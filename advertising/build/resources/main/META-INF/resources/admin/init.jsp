<%@ include file="../init.jsp" %>
<%
	String searchKey = ParamUtil.getString(request,"searchKey");
	boolean	isTemplateTab = ParamUtil.getBoolean(request, "templateTab");
	long detailPackageId = ParamUtil.getLong(request, "advPackageId");
%>
<liferay-portlet:renderURL varImpl="iteratorURL" >
	<portlet:param name="searchKey" value="<%=searchKey %>"/>
	<portlet:param name="templateTab" value="<%=String.valueOf(isTemplateTab) %>"/>
</liferay-portlet:renderURL>