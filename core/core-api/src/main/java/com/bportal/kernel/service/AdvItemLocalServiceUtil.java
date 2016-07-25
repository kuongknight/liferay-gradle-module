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
 * Provides the local service utility for AdvItem. This utility wraps
 * {@link com.bportal.kernel.service.impl.AdvItemLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemLocalService
 * @see com.bportal.kernel.service.base.AdvItemLocalServiceBaseImpl
 * @see com.bportal.kernel.service.impl.AdvItemLocalServiceImpl
 * @generated
 */
@ProviderType
public class AdvItemLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.bportal.kernel.service.impl.AdvItemLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the adv item to the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was added
	*/
	public static com.bportal.kernel.model.AdvItem addAdvItem(
		com.bportal.kernel.model.AdvItem advItem) {
		return getService().addAdvItem(advItem);
	}

	public static com.bportal.kernel.model.AdvItem addOrUpdate(long itemId,
		long packageId, java.lang.String itemName,
		java.lang.String description, java.lang.String targetLink,
		java.lang.String content, int duaration, int order, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .addOrUpdate(itemId, packageId, itemName, description,
			targetLink, content, duaration, order, status, serviceContext);
	}

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param advItemId the primary key for the new adv item
	* @return the new adv item
	*/
	public static com.bportal.kernel.model.AdvItem createAdvItem(long advItemId) {
		return getService().createAdvItem(advItemId);
	}

	/**
	* Deletes the adv item from the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was removed
	*/
	public static com.bportal.kernel.model.AdvItem deleteAdvItem(
		com.bportal.kernel.model.AdvItem advItem) {
		return getService().deleteAdvItem(advItem);
	}

	/**
	* Deletes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	public static com.bportal.kernel.model.AdvItem deleteAdvItem(long advItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAdvItem(advItemId);
	}

	public static com.bportal.kernel.model.AdvItem fetchAdvItem(long advItemId) {
		return getService().fetchAdvItem(advItemId);
	}

	/**
	* Returns the adv item with the primary key.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	public static com.bportal.kernel.model.AdvItem getAdvItem(long advItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAdvItem(advItemId);
	}

	/**
	* Updates the adv item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was updated
	*/
	public static com.bportal.kernel.model.AdvItem updateAdvItem(
		com.bportal.kernel.model.AdvItem advItem) {
		return getService().updateAdvItem(advItem);
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

	public static int countByByPackageId(long packageId) {
		return getService().countByByPackageId(packageId);
	}

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	public static int getAdvItemsCount() {
		return getService().getAdvItemsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bportal.kernel.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.bportal.kernel.model.AdvItem> findByPackageId(
		long packageId, int start, int end) {
		return getService().findByPackageId(packageId, start, end);
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
	public static java.util.List<com.bportal.kernel.model.AdvItem> getAdvItems(
		int start, int end) {
		return getService().getAdvItems(start, end);
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

	public static AdvItemLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AdvItemLocalService, AdvItemLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AdvItemLocalService.class);
}