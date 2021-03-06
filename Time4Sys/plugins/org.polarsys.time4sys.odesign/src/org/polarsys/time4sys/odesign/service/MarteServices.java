/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterSiriusVariables;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.ControlPin;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.odesign.helper.DiagramHelper;

@SuppressWarnings("restriction")
public class MarteServices {

	/**
	 * used everywhere
	 * 
	 * @param current
	 * @return current if it is a diagram or the diagram that contains current
	 *         if it is a DDiagramElement
	 */
	public DDiagram getDiagramContainer(EObject current) {
		DDiagram parent = DiagramHelper.getService().getDiagramContainer(current);

		if (parent == null) {
			EObject target = current;
			if ((current instanceof DSemanticDecorator) && (((DSemanticDecorator) current).getTarget() != null)) {
				target = ((DSemanticDecorator) current).getTarget();
			}
			Object oDiagram = InterpreterUtil.getInterpreter(target).getVariable(IInterpreterSiriusVariables.DIAGRAM);
			if ((oDiagram != null) && (oDiagram instanceof DDiagram)) {
				return (DDiagram) oDiagram;
			}
		}

		return parent;
	}

	public List<EObject> getBranchPrecedenceRelations(EObject context, EObject view) {

		return getPrecedenceRelations(view, ConnectorKind.BRANCH);

	}

	public List<EObject> getForkPrecedenceRelations(EObject context, EObject views) {
		return getPrecedenceRelations(views, ConnectorKind.FORK);
	}

	public List<EObject> getJoinPrecedenceRelations(EObject context, EObject views) {
		return getPrecedenceRelations(views, ConnectorKind.JOIN);
	}

	public List<EObject> getMergePrecedenceRelations(EObject context, EObject views) {
		return getPrecedenceRelations(views, ConnectorKind.MERGE);
	}

	public List<EObject> getPrecedenceRelations(EObject view, ConnectorKind kind) {
		List<EObject> precedenceRelations = new BasicEList<EObject>();
		if (view instanceof ExecutionStep) {
			ExecutionStep execStep = (ExecutionStep) view;
			PrecedenceRelation inputRelation = execStep.getInputRel();
			if (inputRelation != null) {
				if (inputRelation.getConnectorKind().equals(kind)) {
					precedenceRelations.add(inputRelation);
				}
			}
			PrecedenceRelation outputRelation = execStep.getOutputRel();
			if (outputRelation != null) {
				if (outputRelation.getConnectorKind().equals(kind)) {
					precedenceRelations.add(outputRelation);
				}
			}
		}
		return precedenceRelations;
	}

