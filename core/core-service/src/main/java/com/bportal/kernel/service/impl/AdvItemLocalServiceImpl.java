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

package com.bportal.kernel.service.impl;

import java.util.Date;
import java.util.List;

import com.bportal.kernel.model.AdvItem;
import com.bportal.kernel.service.base.AdvItemLocalServiceBaseImpl;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the adv item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bportal.kernel.service.AdvItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemLocalServiceBaseImpl
 * @see com.bportal.kernel.service.AdvItemLocalServiceUtil
 */
@ProviderType
public class AdvItemLocalServiceImpl extends AdvItemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.bportal.kernel.service.AdvItemLocalServiceUtil} to access the adv item local service.
	 */
	public List<AdvItem> findByPackageId(long packageId, int start, int end){
		return getAdvItemPersistence().findByAdvPackageId(packageId, start, end);
	}
	public int countByByPackageId (long packageId){
		return getAdvItemPersistence().countByAdvPackageId(packageId);
	}
	public AdvItem addOrUpdate(long itemId, long packageId, String itemName, String description, String targetLink, String content, int duaration, int order, int status, ServiceContext serviceContext){
		AdvItem advItem = null;
		if (itemId == 0) {
			advItem = getAdvItemLocalService()
					.createAdvItem(getCounterLocalService().increment(AdvItem.class.getName()));
			advItem.setCreateDate(new Date());
		} else {
			advItem = getAdvItemLocalService().fetchAdvItem(itemId);
			advItem.setModifiedDate(new Date());
		}
		User user = getUserLocalService().fetchUser(serviceContext.getUserId());
		advItem.setAdvItemName(itemName);
		advItem.setAdvPackageId(packageId);
		advItem.setStatus(status);
		advItem.setDescription(description);
		advItem.setContent(content);
		advItem.setDuaration(duaration);
		advItem.setOrder(order);
		advItem.setTargetLink(targetLink);
		advItem.setUserId(user.getUserId());
		advItem.setUserName(user.getScreenName());
		advItem.setCompanyId(serviceContext.getCompanyId());
		advItem.setGroupId(serviceContext.getScopeGroupId());
		return getAdvItemLocalService().updateAdvItem(advItem);
	}
}