/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.nfp.NfpFactory
 * @model kind="package"
 * @generated
 */
public interface NfpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nfp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/nfp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nfp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfpPackage eINSTANCE = org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.DurationImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__BEST = 2;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__WORST = 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CLOCK = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__PRECISION = 5;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___ADD__DURATION = 0;

	/**
	 * The operation id for the '<em>Convert To Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___CONVERT_TO_UNIT__TIMEUNITKIND = 1;

	/**
	 * The operation id for the '<em>Simplify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___SIMPLIFY = 2;

	/**
	 * The operation id for the '<em>Sub</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___SUB__DURATION = 3;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___COMPARE_TO__DURATION = 4;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_ZERO = 5;

	/**
	 * The operation id for the '<em>Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___NOT_ZERO = 6;

	/**
	 * The operation id for the '<em>Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MAX__DURATION = 7;

	/**
	 * The operation id for the '<em>Min</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MIN__DURATION = 8;

	/**
	 * The operation id for the '<em>Mul</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MUL__LONG = 9;

	/**
	 * The operation id for the '<em>Lcm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___LCM__DURATION = 10;

	/**
	 * The operation id for the '<em>Div</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___DIV__DURATION = 11;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MIN_OPEN = 2;

	/**
	 * The feature id for the '<em><b>Max Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MAX_OPEN = 3;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___COMPUTE_LENGTH = 0;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.nfp.TimeUnitKind <em>Time Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
	 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeUnitKind()
	 * @generated
	 */
	int TIME_UNIT_KIND = 2;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getValue()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getUnit()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getBest <em>Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getBest()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Best();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getWorst <em>Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getWorst()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Worst();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getClock()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.Duration#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#getPrecision()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Precision();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#add(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Add__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind) <em>Convert To Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Unit</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#convertToUnit(org.polarsys.time4sys.marte.nfp.TimeUnitKind)
	 * @generated
	 */
	EOperation getDuration__ConvertToUnit__TimeUnitKind();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#simplify() <em>Simplify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Simplify</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#simplify()
	 * @generated
	 */
	EOperation getDuration__Simplify();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration) <em>Sub</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sub</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#sub(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Sub__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#compareTo(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__CompareTo__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#isZero() <em>Is Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#isZero()
	 * @generated
	 */
	EOperation getDuration__IsZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#notZero() <em>Not Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Zero</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#notZero()
	 * @generated
	 */
	EOperation getDuration__NotZero();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration) <em>Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#max(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Max__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration) <em>Min</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#min(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Min__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#mul(long) <em>Mul</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mul</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#mul(long)
	 * @generated
	 */
	EOperation getDuration__Mul__long();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration) <em>Lcm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lcm</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#lcm(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Lcm__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration) <em>Div</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Div</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.Duration#div(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getDuration__Div__Duration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.nfp.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#getMin()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Min();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#getMax()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMinOpen <em>Min Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Open</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#isMinOpen()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_MinOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMaxOpen <em>Max Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Open</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#isMaxOpen()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_MaxOpen();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength() <em>Compute Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Length</em>' operation.
	 * @see org.polarsys.time4sys.marte.nfp.TimeInterval#computeLength()
	 * @generated
	 */
	EOperation getTimeInterval__ComputeLength();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.nfp.TimeUnitKind <em>Time Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit Kind</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
	 * @generated
	 */
	EEnum getTimeUnitKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NfpFactory getNfpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.DurationImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__VALUE = eINSTANCE.getDuration_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__UNIT = eINSTANCE.getDuration_Unit();

		/**
		 * The meta object literal for the '<em><b>Best</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__BEST = eINSTANCE.getDuration_Best();

		/**
		 * The meta object literal for the '<em><b>Worst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__WORST = eINSTANCE.getDuration_Worst();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__CLOCK = eINSTANCE.getDuration_Clock();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__PRECISION = eINSTANCE.getDuration_Precision();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___ADD__DURATION = eINSTANCE.getDuration__Add__Duration();

		/**
		 * The meta object literal for the '<em><b>Convert To Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___CONVERT_TO_UNIT__TIMEUNITKIND = eINSTANCE.getDuration__ConvertToUnit__TimeUnitKind();

		/**
		 * The meta object literal for the '<em><b>Simplify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___SIMPLIFY = eINSTANCE.getDuration__Simplify();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___SUB__DURATION = eINSTANCE.getDuration__Sub__Duration();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___COMPARE_TO__DURATION = eINSTANCE.getDuration__CompareTo__Duration();

		/**
		 * The meta object literal for the '<em><b>Is Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___IS_ZERO = eINSTANCE.getDuration__IsZero();

		/**
		 * The meta object literal for the '<em><b>Not Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___NOT_ZERO = eINSTANCE.getDuration__NotZero();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___MAX__DURATION = eINSTANCE.getDuration__Max__Duration();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___MIN__DURATION = eINSTANCE.getDuration__Min__Duration();

		/**
		 * The meta object literal for the '<em><b>Mul</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___MUL__LONG = eINSTANCE.getDuration__Mul__long();

		/**
		 * The meta object literal for the '<em><b>Lcm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___LCM__DURATION = eINSTANCE.getDuration__Lcm__Duration();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___DIV__DURATION = eINSTANCE.getDuration__Div__Duration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.impl.TimeIntervalImpl
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__MIN = eINSTANCE.getTimeInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__MAX = eINSTANCE.getTimeInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Min Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__MIN_OPEN = eINSTANCE.getTimeInterval_MinOpen();

		/**
		 * The meta object literal for the '<em><b>Max Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__MAX_OPEN = eINSTANCE.getTimeInterval_MaxOpen();

		/**
		 * The meta object literal for the '<em><b>Compute Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___COMPUTE_LENGTH = eINSTANCE.getTimeInterval__ComputeLength();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.nfp.TimeUnitKind <em>Time Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
		 * @see org.polarsys.time4sys.marte.nfp.impl.NfpPackageImpl#getTimeUnitKind()
		 * @generated
		 */
		EEnum TIME_UNIT_KIND = eINSTANCE.getTimeUnitKind();

	}

} //NfpPackage
