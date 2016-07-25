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
 * This class is a wrapper for {@link AdvItem}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItem
 * @generated
 */
@ProviderType
public class AdvItemWrapper implements AdvItem, ModelWrapper<AdvItem> {
	public AdvItemWrapper(AdvItem advItem) {
		_advItem = advItem;
	}

	@Override
	public Class<?> getModelClass() {
		return AdvItem.class;
	}

	@Override
	public String getModelClassName() {
		return AdvItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("advItemId", getAdvItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("advPackageId", getAdvPackageId());
		attributes.put("advItemName", getAdvItemName());
		attributes.put("content", getContent());
		attributes.put("targetLink", getTargetLink());
		attributes.put("duaration", getDuaration());
		attributes.put("status", getStatus());
		attributes.put("order", getOrder());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long advItemId = (Long)attributes.get("advItemId");

		if (advItemId != null) {
			setAdvItemId(advItemId);
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

		Long advPackageId = (Long)attributes.get("advPackageId");

		if (advPackageId != null) {
			setAdvPackageId(advPackageId);
		}

		String advItemName = (String)attributes.get("advItemName");

		if (advItemName != null) {
			setAdvItemName(advItemName);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String targetLink = (String)attributes.get("targetLink");

		if (targetLink != null) {
			setTargetLink(targetLink);
		}

		Integer duaration = (Integer)attributes.get("duaration");

		if (duaration != null) {
			setDuaration(duaration);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public AdvItem toEscapedModel() {
		return new AdvItemWrapper(_advItem.toEscapedModel());
	}

	@Override
	public AdvItem toUnescapedModel() {
		return new AdvItemWrapper(_advItem.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _advItem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _advItem.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _advItem.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _advItem.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AdvItem> toCacheModel() {
		return _advItem.toCacheModel();
	}

	@Override
	public int compareTo(AdvItem advItem) {
		return _advItem.compareTo(advItem);
	}

	/**
	* Returns the duaration of this adv item.
	*
	* @return the duaration of this adv item
	*/
	@Override
	public int getDuaration() {
		return _advItem.getDuaration();
	}

	/**
	* Returns the order of this adv item.
	*
	* @return the order of this adv item
	*/
	@Override
	public int getOrder() {
		return _advItem.getOrder();
	}

	/**
	* Returns the status of this adv item.
	*
	* @return the status of this adv item
	*/
	@Override
	public int getStatus() {
		return _advItem.getStatus();
	}

	@Override
	public int hashCode() {
		return _advItem.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _advItem.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AdvItemWrapper((AdvItem)_advItem.clone());
	}

	/**
	* Returns the adv item name of this adv item.
	*
	* @return the adv item name of this adv item
	*/
	@Override
	public java.lang.String getAdvItemName() {
		return _advItem.getAdvItemName();
	}

	/**
	* Returns the content of this adv item.
	*
	* @return the content of this adv item
	*/
	@Override
	public java.lang.String getContent() {
		return _advItem.getContent();
	}

	/**
	* Returns the description of this adv item.
	*
	* @return the description of this adv item
	*/
	@Override
	public java.lang.String getDescription() {
		return _advItem.getDescription();
	}

	/**
	* Returns the target link of this adv item.
	*
	* @return the target link of this adv item
	*/
	@Override
	public java.lang.String getTargetLink() {
		return _advItem.getTargetLink();
	}

	/**
	* Returns the user name of this adv item.
	*
	* @return the user name of this adv item
	*/
	@Override
	public java.lang.String getUserName() {
		return _advItem.getUserName();
	}

	/**
	* Returns the user uuid of this adv item.
	*
	* @return the user uuid of this adv item
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _advItem.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _advItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _advItem.toXmlString();
	}

	/**
	* Returns the create date of this adv item.
	*
	* @return the create date of this adv item
	*/
	@Override
	public Date getCreateDate() {
		return _advItem.getCreateDate();
	}

	/**
	* Returns the modified date of this adv item.
	*
	* @return the modified date of this adv item
	*/
	@Override
	public Date getModifiedDate() {
		return _advItem.getModifiedDate();
	}

	/**
	* Returns the adv item ID of this adv item.
	*
	* @return the adv item ID of this adv item
	*/
	@Override
	public long getAdvItemId() {
		return _advItem.getAdvItemId();
	}

	/**
	* Returns the adv package ID of this adv item.
	*
	* @return the adv package ID of this adv item
	*/
	@Override
	public long getAdvPackageId() {
		return _advItem.getAdvPackageId();
	}

	/**
	* Returns the company ID of this adv item.
	*
	* @return the company ID of this adv item
	*/
	@Override
	public long getCompanyId() {
		return _advItem.getCompanyId();
	}

	/**
	* Returns the group ID of this adv item.
	*
	* @return the group ID of this adv item
	*/
	@Override
	public long getGroupId() {
		return _advItem.getGroupId();
	}

	/**
	* Returns the primary key of this adv item.
	*
	* @return the primary key of this adv item
	*/
	@Override
	public long getPrimaryKey() {
		return _advItem.getPrimaryKey();
	}

	/**
	* Returns the user ID of this adv item.
	*
	* @return the user ID of this adv item
	*/
	@Override
	public long getUserId() {
		return _advItem.getUserId();
	}

	@Override
	public void persist() {
		_advItem.persist();
	}

	/**
	* Sets the adv item ID of this adv item.
	*
	* @param advItemId the adv item ID of this adv item
	*/
	@Override
	public void setAdvItemId(long advItemId) {
		_advItem.setAdvItemId(advItemId);
	}

	/**
	* Sets the adv item name of this adv item.
	*
	* @param advItemName the adv item name of this adv item
	*/
	@Override
	public void setAdvItemName(java.lang.String advItemName) {
		_advItem.setAdvItemName(advItemName);
	}

	/**
	* Sets the adv package ID of this adv item.
	*
	* @param advPackageId the adv package ID of this adv item
	*/
	@Override
	public void setAdvPackageId(long advPackageId) {
		_advItem.setAdvPackageId(advPackageId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_advItem.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this adv item.
	*
	* @param companyId the company ID of this adv item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_advItem.setCompanyId(companyId);
	}

	/**
	* Sets the content of this adv item.
	*
	* @param content the content of this adv item
	*/
	@Override
	public void setContent(java.lang.String content) {
		_advItem.setContent(content);
	}

	/**
	* Sets the create date of this adv item.
	*
	* @param createDate the create date of this adv item
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_advItem.setCreateDate(createDate);
	}

	/**
	* Sets the description of this adv item.
	*
	* @param description the description of this adv item
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_advItem.setDescription(description);
	}

	/**
	* Sets the duaration of this adv item.
	*
	* @param duaration the duaration of this adv item
	*/
	@Override
	public void setDuaration(int duaration) {
		_advItem.setDuaration(duaration);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_advItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_advItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_advItem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this adv item.
	*
	* @param groupId the group ID of this adv item
	*/
	@Override
	public void setGroupId(long groupId) {
		_advItem.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this adv item.
	*
	* @param modifiedDate the modified date of this adv item
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_advItem.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_advItem.setNew(n);
	}

	/**
	* Sets the order of this adv item.
	*
	* @param order the order of this adv item
	*/
	@Override
	public void setOrder(int order) {
		_advItem.setOrder(order);
	}

	/**
	* Sets the primary key of this adv item.
	*
	* @param primaryKey the primary key of this adv item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_advItem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_advItem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this adv item.
	*
	* @param status the status of this adv item
	*/
	@Override
	public void setStatus(int status) {
		_advItem.setStatus(status);
	}

	/**
	* Sets the target link of this adv item.
	*
	* @param targetLink the target link of this adv item
	*/
	@Override
	public void setTargetLink(java.lang.String targetLink) {
		_advItem.setTargetLink(targetLink);
	}

	/**
	* Sets the user ID of this adv item.
	*
	* @param userId the user ID of this adv item
	*/
	@Override
	public void setUserId(long userId) {
		_advItem.setUserId(userId);
	}

	/**
	* Sets the user name of this adv item.
	*
	* @param userName the user name of this adv item
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_advItem.setUserName(userName);
	}

	/**
	* Sets the user uuid of this adv item.
	*
	* @param userUuid the user uuid of this adv item
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_advItem.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvItemWrapper)) {
			return false;
		}

		AdvItemWrapper advItemWrapper = (AdvItemWrapper)obj;

		if (Objects.equals(_advItem, advItemWrapper._advItem)) {
			return true;
		}

		return false;
	}

	@Override
	public AdvItem getWrappedModel() {
		return _advItem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _advItem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _advItem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_advItem.resetOriginalValues();
	}

	private final AdvItem _advItem;
}