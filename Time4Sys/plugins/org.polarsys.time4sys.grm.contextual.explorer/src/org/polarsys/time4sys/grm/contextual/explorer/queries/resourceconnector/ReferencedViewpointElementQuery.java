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

// Generated on 23.11.2016 at 05:45:03 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.time4sys.grm.contextual.explorer.queries.resourceconnector;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.polarsys.time4sys.marte.grm.ResourceConnector;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencedViewpointElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public ReferencedViewpointElementQuery() {
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
		ResourceConnector object = (ResourceConnector) object_p;
		if (object.getSourcePort() != null)
			result.add(object.getSourcePort());
		if (object.getTargetPort() != null)
			result.add(object.getTargetPort());

		return result;
	}

}