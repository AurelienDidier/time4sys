/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.srm.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceService;

import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class SoftwareSchedulableResourceOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String OTHER_PART = "Other"; //$NON-NLS-1$

	
	/**
	 * Settings for pServices ReferencesTable
	 */
	protected ReferencesTableSettings pServicesSettings;
	
	/**
	 * Settings for rServices ReferencesTable
	 */
	private ReferencesTableSettings rServicesSettings;
	
	/**
	 * Settings for createServices ReferencesTable
	 */
	private ReferencesTableSettings createServicesSettings;
	
	/**
	 * Settings for deleteServices ReferencesTable
	 */
	private ReferencesTableSettings deleteServicesSettings;
	
	/**
	 * Settings for initializeServices ReferencesTable
	 */
	private ReferencesTableSettings initializeServicesSettings;
	
	/**
	 * Settings for activateServices ReferencesTable
	 */
	private ReferencesTableSettings activateServicesSettings;
	
	/**
	 * Settings for resumeServices ReferencesTable
	 */
	private ReferencesTableSettings resumeServicesSettings;
	
	/**
	 * Settings for suspendServices ReferencesTable
	 */
	private ReferencesTableSettings suspendServicesSettings;
	
	/**
	 * Settings for enableConcurrencyServices ReferencesTable
	 */
	private ReferencesTableSettings enableConcurrencyServicesSettings;
	
	/**
	 * Settings for disableConcurrencyServices ReferencesTable
	 */
	private ReferencesTableSettings disableConcurrencyServicesSettings;
	
	/**
	 * Settings for terminateServices ReferencesTable
	 */
	private ReferencesTableSettings terminateServicesSettings;
	
	/**
	 * Settings for joinServices ReferencesTable
	 */
	private ReferencesTableSettings joinServicesSettings;
	
	/**
	 * Settings for yieldServices ReferencesTable
	 */
	private ReferencesTableSettings yieldServicesSettings;
	
	/**
	 * Settings for delayServices ReferencesTable
	 */
	private ReferencesTableSettings delayServicesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoftwareSchedulableResourceOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareSchedulableResource, String editing_mode) {
		super(editingContext, softwareSchedulableResource, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = SrmViewsRepository.class;
		partKey = SrmViewsRepository.Other.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final SoftwareSchedulableResource softwareSchedulableResource = (SoftwareSchedulableResource)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.isStaticSchedulingFeature)) {
				otherPart.setIsStaticSchedulingFeature(softwareSchedulableResource.isIsStaticSchedulingFeature());
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.stackSizeElements))
				otherPart.setStackSizeElements(softwareSchedulableResource.getStackSizeElements());
			
			if (isAccessible(SrmViewsRepository.Other.Properties.heapSizeElements))
				otherPart.setHeapSizeElements(softwareSchedulableResource.getHeapSizeElements());
			
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				createServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareResource_CreateServices());
				otherPart.initCreateServices(createServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				deleteServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices());
				otherPart.initDeleteServices(deleteServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				initializeServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices());
				otherPart.initInitializeServices(initializeServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.activateServices)) {
				activateServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivateServices());
				otherPart.initActivateServices(activateServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.resumeServices)) {
				resumeServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ResumeServices());
				otherPart.initResumeServices(resumeServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.suspendServices)) {
				suspendServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SuspendServices());
				otherPart.initSuspendServices(suspendServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.enableConcurrencyServices)) {
				enableConcurrencyServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EnableConcurrencyServices());
				otherPart.initEnableConcurrencyServices(enableConcurrencyServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.disableConcurrencyServices)) {
				disableConcurrencyServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_DisableConcurrencyServices());
				otherPart.initDisableConcurrencyServices(disableConcurrencyServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.terminateServices)) {
				terminateServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_TerminateServices());
				otherPart.initTerminateServices(terminateServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.joinServices)) {
				joinServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareSchedulableResource_JoinServices());
				otherPart.initJoinServices(joinServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.yieldServices)) {
				yieldServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareSchedulableResource_YieldServices());
				otherPart.initYieldServices(yieldServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.delayServices)) {
				delayServicesSettings = new ReferencesTableSettings(softwareSchedulableResource, SrmPackage.eINSTANCE.getSoftwareSchedulableResource_DelayServices());
				otherPart.initDelayServices(delayServicesSettings);
			}
			// init filters
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				otherPart.addFilterToPServices(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceService); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for pServices
				// End of user code
			}
			
			
			
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				otherPart.addFilterToRServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for rServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				otherPart.addFilterToCreateServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for createServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				otherPart.addFilterToDeleteServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for deleteServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				otherPart.addFilterToInitializeServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for initializeServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.activateServices)) {
				otherPart.addFilterToActivateServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for activateServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.resumeServices)) {
				otherPart.addFilterToResumeServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for resumeServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.suspendServices)) {
				otherPart.addFilterToSuspendServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for suspendServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.enableConcurrencyServices)) {
				otherPart.addFilterToEnableConcurrencyServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for enableConcurrencyServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.disableConcurrencyServices)) {
				otherPart.addFilterToDisableConcurrencyServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for disableConcurrencyServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.terminateServices)) {
				otherPart.addFilterToTerminateServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for terminateServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.joinServices)) {
				otherPart.addFilterToJoinServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for joinServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.yieldServices)) {
				otherPart.addFilterToYieldServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for yieldServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.delayServices)) {
				otherPart.addFilterToDelayServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for delayServices
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




















	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == SrmViewsRepository.Other.Properties.pServices) {
			return GrmPackage.eINSTANCE.getResource_PServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.isStaticSchedulingFeature) {
			return SrmPackage.eINSTANCE.getSoftwareSchedulableResource_IsStaticSchedulingFeature();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.stackSizeElements) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_StackSizeElements();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.heapSizeElements) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_HeapSizeElements();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.rServices) {
			return GrmPackage.eINSTANCE.getResource_RServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.createServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_CreateServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.deleteServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.initializeServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.activateServices) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivateServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.resumeServices) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ResumeServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.suspendServices) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SuspendServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.enableConcurrencyServices) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EnableConcurrencyServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.disableConcurrencyServices) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_DisableConcurrencyServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.terminateServices) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_TerminateServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.joinServices) {
			return SrmPackage.eINSTANCE.getSoftwareSchedulableResource_JoinServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.yieldServices) {
			return SrmPackage.eINSTANCE.getSoftwareSchedulableResource_YieldServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.delayServices) {
			return SrmPackage.eINSTANCE.getSoftwareSchedulableResource_DelayServices();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoftwareSchedulableResource softwareSchedulableResource = (SoftwareSchedulableResource)semanticObject;
		if (SrmViewsRepository.Other.Properties.pServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, pServicesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				pServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				pServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.isStaticSchedulingFeature == event.getAffectedEditor()) {
			softwareSchedulableResource.setIsStaticSchedulingFeature((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.Other.Properties.stackSizeElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				softwareSchedulableResource.getStackSizeElements().clear();
				softwareSchedulableResource.getStackSizeElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Other.Properties.heapSizeElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				softwareSchedulableResource.getHeapSizeElements().clear();
				softwareSchedulableResource.getHeapSizeElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Other.Properties.rServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					rServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				rServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.createServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					createServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				createServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				createServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.deleteServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					deleteServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				deleteServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				deleteServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.initializeServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					initializeServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				initializeServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				initializeServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.activateServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					activateServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				activateServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				activateServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.resumeServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					resumeServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resumeServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resumeServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.suspendServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					suspendServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				suspendServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				suspendServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.enableConcurrencyServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					enableConcurrencyServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				enableConcurrencyServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				enableConcurrencyServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.disableConcurrencyServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					disableConcurrencyServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				disableConcurrencyServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				disableConcurrencyServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.terminateServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					terminateServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				terminateServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				terminateServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.joinServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					joinServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				joinServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				joinServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.yieldServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					yieldServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				yieldServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				yieldServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.delayServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					delayServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				delayServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				delayServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getResource_PServices().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.Other.Properties.pServices))
				otherPart.updatePServices();
			if (SrmPackage.eINSTANCE.getSoftwareSchedulableResource_IsStaticSchedulingFeature().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.isStaticSchedulingFeature))
				otherPart.setIsStaticSchedulingFeature((Boolean)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_StackSizeElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.stackSizeElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					otherPart.setStackSizeElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					otherPart.setStackSizeElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					otherPart.setStackSizeElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_HeapSizeElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.heapSizeElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					otherPart.setHeapSizeElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					otherPart.setHeapSizeElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					otherPart.setHeapSizeElements(newValueAsList);
				}
			}
			
			if (GrmPackage.eINSTANCE.getResource_RServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.rServices))
				otherPart.updateRServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_CreateServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.createServices))
				otherPart.updateCreateServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.deleteServices))
				otherPart.updateDeleteServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.initializeServices))
				otherPart.updateInitializeServices();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivateServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.activateServices))
				otherPart.updateActivateServices();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ResumeServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.resumeServices))
				otherPart.updateResumeServices();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SuspendServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.suspendServices))
				otherPart.updateSuspendServices();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EnableConcurrencyServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.enableConcurrencyServices))
				otherPart.updateEnableConcurrencyServices();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_DisableConcurrencyServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.disableConcurrencyServices))
				otherPart.updateDisableConcurrencyServices();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_TerminateServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.terminateServices))
				otherPart.updateTerminateServices();
			if (SrmPackage.eINSTANCE.getSoftwareSchedulableResource_JoinServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.joinServices))
				otherPart.updateJoinServices();
			if (SrmPackage.eINSTANCE.getSoftwareSchedulableResource_YieldServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.yieldServices))
				otherPart.updateYieldServices();
			if (SrmPackage.eINSTANCE.getSoftwareSchedulableResource_DelayServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.delayServices))
				otherPart.updateDelayServices();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			GrmPackage.eINSTANCE.getResource_PServices(),
			SrmPackage.eINSTANCE.getSoftwareSchedulableResource_IsStaticSchedulingFeature(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_StackSizeElements(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_HeapSizeElements(),
			GrmPackage.eINSTANCE.getResource_RServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_CreateServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivateServices(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ResumeServices(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SuspendServices(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EnableConcurrencyServices(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_DisableConcurrencyServices(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_TerminateServices(),
			SrmPackage.eINSTANCE.getSoftwareSchedulableResource_JoinServices(),
			SrmPackage.eINSTANCE.getSoftwareSchedulableResource_YieldServices(),
			SrmPackage.eINSTANCE.getSoftwareSchedulableResource_DelayServices()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Other.Properties.pServices || key == SrmViewsRepository.Other.Properties.isStaticSchedulingFeature || key == SrmViewsRepository.Other.Properties.stackSizeElements || key == SrmViewsRepository.Other.Properties.heapSizeElements || key == SrmViewsRepository.Other.Properties.rServices || key == SrmViewsRepository.Other.Properties.createServices || key == SrmViewsRepository.Other.Properties.deleteServices || key == SrmViewsRepository.Other.Properties.initializeServices || key == SrmViewsRepository.Other.Properties.activateServices || key == SrmViewsRepository.Other.Properties.resumeServices || key == SrmViewsRepository.Other.Properties.suspendServices || key == SrmViewsRepository.Other.Properties.enableConcurrencyServices || key == SrmViewsRepository.Other.Properties.disableConcurrencyServices || key == SrmViewsRepository.Other.Properties.terminateServices || key == SrmViewsRepository.Other.Properties.joinServices || key == SrmViewsRepository.Other.Properties.yieldServices || key == SrmViewsRepository.Other.Properties.delayServices || key == SrmViewsRepository.Other.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.host || key == SrmViewsRepository.General.Properties.scheduler || key == SrmViewsRepository.Other.Properties.isStaticSchedulingFeature || key == SrmViewsRepository.Timing.Properties.isPreemptable || key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (SrmViewsRepository.Other.Properties.isStaticSchedulingFeature == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareSchedulableResource_IsStaticSchedulingFeature().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareSchedulableResource_IsStaticSchedulingFeature().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Other.Properties.stackSizeElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_StackSizeElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.Other.Properties.heapSizeElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_HeapSizeElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
