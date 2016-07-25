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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AdvTemplateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplateLocalService
 * @generated
 */
@ProviderType
public class AdvTemplateLocalServiceWrapper implements AdvTemplateLocalService,
	ServiceWrapper<AdvTemplateLocalService> {
	public AdvTemplateLocalServiceWrapper(
		AdvTemplateLocalService advTemplateLocalService) {
		_advTemplateLocalService = advTemplateLocalService;
	}

	/**
	* Adds the adv template to the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplate the adv template
	* @return the adv template that was added
	*/
	@Override
	public com.bportal.kernel.model.AdvTemplate addAdvTemplate(
		com.bportal.kernel.model.AdvTemplate advTemplate) {
		return _advTemplateLocalService.addAdvTemplate(advTemplate);
	}

	@Override
	public com.bportal.kernel.model.AdvTemplate addOrUpdate(
		long advTemplateId, java.lang.String templateName,
		java.lang.String content, java.lang.String description, int type,
		int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _advTemplateLocalService.addOrUpdate(advTemplateId,
			templateName, content, description, type, status, serviceContext);
	}

	/**
	* Creates a new adv template with the primary key. Does not add the adv template to the database.
	*
	* @param advTemplateId the primary key for the new adv template
	* @return the new adv template
	*/
	@Override
	public com.bportal.kernel.model.AdvTemplate createAdvTemplate(
		long advTemplateId) {
		return _advTemplateLocalService.createAdvTemplate(advTemplateId);
	}

	/**
	* Deletes the adv template from the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplate the adv template
	* @return the adv template that was removed
	*/
	@Override
	public com.bportal.kernel.model.AdvTemplate deleteAdvTemplate(
		com.bportal.kernel.model.AdvTemplate advTemplate) {
		return _advTemplateLocalService.deleteAdvTemplate(advTemplate);
	}

	/**
	* Deletes the adv template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template that was removed
	* @throws PortalException if a adv template with the primary key could not be found
	*/
	@Override
	public com.bportal.kernel.model.AdvTemplate deleteAdvTemplate(
		long advTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTemplateLocalService.deleteAdvTemplate(advTemplateId);
	}

	@Override
	public com.bportal.kernel.model.AdvTemplate fetchAdvTemplate(
		long advTemplateId) {
		return _advTemplateLocalService.fetchAdvTemplate(advTemplateId);
	}

	/**
	* Returns the adv template with the primary key.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template
	* @throws PortalException if a adv template with the primary key could not be found
	*/
	@Override
	public com.bportal.kernel.model.AdvTemplate getAdvTemplate(
		long advTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTemplateLocalService.getAdvTemplate(advTemplateId);
	}

	/**
	* Updates the adv template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advTemplate the adv template
	* @return the adv template that was updated
	*/
	@Override
	public com.bportal.kernel.model.AdvTemplate updateAdvTemplate(
		com.bportal.kernel.model.AdvTemplate advTemplate) {
		return _advTemplateLocalService.updateAdvTemplate(advTemplate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _advTemplateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advTemplateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _advTemplateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTemplateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTemplateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of adv templates.
	*
	* @return the number of adv templates
	*/
	@Override
	public int getAdvTemplatesCount() {
		return _advTemplateLocalService.getAdvTemplatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advTemplateLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _advTemplateLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _advTemplateLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _advTemplateLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.bportal.kernel.model.AdvTemplate> findByStatus(
		int status) {
		return _advTemplateLocalService.findByStatus(status);
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
	@Override
	public java.util.List<com.bportal.kernel.model.AdvTemplate> getAdvTemplates(
		int start, int end) {
		return _advTemplateLocalService.getAdvTemplates(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _advTemplateLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _advTemplateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AdvTemplateLocalService getWrappedService() {
		return _advTemplateLocalService;
	}

	@Override
	public void setWrappedService(
		AdvTemplateLocalService advTemplateLocalService) {
		_advTemplateLocalService = advTemplateLocalService;
	}

	private AdvTemplateLocalService _advTemplateLocalService;
}