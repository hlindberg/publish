/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package com.cloudsmith.publish.impl;

import com.cloudsmith.publish.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PublishFactoryImpl extends EFactoryImpl implements PublishFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PublishPackage getPackage() {
		return PublishPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PublishFactory init() {
		try {
			PublishFactory thePublishFactory = (PublishFactory) EPackage.Registry.INSTANCE.getEFactory("http://com.cloudsmith.publish/1.0");
			if(thePublishFactory != null) {
				return thePublishFactory;
			}
		}
		catch(Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PublishFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublishFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch(eClass.getClassifierID()) {
			case PublishPackage.NATIVE_ACTIONS:
				return createNativeActions();
			case PublishPackage.GEM_ACTIONS:
				return createGEMActions();
			case PublishPackage.PUBLISHER_ACTION:
				return createPublisherAction();
			case PublishPackage.ACTION_PARAMETER:
				return createActionParameter();
			case PublishPackage.RPM_ACTIONS:
				return createRPMActions();
			case PublishPackage.RPM_PUBLISHER:
				return createRPMPublisher();
			case PublishPackage.GEM_PUBLISHER:
				return createGEMPublisher();
			case PublishPackage.REPOSITORY_PUBLISHER:
				return createRepositoryPublisher();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionParameter createActionParameter() {
		ActionParameterImpl actionParameter = new ActionParameterImpl();
		return actionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GEMActions createGEMActions() {
		GEMActionsImpl gemActions = new GEMActionsImpl();
		return gemActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GEMPublisher createGEMPublisher() {
		GEMPublisherImpl gemPublisher = new GEMPublisherImpl();
		return gemPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NativeActions createNativeActions() {
		NativeActionsImpl nativeActions = new NativeActionsImpl();
		return nativeActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction createPublisherAction() {
		PublisherActionImpl publisherAction = new PublisherActionImpl();
		return publisherAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RepositoryPublisher createRepositoryPublisher() {
		RepositoryPublisherImpl repositoryPublisher = new RepositoryPublisherImpl();
		return repositoryPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RPMActions createRPMActions() {
		RPMActionsImpl rpmActions = new RPMActionsImpl();
		return rpmActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RPMPublisher createRPMPublisher() {
		RPMPublisherImpl rpmPublisher = new RPMPublisherImpl();
		return rpmPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublishPackage getPublishPackage() {
		return (PublishPackage) getEPackage();
	}

} // PublishFactoryImpl
