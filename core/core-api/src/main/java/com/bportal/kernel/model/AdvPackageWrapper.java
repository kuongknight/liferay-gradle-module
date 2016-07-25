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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AdvPackage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackage
 * @generated
 */
@ProviderType
public class AdvPackageWrapper implements AdvPackage, ModelWrapper<AdvPackage> {
	public AdvPackageWrapper(AdvPackage advPackage) {
		_advPackage = advPackage;
	}

	@Override
	public Class<?> getModelClass() {
		return AdvPackage.class;
	}

	@Override
	public String getModelClassName() {
		return AdvPackage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("advPackageId", getAdvPackageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("templateId", getTemplateId());
		attributes.put("advPackageName", getAdvPackageName());
		attributes.put("layoutId", getLayoutId());
		attributes.put("status", getStatus());
		attributes.put("beginDate", getBeginDate());
		attributes.put("expiredDate", getExpiredDate());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long advPackageId = (Long)attributes.get("advPackageId");

		if (advPackageId != null) {
			setAdvPackageId(advPackageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long templateId = (Long)attributes.get("templateId");

		if (templateId != null) {
			setTemplateId(templateId);
		}

		String advPackageName = (String)attributes.get("advPackageName");

		if (advPackageName != null) {
			setAdvPackageName(advPackageName);
		}

		Long layoutId = (Long)attributes.get("layoutId");

		if (layoutId != null) {
			setLayoutId(layoutId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date beginDate = (Date)attributes.get("beginDate");

		if (beginDate != null) {
			setBeginDate(beginDate);
		}

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public AdvPackage toEscapedModel() {
		return new AdvPackageWrapper(_advPackage.toEscapedModel());
	}

	@Override
	public AdvPackage toUnescapedModel() {
		return new AdvPackageWrapper(_advPackage.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _advPackage.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _advPackage.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _advPackage.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _advPackage.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AdvPackage> toCacheModel() {
		return _advPackage.toCacheModel();
	}

	@Override
	public int compareTo(AdvPackage advPackage) {
		return _advPackage.compareTo(advPackage);
	}

	/**
	* Returns the status of this adv package.
	*
	* @return the status of this adv package
	*/
	@Override
	public int getStatus() {
		return _advPackage.getStatus();
	}

	@Override
	public int hashCode() {
		return _advPackage.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _advPackage.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AdvPackageWrapper((AdvPackage)_advPackage.clone());
	}

	/**
	* Returns the adv package name of this adv package.
	*
	* @return the adv package name of this adv package
	*/
	@Override
	public java.lang.String getAdvPackageName() {
		return _advPackage.getAdvPackageName();
	}

	/**
	* Returns the description of this adv package.
	*
	* @return the description of this adv package
	*/
	@Override
	public java.lang.String getDescription() {
		return _advPackage.getDescription();
	}

	/**
	* Returns the user name of this adv package.
	*
	* @return the user name of this adv package
	*/
	@Override
	public java.lang.String getUserName() {
		return _advPackage.getUserName();
	}

	/**
	* Returns the user uuid of this adv package.
	*
	* @return the user uuid of this adv package
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _advPackage.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _advPackage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _advPackage.toXmlString();
	}

	/**
	* Returns the begin date of this adv package.
	*
	* @return the begin date of this adv package
	*/
	@Override
	public Date getBeginDate() {
		return _advPackage.getBeginDate();
	}

	/**
	* Returns the create date of this adv package.
	*
	* @return the create date of this adv package
	*/
	@Override
	public Date getCreateDate() {
		return _advPackage.getCreateDate();
	}

	/**
	* Returns the expired date of this adv package.
	*
	* @return the expired date of this adv package
	*/
	@Override
	public Date getExpiredDate() {
		return _advPackage.getExpiredDate();
	}

	/**
	* Returns the modified date of this adv package.
	*
	* @return the modified date of this adv package
	*/
	@Override
	public Date getModifiedDate() {
		return _advPackage.getModifiedDate();
	}

	/**
	* Returns the adv package ID of this adv package.
	*
	* @return the adv package ID of this adv package
	*/
	@Override
	public long getAdvPackageId() {
		return _advPackage.getAdvPackageId();
	}

	/**
	* Returns the company ID of this adv package.
	*
	* @return the company ID of this adv package
	*/
	@Override
	public long getCompanyId() {
		return _advPackage.getCompanyId();
	}

	/**
	* Returns the group ID of this adv package.
	*
	* @return the group ID of this adv package
	*/
	@Override
	public long getGroupId() {
		return _advPackage.getGroupId();
	}

	/**
	* Returns the layout ID of this adv package.
	*
	* @return the layout ID of this adv package
	*/
	@Override
	public long getLayoutId() {
		return _advPackage.getLayoutId();
	}

	/**
	* Returns the primary key of this adv package.
	*
	* @return the primary key of this adv package
	*/
	@Override
	public long getPrimaryKey() {
		return _advPackage.getPrimaryKey();
	}

	/**
	* Returns the template ID of this adv package.
	*
	* @return the template ID of this adv package
	*/
	@Override
	public long getTemplateId() {
		return _advPackage.getTemplateId();
	}

	/**
	* Returns the user ID of this adv package.
	*
	* @return the user ID of this adv package
	*/
	@Override
	public long getUserId() {
		return _advPackage.getUserId();
	}

	@Override
	public void persist() {
		_advPackage.persist();
	}

	/**
	* Sets the adv package ID of this adv package.
	*
	* @param advPackageId the adv package ID of this adv package
	*/
	@Override
	public void setAdvPackageId(long advPackageId) {
		_advPackage.setAdvPackageId(advPackageId);
	}

	/**
	* Sets the adv package name of this adv package.
	*
	* @param advPackageName the adv package name of this adv package
	*/
	@Override
	public void setAdvPackageName(java.lang.String advPackageName) {
		_advPackage.setAdvPackageName(advPackageName);
	}

	/**
	* Sets the begin date of this adv package.
	*
	* @param beginDate the begin date of this adv package
	*/
	@Override
	public void setBeginDate(Date beginDate) {
		_advPackage.setBeginDate(beginDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_advPackage.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this adv package.
	*
	* @param companyId the company ID of this adv package
	*/
	@Override
	public void setCompanyId(long companyId) {
		_advPackage.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this adv package.
	*
	* @param createDate the create date of this adv package
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_advPackage.setCreateDate(createDate);
	}

	/**
	* Sets the description of this adv package.
	*
	* @param description the description of this adv package
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_advPackage.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_advPackage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_advPackage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_advPackage.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired date of this adv package.
	*
	* @param expiredDate the expired date of this adv package
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_advPackage.setExpiredDate(expiredDate);
	}

	/**
	* Sets the group ID of this adv package.
	*
	* @param groupId the group ID of this adv package
	*/
	@Override
	public void setGroupId(long groupId) {
		_advPackage.setGroupId(groupId);
	}

	/**
	* Sets the layout ID of this adv package.
	*
	* @param layoutId the layout ID of this adv package
	*/
	@Override
	public void setLayoutId(long layoutId) {
		_advPackage.setLayoutId(layoutId);
	}

	/**
	* Sets the modified date of this adv package.
	*
	* @param modifiedDate the modified date of this adv package
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_advPackage.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_advPackage.setNew(n);
	}

	/**
	* Sets the primary key of this adv package.
	*
	* @param primaryKey the primary key of this adv package
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_advPackage.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_advPackage.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this adv package.
	*
	* @param status the status of this adv package
	*/
	@Override
	public void setStatus(int status) {
		_advPackage.setStatus(status);
	}

	/**
	* Sets the template ID of this adv package.
	*
	* @param templateId the template ID of this adv package
	*/
	@Override
	public void setTemplateId(long templateId) {
		_advPackage.setTemplateId(templateId);
	}

	/**
	* Sets the user ID of this adv package.
	*
	* @param userId the user ID of this adv package
	*/
	@Override
	public void setUserId(long userId) {
		_advPackage.setUserId(userId);
	}

	/**
	* Sets the user name of this adv package.
	*
	* @param userName the user name of this adv package
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_advPackage.setUserName(userName);
	}

	/**
	* Sets the user uuid of this adv package.
	*
	* @param userUuid the user uuid of this adv package
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_advPackage.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvPackageWrapper)) {
			return false;
		}

		AdvPackageWrapper advPackageWrapper = (AdvPackageWrapper)obj;

		if (Objects.equals(_advPackage, advPackageWrapper._advPackage)) {
			return true;
		}

		return false;
	}

	@Override
	public AdvPackage getWrappedModel() {
		return _advPackage;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _advPackage.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _advPackage.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_advPackage.resetOriginalValues();
	}

	private final AdvPackage _advPackage;
}