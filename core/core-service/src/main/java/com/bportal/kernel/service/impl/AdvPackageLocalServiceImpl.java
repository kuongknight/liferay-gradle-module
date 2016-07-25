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

import aQute.bnd.annotation.ProviderType;

import java.util.Date;

import com.bportal.kernel.model.AdvPackage;
import com.bportal.kernel.service.base.AdvPackageLocalServiceBaseImpl;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the adv package local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bportal.kernel.service.AdvPackageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackageLocalServiceBaseImpl
 * @see com.bportal.kernel.service.AdvPackageLocalServiceUtil
 */
@ProviderType
public class AdvPackageLocalServiceImpl extends AdvPackageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bportal.kernel.service.AdvPackageLocalServiceUtil} to access the adv
	 * package local service.
	 */
	public AdvPackage addOrUpdate(long packageId, long layoutId, long templateId, String packageName,
			String description, Date beginDate, Date expiredDate, int status, ServiceContext serviceContext) {
		AdvPackage advPackage = null;
		if (packageId == 0) {
			advPackage = getAdvPackageLocalService()
					.createAdvPackage(getCounterLocalService().increment(AdvPackage.class.getName()));
			advPackage.setCreateDate(new Date());
		} else {
			advPackage = getAdvPackageLocalService().fetchAdvPackage(packageId);
			advPackage.setModifiedDate(new Date());
		}
		User user = getUserLocalService().fetchUser(serviceContext.getUserId());
		advPackage.setAdvPackageName(packageName);
		advPackage.setLayoutId(layoutId);
		advPackage.setTemplateId(templateId);
		advPackage.setBeginDate(beginDate);
		advPackage.setExpiredDate(expiredDate);
		advPackage.setStatus(status);
		advPackage.setDescription(description);
		advPackage.setUserId(user.getUserId());
		advPackage.setUserName(user.getScreenName());
		advPackage.setCompanyId(serviceContext.getCompanyId());
		advPackage.setGroupId(serviceContext.getScopeGroupId());
		return getAdvPackageLocalService().updateAdvPackage(advPackage);

	}
}