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
import java.util.List;

import com.bportal.kernel.model.AdvPackage;
import com.bportal.kernel.model.AdvTemplate;
import com.bportal.kernel.service.base.AdvTemplateLocalServiceBaseImpl;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the adv template local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bportal.kernel.service.AdvTemplateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplateLocalServiceBaseImpl
 * @see com.bportal.kernel.service.AdvTemplateLocalServiceUtil
 */
@ProviderType
public class AdvTemplateLocalServiceImpl extends AdvTemplateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bportal.kernel.service.AdvTemplateLocalServiceUtil} to access the adv
	 * template local service.
	 */
	public AdvTemplate addOrUpdate(long advTemplateId, String templateName, String content, String description,
			int type, int status, ServiceContext serviceContext) {
		AdvTemplate advTemplate = null;
		if (advTemplateId == 0) {
			advTemplate = getAdvTemplateLocalService().createAdvTemplate(getCounterLocalService().increment(AdvPackage.class.getName()));
			advTemplate.setCreateDate(new Date());
		} else {
			advTemplate = getAdvTemplateLocalService().fetchAdvTemplate(advTemplateId);
			advTemplate.setModifiedDate(new Date());
		}
		User user = getUserLocalService().fetchUser(serviceContext.getUserId());
		advTemplate.setUserId(user.getUserId());
		advTemplate.setUserName(user.getScreenName());
		advTemplate.setCompanyId(serviceContext.getCompanyId());
		advTemplate.setGroupId(serviceContext.getScopeGroupId());
		advTemplate.setAdvTemplateName(templateName);
		advTemplate.setDescription(description);
		advTemplate.setContent(content);
		advTemplate.setStatus(status);
		advTemplate.setType(type);
		return getAdvTemplateLocalService().updateAdvTemplate(advTemplate);
		
	}
	public List<AdvTemplate> findByStatus(int status){
		return getAdvTemplatePersistence().findByStatus(status);
	}
}