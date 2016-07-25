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
 * This class is a wrapper for {@link AdvTemplate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplate
 * @generated
 */
@ProviderType
public class AdvTemplateWrapper implements AdvTemplate,
	ModelWrapper<AdvTemplate> {
	public AdvTemplateWrapper(AdvTemplate advTemplate) {
		_advTemplate = advTemplate;
	}

	@Override
	public Class<?> getModelClass() {
		return AdvTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return AdvTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("advTemplateId", getAdvTemplateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("advTemplateName", getAdvTemplateName());
		attributes.put("content", getContent());
		attributes.put("status", getStatus());
		attributes.put("type", getType());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long advTemplateId = (Long)attributes.get("advTemplateId");

		if (advTemplateId != null) {
			setAdvTemplateId(advTemplateId);
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

		String advTemplateName = (String)attributes.get("advTemplateName");

		if (advTemplateName != null) {
			setAdvTemplateName(advTemplateName);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public AdvTemplate toEscapedModel() {
		return new AdvTemplateWrapper(_advTemplate.toEscapedModel());
	}

	@Override
	public AdvTemplate toUnescapedModel() {
		return new AdvTemplateWrapper(_advTemplate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _advTemplate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _advTemplate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _advTemplate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _advTemplate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AdvTemplate> toCacheModel() {
		return _advTemplate.toCacheModel();
	}

	@Override
	public int compareTo(AdvTemplate advTemplate) {
		return _advTemplate.compareTo(advTemplate);
	}

	/**
	* Returns the status of this adv template.
	*
	* @return the status of this adv template
	*/
	@Override
	public int getStatus() {
		return _advTemplate.getStatus();
	}

	/**
	* Returns the type of this adv template.
	*
	* @return the type of this adv template
	*/
	@Override
	public int getType() {
		return _advTemplate.getType();
	}

	@Override
	public int hashCode() {
		return _advTemplate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _advTemplate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AdvTemplateWrapper((AdvTemplate)_advTemplate.clone());
	}

	/**
	* Returns the adv template name of this adv template.
	*
	* @return the adv template name of this adv template
	*/
	@Override
	public java.lang.String getAdvTemplateName() {
		return _advTemplate.getAdvTemplateName();
	}

	/**
	* Returns the content of this adv template.
	*
	* @return the content of this adv template
	*/
	@Override
	public java.lang.String getContent() {
		return _advTemplate.getContent();
	}

	/**
	* Returns the description of this adv template.
	*
	* @return the description of this adv template
	*/
	@Override
	public java.lang.String getDescription() {
		return _advTemplate.getDescription();
	}

	/**
	* Returns the user name of this adv template.
	*
	* @return the user name of this adv template
	*/
	@Override
	public java.lang.String getUserName() {
		return _advTemplate.getUserName();
	}

	/**
	* Returns the user uuid of this adv template.
	*
	* @return the user uuid of this adv template
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _advTemplate.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _advTemplate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _advTemplate.toXmlString();
	}

	/**
	* Returns the create date of this adv template.
	*
	* @return the create date of this adv template
	*/
	@Override
	public Date getCreateDate() {
		return _advTemplate.getCreateDate();
	}

	/**
	* Returns the modified date of this adv template.
	*
	* @return the modified date of this adv template
	*/
	@Override
	public Date getModifiedDate() {
		return _advTemplate.getModifiedDate();
	}

	/**
	* Returns the adv template ID of this adv template.
	*
	* @return the adv template ID of this adv template
	*/
	@Override
	public long getAdvTemplateId() {
		return _advTemplate.getAdvTemplateId();
	}

	/**
	* Returns the company ID of this adv template.
	*
	* @return the company ID of this adv template
	*/
	@Override
	public long getCompanyId() {
		return _advTemplate.getCompanyId();
	}

	/**
	* Returns the group ID of this adv template.
	*
	* @return the group ID of this adv template
	*/
	@Override
	public long getGroupId() {
		return _advTemplate.getGroupId();
	}

	/**
	* Returns the primary key of this adv template.
	*
	* @return the primary key of this adv template
	*/
	@Override
	public long getPrimaryKey() {
		return _advTemplate.getPrimaryKey();
	}

	/**
	* Returns the user ID of this adv template.
	*
	* @return the user ID of this adv template
	*/
	@Override
	public long getUserId() {
		return _advTemplate.getUserId();
	}

	@Override
	public void persist() {
		_advTemplate.persist();
	}

	/**
	* Sets the adv template ID of this adv template.
	*
	* @param advTemplateId the adv template ID of this adv template
	*/
	@Override
	public void setAdvTemplateId(long advTemplateId) {
		_advTemplate.setAdvTemplateId(advTemplateId);
	}

	/**
	* Sets the adv template name of this adv template.
	*
	* @param advTemplateName the adv template name of this adv template
	*/
	@Override
	public void setAdvTemplateName(java.lang.String advTemplateName) {
		_advTemplate.setAdvTemplateName(advTemplateName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_advTemplate.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this adv template.
	*
	* @param companyId the company ID of this adv template
	*/
	@Override
	public void setCompanyId(long companyId) {
		_advTemplate.setCompanyId(companyId);
	}

	/**
	* Sets the content of this adv template.
	*
	* @param content the content of this adv template
	*/
	@Override
	public void setContent(java.lang.String content) {
		_advTemplate.setContent(content);
	}

	/**
	* Sets the create date of this adv template.
	*
	* @param createDate the create date of this adv template
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_advTemplate.setCreateDate(createDate);
	}

	/**
	* Sets the description of this adv template.
	*
	* @param description the description of this adv template
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_advTemplate.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_advTemplate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_advTemplate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_advTemplate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this adv template.
	*
	* @param groupId the group ID of this adv template
	*/
	@Override
	public void setGroupId(long groupId) {
		_advTemplate.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this adv template.
	*
	* @param modifiedDate the modified date of this adv template
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_advTemplate.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_advTemplate.setNew(n);
	}

	/**
	* Sets the primary key of this adv template.
	*
	* @param primaryKey the primary key of this adv template
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_advTemplate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_advTemplate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this adv template.
	*
	* @param status the status of this adv template
	*/
	@Override
	public void setStatus(int status) {
		_advTemplate.setStatus(status);
	}

	/**
	* Sets the type of this adv template.
	*
	* @param type the type of this adv template
	*/
	@Override
	public void setType(int type) {
		_advTemplate.setType(type);
	}

	/**
	* Sets the user ID of this adv template.
	*
	* @param userId the user ID of this adv template
	*/
	@Override
	public void setUserId(long userId) {
		_advTemplate.setUserId(userId);
	}

	/**
	* Sets the user name of this adv template.
	*
	* @param userName the user name of this adv template
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_advTemplate.setUserName(userName);
	}

	/**
	* Sets the user uuid of this adv template.
	*
	* @param userUuid the user uuid of this adv template
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_advTemplate.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvTemplateWrapper)) {
			return false;
		}

		AdvTemplateWrapper advTemplateWrapper = (AdvTemplateWrapper)obj;

		if (Objects.equals(_advTemplate, advTemplateWrapper._advTemplate)) {
			return true;
		}

		return false;
	}

	@Override
	public AdvTemplate getWrappedModel() {
		return _advTemplate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _advTemplate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _advTemplate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_advTemplate.resetOriginalValues();
	}

	private final AdvTemplate _advTemplate;
}