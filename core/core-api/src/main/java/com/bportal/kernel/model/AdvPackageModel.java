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

package com.bportal.kernel.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AdvPackage service. Represents a row in the &quot;BPortal_AdvPackage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bportal.kernel.model.impl.AdvPackageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bportal.kernel.model.impl.AdvPackageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackage
 * @see com.bportal.kernel.model.impl.AdvPackageImpl
 * @see com.bportal.kernel.model.impl.AdvPackageModelImpl
 * @generated
 */
@ProviderType
public interface AdvPackageModel extends BaseModel<AdvPackage>, GroupedModel,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a adv package model instance should use the {@link AdvPackage} interface instead.
	 */

	/**
	 * Returns the primary key of this adv package.
	 *
	 * @return the primary key of this adv package
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this adv package.
	 *
	 * @param primaryKey the primary key of this adv package
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the adv package ID of this adv package.
	 *
	 * @return the adv package ID of this adv package
	 */
	public long getAdvPackageId();

	/**
	 * Sets the adv package ID of this adv package.
	 *
	 * @param advPackageId the adv package ID of this adv package
	 */
	public void setAdvPackageId(long advPackageId);

	/**
	 * Returns the group ID of this adv package.
	 *
	 * @return the group ID of this adv package
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this adv package.
	 *
	 * @param groupId the group ID of this adv package
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this adv package.
	 *
	 * @return the company ID of this adv package
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this adv package.
	 *
	 * @param companyId the company ID of this adv package
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this adv package.
	 *
	 * @return the user ID of this adv package
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this adv package.
	 *
	 * @param userId the user ID of this adv package
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this adv package.
	 *
	 * @return the user uuid of this adv package
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this adv package.
	 *
	 * @param userUuid the user uuid of this adv package
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this adv package.
	 *
	 * @return the user name of this adv package
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this adv package.
	 *
	 * @param userName the user name of this adv package
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this adv package.
	 *
	 * @return the create date of this adv package
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this adv package.
	 *
	 * @param createDate the create date of this adv package
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this adv package.
	 *
	 * @return the modified date of this adv package
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this adv package.
	 *
	 * @param modifiedDate the modified date of this adv package
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the template ID of this adv package.
	 *
	 * @return the template ID of this adv package
	 */
	public long getTemplateId();

	/**
	 * Sets the template ID of this adv package.
	 *
	 * @param templateId the template ID of this adv package
	 */
	public void setTemplateId(long templateId);

	/**
	 * Returns the adv package name of this adv package.
	 *
	 * @return the adv package name of this adv package
	 */
	@AutoEscape
	public String getAdvPackageName();

	/**
	 * Sets the adv package name of this adv package.
	 *
	 * @param advPackageName the adv package name of this adv package
	 */
	public void setAdvPackageName(String advPackageName);

	/**
	 * Returns the layout ID of this adv package.
	 *
	 * @return the layout ID of this adv package
	 */
	public long getLayoutId();

	/**
	 * Sets the layout ID of this adv package.
	 *
	 * @param layoutId the layout ID of this adv package
	 */
	public void setLayoutId(long layoutId);

	/**
	 * Returns the status of this adv package.
	 *
	 * @return the status of this adv package
	 */
	public int getStatus();

	/**
	 * Sets the status of this adv package.
	 *
	 * @param status the status of this adv package
	 */
	public void setStatus(int status);

	/**
	 * Returns the begin date of this adv package.
	 *
	 * @return the begin date of this adv package
	 */
	public Date getBeginDate();

	/**
	 * Sets the begin date of this adv package.
	 *
	 * @param beginDate the begin date of this adv package
	 */
	public void setBeginDate(Date beginDate);

	/**
	 * Returns the expired date of this adv package.
	 *
	 * @return the expired date of this adv package
	 */
	public Date getExpiredDate();

	/**
	 * Sets the expired date of this adv package.
	 *
	 * @param expiredDate the expired date of this adv package
	 */
	public void setExpiredDate(Date expiredDate);

	/**
	 * Returns the description of this adv package.
	 *
	 * @return the description of this adv package
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this adv package.
	 *
	 * @param description the description of this adv package
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(AdvPackage advPackage);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AdvPackage> toCacheModel();

	@Override
	public AdvPackage toEscapedModel();

	@Override
	public AdvPackage toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}