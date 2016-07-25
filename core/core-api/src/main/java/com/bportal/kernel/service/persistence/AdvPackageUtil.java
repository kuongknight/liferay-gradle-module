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

import com.bportal.kernel.model.AdvPackage;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the adv package service. This utility wraps {@link com.bportal.kernel.service.persistence.impl.AdvPackagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackagePersistence
 * @see com.bportal.kernel.service.persistence.impl.AdvPackagePersistenceImpl
 * @generated
 */
@ProviderType
public class AdvPackageUtil {
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
	public static void clearCache(AdvPackage advPackage) {
		getPersistence().clearCache(advPackage);
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
	public static List<AdvPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AdvPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AdvPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AdvPackage> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AdvPackage update(AdvPackage advPackage) {
		return getPersistence().update(advPackage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AdvPackage update(AdvPackage advPackage,
		ServiceContext serviceContext) {
		return getPersistence().update(advPackage, serviceContext);
	}

	/**
	* Returns all the adv packages where status = &#63;.
	*
	* @param status the status
	* @return the matching adv packages
	*/
	public static List<AdvPackage> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the adv packages where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @return the range of matching adv packages
	*/
	public static List<AdvPackage> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the adv packages where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv packages
	*/
	public static List<AdvPackage> findByStatus(int status, int start, int end,
		OrderByComparator<AdvPackage> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv packages where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv packages
	*/
	public static List<AdvPackage> findByStatus(int status, int start, int end,
		OrderByComparator<AdvPackage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv package
	* @throws NoSuchAdvPackageException if a matching adv package could not be found
	*/
	public static AdvPackage findByStatus_First(int status,
		OrderByComparator<AdvPackage> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvPackageException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv package, or <code>null</code> if a matching adv package could not be found
	*/
	public static AdvPackage fetchByStatus_First(int status,
		OrderByComparator<AdvPackage> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv package
	* @throws NoSuchAdvPackageException if a matching adv package could not be found
	*/
	public static AdvPackage findByStatus_Last(int status,
		OrderByComparator<AdvPackage> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvPackageException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv package, or <code>null</code> if a matching adv package could not be found
	*/
	public static AdvPackage fetchByStatus_Last(int status,
		OrderByComparator<AdvPackage> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the adv packages before and after the current adv package in the ordered set where status = &#63;.
	*
	* @param advPackageId the primary key of the current adv package
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv package
	* @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	*/
	public static AdvPackage[] findByStatus_PrevAndNext(long advPackageId,
		int status, OrderByComparator<AdvPackage> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvPackageException {
		return getPersistence()
				   .findByStatus_PrevAndNext(advPackageId, status,
			orderByComparator);
	}

	/**
	* Removes all the adv packages where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of adv packages where status = &#63;.
	*
	* @param status the status
	* @return the number of matching adv packages
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Caches the adv package in the entity cache if it is enabled.
	*
	* @param advPackage the adv package
	*/
	public static void cacheResult(AdvPackage advPackage) {
		getPersistence().cacheResult(advPackage);
	}

	/**
	* Caches the adv packages in the entity cache if it is enabled.
	*
	* @param advPackages the adv packages
	*/
	public static void cacheResult(List<AdvPackage> advPackages) {
		getPersistence().cacheResult(advPackages);
	}

	/**
	* Creates a new adv package with the primary key. Does not add the adv package to the database.
	*
	* @param advPackageId the primary key for the new adv package
	* @return the new adv package
	*/
	public static AdvPackage create(long advPackageId) {
		return getPersistence().create(advPackageId);
	}

	/**
	* Removes the adv package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package that was removed
	* @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	*/
	public static AdvPackage remove(long advPackageId)
		throws com.bportal.kernel.exception.NoSuchAdvPackageException {
		return getPersistence().remove(advPackageId);
	}

	public static AdvPackage updateImpl(AdvPackage advPackage) {
		return getPersistence().updateImpl(advPackage);
	}

	/**
	* Returns the adv package with the primary key or throws a {@link NoSuchAdvPackageException} if it could not be found.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package
	* @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	*/
	public static AdvPackage findByPrimaryKey(long advPackageId)
		throws com.bportal.kernel.exception.NoSuchAdvPackageException {
		return getPersistence().findByPrimaryKey(advPackageId);
	}

	/**
	* Returns the adv package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package, or <code>null</code> if a adv package with the primary key could not be found
	*/
	public static AdvPackage fetchByPrimaryKey(long advPackageId) {
		return getPersistence().fetchByPrimaryKey(advPackageId);
	}

	public static java.util.Map<java.io.Serializable, AdvPackage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the adv packages.
	*
	* @return the adv packages
	*/
	public static List<AdvPackage> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the adv packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @return the range of adv packages
	*/
	public static List<AdvPackage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the adv packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of adv packages
	*/
	public static List<AdvPackage> findAll(int start, int end,
		OrderByComparator<AdvPackage> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv packages
	* @param end the upper bound of the range of adv packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of adv packages
	*/
	public static List<AdvPackage> findAll(int start, int end,
		OrderByComparator<AdvPackage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the adv packages from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of adv packages.
	*
	* @return the number of adv packages
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AdvPackagePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AdvPackagePersistence, AdvPackagePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AdvPackagePersistence.class);
}