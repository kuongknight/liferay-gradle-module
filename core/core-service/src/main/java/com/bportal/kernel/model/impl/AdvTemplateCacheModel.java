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

import com.bportal.kernel.model.AdvTemplate;

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
 * The cache model class for representing AdvTemplate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplate
 * @generated
 */
@ProviderType
public class AdvTemplateCacheModel implements CacheModel<AdvTemplate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvTemplateCacheModel)) {
			return false;
		}

		AdvTemplateCacheModel advTemplateCacheModel = (AdvTemplateCacheModel)obj;

		if (advTemplateId == advTemplateCacheModel.advTemplateId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, advTemplateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{advTemplateId=");
		sb.append(advTemplateId);
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
		sb.append(", advTemplateName=");
		sb.append(advTemplateName);
		sb.append(", content=");
		sb.append(content);
		sb.append(", status=");
		sb.append(status);
		sb.append(", type=");
		sb.append(type);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AdvTemplate toEntityModel() {
		AdvTemplateImpl advTemplateImpl = new AdvTemplateImpl();

		advTemplateImpl.setAdvTemplateId(advTemplateId);
		advTemplateImpl.setGroupId(groupId);
		advTemplateImpl.setCompanyId(companyId);
		advTemplateImpl.setUserId(userId);

		if (userName == null) {
			advTemplateImpl.setUserName(StringPool.BLANK);
		}
		else {
			advTemplateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			advTemplateImpl.setCreateDate(null);
		}
		else {
			advTemplateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			advTemplateImpl.setModifiedDate(null);
		}
		else {
			advTemplateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (advTemplateName == null) {
			advTemplateImpl.setAdvTemplateName(StringPool.BLANK);
		}
		else {
			advTemplateImpl.setAdvTemplateName(advTemplateName);
		}

		if (content == null) {
			advTemplateImpl.setContent(StringPool.BLANK);
		}
		else {
			advTemplateImpl.setContent(content);
		}

		advTemplateImpl.setStatus(status);
		advTemplateImpl.setType(type);

		if (description == null) {
			advTemplateImpl.setDescription(StringPool.BLANK);
		}
		else {
			advTemplateImpl.setDescription(description);
		}

		advTemplateImpl.resetOriginalValues();

		return advTemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		advTemplateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		advTemplateName = objectInput.readUTF();
		content = objectInput.readUTF();

		status = objectInput.readInt();

		type = objectInput.readInt();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(advTemplateId);

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

		if (advTemplateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(advTemplateName);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeInt(status);

		objectOutput.writeInt(type);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long advTemplateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String advTemplateName;
	public String content;
	public int status;
	public int type;
	public String description;
}