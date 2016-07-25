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

import com.bportal.kernel.exception.NoSuchAdvPackageException;
import com.bportal.kernel.model.AdvPackage;
import com.bportal.kernel.model.impl.AdvPackageImpl;
import com.bportal.kernel.model.impl.AdvPackageModelImpl;
import com.bportal.kernel.service.persistence.AdvPackagePersistence;

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
 * The persistence implementation for the adv package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackagePersistence
 * @see com.bportal.kernel.service.persistence.AdvPackageUtil
 * @generated
 */
@ProviderType
public class AdvPackagePersistenceImpl extends BasePersistenceImpl<AdvPackage>
	implements AdvPackagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AdvPackageUtil} to access the adv package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AdvPackageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageModelImpl.FINDER_CACHE_ENABLED, AdvPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageModelImpl.FINDER_CACHE_ENABLED, AdvPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageModelImpl.FINDER_CACHE_ENABLED, AdvPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageModelImpl.FINDER_CACHE_ENABLED, AdvPackageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Integer.class.getName() },
			AdvPackageModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the adv packages where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching adv packages
	 */
	@Override
	public List<AdvPackage> findByStatus(int status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AdvPackage> findByStatus(int status, int start, int end) {
		return findByStatus(status, start, end, null);
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
	@Override
	public List<AdvPackage> findByStatus(int status, int start, int end,
		OrderByComparator<AdvPackage> orderByComparator) {
		return findByStatus(status, start, end, orderByComparator, true);
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
	@Override
	public List<AdvPackage> findByStatus(int status, int start, int end,
		OrderByComparator<AdvPackage> orderByComparator,
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

		List<AdvPackage> list = null;

		if (retrieveFromCache) {
			list = (List<AdvPackage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvPackage advPackage : list) {
					if ((status != advPackage.getStatus())) {
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

			query.append(_SQL_SELECT_ADVPACKAGE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvPackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<AdvPackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvPackage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv package in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv package
	 * @throws NoSuchAdvPackageException if a matching adv package could not be found
	 */
	@Override
	public AdvPackage findByStatus_First(int status,
		OrderByComparator<AdvPackage> orderByComparator)
		throws NoSuchAdvPackageException {
		AdvPackage advPackage = fetchByStatus_First(status, orderByComparator);

		if (advPackage != null) {
			return advPackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvPackageException(msg.toString());
	}

	/**
	 * Returns the first adv package in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv package, or <code>null</code> if a matching adv package could not be found
	 */
	@Override
	public AdvPackage fetchByStatus_First(int status,
		OrderByComparator<AdvPackage> orderByComparator) {
		List<AdvPackage> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv package in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv package
	 * @throws NoSuchAdvPackageException if a matching adv package could not be found
	 */
	@Override
	public AdvPackage findByStatus_Last(int status,
		OrderByComparator<AdvPackage> orderByComparator)
		throws NoSuchAdvPackageException {
		AdvPackage advPackage = fetchByStatus_Last(status, orderByComparator);

		if (advPackage != null) {
			return advPackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvPackageException(msg.toString());
	}

	/**
	 * Returns the last adv package in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv package, or <code>null</code> if a matching adv package could not be found
	 */
	@Override
	public AdvPackage fetchByStatus_Last(int status,
		OrderByComparator<AdvPackage> orderByComparator) {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<AdvPackage> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AdvPackage[] findByStatus_PrevAndNext(long advPackageId, int status,
		OrderByComparator<AdvPackage> orderByComparator)
		throws NoSuchAdvPackageException {
		AdvPackage advPackage = findByPrimaryKey(advPackageId);

		Session session = null;

		try {
			session = openSession();

			AdvPackage[] array = new AdvPackageImpl[3];

			array[0] = getByStatus_PrevAndNext(session, advPackage, status,
					orderByComparator, true);

			array[1] = advPackage;

			array[2] = getByStatus_PrevAndNext(session, advPackage, status,
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

	protected AdvPackage getByStatus_PrevAndNext(Session session,
		AdvPackage advPackage, int status,
		OrderByComparator<AdvPackage> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVPACKAGE_WHERE);

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
			query.append(AdvPackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advPackage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvPackage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv packages where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(int status) {
		for (AdvPackage advPackage : findByStatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advPackage);
		}
	}

	/**
	 * Returns the number of adv packages where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching adv packages
	 */
	@Override
	public int countByStatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVPACKAGE_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "advPackage.status = ?";

	public AdvPackagePersistenceImpl() {
		setModelClass(AdvPackage.class);
	}

	/**
	 * Caches the adv package in the entity cache if it is enabled.
	 *
	 * @param advPackage the adv package
	 */
	@Override
	public void cacheResult(AdvPackage advPackage) {
		entityCache.putResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageImpl.class, advPackage.getPrimaryKey(), advPackage);

		advPackage.resetOriginalValues();
	}

	/**
	 * Caches the adv packages in the entity cache if it is enabled.
	 *
	 * @param advPackages the adv packages
	 */
	@Override
	public void cacheResult(List<AdvPackage> advPackages) {
		for (AdvPackage advPackage : advPackages) {
			if (entityCache.getResult(
						AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
						AdvPackageImpl.class, advPackage.getPrimaryKey()) == null) {
				cacheResult(advPackage);
			}
			else {
				advPackage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all adv packages.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AdvPackageImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the adv package.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AdvPackage advPackage) {
		entityCache.removeResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageImpl.class, advPackage.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AdvPackage> advPackages) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AdvPackage advPackage : advPackages) {
			entityCache.removeResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
				AdvPackageImpl.class, advPackage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new adv package with the primary key. Does not add the adv package to the database.
	 *
	 * @param advPackageId the primary key for the new adv package
	 * @return the new adv package
	 */
	@Override
	public AdvPackage create(long advPackageId) {
		AdvPackage advPackage = new AdvPackageImpl();

		advPackage.setNew(true);
		advPackage.setPrimaryKey(advPackageId);

		advPackage.setCompanyId(companyProvider.getCompanyId());

		return advPackage;
	}

	/**
	 * Removes the adv package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param advPackageId the primary key of the adv package
	 * @return the adv package that was removed
	 * @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	 */
	@Override
	public AdvPackage remove(long advPackageId)
		throws NoSuchAdvPackageException {
		return remove((Serializable)advPackageId);
	}

	/**
	 * Removes the adv package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the adv package
	 * @return the adv package that was removed
	 * @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	 */
	@Override
	public AdvPackage remove(Serializable primaryKey)
		throws NoSuchAdvPackageException {
		Session session = null;

		try {
			session = openSession();

			AdvPackage advPackage = (AdvPackage)session.get(AdvPackageImpl.class,
					primaryKey);

			if (advPackage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdvPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(advPackage);
		}
		catch (NoSuchAdvPackageException nsee) {
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
	protected AdvPackage removeImpl(AdvPackage advPackage) {
		advPackage = toUnwrappedModel(advPackage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(advPackage)) {
				advPackage = (AdvPackage)session.get(AdvPackageImpl.class,
						advPackage.getPrimaryKeyObj());
			}

			if (advPackage != null) {
				session.delete(advPackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (advPackage != null) {
			clearCache(advPackage);
		}

		return advPackage;
	}

	@Override
	public AdvPackage updateImpl(AdvPackage advPackage) {
		advPackage = toUnwrappedModel(advPackage);

		boolean isNew = advPackage.isNew();

		AdvPackageModelImpl advPackageModelImpl = (AdvPackageModelImpl)advPackage;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (advPackage.getCreateDate() == null)) {
			if (serviceContext == null) {
				advPackage.setCreateDate(now);
			}
			else {
				advPackage.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!advPackageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				advPackage.setModifiedDate(now);
			}
			else {
				advPackage.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (advPackage.isNew()) {
				session.save(advPackage);

				advPackage.setNew(false);
			}
			else {
				advPackage = (AdvPackage)session.merge(advPackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AdvPackageModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((advPackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advPackageModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { advPackageModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
			AdvPackageImpl.class, advPackage.getPrimaryKey(), advPackage, false);

		advPackage.resetOriginalValues();

		return advPackage;
	}

	protected AdvPackage toUnwrappedModel(AdvPackage advPackage) {
		if (advPackage instanceof AdvPackageImpl) {
			return advPackage;
		}

		AdvPackageImpl advPackageImpl = new AdvPackageImpl();

		advPackageImpl.setNew(advPackage.isNew());
		advPackageImpl.setPrimaryKey(advPackage.getPrimaryKey());

		advPackageImpl.setAdvPackageId(advPackage.getAdvPackageId());
		advPackageImpl.setGroupId(advPackage.getGroupId());
		advPackageImpl.setCompanyId(advPackage.getCompanyId());
		advPackageImpl.setUserId(advPackage.getUserId());
		advPackageImpl.setUserName(advPackage.getUserName());
		advPackageImpl.setCreateDate(advPackage.getCreateDate());
		advPackageImpl.setModifiedDate(advPackage.getModifiedDate());
		advPackageImpl.setTemplateId(advPackage.getTemplateId());
		advPackageImpl.setAdvPackageName(advPackage.getAdvPackageName());
		advPackageImpl.setLayoutId(advPackage.getLayoutId());
		advPackageImpl.setStatus(advPackage.getStatus());
		advPackageImpl.setBeginDate(advPackage.getBeginDate());
		advPackageImpl.setExpiredDate(advPackage.getExpiredDate());
		advPackageImpl.setDescription(advPackage.getDescription());

		return advPackageImpl;
	}

	/**
	 * Returns the adv package with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv package
	 * @return the adv package
	 * @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	 */
	@Override
	public AdvPackage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAdvPackageException {
		AdvPackage advPackage = fetchByPrimaryKey(primaryKey);

		if (advPackage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAdvPackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return advPackage;
	}

	/**
	 * Returns the adv package with the primary key or throws a {@link NoSuchAdvPackageException} if it could not be found.
	 *
	 * @param advPackageId the primary key of the adv package
	 * @return the adv package
	 * @throws NoSuchAdvPackageException if a adv package with the primary key could not be found
	 */
	@Override
	public AdvPackage findByPrimaryKey(long advPackageId)
		throws NoSuchAdvPackageException {
		return findByPrimaryKey((Serializable)advPackageId);
	}

	/**
	 * Returns the adv package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv package
	 * @return the adv package, or <code>null</code> if a adv package with the primary key could not be found
	 */
	@Override
	public AdvPackage fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
				AdvPackageImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AdvPackage advPackage = (AdvPackage)serializable;

		if (advPackage == null) {
			Session session = null;

			try {
				session = openSession();

				advPackage = (AdvPackage)session.get(AdvPackageImpl.class,
						primaryKey);

				if (advPackage != null) {
					cacheResult(advPackage);
				}
				else {
					entityCache.putResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
						AdvPackageImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
					AdvPackageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return advPackage;
	}

	/**
	 * Returns the adv package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param advPackageId the primary key of the adv package
	 * @return the adv package, or <code>null</code> if a adv package with the primary key could not be found
	 */
	@Override
	public AdvPackage fetchByPrimaryKey(long advPackageId) {
		return fetchByPrimaryKey((Serializable)advPackageId);
	}

	@Override
	public Map<Serializable, AdvPackage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AdvPackage> map = new HashMap<Serializable, AdvPackage>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AdvPackage advPackage = fetchByPrimaryKey(primaryKey);

			if (advPackage != null) {
				map.put(primaryKey, advPackage);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
					AdvPackageImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AdvPackage)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ADVPACKAGE_WHERE_PKS_IN);

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

			for (AdvPackage advPackage : (List<AdvPackage>)q.list()) {
				map.put(advPackage.getPrimaryKeyObj(), advPackage);

				cacheResult(advPackage);

				uncachedPrimaryKeys.remove(advPackage.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AdvPackageModelImpl.ENTITY_CACHE_ENABLED,
					AdvPackageImpl.class, primaryKey, nullModel);
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
	 * Returns all the adv packages.
	 *
	 * @return the adv packages
	 */
	@Override
	public List<AdvPackage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AdvPackage> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<AdvPackage> findAll(int start, int end,
		OrderByComparator<AdvPackage> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<AdvPackage> findAll(int start, int end,
		OrderByComparator<AdvPackage> orderByComparator,
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

		List<AdvPackage> list = null;

		if (retrieveFromCache) {
			list = (List<AdvPackage>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ADVPACKAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVPACKAGE;

				if (pagination) {
					sql = sql.concat(AdvPackageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AdvPackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvPackage>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the adv packages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AdvPackage advPackage : findAll()) {
			remove(advPackage);
		}
	}

	/**
	 * Returns the number of adv packages.
	 *
	 * @return the number of adv packages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADVPACKAGE);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return AdvPackageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the adv package persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AdvPackageImpl.class.getName());
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
	private static final String _SQL_SELECT_ADVPACKAGE = "SELECT advPackage FROM AdvPackage advPackage";
	private static final String _SQL_SELECT_ADVPACKAGE_WHERE_PKS_IN = "SELECT advPackage FROM AdvPackage advPackage WHERE advPackageId IN (";
	private static final String _SQL_SELECT_ADVPACKAGE_WHERE = "SELECT advPackage FROM AdvPackage advPackage WHERE ";
	private static final String _SQL_COUNT_ADVPACKAGE = "SELECT COUNT(advPackage) FROM AdvPackage advPackage";
	private static final String _SQL_COUNT_ADVPACKAGE_WHERE = "SELECT COUNT(advPackage) FROM AdvPackage advPackage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advPackage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AdvPackage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AdvPackage exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AdvPackagePersistenceImpl.class);
}