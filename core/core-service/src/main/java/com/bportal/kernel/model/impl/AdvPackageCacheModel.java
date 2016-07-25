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

package com.bportal.kernel.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bportal.kernel.model.AdvPackage;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AdvPackage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AdvPackage
 * @generated
 */
@ProviderType
public class AdvPackageCacheModel implements CacheModel<AdvPackage>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvPackageCacheModel)) {
			return false;
		}

		AdvPackageCacheModel advPackageCacheModel = (AdvPackageCacheModel)obj;

		if (advPackageId == advPackageCacheModel.advPackageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, advPackageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{advPackageId=");
		sb.append(advPackageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", templateId=");
		sb.append(templateId);
		sb.append(", advPackageName=");
		sb.append(advPackageName);
		sb.append(", layoutId=");
		sb.append(layoutId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", beginDate=");
		sb.append(beginDate);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AdvPackage toEntityModel() {
		AdvPackageImpl advPackageImpl = new AdvPackageImpl();

		advPackageImpl.setAdvPackageId(advPackageId);
		advPackageImpl.setGroupId(groupId);
		advPackageImpl.setCompanyId(companyId);
		advPackageImpl.setUserId(userId);

		if (userName == null) {
			advPackageImpl.setUserName(StringPool.BLANK);
		}
		else {
			advPackageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			advPackageImpl.setCreateDate(null);
		}
		else {
			advPackageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			advPackageImpl.setModifiedDate(null);
		}
		else {
			advPackageImpl.setModifiedDate(new Date(modifiedDate));
		}

		advPackageImpl.setTemplateId(templateId);

		if (advPackageName == null) {
			advPackageImpl.setAdvPackageName(StringPool.BLANK);
		}
		else {
			advPackageImpl.setAdvPackageName(advPackageName);
		}

		advPackageImpl.setLayoutId(layoutId);
		advPackageImpl.setStatus(status);

		if (beginDate == Long.MIN_VALUE) {
			advPackageImpl.setBeginDate(null);
		}
		else {
			advPackageImpl.setBeginDate(new Date(beginDate));
		}

		if (expiredDate == Long.MIN_VALUE) {
			advPackageImpl.setExpiredDate(null);
		}
		else {
			advPackageImpl.setExpiredDate(new Date(expiredDate));
		}

		if (description == null) {
			advPackageImpl.setDescription(StringPool.BLANK);
		}
		else {
			advPackageImpl.setDescription(description);
		}

		advPackageImpl.resetOriginalValues();

		return advPackageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		advPackageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		templateId = objectInput.readLong();
		advPackageName = objectInput.readUTF();

		layoutId = objectInput.readLong();

		status = objectInput.readInt();
		beginDate = objectInput.readLong();
		expiredDate = objectInput.readLong();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(advPackageId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(templateId);

		if (advPackageName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(advPackageName);
		}

		objectOutput.writeLong(layoutId);

		objectOutput.writeInt(status);
		objectOutput.writeLong(beginDate);
		objectOutput.writeLong(expiredDate);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long advPackageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long templateId;
	public String advPackageName;
	public long layoutId;
	public int status;
	public long beginDate;
	public long expiredDate;
	public String description;
}