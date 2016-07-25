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

import com.bportal.kernel.model.AdvItem;

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
 * The cache model class for representing AdvItem in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItem
 * @generated
 */
@ProviderType
public class AdvItemCacheModel implements CacheModel<AdvItem>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvItemCacheModel)) {
			return false;
		}

		AdvItemCacheModel advItemCacheModel = (AdvItemCacheModel)obj;

		if (advItemId == advItemCacheModel.advItemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, advItemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{advItemId=");
		sb.append(advItemId);
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
		sb.append(", advPackageId=");
		sb.append(advPackageId);
		sb.append(", advItemName=");
		sb.append(advItemName);
		sb.append(", content=");
		sb.append(content);
		sb.append(", targetLink=");
		sb.append(targetLink);
		sb.append(", duaration=");
		sb.append(duaration);
		sb.append(", status=");
		sb.append(status);
		sb.append(", order=");
		sb.append(order);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AdvItem toEntityModel() {
		AdvItemImpl advItemImpl = new AdvItemImpl();

		advItemImpl.setAdvItemId(advItemId);
		advItemImpl.setGroupId(groupId);
		advItemImpl.setCompanyId(companyId);
		advItemImpl.setUserId(userId);

		if (userName == null) {
			advItemImpl.setUserName(StringPool.BLANK);
		}
		else {
			advItemImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			advItemImpl.setCreateDate(null);
		}
		else {
			advItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			advItemImpl.setModifiedDate(null);
		}
		else {
			advItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		advItemImpl.setAdvPackageId(advPackageId);

		if (advItemName == null) {
			advItemImpl.setAdvItemName(StringPool.BLANK);
		}
		else {
			advItemImpl.setAdvItemName(advItemName);
		}

		if (content == null) {
			advItemImpl.setContent(StringPool.BLANK);
		}
		else {
			advItemImpl.setContent(content);
		}

		if (targetLink == null) {
			advItemImpl.setTargetLink(StringPool.BLANK);
		}
		else {
			advItemImpl.setTargetLink(targetLink);
		}

		advItemImpl.setDuaration(duaration);
		advItemImpl.setStatus(status);
		advItemImpl.setOrder(order);

		if (description == null) {
			advItemImpl.setDescription(StringPool.BLANK);
		}
		else {
			advItemImpl.setDescription(description);
		}

		advItemImpl.resetOriginalValues();

		return advItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		advItemId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		advPackageId = objectInput.readLong();
		advItemName = objectInput.readUTF();
		content = objectInput.readUTF();
		targetLink = objectInput.readUTF();

		duaration = objectInput.readInt();

		status = objectInput.readInt();

		order = objectInput.readInt();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(advItemId);

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

		objectOutput.writeLong(advPackageId);

		if (advItemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(advItemName);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (targetLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(targetLink);
		}

		objectOutput.writeInt(duaration);

		objectOutput.writeInt(status);

		objectOutput.writeInt(order);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long advItemId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long advPackageId;
	public String advItemName;
	public String content;
	public String targetLink;
	public int duaration;
	public int status;
	public int order;
	public String description;
}