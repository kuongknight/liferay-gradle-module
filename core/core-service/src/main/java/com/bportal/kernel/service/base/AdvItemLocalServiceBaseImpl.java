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

package com.bportal.kernel.service.base;

import aQute.bnd.annotation.ProviderType;

import com.bportal.kernel.model.AdvItem;
import com.bportal.kernel.service.AdvItemLocalService;
import com.bportal.kernel.service.persistence.AdvItemPersistence;
import com.bportal.kernel.service.persistence.AdvPackagePersistence;
import com.bportal.kernel.service.persistence.AdvTemplatePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the adv item local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bportal.kernel.service.impl.AdvItemLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.impl.AdvItemLocalServiceImpl
 * @see com.bportal.kernel.service.AdvItemLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class AdvItemLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements AdvItemLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.bportal.kernel.service.AdvItemLocalServiceUtil} to access the adv item local service.
	 */

	/**
	 * Adds the adv item to the database. Also notifies the appropriate model listeners.
	 *
	 * @param advItem the adv item
	 * @return the adv item that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AdvItem addAdvItem(AdvItem advItem) {
		advItem.setNew(true);

		return advItemPersistence.update(advItem);
	}

	/**
	 * Creates a new adv item with the primary key. Does not add the adv item to the database.
	 *
	 * @param advItemId the primary key for the new adv item
	 * @return the new adv item
	 */
	@Override
	public AdvItem createAdvItem(long advItemId) {
		return advItemPersistence.create(advItemId);
	}

	/**
	 * Deletes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param advItemId the primary key of the adv item
	 * @return the adv item that was removed
	 * @throws PortalException if a adv item with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AdvItem deleteAdvItem(long advItemId) throws PortalException {
		return advItemPersistence.remove(advItemId);
	}

	/**
	 * Deletes the adv item from the database. Also notifies the appropriate model listeners.
	 *
	 * @param advItem the adv item
	 * @return the adv item that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AdvItem deleteAdvItem(AdvItem advItem) {
		return advItemPersistence.remove(advItem);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(AdvItem.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return advItemPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return advItemPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return advItemPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return advItemPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return advItemPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public AdvItem fetchAdvItem(long advItemId) {
		return advItemPersistence.fetchByPrimaryKey(advItemId);
	}

	/**
	 * Returns the adv item with the primary key.
	 *
	 * @param advItemId the primary key of the adv item
	 * @return the adv item
	 * @throws PortalException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem getAdvItem(long advItemId) throws PortalException {
		return advItemPersistence.findByPrimaryKey(advItemId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(advItemLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AdvItem.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("advItemId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(advItemLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(AdvItem.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("advItemId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(advItemLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AdvItem.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("advItemId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return advItemLocalService.deleteAdvItem((AdvItem)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return advItemPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<AdvItem> getAdvItems(int start, int end) {
		return advItemPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of adv items.
	 *
	 * @return the number of adv items
	 */
	@Override
	public int getAdvItemsCount() {
		return advItemPersistence.countAll();
	}

	/**
	 * Updates the adv item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param advItem the adv item
	 * @return the adv item that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AdvItem updateAdvItem(AdvItem advItem) {
		return advItemPersistence.update(advItem);
	}

	/**
	 * Returns the adv item local service.
	 *
	 * @return the adv item local service
	 */
	public AdvItemLocalService getAdvItemLocalService() {
		return advItemLocalService;
	}

	/**
	 * Sets the adv item local service.
	 *
	 * @param advItemLocalService the adv item local service
	 */
	public void setAdvItemLocalService(AdvItemLocalService advItemLocalService) {
		this.advItemLocalService = advItemLocalService;
	}

	/**
	 * Returns the adv item persistence.
	 *
	 * @return the adv item persistence
	 */
	public AdvItemPersistence getAdvItemPersistence() {
		return advItemPersistence;
	}

	/**
	 * Sets the adv item persistence.
	 *
	 * @param advItemPersistence the adv item persistence
	 */
	public void setAdvItemPersistence(AdvItemPersistence advItemPersistence) {
		this.advItemPersistence = advItemPersistence;
	}

	/**
	 * Returns the adv package local service.
	 *
	 * @return the adv package local service
	 */
	public com.bportal.kernel.service.AdvPackageLocalService getAdvPackageLocalService() {
		return advPackageLocalService;
	}

	/**
	 * Sets the adv package local service.
	 *
	 * @param advPackageLocalService the adv package local service
	 */
	public void setAdvPackageLocalService(
		com.bportal.kernel.service.AdvPackageLocalService advPackageLocalService) {
		this.advPackageLocalService = advPackageLocalService;
	}

	/**
	 * Returns the adv package persistence.
	 *
	 * @return the adv package persistence
	 */
	public AdvPackagePersistence getAdvPackagePersistence() {
		return advPackagePersistence;
	}

	/**
	 * Sets the adv package persistence.
	 *
	 * @param advPackagePersistence the adv package persistence
	 */
	public void setAdvPackagePersistence(
		AdvPackagePersistence advPackagePersistence) {
		this.advPackagePersistence = advPackagePersistence;
	}

	/**
	 * Returns the adv template local service.
	 *
	 * @return the adv template local service
	 */
	public com.bportal.kernel.service.AdvTemplateLocalService getAdvTemplateLocalService() {
		return advTemplateLocalService;
	}

	/**
	 * Sets the adv template local service.
	 *
	 * @param advTemplateLocalService the adv template local service
	 */
	public void setAdvTemplateLocalService(
		com.bportal.kernel.service.AdvTemplateLocalService advTemplateLocalService) {
		this.advTemplateLocalService = advTemplateLocalService;
	}

	/**
	 * Returns the adv template persistence.
	 *
	 * @return the adv template persistence
	 */
	public AdvTemplatePersistence getAdvTemplatePersistence() {
		return advTemplatePersistence;
	}

	/**
	 * Sets the adv template persistence.
	 *
	 * @param advTemplatePersistence the adv template persistence
	 */
	public void setAdvTemplatePersistence(
		AdvTemplatePersistence advTemplatePersistence) {
		this.advTemplatePersistence = advTemplatePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.bportal.kernel.model.AdvItem",
			advItemLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.bportal.kernel.model.AdvItem");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AdvItemLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AdvItem.class;
	}

	protected String getModelClassName() {
		return AdvItem.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = advItemPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AdvItemLocalService.class)
	protected AdvItemLocalService advItemLocalService;
	@BeanReference(type = AdvItemPersistence.class)
	protected AdvItemPersistence advItemPersistence;
	@BeanReference(type = com.bportal.kernel.service.AdvPackageLocalService.class)
	protected com.bportal.kernel.service.AdvPackageLocalService advPackageLocalService;
	@BeanReference(type = AdvPackagePersistence.class)
	protected AdvPackagePersistence advPackagePersistence;
	@BeanReference(type = com.bportal.kernel.service.AdvTemplateLocalService.class)
	protected com.bportal.kernel.service.AdvTemplateLocalService advTemplateLocalService;
	@BeanReference(type = AdvTemplatePersistence.class)
	protected AdvTemplatePersistence advTemplatePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}