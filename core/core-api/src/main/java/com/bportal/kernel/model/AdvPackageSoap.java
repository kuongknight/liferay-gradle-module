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
 * This class is used by SOAP remote services, specifically {@link com.bportal.kernel.service.http.AdvPackageServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bportal.kernel.service.http.AdvPackageServiceSoap
 * @generated
 */
@ProviderType
public class AdvPackageSoap implements Serializable {
	public static AdvPackageSoap toSoapModel(AdvPackage model) {
		AdvPackageSoap soapModel = new AdvPackageSoap();

		soapModel.setAdvPackageId(model.getAdvPackageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTemplateId(model.getTemplateId());
		soapModel.setAdvPackageName(model.getAdvPackageName());
		soapModel.setLayoutId(model.getLayoutId());
		soapModel.setStatus(model.getStatus());
		soapModel.setBeginDate(model.getBeginDate());
		soapModel.setExpiredDate(model.getExpiredDate());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static AdvPackageSoap[] toSoapModels(AdvPackage[] models) {
		AdvPackageSoap[] soapModels = new AdvPackageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AdvPackageSoap[][] toSoapModels(AdvPackage[][] models) {
		AdvPackageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AdvPackageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AdvPackageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AdvPackageSoap[] toSoapModels(List<AdvPackage> models) {
		List<AdvPackageSoap> soapModels = new ArrayList<AdvPackageSoap>(models.size());

		for (AdvPackage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AdvPackageSoap[soapModels.size()]);
	}

	public AdvPackageSoap() {
	}

	public long getPrimaryKey() {
		return _advPackageId;
	}

	public void setPrimaryKey(long pk) {
		setAdvPackageId(pk);
	}

	public long getAdvPackageId() {
		return _advPackageId;
	}

	public void setAdvPackageId(long advPackageId) {
		_advPackageId = advPackageId;
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

	public long getTemplateId() {
		return _templateId;
	}

	public void setTemplateId(long templateId) {
		_templateId = templateId;
	}

	public String getAdvPackageName() {
		return _advPackageName;
	}

	public void setAdvPackageName(String advPackageName) {
		_advPackageName = advPackageName;
	}

	public long getLayoutId() {
		return _layoutId;
	}

	public void setLayoutId(long layoutId) {
		_layoutId = layoutId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public Date getBeginDate() {
		return _beginDate;
	}

	public void setBeginDate(Date beginDate) {
		_beginDate = beginDate;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _advPackageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _templateId;
	private String _advPackageName;
	private long _layoutId;
	private int _status;
	private Date _beginDate;
	private Date _expiredDate;
	private String _description;
}