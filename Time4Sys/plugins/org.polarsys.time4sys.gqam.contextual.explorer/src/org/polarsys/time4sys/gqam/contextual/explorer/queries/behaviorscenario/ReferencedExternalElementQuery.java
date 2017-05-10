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

// Generated on 23.11.2016 at 05:48:03 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.time4sys.gqam.contextual.explorer.queries.behaviorscenario;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencedExternalElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public ReferencedExternalElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		BehaviorScenario object = (BehaviorScenario) object_p;

		if (object.getRespTime() != null)
			result.add(object.getRespTime());

		if (object.getBestCET() != null)
			result.add(object.getBestCET());

		if (object.getWorstCET() != null)
			result.add(object.getWorstCET());

		return result;
	}

}