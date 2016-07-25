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

import com.bportal.kernel.model.AdvTemplate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the adv template service. This utility wraps {@link com.bportal.kernel.service.persistence.impl.AdvTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplatePersistence
 * @see com.bportal.kernel.service.persistence.impl.AdvTemplatePersistenceImpl
 * @generated
 */
@ProviderType
public class AdvTemplateUtil {
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
	public static void clearCache(AdvTemplate advTemplate) {
		getPersistence().clearCache(advTemplate);
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
	public static List<AdvTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AdvTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AdvTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AdvTemplate update(AdvTemplate advTemplate) {
		return getPersistence().update(advTemplate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AdvTemplate update(AdvTemplate advTemplate,
		ServiceContext serviceContext) {
		return getPersistence().update(advTemplate, serviceContext);
	}

	/**
	* Returns all the adv templates where status = &#63;.
	*
	* @param status the status
	* @return the matching adv templates
	*/
	public static List<AdvTemplate> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

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
	public static List<AdvTemplate> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

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
	public static List<AdvTemplate> findByStatus(int status, int start,
		int end, OrderByComparator<AdvTemplate> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

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
	public static List<AdvTemplate> findByStatus(int status, int start,
		int end, OrderByComparator<AdvTemplate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv template
	* @throws NoSuchAdvTemplateException if a matching adv template could not be found
	*/
	public static AdvTemplate findByStatus_First(int status,
		OrderByComparator<AdvTemplate> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvTemplateException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv template, or <code>null</code> if a matching adv template could not be found
	*/
	public static AdvTemplate fetchByStatus_First(int status,
		OrderByComparator<AdvTemplate> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv template
	* @throws NoSuchAdvTemplateException if a matching adv template could not be found
	*/
	public static AdvTemplate findByStatus_Last(int status,
		OrderByComparator<AdvTemplate> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvTemplateException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last adv template in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv template, or <code>null</code> if a matching adv template could not be found
	*/
	public static AdvTemplate fetchByStatus_Last(int status,
		OrderByComparator<AdvTemplate> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the adv templates before and after the current adv template in the ordered set where status = &#63;.
	*
	* @param advTemplateId the primary key of the current adv template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv template
	* @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	*/
	public static AdvTemplate[] findByStatus_PrevAndNext(long advTemplateId,
		int status, OrderByComparator<AdvTemplate> orderByComparator)
		throws com.bportal.kernel.exception.NoSuchAdvTemplateException {
		return getPersistence()
				   .findByStatus_PrevAndNext(advTemplateId, status,
			orderByComparator);
	}

	/**
	* Removes all the adv templates where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of adv templates where status = &#63;.
	*
	* @param status the status
	* @return the number of matching adv templates
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Caches the adv template in the entity cache if it is enabled.
	*
	* @param advTemplate the adv template
	*/
	public static void cacheResult(AdvTemplate advTemplate) {
		getPersistence().cacheResult(advTemplate);
	}

	/**
	* Caches the adv templates in the entity cache if it is enabled.
	*
	* @param advTemplates the adv templates
	*/
	public static void cacheResult(List<AdvTemplate> advTemplates) {
		getPersistence().cacheResult(advTemplates);
	}

	/**
	* Creates a new adv template with the primary key. Does not add the adv template to the database.
	*
	* @param advTemplateId the primary key for the new adv template
	* @return the new adv template
	*/
	public static AdvTemplate create(long advTemplateId) {
		return getPersistence().create(advTemplateId);
	}

	/**
	* Removes the adv template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template that was removed
	* @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	*/
	public static AdvTemplate remove(long advTemplateId)
		throws com.bportal.kernel.exception.NoSuchAdvTemplateException {
		return getPersistence().remove(advTemplateId);
	}

	public static AdvTemplate updateImpl(AdvTemplate advTemplate) {
		return getPersistence().updateImpl(advTemplate);
	}

	/**
	* Returns the adv template with the primary key or throws a {@link NoSuchAdvTemplateException} if it could not be found.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template
	* @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	*/
	public static AdvTemplate findByPrimaryKey(long advTemplateId)
		throws com.bportal.kernel.exception.NoSuchAdvTemplateException {
		return getPersistence().findByPrimaryKey(advTemplateId);
	}

	/**
	* Returns the adv template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param advTemplateId the primary key of the adv template
	* @return the adv template, or <code>null</code> if a adv template with the primary key could not be found
	*/
	public static AdvTemplate fetchByPrimaryKey(long advTemplateId) {
		return getPersistence().fetchByPrimaryKey(advTemplateId);
	}

	public static java.util.Map<java.io.Serializable, AdvTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the adv templates.
	*
	* @return the adv templates
	*/
	public static List<AdvTemplate> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<AdvTemplate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<AdvTemplate> findAll(int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<AdvTemplate> findAll(int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the adv templates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of adv templates.
	*
	* @return the number of adv templates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AdvTemplatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AdvTemplatePersistence, AdvTemplatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AdvTemplatePersistence.class);
}