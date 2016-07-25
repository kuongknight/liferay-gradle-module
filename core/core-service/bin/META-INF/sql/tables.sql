create table BPortal_AdvItem (
	advItemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	advPackageId LONG,
	advItemName VARCHAR(75) null,
	content VARCHAR(75) null,
	targetLink VARCHAR(75) null,
	duaration INTEGER,
	status INTEGER,
	order_ INTEGER,
	description VARCHAR(75) null
);

create table BPortal_AdvPackage (
	advPackageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	templateId LONG,
	advPackageName VARCHAR(75) null,
	layoutId LONG,
	status INTEGER,
	beginDate DATE null,
	expiredDate DATE null,
	description VARCHAR(75) null
);

create table BPortal_AdvTemplate (
	advTemplateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	advTemplateName VARCHAR(75) null,
	content VARCHAR(75) null,
	status INTEGER,
	type_ INTEGER,
	description VARCHAR(75) null
);