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

import com.bportal.kernel.exception.NoSuchAdvPackageException;
import com.bportal.kernel.model.AdvPackage;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the adv package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.persistence.impl.AdvPackagePersistenceImpl
 * @see AdvPackageUtil
 * @generated
 */
@ProviderType
public interface AdvPackagePersistence extends BasePersistence<AdvPackage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvPackageUtil} to access the adv package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the adv packages where status = &#63;.
	*
	* @param status the status
	* @return the matching adv packages
	*/
	public java.util.List<AdvPackage> findByStatus(int status);

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
	public java.util.List<AdvPackage> findByStatus(int status, int start,
		int end);

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
	public java.util.List<AdvPackage> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator);

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
	public java.util.List<AdvPackage> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv package
	* @throws NoSuchAdvPackageException if a matching adv package could not be found
	*/
	public AdvPackage findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator)
		throws NoSuchAdvPackageException;

	/**
	* Returns the first adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv package, or <code>null</code> if a matching adv package could not be found
	*/
	public AdvPackage fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator);

	/**
	* Returns the last adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv package
	* @throws NoSuchAdvPackageException if a matching adv package could not be found
	*/
	public AdvPackage findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator)
		throws NoSuchAdvPackageException;

	/**
	* Returns the last adv package in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv package, or <code>null</code> if a matching adv package could not be found
	*/
	public AdvPackage fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator);

	/**
	* Returns the adv packages before and after the current adv package in the ordered set where status = &#63;.
	*
	* @param advPackageId the primary key of the current adv package
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv package
	* @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	*/
	public AdvPackage[] findByStatus_PrevAndNext(long advPackageId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator)
		throws NoSuchAdvPackageException;

	/**
	* Removes all the adv packages where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of adv packages where status = &#63;.
	*
	* @param status the status
	* @return the number of matching adv packages
	*/
	public int countByStatus(int status);

	/**
	* Caches the adv package in the entity cache if it is enabled.
	*
	* @param advPackage the adv package
	*/
	public void cacheResult(AdvPackage advPackage);

	/**
	* Caches the adv packages in the entity cache if it is enabled.
	*
	* @param advPackages the adv packages
	*/
	public void cacheResult(java.util.List<AdvPackage> advPackages);

	/**
	* Creates a new adv package with the primary key. Does not add the adv package to the database.
	*
	* @param advPackageId the primary key for the new adv package
	* @return the new adv package
	*/
	public AdvPackage create(long advPackageId);

	/**
	* Removes the adv package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package that was removed
	* @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	*/
	public AdvPackage remove(long advPackageId)
		throws NoSuchAdvPackageException;

	public AdvPackage updateImpl(AdvPackage advPackage);

	/**
	* Returns the adv package with the primary key or throws a {@link NoSuchAdvPackageException} if it could not be found.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package
	* @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	*/
	public AdvPackage findByPrimaryKey(long advPackageId)
		throws NoSuchAdvPackageException;

	/**
	* Returns the adv package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param advPackageId the primary key of the adv package
	* @return the adv package, or <code>null</code> if a adv package with the primary key could not be found
	*/
	public AdvPackage fetchByPrimaryKey(long advPackageId);

	@Override
	public java.util.Map<java.io.Serializable, AdvPackage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the adv packages.
	*
	* @return the adv packages
	*/
	public java.util.List<AdvPackage> findAll();

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
	public java.util.List<AdvPackage> findAll(int start, int end);

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
	public java.util.List<AdvPackage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator);

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
	public java.util.List<AdvPackage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvPackage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the adv packages from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of adv packages.
	*
	* @return the number of adv packages
	*/
	public int countAll();
}