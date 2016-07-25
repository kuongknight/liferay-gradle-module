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

package com.bportal.kernel.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.bportal.kernel.exception.NoSuchAdvTemplateException;
import com.bportal.kernel.model.AdvTemplate;
import com.bportal.kernel.model.impl.AdvTemplateImpl;
import com.bportal.kernel.model.impl.AdvTemplateModelImpl;
import com.bportal.kernel.service.persistence.AdvTemplatePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the adv template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplatePersistence
 * @see com.bportal.kernel.service.persistence.AdvTemplateUtil
 * @generated
 */
@ProviderType
public class AdvTemplatePersistenceImpl extends BasePersistenceImpl<AdvTemplate>
	implements AdvTemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AdvTemplateUtil} to access the adv template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AdvTemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateModelImpl.FINDER_CACHE_ENABLED, AdvTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateModelImpl.FINDER_CACHE_ENABLED, AdvTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateModelImpl.FINDER_CACHE_ENABLED, AdvTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateModelImpl.FINDER_CACHE_ENABLED, AdvTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Integer.class.getName() },
			AdvTemplateModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the adv templates where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching adv templates
	 */
	@Override
	public List<AdvTemplate> findByStatus(int status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AdvTemplate> findByStatus(int status, int start, int end) {
		return findByStatus(status, start, end, null);
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
	@Override
	public List<AdvTemplate> findByStatus(int status, int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator) {
		return findByStatus(status, start, end, orderByComparator, true);
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
	@Override
	public List<AdvTemplate> findByStatus(int status, int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<AdvTemplate> list = null;

		if (retrieveFromCache) {
			list = (List<AdvTemplate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvTemplate advTemplate : list) {
					if ((status != advTemplate.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ADVTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvTemplateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<AdvTemplate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvTemplate>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first adv template in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv template
	 * @throws NoSuchAdvTemplateException if a matching adv template could not be found
	 */
	@Override
	public AdvTemplate findByStatus_First(int status,
		OrderByComparator<AdvTemplate> orderByComparator)
		throws NoSuchAdvTemplateException {
		AdvTemplate advTemplate = fetchByStatus_First(status, orderByComparator);

		if (advTemplate != null) {
			return advTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvTemplateException(msg.toString());
	}

	/**
	 * Returns the first adv template in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv template, or <code>null</code> if a matching adv template could not be found
	 */
	@Override
	public AdvTemplate fetchByStatus_First(int status,
		OrderByComparator<AdvTemplate> orderByComparator) {
		List<AdvTemplate> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv template in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv template
	 * @throws NoSuchAdvTemplateException if a matching adv template could not be found
	 */
	@Override
	public AdvTemplate findByStatus_Last(int status,
		OrderByComparator<AdvTemplate> orderByComparator)
		throws NoSuchAdvTemplateException {
		AdvTemplate advTemplate = fetchByStatus_Last(status, orderByComparator);

		if (advTemplate != null) {
			return advTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvTemplateException(msg.toString());
	}

	/**
	 * Returns the last adv template in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv template, or <code>null</code> if a matching adv template could not be found
	 */
	@Override
	public AdvTemplate fetchByStatus_Last(int status,
		OrderByComparator<AdvTemplate> orderByComparator) {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<AdvTemplate> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AdvTemplate[] findByStatus_PrevAndNext(long advTemplateId,
		int status, OrderByComparator<AdvTemplate> orderByComparator)
		throws NoSuchAdvTemplateException {
		AdvTemplate advTemplate = findByPrimaryKey(advTemplateId);

		Session session = null;

		try {
			session = openSession();

			AdvTemplate[] array = new AdvTemplateImpl[3];

			array[0] = getByStatus_PrevAndNext(session, advTemplate, status,
					orderByComparator, true);

			array[1] = advTemplate;

			array[2] = getByStatus_PrevAndNext(session, advTemplate, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AdvTemplate getByStatus_PrevAndNext(Session session,
		AdvTemplate advTemplate, int status,
		OrderByComparator<AdvTemplate> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVTEMPLATE_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AdvTemplateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advTemplate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvTemplate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv templates where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(int status) {
		for (AdvTemplate advTemplate : findByStatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advTemplate);
		}
	}

	/**
	 * Returns the number of adv templates where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching adv templates
	 */
	@Override
	public int countByStatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVTEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "advTemplate.status = ?";

	public AdvTemplatePersistenceImpl() {
		setModelClass(AdvTemplate.class);
	}

	/**
	 * Caches the adv template in the entity cache if it is enabled.
	 *
	 * @param advTemplate the adv template
	 */
	@Override
	public void cacheResult(AdvTemplate advTemplate) {
		entityCache.putResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateImpl.class, advTemplate.getPrimaryKey(), advTemplate);

		advTemplate.resetOriginalValues();
	}

	/**
	 * Caches the adv templates in the entity cache if it is enabled.
	 *
	 * @param advTemplates the adv templates
	 */
	@Override
	public void cacheResult(List<AdvTemplate> advTemplates) {
		for (AdvTemplate advTemplate : advTemplates) {
			if (entityCache.getResult(
						AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
						AdvTemplateImpl.class, advTemplate.getPrimaryKey()) == null) {
				cacheResult(advTemplate);
			}
			else {
				advTemplate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all adv templates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AdvTemplateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the adv template.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AdvTemplate advTemplate) {
		entityCache.removeResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateImpl.class, advTemplate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AdvTemplate> advTemplates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AdvTemplate advTemplate : advTemplates) {
			entityCache.removeResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
				AdvTemplateImpl.class, advTemplate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new adv template with the primary key. Does not add the adv template to the database.
	 *
	 * @param advTemplateId the primary key for the new adv template
	 * @return the new adv template
	 */
	@Override
	public AdvTemplate create(long advTemplateId) {
		AdvTemplate advTemplate = new AdvTemplateImpl();

		advTemplate.setNew(true);
		advTemplate.setPrimaryKey(advTemplateId);

		advTemplate.setCompanyId(companyProvider.getCompanyId());

		return advTemplate;
	}

	/**
	 * Removes the adv template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param advTemplateId the primary key of the adv template
	 * @return the adv template that was removed
	 * @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	 */
	@Override
	public AdvTemplate remove(long advTemplateId)
		throws NoSuchAdvTemplateException {
		return remove((Serializable)advTemplateId);
	}

	/**
	 * Removes the adv template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the adv template
	 * @return the adv template that was removed
	 * @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	 */
	@Override
	public AdvTemplate remove(Serializable primaryKey)
		throws NoSuchAdvTemplateException {
		Session session = null;

		try {
			session = openSession();

			AdvTemplate advTemplate = (AdvTemplate)session.get(AdvTemplateImpl.class,
					primaryKey);

			if (advTemplate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdvTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(advTemplate);
		}
		catch (NoSuchAdvTemplateException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AdvTemplate removeImpl(AdvTemplate advTemplate) {
		advTemplate = toUnwrappedModel(advTemplate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(advTemplate)) {
				advTemplate = (AdvTemplate)session.get(AdvTemplateImpl.class,
						advTemplate.getPrimaryKeyObj());
			}

			if (advTemplate != null) {
				session.delete(advTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (advTemplate != null) {
			clearCache(advTemplate);
		}

		return advTemplate;
	}

	@Override
	public AdvTemplate updateImpl(AdvTemplate advTemplate) {
		advTemplate = toUnwrappedModel(advTemplate);

		boolean isNew = advTemplate.isNew();

		AdvTemplateModelImpl advTemplateModelImpl = (AdvTemplateModelImpl)advTemplate;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (advTemplate.getCreateDate() == null)) {
			if (serviceContext == null) {
				advTemplate.setCreateDate(now);
			}
			else {
				advTemplate.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!advTemplateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				advTemplate.setModifiedDate(now);
			}
			else {
				advTemplate.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (advTemplate.isNew()) {
				session.save(advTemplate);

				advTemplate.setNew(false);
			}
			else {
				advTemplate = (AdvTemplate)session.merge(advTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AdvTemplateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((advTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advTemplateModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { advTemplateModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
			AdvTemplateImpl.class, advTemplate.getPrimaryKey(), advTemplate,
			false);

		advTemplate.resetOriginalValues();

		return advTemplate;
	}

	protected AdvTemplate toUnwrappedModel(AdvTemplate advTemplate) {
		if (advTemplate instanceof AdvTemplateImpl) {
			return advTemplate;
		}

		AdvTemplateImpl advTemplateImpl = new AdvTemplateImpl();

		advTemplateImpl.setNew(advTemplate.isNew());
		advTemplateImpl.setPrimaryKey(advTemplate.getPrimaryKey());

		advTemplateImpl.setAdvTemplateId(advTemplate.getAdvTemplateId());
		advTemplateImpl.setGroupId(advTemplate.getGroupId());
		advTemplateImpl.setCompanyId(advTemplate.getCompanyId());
		advTemplateImpl.setUserId(advTemplate.getUserId());
		advTemplateImpl.setUserName(advTemplate.getUserName());
		advTemplateImpl.setCreateDate(advTemplate.getCreateDate());
		advTemplateImpl.setModifiedDate(advTemplate.getModifiedDate());
		advTemplateImpl.setAdvTemplateName(advTemplate.getAdvTemplateName());
		advTemplateImpl.setContent(advTemplate.getContent());
		advTemplateImpl.setStatus(advTemplate.getStatus());
		advTemplateImpl.setType(advTemplate.getType());
		advTemplateImpl.setDescription(advTemplate.getDescription());

		return advTemplateImpl;
	}

	/**
	 * Returns the adv template with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv template
	 * @return the adv template
	 * @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	 */
	@Override
	public AdvTemplate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAdvTemplateException {
		AdvTemplate advTemplate = fetchByPrimaryKey(primaryKey);

		if (advTemplate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAdvTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return advTemplate;
	}

	/**
	 * Returns the adv template with the primary key or throws a {@link NoSuchAdvTemplateException} if it could not be found.
	 *
	 * @param advTemplateId the primary key of the adv template
	 * @return the adv template
	 * @throws NoSuchAdvTemplateException if a adv template with the primary key could not be found
	 */
	@Override
	public AdvTemplate findByPrimaryKey(long advTemplateId)
		throws NoSuchAdvTemplateException {
		return findByPrimaryKey((Serializable)advTemplateId);
	}

	/**
	 * Returns the adv template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv template
	 * @return the adv template, or <code>null</code> if a adv template with the primary key could not be found
	 */
	@Override
	public AdvTemplate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
				AdvTemplateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AdvTemplate advTemplate = (AdvTemplate)serializable;

		if (advTemplate == null) {
			Session session = null;

			try {
				session = openSession();

				advTemplate = (AdvTemplate)session.get(AdvTemplateImpl.class,
						primaryKey);

				if (advTemplate != null) {
					cacheResult(advTemplate);
				}
				else {
					entityCache.putResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
						AdvTemplateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
					AdvTemplateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return advTemplate;
	}

	/**
	 * Returns the adv template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param advTemplateId the primary key of the adv template
	 * @return the adv template, or <code>null</code> if a adv template with the primary key could not be found
	 */
	@Override
	public AdvTemplate fetchByPrimaryKey(long advTemplateId) {
		return fetchByPrimaryKey((Serializable)advTemplateId);
	}

	@Override
	public Map<Serializable, AdvTemplate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AdvTemplate> map = new HashMap<Serializable, AdvTemplate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AdvTemplate advTemplate = fetchByPrimaryKey(primaryKey);

			if (advTemplate != null) {
				map.put(primaryKey, advTemplate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
					AdvTemplateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AdvTemplate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ADVTEMPLATE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (AdvTemplate advTemplate : (List<AdvTemplate>)q.list()) {
				map.put(advTemplate.getPrimaryKeyObj(), advTemplate);

				cacheResult(advTemplate);

				uncachedPrimaryKeys.remove(advTemplate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AdvTemplateModelImpl.ENTITY_CACHE_ENABLED,
					AdvTemplateImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the adv templates.
	 *
	 * @return the adv templates
	 */
	@Override
	public List<AdvTemplate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AdvTemplate> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<AdvTemplate> findAll(int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<AdvTemplate> findAll(int start, int end,
		OrderByComparator<AdvTemplate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AdvTemplate> list = null;

		if (retrieveFromCache) {
			list = (List<AdvTemplate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ADVTEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVTEMPLATE;

				if (pagination) {
					sql = sql.concat(AdvTemplateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AdvTemplate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvTemplate>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the adv templates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AdvTemplate advTemplate : findAll()) {
			remove(advTemplate);
		}
	}

	/**
	 * Returns the number of adv templates.
	 *
	 * @return the number of adv templates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADVTEMPLATE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AdvTemplateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the adv template persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AdvTemplateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ADVTEMPLATE = "SELECT advTemplate FROM AdvTemplate advTemplate";
	private static final String _SQL_SELECT_ADVTEMPLATE_WHERE_PKS_IN = "SELECT advTemplate FROM AdvTemplate advTemplate WHERE advTemplateId IN (";
	private static final String _SQL_SELECT_ADVTEMPLATE_WHERE = "SELECT advTemplate FROM AdvTemplate advTemplate WHERE ";
	private static final String _SQL_COUNT_ADVTEMPLATE = "SELECT COUNT(advTemplate) FROM AdvTemplate advTemplate";
	private static final String _SQL_COUNT_ADVTEMPLATE_WHERE = "SELECT COUNT(advTemplate) FROM AdvTemplate advTemplate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advTemplate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AdvTemplate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AdvTemplate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AdvTemplatePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
}