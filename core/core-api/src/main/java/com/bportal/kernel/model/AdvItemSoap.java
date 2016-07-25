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
 * This class is used by SOAP remote services, specifically {@link com.bportal.kernel.service.http.AdvItemServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.http.AdvItemServiceSoap
 * @generated
 */
@ProviderType
public class AdvItemSoap implements Serializable {
	public static AdvItemSoap toSoapModel(AdvItem model) {
		AdvItemSoap soapModel = new AdvItemSoap();

		soapModel.setAdvItemId(model.getAdvItemId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAdvPackageId(model.getAdvPackageId());
		soapModel.setAdvItemName(model.getAdvItemName());
		soapModel.setContent(model.getContent());
		soapModel.setTargetLink(model.getTargetLink());
		soapModel.setDuaration(model.getDuaration());
		soapModel.setStatus(model.getStatus());
		soapModel.setOrder(model.getOrder());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static AdvItemSoap[] toSoapModels(AdvItem[] models) {
		AdvItemSoap[] soapModels = new AdvItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AdvItemSoap[][] toSoapModels(AdvItem[][] models) {
		AdvItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AdvItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AdvItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AdvItemSoap[] toSoapModels(List<AdvItem> models) {
		List<AdvItemSoap> soapModels = new ArrayList<AdvItemSoap>(models.size());

		for (AdvItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AdvItemSoap[soapModels.size()]);
	}

	public AdvItemSoap() {
	}

	public long getPrimaryKey() {
		return _advItemId;
	}

	public void setPrimaryKey(long pk) {
		setAdvItemId(pk);
	}

	public long getAdvItemId() {
		return _advItemId;
	}

	public void setAdvItemId(long advItemId) {
		_advItemId = advItemId;
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

	public long getAdvPackageId() {
		return _advPackageId;
	}

	public void setAdvPackageId(long advPackageId) {
		_advPackageId = advPackageId;
	}

	public String getAdvItemName() {
		return _advItemName;
	}

	public void setAdvItemName(String advItemName) {
		_advItemName = advItemName;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getTargetLink() {
		return _targetLink;
	}

	public void setTargetLink(String targetLink) {
		_targetLink = targetLink;
	}

	public int getDuaration() {
		return _duaration;
	}

	public void setDuaration(int duaration) {
		_duaration = duaration;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _advItemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _advPackageId;
	private String _advItemName;
	private String _content;
	private String _targetLink;
	private int _duaration;
	private int _status;
	private int _order;
	private String _description;
}