	public boolean isForkPrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.FORK);
	}

	public boolean isJoinPrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.JOIN);
	}

	public boolean isBranchPrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.BRANCH);
	}

	public boolean isMergePrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.MERGE);
	}

	public boolean isSequencePrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.SEQUENCE);
	}

	public String formatStepLabel(EObject context, EObject view) {
		if (view instanceof DNodeSpec) {
			if (((DNodeSpec) view).getTarget() instanceof Step) {
				Step step = (Step) ((DNodeSpec) view).getTarget();

				String result = "";
				if (step.getName() != null) {
					result = step.getName() + "\n";
				}
				result += "[";
				if (step.getBestCET() != null) {
					result += String.valueOf(step.getBestCET().getValue());
				}
				result += ":";
				if (step.getWorstCET() != null) {
					result += String.valueOf(step.getWorstCET().getValue());
				}
				result += "]";
				if (step.getWorstCET() != null) {
					result += step.getWorstCET().getUnit();
				}

				return result;
			}
		}
		return "invalid label";
	}

	//
	public WorkloadEvent getWorkloadEvent(EObject context, EObject views) {
		if (views instanceof DesignModel) {
			DesignModel model = (DesignModel) views;
			if (context instanceof SoftwareSchedulableResource) {
				SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;
				// WARNING: only first scenario is considered ( get(0) )
				return getWorkloadEvent(swSchedRes, model);
			}
		}
		return null;
	}

	//
	public static WorkloadEvent getWorkloadEvent(SoftwareSchedulableResource swSchedRes, DesignModel model) {
		// WARNING: only first scenario is considered ( get(0) )
		for (Step step : model.getWorkloadBehavior().getBehavior().get(0).getSteps()) {
			if (step instanceof ExecutionStep) {
				// Look for the steps allocated on swSchedRes
				if (((ExecutionStep) step).getConcurRes().equals(swSchedRes)) {
					// Look for the step that has a WorloadEvent
					if ((step.getCause() != null) && (step.getCause().size() > 0)) {
						return step.getCause().get(0);
					}
				}
			}
		}
		return null;
	}

	public TimeInterval getTimeIntervalCET(EObject context, EObject views) {
		NfpFactory nfpfactory = NfpFactory.eINSTANCE;
		Duration min = nfpfactory.createDuration();
		Duration max = nfpfactory.createDuration();
		if (views instanceof DesignModel) {
			DesignModel model = (DesignModel) views;
			if (context instanceof SoftwareSchedulableResource) {
				SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;
				for (Step step : model.getWorkloadBehavior().getBehavior().get(0).getSteps()) {
					if (step instanceof ExecutionStep) {
						ExecutionStep execStep = (ExecutionStep) step;
						if (execStep.getConcurRes().equals(swSchedRes)) {
							min = min.add(nfpfactory.createDurationFromString(execStep.getBestCET().toString()));
							max = max.add(nfpfactory.createDurationFromString(execStep.getWorstCET().toString()));
						}
					}
				}
			} else if (context instanceof ExecutionStep) {
				ExecutionStep execStep = (ExecutionStep) context;
				min = nfpfactory.createDurationFromString(execStep.getBestCET().toString());
				max = nfpfactory.createDurationFromString(execStep.getWorstCET().toString());
			} else {
				return null;
			}
		}
		TimeInterval ti = nfpfactory.createTimeInterval();
		ti.setMin(min);
		ti.setMax(max);
		return ti;
	}

	//
	public int getPriority(EObject context) {
		if (context instanceof SoftwareSchedulableResource) {
			SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;
			return Integer.parseInt(swSchedRes.getSchedParams().get(0).getValue());
		}
		return 0;
	}

	// /**
	// * Used for conditional style on column Deadline
	// * @param context
	// * @return
	// */
	// public boolean deadlineLowerThanWcrt(EObject context) {
	// if(context instanceof EndToEndFlow){
	// EndToEndFlow endToEndFlow = (EndToEndFlow)context;
	// if(endToEndFlow.getEndToEndScenario() instanceof ExecutionStep){
	// ExecutionStep execStep =
	// (ExecutionStep)endToEndFlow.getEndToEndScenario();
	// if(execStep.getConcurRes() != null){
	// SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource)
	// execStep.getConcurRes();
	// if(endToEndFlow.eContainer() instanceof DesignModel){
	// DesignModel model = (DesignModel)endToEndFlow.eContainer();
	// for(ResultSet resultSet: model.getResultSets()){
	// for(Result result: resultSet.getResults()){
	// if(result.getRefersTo().equals(swSchedRes)){
	// if(result instanceof TaskResult){
	// TaskResult taskResult = (TaskResult)result;
	// if(taskResult.getResponseTime().getMax() >
	// endToEndFlow.getEndToEndDeadline().getValue()){
	// return true;
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// return false;
	// }

	// /**
	// * Used for conditional style on column ResponseTime
	// * @param context_p
	// * @return
	// */
	// public boolean wcrtGreaterThanDeadline(EObject context_p) {
	//// if(context_p instanceof TaskResult){
	//// TaskResult taskResult = (TaskResult)context_p;
	//// if(taskResult.getRefersTo() instanceof SoftwareSchedulableResource){
	//// SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource)
	// taskResult.getRefersTo();
	//// if(taskResult.getResultSet().getContainer() instanceof DesignModel){
	//// DesignModel model =
	// (DesignModel)taskResult.getResultSet().getContainer();
	//// for(EndToEndFlow endToEndFlow: model.getEndToEndFlows()){
	//// if(endToEndFlow.getEndToEndScenario() instanceof ExecutionStep){
	//// ExecutionStep executionStep =
	// (ExecutionStep)endToEndFlow.getEndToEndScenario();
	//// if(executionStep.getConcurRes().equals(swSchedRes)){
	//// if(taskResult.getResponseTime().getMax() >
	// endToEndFlow.getEndToEndDeadline().getValue()){
	//// return true;
	//// }
	//// }
	//// }
	//// }
	//// }
	//// }
	//// }
	// return false;
	// }

	public void setPeriod(EObject context) {
		if (context instanceof SoftwareSchedulableResource) {
			SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;

		}
	}

	public Duration getOffset(EObject context, EObject views) {
		WorkloadEvent we = getWorkloadEvent(context, views);
		if (we != null) {
			if (we.getPattern() instanceof PeriodicPattern) {
				return ((PeriodicPattern) we.getPattern()).getPhase();
			}
		}
		return null;
	}

	public Duration getPeriod(EObject context, EObject views) {
		WorkloadEvent we = getWorkloadEvent(context, views);
		if (we != null) {
			if (we.getPattern() instanceof PeriodicPattern) {
				return ((PeriodicPattern) we.getPattern()).getPeriod();
			}
		}
		return null;
	}

	public Duration getJitter(EObject context, EObject views) {
		WorkloadEvent we = getWorkloadEvent(context, views);
		if (we != null) {
			if (we.getPattern() instanceof PeriodicPattern) {
				return ((PeriodicPattern) we.getPattern()).getJitter();
			}
		}
		return null;
	}

	public List<SoftwareSchedulableResource> getSwSchedulableResourcesOrderedByPriority(EObject context) {
		List<SoftwareSchedulableResource> sortedSwSchedRes = new BasicEList<SoftwareSchedulableResource>();
		if (context instanceof HardwareComputingResource) {
			HardwareComputingResource hcr = (HardwareComputingResource) context;
			for (Resource resource : hcr.getOwnedResource()) {
				if (resource instanceof SoftwareSchedulableResource) {
					SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) resource;
					int insertionIndex = 0;
					// WARNING First SchedulingParameter value considered as
					// priority
					int priority = Integer.parseInt(swSchedRes.getSchedParams().get(0).getValue());
					for (SoftwareSchedulableResource sortedSwSched : sortedSwSchedRes) {
						int sortedSwSchedPriority = Integer.parseInt(sortedSwSched.getSchedParams().get(0).getValue());
						if (sortedSwSchedPriority < priority) {
							insertionIndex++;
						} else {
							break;
						}
					}
					sortedSwSchedRes.add(insertionIndex, swSchedRes);
				}
			}
		}
		return sortedSwSchedRes;
	}

	public float createFloat(EObject context, int value) {
		return new Integer(value).floatValue();
	}

	public EObject getDesign(EObject context) {
		org.eclipse.emf.ecore.resource.Resource res = context.eResource();
		EList<EObject> contents = res.getContents();
		for (EObject content : contents) {
			if (content instanceof Project) {
				Project proj = (Project) content;
				DesignModel design = proj.getDesign();
				return design;
			}
		}
		return context;
	}

	public void deleteStep2InputRel(EObject context) {
		if (context instanceof Step) {
			Step step = (Step) context;
			PrecedenceRelation pr = step.getOutputRel();
			/* case 2 predecessors */
			if (pr.getPredec().size() == 2) {
				Step stepToRemove = null;
				PrecedenceRelation prToRemove = null;
				for (Step predecStep : pr.getPredec()) {
					if ("intermediate step".equals(predecStep.getName())) {
						/* shortcut intermediate step and remove it */
						pr.getSucces().get(0).setInputRel(predecStep.getInputRel());
						stepToRemove = predecStep;
						step.getScenario().getConnectors().remove(pr);
					}
				}
				if (stepToRemove != null) {
					stepToRemove.getScenario().getSteps().remove(stepToRemove);
				}
				pr.getPredec().remove(step);
				pr.setConnectorKind(ConnectorKind.SEQUENCE);

			} else if (pr.getPredec().size() > 2) {
				pr.getPredec().remove(step);
				if (step.getOutputRel().getSucces().size() == 0) {
					step.getScenario().getConnectors().remove(pr);
				}
			}
		}
	}

	public void deleteOutputRel2Step(EObject views) {
		if (views instanceof DEdgeSpec) {
			EObject context = ((DEdgeSpec) views).getTarget();
			EObject targetNode = ((DEdgeSpec) views).getTargetNode();
			EObject target = ((DDiagramElement) targetNode).getTarget();

			if (context instanceof PrecedenceRelation) {
				PrecedenceRelation pr = (PrecedenceRelation) context;
				BehaviorScenario scenario = pr.getPredec().get(0).getScenario();
				/* case only 2 successors -> modify relation construction */
				if (pr.getSucces().size() == 2) {
					Step stepToRemove = null;
					for (Step succesStep : pr.getSucces()) {
						if ("intermediate step".equals(succesStep.getName())) {
							/* shortcut intermediate step and remove it */
							pr.getPredec().get(0).setOutputRel(succesStep.getOutputRel());
							stepToRemove = succesStep;
							scenario.getConnectors().remove(pr);
						}
					}
					if (stepToRemove != null) {
						stepToRemove.getScenario().getSteps().remove(stepToRemove);
					}
					pr.getSucces().remove(target);
					pr.setConnectorKind(ConnectorKind.SEQUENCE);
				}
				/* case more than 2 successors -> remove successor Step */
				else if (pr.getSucces().size() > 2) {
					if (target instanceof Step) {
						Step targetStep = (Step) target;
						pr.getSucces().remove(targetStep);
						if (targetStep.getInputRel().getPredec().size() == 0) {
							targetStep.getScenario().getConnectors().remove(pr);
						}
					}
				}
			}
		}
	}

	public List<ArrivalPattern> getAllPatternInDesign(EObject design, EObject diagram){
		List<ArrivalPattern> result = new ArrayList<ArrivalPattern>();
		if (design instanceof DesignModel){
			DesignModel designModel = (DesignModel) design;
			for (WorkloadEvent demand : designModel.getWorkloadBehavior().getDemand()){
				result.add(demand.getPattern());
			}
			if (diagram instanceof DDiagram){
			DDiagram dDiagram = (DDiagram) diagram;
			for (EObject controlPin : dDiagram.getDiagramElements()){
				EObject target = ((DDiagramElement)controlPin).getTarget();
				if (target instanceof ControlPin){
					result.add(((ControlPin) target).getPattern());
				}
			}
			}
		}
		return result;
	}

	public void deleteStep(DNode views) {
		EObject context = ((DNode) views).getTarget();
		if (context instanceof Step) {
			Step step = (Step) context;
			if (step.getInputRel() != null) {
				List<Step> inputRelBrother = step.getInputRel().getSucces();

				if (inputRelBrother.size() == 1) {
					step.getScenario().getConnectors().remove(step.getInputRel());
				}
				if (inputRelBrother.size() == 2) {
					step.getInputRel().setConnectorKind(ConnectorKind.SEQUENCE);
				}
			}
			if (step.getOutputRel() != null) {
				List<Step> outputRelBrother = step.getOutputRel().getPredec();
				if (outputRelBrother.size() == 1) {
					step.getScenario().getConnectors().remove(step.getOutputRel());
				}
				if (outputRelBrother.size() == 2) {
					step.getOutputRel().setConnectorKind(ConnectorKind.SEQUENCE);
				}
			}
			step.getScenario().getSteps().remove(step);
		}
	}

	public boolean hasDeadline2(EObject context) {
		if (context instanceof SoftwareSchedulableResource) {
			SoftwareSchedulableResource ssr = (SoftwareSchedulableResource) context;
			if (!ssr.getDeadlineElements().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public static void dragAndDropResourceToDiagram(EObject context, EObject diagram) {
		if (context instanceof ProcessingResource && diagram instanceof DesignModel) {
			ProcessingResource res = (ProcessingResource) context;
			DesignModel dm = (DesignModel) diagram;
			dm.getResourcePackage().getOwnedElement().add(res);
		}
	}
}
