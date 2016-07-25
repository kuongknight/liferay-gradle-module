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
 * Provides a wrapper for {@link AdvItemLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemLocalService
 * @generated
 */
@ProviderType
public class AdvItemLocalServiceWrapper implements AdvItemLocalService,
	ServiceWrapper<AdvItemLocalService> {
	public AdvItemLocalServiceWrapper(AdvItemLocalService advItemLocalService) {
		_advItemLocalService = advItemLocalService;
	}

	/**
	* Adds the adv item to the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was added
	*/
	@Override
	public com.bportal.kernel.model.AdvItem addAdvItem(
		com.bportal.kernel.model.AdvItem advItem) {
		return _advItemLocalService.addAdvItem(advItem);
	}

	@Override
	public com.bportal.kernel.model.AdvItem addOrUpdate(long itemId,
		long packageId, java.lang.String itemName,
		java.lang.String description, java.lang.String targetLink,
		java.lang.String content, int duaration, int order, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _advItemLocalService.addOrUpdate(itemId, packageId, itemName,
			description, targetLink, content, duaration, order, status,
			serviceContext);
	}

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param advItemId the primary key for the new adv item
	* @return the new adv item
	*/
	@Override
	public com.bportal.kernel.model.AdvItem createAdvItem(long advItemId) {
		return _advItemLocalService.createAdvItem(advItemId);
	}

	/**
	* Deletes the adv item from the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was removed
	*/
	@Override
	public com.bportal.kernel.model.AdvItem deleteAdvItem(
		com.bportal.kernel.model.AdvItem advItem) {
		return _advItemLocalService.deleteAdvItem(advItem);
	}

	/**
	* Deletes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	@Override
	public com.bportal.kernel.model.AdvItem deleteAdvItem(long advItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.deleteAdvItem(advItemId);
	}

	@Override
	public com.bportal.kernel.model.AdvItem fetchAdvItem(long advItemId) {
		return _advItemLocalService.fetchAdvItem(advItemId);
	}

	/**
	* Returns the adv item with the primary key.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	@Override
	public com.bportal.kernel.model.AdvItem getAdvItem(long advItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.getAdvItem(advItemId);
	}

	/**
	* Updates the adv item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was updated
	*/
	@Override
	public com.bportal.kernel.model.AdvItem updateAdvItem(
		com.bportal.kernel.model.AdvItem advItem) {
		return _advItemLocalService.updateAdvItem(advItem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _advItemLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advItemLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _advItemLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByByPackageId(long packageId) {
		return _advItemLocalService.countByByPackageId(packageId);
	}

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	@Override
	public int getAdvItemsCount() {
		return _advItemLocalService.getAdvItemsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advItemLocalService.getOSGiServiceIdentifier();
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
		return _advItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advItemLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.bportal.kernel.model.AdvItem> findByPackageId(
		long packageId, int start, int end) {
		return _advItemLocalService.findByPackageId(packageId, start, end);
	}

	/**
	* Returns a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of adv items
	*/
	@Override
	public java.util.List<com.bportal.kernel.model.AdvItem> getAdvItems(
		int start, int end) {
		return _advItemLocalService.getAdvItems(start, end);
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
		return _advItemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _advItemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public AdvItemLocalService getWrappedService() {
		return _advItemLocalService;
	}

	@Override
	public void setWrappedService(AdvItemLocalService advItemLocalService) {
		_advItemLocalService = advItemLocalService;
	}

	private AdvItemLocalService _advItemLocalService;
}