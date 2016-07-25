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
 * Provides a wrapper for {@link AdvPackageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackageLocalService
 * @generated
 */
@ProviderType
public class AdvPackageLocalServiceWrapper implements AdvPackageLocalService,
	ServiceWrapper<AdvPackageLocalService> {
	public AdvPackageLocalServiceWrapper(
		AdvPackageLocalService advPackageLocalService) {
		_advPackageLocalService = advPackageLocalService;
	}

	/**
	* Adds the adv package to the database. Also notifies the appropriate model listeners.
	*
	* @param advPackage the adv package
	* @return the adv package that was added
	*/
	@Override
	public com.bportal.kernel.model.AdvPackage addAdvPackage(
		com.bportal.kernel.model.AdvPackage advPackage) {
		return _advPackageLocalService.addAdvPackage(advPackage);
	}

	@Override
	public com.bportal.kernel.model.AdvPackage addOrUpdate(long packageId,
		long layoutId, long templateId, java.lang.String packageName,
		java.lang.String description, java.util.Date beginDate,
		java.util.Date expiredDate, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _advPackageLocalService.addOrUpdate(packageId, layoutId,
			templateId, packageName, description, beginDate, expiredDate,
			status, serviceContext);
	}

	/**
	* Creates a new adv package with the primary key. Does not add the adv package to the database.
	*
	* @param advPackageId the primary key for the new adv package
	* @return the new adv package
	*/
	@Override
	public com.bportal.kernel.model.AdvPackage createAdvPackage(
		long advPackageId) {
		return _advPackageLocalService.createAdvPackage(advPackageId);
	}

	/**
	* Deletes the adv package from the database. Also notifies the appropriate model listeners.
	*
	* @param advPackage the adv package
	* @return the adv package that was removed
	*/
	@Override
	public com.bportal.kernel.model.AdvPackage deleteAdvPackage(
		com.bportal.kernel.model.AdvPackage advPackage) {
		return _advPackageLocalService.deleteAdvPackage(advPackage);
	}

	/**
	* Deletes the adv package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package that was removed
	* @throws PortalException if a adv package with the primary key could not be found
	*/
	@Override
	public com.bportal.kernel.model.AdvPackage deleteAdvPackage(
		long advPackageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advPackageLocalService.deleteAdvPackage(advPackageId);
	}

	@Override
	public com.bportal.kernel.model.AdvPackage fetchAdvPackage(
		long advPackageId) {
		return _advPackageLocalService.fetchAdvPackage(advPackageId);
	}

	/**
	* Returns the adv package with the primary key.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package
	* @throws PortalException if a adv package with the primary key could not be found
	*/
	@Override
	public com.bportal.kernel.model.AdvPackage getAdvPackage(long advPackageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advPackageLocalService.getAdvPackage(advPackageId);
	}

	/**
	* Updates the adv package in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advPackage the adv package
	* @return the adv package that was updated
	*/
	@Override
	public com.bportal.kernel.model.AdvPackage updateAdvPackage(
		com.bportal.kernel.model.AdvPackage advPackage) {
		return _advPackageLocalService.updateAdvPackage(advPackage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _advPackageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advPackageLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _advPackageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advPackageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advPackageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of adv packages.
	*
	* @return the number of adv packages
	*/
	@Override
	public int getAdvPackagesCount() {
		return _advPackageLocalService.getAdvPackagesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advPackageLocalService.getOSGiServiceIdentifier();
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
		return _advPackageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advPackageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advPackageLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the adv packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @return the range of adv packages
	*/
	@Override
	public java.util.List<com.bportal.kernel.model.AdvPackage> getAdvPackages(
		int start, int end) {
		return _advPackageLocalService.getAdvPackages(start, end);
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
		return _advPackageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _advPackageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AdvPackageLocalService getWrappedService() {
		return _advPackageLocalService;
	}

	@Override
	public void setWrappedService(AdvPackageLocalService advPackageLocalService) {
		_advPackageLocalService = advPackageLocalService;
	}

	private AdvPackageLocalService _advPackageLocalService;
}