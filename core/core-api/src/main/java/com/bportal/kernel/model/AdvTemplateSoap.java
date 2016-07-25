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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bportal.kernel.service.http.AdvTemplateServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.http.AdvTemplateServiceSoap
 * @generated
 */
@ProviderType
public class AdvTemplateSoap implements Serializable {
	public static AdvTemplateSoap toSoapModel(AdvTemplate model) {
		AdvTemplateSoap soapModel = new AdvTemplateSoap();

		soapModel.setAdvTemplateId(model.getAdvTemplateId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAdvTemplateName(model.getAdvTemplateName());
		soapModel.setContent(model.getContent());
		soapModel.setStatus(model.getStatus());
		soapModel.setType(model.getType());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static AdvTemplateSoap[] toSoapModels(AdvTemplate[] models) {
		AdvTemplateSoap[] soapModels = new AdvTemplateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AdvTemplateSoap[][] toSoapModels(AdvTemplate[][] models) {
		AdvTemplateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AdvTemplateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AdvTemplateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AdvTemplateSoap[] toSoapModels(List<AdvTemplate> models) {
		List<AdvTemplateSoap> soapModels = new ArrayList<AdvTemplateSoap>(models.size());

		for (AdvTemplate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AdvTemplateSoap[soapModels.size()]);
	}

	public AdvTemplateSoap() {
	}

	public long getPrimaryKey() {
		return _advTemplateId;
	}

	public void setPrimaryKey(long pk) {
		setAdvTemplateId(pk);
	}

	public long getAdvTemplateId() {
		return _advTemplateId;
	}

	public void setAdvTemplateId(long advTemplateId) {
		_advTemplateId = advTemplateId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getAdvTemplateName() {
		return _advTemplateName;
	}

	public void setAdvTemplateName(String advTemplateName) {
		_advTemplateName = advTemplateName;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _advTemplateId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _advTemplateName;
	private String _content;
	private int _status;
	private int _type;
	private String _description;
}