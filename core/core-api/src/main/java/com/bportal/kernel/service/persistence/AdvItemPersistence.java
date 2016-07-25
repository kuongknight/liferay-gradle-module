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

import com.bportal.kernel.exception.NoSuchAdvItemException;
import com.bportal.kernel.model.AdvItem;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the adv item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.persistence.impl.AdvItemPersistenceImpl
 * @see AdvItemUtil
 * @generated
 */
@ProviderType
public interface AdvItemPersistence extends BasePersistence<AdvItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvItemUtil} to access the adv item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the adv items where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByAdvPackageId(long advPackageId);

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
	public java.util.List<AdvItem> findByAdvPackageId(long advPackageId,
		int start, int end);

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
	public java.util.List<AdvItem> findByAdvPackageId(long advPackageId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

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
	public java.util.List<AdvItem> findByAdvPackageId(long advPackageId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByAdvPackageId_First(long advPackageId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByAdvPackageId_First(long advPackageId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByAdvPackageId_Last(long advPackageId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByAdvPackageId_Last(long advPackageId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where advPackageId = &#63;.
	*
	* @param advItemId the primary key of the current adv item
	* @param advPackageId the adv package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByAdvPackageId_PrevAndNext(long advItemId,
		long advPackageId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where advPackageId = &#63; from the database.
	*
	* @param advPackageId the adv package ID
	*/
	public void removeByAdvPackageId(long advPackageId);

	/**
	* Returns the number of adv items where advPackageId = &#63;.
	*
	* @param advPackageId the adv package ID
	* @return the number of matching adv items
	*/
	public int countByAdvPackageId(long advPackageId);

	/**
	* Returns all the adv items where status = &#63;.
	*
	* @param status the status
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByStatus(int status);

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
	public java.util.List<AdvItem> findByStatus(int status, int start, int end);

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
	public java.util.List<AdvItem> findByStatus(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

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
	public java.util.List<AdvItem> findByStatus(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where status = &#63;.
	*
	* @param advItemId the primary key of the current adv item
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByStatus_PrevAndNext(long advItemId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of adv items where status = &#63;.
	*
	* @param status the status
	* @return the number of matching adv items
	*/
	public int countByStatus(int status);

	/**
	* Caches the adv item in the entity cache if it is enabled.
	*
	* @param advItem the adv item
	*/
	public void cacheResult(AdvItem advItem);

	/**
	* Caches the adv items in the entity cache if it is enabled.
	*
	* @param advItems the adv items
	*/
	public void cacheResult(java.util.List<AdvItem> advItems);

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param advItemId the primary key for the new adv item
	* @return the new adv item
	*/
	public AdvItem create(long advItemId);

	/**
	* Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem remove(long advItemId) throws NoSuchAdvItemException;

	public AdvItem updateImpl(AdvItem advItem);

	/**
	* Returns the adv item with the primary key or throws a {@link NoSuchAdvItemException} if it could not be found.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem findByPrimaryKey(long advItemId)
		throws NoSuchAdvItemException;

	/**
	* Returns the adv item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param advItemId the primary key of the adv item
	* @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	*/
	public AdvItem fetchByPrimaryKey(long advItemId);

	@Override
	public java.util.Map<java.io.Serializable, AdvItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the adv items.
	*
	* @return the adv items
	*/
	public java.util.List<AdvItem> findAll();

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
	public java.util.List<AdvItem> findAll(int start, int end);

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
	public java.util.List<AdvItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

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
	public java.util.List<AdvItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the adv items from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}