/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bportal.kernel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AdvTemplate. This utility wraps
 * {@link com.bportal.kernel.service.impl.AdvTemplateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplateLocalService
 * @see com.bportal.kernel.service.base.AdvTemplateLocalServiceBaseImpl
 * @see com.bportal.kernel.service.impl.AdvTemplateLocalServiceImpl
 * @generated
 */
@ProviderType
public class AdvTemplateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.bportal.kernel.service.impl.AdvTemplateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the adv template to the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplate the adv template
	* @return the adv template that was added
	*/
	public static com.bportal.kernel.model.AdvTemplate addAdvTemplate(
		com.bportal.kernel.model.AdvTemplate advTemplate) {
		return getService().addAdvTemplate(advTemplate);
	}

	public static com.bportal.kernel.model.AdvTemplate addOrUpdate(
		long advTemplateId, java.lang.String templateName,
		java.lang.String content, java.lang.String description, int type,
		int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .addOrUpdate(advTemplateId, templateName, content,
			description, type, status, serviceContext);
	}

	/**
	* Creates a new adv template with the primary key. Does not add the adv template to the database.
	*
	* @param advTemplateId the primary key for the new adv template
	* @return the new adv template
	*/
	public static com.bportal.kernel.model.AdvTemplate createAdvTemplate(
		long advTemplateId) {
		return getService().createAdvTemplate(advTemplateId);
	}

	/**
	* Deletes the adv template from the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplate the adv template
	* @return the adv template that was removed
	*/
	public static com.bportal.kernel.model.AdvTemplate deleteAdvTemplate(
		com.bportal.kernel.model.AdvTemplate advTemplate) {
		return getService().deleteAdvTemplate(advTemplate);
	}

	/**
	* Deletes the adv template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template that was removed
	* @throws PortalException if a adv template with the primary key could not be found
	*/
	public static com.bportal.kernel.model.AdvTemplate deleteAdvTemplate(
		long advTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAdvTemplate(advTemplateId);
	}

	public static com.bportal.kernel.model.AdvTemplate fetchAdvTemplate(
		long advTemplateId) {
		return getService().fetchAdvTemplate(advTemplateId);
	}

	/**
	* Returns the adv template with the primary key.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template
	* @throws PortalException if a adv template with the primary key could not be found
	*/
	public static com.bportal.kernel.model.AdvTemplate getAdvTemplate(
		long advTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAdvTemplate(advTemplateId);
	}

	/**
	* Updates the adv template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advTemplate the adv template
	* @return the adv template that was updated
	*/
	public static com.bportal.kernel.model.AdvTemplate updateAdvTemplate(
		com.bportal.kernel.model.AdvTemplate advTemplate) {
		return getService().updateAdvTemplate(advTemplate);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of adv templates.
	*
	* @return the number of adv templates
	*/
	public static int getAdvTemplatesCount() {
		return getService().getAdvTemplatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.bportal.kernel.model.AdvTemplate> findByStatus(
		int status) {
		return getService().findByStatus(status);
	}

	/**
	* Returns a range of all the adv templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @return the range of adv templates
	*/
	public static java.util.List<com.bportal.kernel.model.AdvTemplate> getAdvTemplates(
		int start, int end) {
		return getService().getAdvTemplates(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AdvTemplateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AdvTemplateLocalService, AdvTemplateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AdvTemplateLocalService.class);
}