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

import com.bportal.kernel.exception.NoSuchAdvTemplateException;
import com.bportal.kernel.model.AdvTemplate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the adv template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.persistence.impl.AdvTemplatePersistenceImpl
 * @see AdvTemplateUtil
 * @generated
 */
@ProviderType
public interface AdvTemplatePersistence extends BasePersistence<AdvTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvTemplateUtil} to access the adv template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the adv templates where status = &#63;.
	*
	* @param status the status
	* @return the matching adv templates
	*/
	public java.util.List<AdvTemplate> findByStatus(int status);

	/**
	* Returns a range of all the adv templates where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @return the range of matching adv templates
	*/
	public java.util.List<AdvTemplate> findByStatus(int status, int start,
		int end);

	/**
	* Returns an ordered range of all the adv templates where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv templates
	*/
	public java.util.List<AdvTemplate> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator);

	/**
	* Returns an ordered range of all the adv templates where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv templates
	*/
	public java.util.List<AdvTemplate> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv template
	* @throws NoSuchAdvTemplateException if a matching adv template could not be found
	*/
	public AdvTemplate findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator)
		throws NoSuchAdvTemplateException;

	/**
	* Returns the first adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv template, or <code>null</code> if a matching adv template could not be found
	*/
	public AdvTemplate fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator);

	/**
	* Returns the last adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv template
	* @throws NoSuchAdvTemplateException if a matching adv template could not be found
	*/
	public AdvTemplate findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator)
		throws NoSuchAdvTemplateException;

	/**
	* Returns the last adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv template, or <code>null</code> if a matching adv template could not be found
	*/
	public AdvTemplate fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator);

	/**
	* Returns the adv templates before and after the current adv template in the ordered set where status = &#63;.
	*
	* @param advTemplateId the primary key of the current adv template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv template
	* @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	*/
	public AdvTemplate[] findByStatus_PrevAndNext(long advTemplateId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator)
		throws NoSuchAdvTemplateException;

	/**
	* Removes all the adv templates where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of adv templates where status = &#63;.
	*
	* @param status the status
	* @return the number of matching adv templates
	*/
	public int countByStatus(int status);

	/**
	* Caches the adv template in the entity cache if it is enabled.
	*
	* @param advTemplate the adv template
	*/
	public void cacheResult(AdvTemplate advTemplate);

	/**
	* Caches the adv templates in the entity cache if it is enabled.
	*
	* @param advTemplates the adv templates
	*/
	public void cacheResult(java.util.List<AdvTemplate> advTemplates);

	/**
	* Creates a new adv template with the primary key. Does not add the adv template to the database.
	*
	* @param advTemplateId the primary key for the new adv template
	* @return the new adv template
	*/
	public AdvTemplate create(long advTemplateId);

	/**
	* Removes the adv template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template that was removed
	* @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	*/
	public AdvTemplate remove(long advTemplateId)
		throws NoSuchAdvTemplateException;

	public AdvTemplate updateImpl(AdvTemplate advTemplate);

	/**
	* Returns the adv template with the primary key or throws a {@link NoSuchAdvTemplateException} if it could not be found.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template
	* @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	*/
	public AdvTemplate findByPrimaryKey(long advTemplateId)
		throws NoSuchAdvTemplateException;

	/**
	* Returns the adv template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template, or <code>null</code> if a adv template with the primary key could not be found
	*/
	public AdvTemplate fetchByPrimaryKey(long advTemplateId);

	@Override
	public java.util.Map<java.io.Serializable, AdvTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the adv templates.
	*
	* @return the adv templates
	*/
	public java.util.List<AdvTemplate> findAll();

	/**
	* Returns a range of all the adv templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @return the range of adv templates
	*/
	public java.util.List<AdvTemplate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the adv templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of adv templates
	*/
	public java.util.List<AdvTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator);

	/**
	* Returns an ordered range of all the adv templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv templates
	* @param end the upper bound of the range of adv templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of adv templates
	*/
	public java.util.List<AdvTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the adv templates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of adv templates.
	*
	* @return the number of adv templates
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}