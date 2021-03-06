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
package org.polarsys.time4sys.marte.grm.provider;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.util.GrmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GrmItemProviderAdapterFactory extends GrmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(GrmEditPlugin.INSTANCE, GrmPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourcePackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePackageItemProvider resourcePackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourcePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcePackageAdapter() {
		if (resourcePackageItemProvider == null) {
			resourcePackageItemProvider = new ResourcePackageItemProvider(this);
		}

		return resourcePackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceItemProvider resourceInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceInstanceAdapter() {
		if (resourceInstanceItemProvider == null) {
			resourceInstanceItemProvider = new ResourceInstanceItemProvider(this);
		}

		return resourceInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.StorageResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageResourceItemProvider storageResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.StorageResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStorageResourceAdapter() {
		if (storageResourceItemProvider == null) {
			storageResourceItemProvider = new StorageResourceItemProvider(this);
		}

		return storageResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.SynchResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchResourceItemProvider synchResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.SynchResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchResourceAdapter() {
		if (synchResourceItemProvider == null) {
			synchResourceItemProvider = new SynchResourceItemProvider(this);
		}

		return synchResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ConcurrencyResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyResourceItemProvider concurrencyResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ConcurrencyResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcurrencyResourceAdapter() {
		if (concurrencyResourceItemProvider == null) {
			concurrencyResourceItemProvider = new ConcurrencyResourceItemProvider(this);
		}

		return concurrencyResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ComputingResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingResourceItemProvider computingResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ComputingResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputingResourceAdapter() {
		if (computingResourceItemProvider == null) {
			computingResourceItemProvider = new ComputingResourceItemProvider(this);
		}

		return computingResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.DeviceResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceResourceItemProvider deviceResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.DeviceResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceResourceAdapter() {
		if (deviceResourceItemProvider == null) {
			deviceResourceItemProvider = new DeviceResourceItemProvider(this);
		}

		return deviceResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ClockResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockResourceItemProvider clockResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ClockResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockResourceAdapter() {
		if (clockResourceItemProvider == null) {
			clockResourceItemProvider = new ClockResourceItemProvider(this);
		}

		return clockResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.TimerResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerResourceItemProvider timerResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.TimerResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimerResourceAdapter() {
		if (timerResourceItemProvider == null) {
			timerResourceItemProvider = new TimerResourceItemProvider(this);
		}

		return timerResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceServiceItemProvider resourceServiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceServiceAdapter() {
		if (resourceServiceItemProvider == null) {
			resourceServiceItemProvider = new ResourceServiceItemProvider(this);
		}

		return resourceServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.CommunicationMedia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMediaItemProvider communicationMediaItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.CommunicationMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationMediaAdapter() {
		if (communicationMediaItemProvider == null) {
			communicationMediaItemProvider = new CommunicationMediaItemProvider(this);
		}

		return communicationMediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceConnectorItemProvider resourceConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceConnectorAdapter() {
		if (resourceConnectorItemProvider == null) {
			resourceConnectorItemProvider = new ResourceConnectorItemProvider(this);
		}

		return resourceConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourcePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePortItemProvider resourcePortItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourcePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcePortAdapter() {
		if (resourcePortItemProvider == null) {
			resourcePortItemProvider = new ResourcePortItemProvider(this);
		}

		return resourcePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceBrokerItemProvider resourceBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceBrokerAdapter() {
		if (resourceBrokerItemProvider == null) {
			resourceBrokerItemProvider = new ResourceBrokerItemProvider(this);
		}

		return resourceBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceManager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceManagerItemProvider resourceManagerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceManagerAdapter() {
		if (resourceManagerItemProvider == null) {
			resourceManagerItemProvider = new ResourceManagerItemProvider(this);
		}

		return resourceManagerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.AccessControlPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlPolicyItemProvider accessControlPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.AccessControlPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccessControlPolicyAdapter() {
		if (accessControlPolicyItemProvider == null) {
			accessControlPolicyItemProvider = new AccessControlPolicyItemProvider(this);
		}

		return accessControlPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceControlPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceControlPolicyItemProvider resourceControlPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceControlPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceControlPolicyAdapter() {
		if (resourceControlPolicyItemProvider == null) {
			resourceControlPolicyItemProvider = new ResourceControlPolicyItemProvider(this);
		}

		return resourceControlPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.Scheduler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerItemProvider schedulerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.Scheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulerAdapter() {
		if (schedulerItemProvider == null) {
			schedulerItemProvider = new SchedulerItemProvider(this);
		}

		return schedulerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.SecondaryScheduler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondarySchedulerItemProvider secondarySchedulerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.SecondaryScheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecondarySchedulerAdapter() {
		if (secondarySchedulerItemProvider == null) {
			secondarySchedulerItemProvider = new SecondarySchedulerItemProvider(this);
		}

		return secondarySchedulerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.SchedulableResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulableResourceItemProvider schedulableResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.SchedulableResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulableResourceAdapter() {
		if (schedulableResourceItemProvider == null) {
			schedulableResourceItemProvider = new SchedulableResourceItemProvider(this);
		}

		return schedulableResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.SchedulingParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingParameterItemProvider schedulingParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.SchedulingParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulingParameterAdapter() {
		if (schedulingParameterItemProvider == null) {
			schedulingParameterItemProvider = new SchedulingParameterItemProvider(this);
		}

		return schedulingParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.SchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicyItemProvider schedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.SchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulingPolicyAdapter() {
		if (schedulingPolicyItemProvider == null) {
			schedulingPolicyItemProvider = new SchedulingPolicyItemProvider(this);
		}

		return schedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.MutualExclusionResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualExclusionResourceItemProvider mutualExclusionResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.MutualExclusionResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMutualExclusionResourceAdapter() {
		if (mutualExclusionResourceItemProvider == null) {
			mutualExclusionResourceItemProvider = new MutualExclusionResourceItemProvider(this);
		}

		return mutualExclusionResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualExclusionProtocolItemProvider mutualExclusionProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.MutualExclusionProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMutualExclusionProtocolAdapter() {
		if (mutualExclusionProtocolItemProvider == null) {
			mutualExclusionProtocolItemProvider = new MutualExclusionProtocolItemProvider(this);
		}

		return mutualExclusionProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ProtectionParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionParameterItemProvider protectionParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ProtectionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProtectionParameterAdapter() {
		if (protectionParameterItemProvider == null) {
			protectionParameterItemProvider = new ProtectionParameterItemProvider(this);
		}

		return protectionParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.UsageDemand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageDemandItemProvider usageDemandItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.UsageDemand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsageDemandAdapter() {
		if (usageDemandItemProvider == null) {
			usageDemandItemProvider = new UsageDemandItemProvider(this);
		}

		return usageDemandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceUsage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceUsageItemProvider resourceUsageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceUsageAdapter() {
		if (resourceUsageItemProvider == null) {
			resourceUsageItemProvider = new ResourceUsageItemProvider(this);
		}

		return resourceUsageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.UsageTypedAmount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageTypedAmountItemProvider usageTypedAmountItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.UsageTypedAmount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsageTypedAmountAdapter() {
		if (usageTypedAmountItemProvider == null) {
			usageTypedAmountItemProvider = new UsageTypedAmountItemProvider(this);
		}

		return usageTypedAmountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.DynamicUsage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicUsageItemProvider dynamicUsageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.DynamicUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicUsageAdapter() {
		if (dynamicUsageItemProvider == null) {
			dynamicUsageItemProvider = new DynamicUsageItemProvider(this);
		}

		return dynamicUsageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.StaticUsage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticUsageItemProvider staticUsageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.StaticUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticUsageAdapter() {
		if (staticUsageItemProvider == null) {
			staticUsageItemProvider = new StaticUsageItemProvider(this);
		}

		return staticUsageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.grm.ResourceInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfaceItemProvider resourceInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.grm.ResourceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceInterfaceAdapter() {
		if (resourceInterfaceItemProvider == null) {
			resourceInterfaceItemProvider = new ResourceInterfaceItemProvider(this);
		}

		return resourceInterfaceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (accessControlPolicyItemProvider != null) accessControlPolicyItemProvider.dispose();
		if (clockResourceItemProvider != null) clockResourceItemProvider.dispose();
		if (communicationMediaItemProvider != null) communicationMediaItemProvider.dispose();
		if (computingResourceItemProvider != null) computingResourceItemProvider.dispose();
		if (concurrencyResourceItemProvider != null) concurrencyResourceItemProvider.dispose();
		if (deviceResourceItemProvider != null) deviceResourceItemProvider.dispose();
		if (dynamicUsageItemProvider != null) dynamicUsageItemProvider.dispose();
		if (mutualExclusionProtocolItemProvider != null) mutualExclusionProtocolItemProvider.dispose();
		if (mutualExclusionResourceItemProvider != null) mutualExclusionResourceItemProvider.dispose();
		if (protectionParameterItemProvider != null) protectionParameterItemProvider.dispose();
		if (resourceBrokerItemProvider != null) resourceBrokerItemProvider.dispose();
		if (resourceConnectorItemProvider != null) resourceConnectorItemProvider.dispose();
		if (resourceControlPolicyItemProvider != null) resourceControlPolicyItemProvider.dispose();
		if (resourceInstanceItemProvider != null) resourceInstanceItemProvider.dispose();
		if (resourceInterfaceItemProvider != null) resourceInterfaceItemProvider.dispose();
		if (resourceManagerItemProvider != null) resourceManagerItemProvider.dispose();
		if (resourcePackageItemProvider != null) resourcePackageItemProvider.dispose();
		if (resourcePortItemProvider != null) resourcePortItemProvider.dispose();
		if (resourceServiceItemProvider != null) resourceServiceItemProvider.dispose();
		if (resourceUsageItemProvider != null) resourceUsageItemProvider.dispose();
		if (schedulerItemProvider != null) schedulerItemProvider.dispose();
		if (schedulableResourceItemProvider != null) schedulableResourceItemProvider.dispose();
		if (schedulingParameterItemProvider != null) schedulingParameterItemProvider.dispose();
		if (schedulingPolicyItemProvider != null) schedulingPolicyItemProvider.dispose();
		if (secondarySchedulerItemProvider != null) secondarySchedulerItemProvider.dispose();
		if (staticUsageItemProvider != null) staticUsageItemProvider.dispose();
		if (storageResourceItemProvider != null) storageResourceItemProvider.dispose();
		if (synchResourceItemProvider != null) synchResourceItemProvider.dispose();
		if (timerResourceItemProvider != null) timerResourceItemProvider.dispose();
		if (usageDemandItemProvider != null) usageDemandItemProvider.dispose();
		if (usageTypedAmountItemProvider != null) usageTypedAmountItemProvider.dispose();
	}

}
