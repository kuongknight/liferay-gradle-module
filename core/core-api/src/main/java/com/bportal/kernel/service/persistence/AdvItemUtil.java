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

package com.bportal.kernel.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bportal.kernel.model.AdvItem;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the adv item service. This utility wraps {@link com.bportal.kernel.service.persistence.impl.AdvItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemPersistence
 * @see com.bportal.kernel.service.persistence.impl.AdvItemPersistenceImpl
 * @generated
 */
@ProviderType
public class AdvItemUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AdvItem advItem) {
		getPersistence().clearCache(advItem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AdvItem> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AdvItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AdvItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AdvItem update(AdvItem advItem) {
		return getPersistence().update(advItem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AdvItem update(AdvItem advItem, ServiceContext serviceContext) {
		return getPersistence().update(advItem, serviceContext);
	}

	/**
	* Returns all the adv items where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @return the matching adv items
	*/
	public static List<AdvItem> findByAdvPackageId(long advPackageId) {
		return getPersistence().findByAdvPackageId(advPackageId);
	}

	/**
	* Returns a range of all the adv items where advPackageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param advPackageId the adv package ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByAdvPackageId(long advPackageId,
		int start, int end) {
		return getPersistence().findByAdvPackageId(advPackageId, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where advPackageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param advPackageId the adv package ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByAdvPackageId(long advPackageId,
		int start, int end, OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findByAdvPackageId(advPackageId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where advPackageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param advPackageId the adv package ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByAdvPackageId(long advPackageId,
		int start, int end, OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAdvPackageId(advPackageId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByAdvPackageId_First(long advPackageId,
		OrderByComparator<AdvItem> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByAdvPackageId_First(advPackageId, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByAdvPackageId_First(long advPackageId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByAdvPackageId_First(advPackageId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByAdvPackageId_Last(long advPackageId,
		OrderByComparator<AdvItem> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByAdvPackageId_Last(advPackageId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByAdvPackageId_Last(long advPackageId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByAdvPackageId_Last(advPackageId, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advItemId the primary key of the current adv item
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByAdvPackageId_PrevAndNext(long advItemId,
		long advPackageId, OrderByComparator<AdvItem> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByAdvPackageId_PrevAndNext(advItemId, advPackageId,
			orderByComparator);
	}

	/**
	* Removes all the adv items where advPackageId = &#63; from the database.
	*
	* @param advPackageId the adv package ID
	*/
	public static void removeByAdvPackageId(long advPackageId) {
		getPersistence().removeByAdvPackageId(advPackageId);
	}

	/**
	* Returns the number of adv items where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @return the number of matching adv items
	*/
	public static int countByAdvPackageId(long advPackageId) {
		return getPersistence().countByAdvPackageId(advPackageId);
	}

	/**
	* Returns all the adv items where status = &#63;.
	*
	* @param status the status
	* @return the matching adv items
	*/
	public static List<AdvItem> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the adv items where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByStatus(int status, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByStatus(int status, int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByStatus_First(int status,
		OrderByComparator<AdvItem> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByStatus_First(int status,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByStatus_Last(int status,
		OrderByComparator<AdvItem> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByStatus_Last(int status,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where status = &#63;.
	*
	* @param advItemId the primary key of the current adv item
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByStatus_PrevAndNext(long advItemId,
		int status, OrderByComparator<AdvItem> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByStatus_PrevAndNext(advItemId, status,
			orderByComparator);
	}

	/**
	* Removes all the adv items where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of adv items where status = &#63;.
	*
	* @param status the status
	* @return the number of matching adv items
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Caches the adv item in the entity cache if it is enabled.
	*
	* @param advItem the adv item
	*/
	public static void cacheResult(AdvItem advItem) {
		getPersistence().cacheResult(advItem);
	}

	/**
	* Caches the adv items in the entity cache if it is enabled.
	*
	* @param advItems the adv items
	*/
	public static void cacheResult(List<AdvItem> advItems) {
		getPersistence().cacheResult(advItems);
	}

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param advItemId the primary key for the new adv item
	* @return the new adv item
	*/
	public static AdvItem create(long advItemId) {
		return getPersistence().create(advItemId);
	}

	/**
	* Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem remove(long advItemId)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence().remove(advItemId);
	}

	public static AdvItem updateImpl(AdvItem advItem) {
		return getPersistence().updateImpl(advItem);
	}

	/**
	* Returns the adv item with the primary key or throws a {@link NoSuchAdvItemException} if it could not be found.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem findByPrimaryKey(long advItemId)
		throws com.bportal.kernel.exception.NoSuchAdvItemException {
		return getPersistence().findByPrimaryKey(advItemId);
	}

	/**
	* Returns the adv item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	*/
	public static AdvItem fetchByPrimaryKey(long advItemId) {
		return getPersistence().fetchByPrimaryKey(advItemId);
	}

	public static java.util.Map<java.io.Serializable, AdvItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the adv items.
	*
	* @return the adv items
	*/
	public static List<AdvItem> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of adv items
	*/
	public static List<AdvItem> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of adv items
	*/
	public static List<AdvItem> findAll(int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of adv items
	*/
	public static List<AdvItem> findAll(int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the adv items from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AdvItemPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AdvItemPersistence, AdvItemPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AdvItemPersistence.class);
}