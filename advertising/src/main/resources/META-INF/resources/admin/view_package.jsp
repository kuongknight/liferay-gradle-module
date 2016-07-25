<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.bportal.kernel.service.AdvTemplateLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvTemplate"%>
<%@page import="com.bportal.kernel.service.AdvPackageLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvPackage"%>
<%@ include file="init.jsp" %>
<portlet:actionURL name="deleteEntry" var="deleteEntryURL">
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>
<aui:form action="<%= deleteEntryURL %>" method="get" name="fmPackage">
<aui:input name="cmd" value="deletePackage" type="hidden"></aui:input>
<liferay-util:include page="/admin/management_bar.jsp" servletContext="<%= application %>" />
<liferay-ui:search-container id="advpackageSC"
	total="<%=AdvPackageLocalServiceUtil.getAdvPackagesCount() %>"
	emptyResultsMessage="no-item"
	iteratorURL="<%=iteratorURL %>"
	 rowChecker="<%=new RowChecker(renderResponse)%>">
	<%
		searchContainer.setEmptyResultsMessageCssClass("taglib-empty-search-result-message-header");
	%>
	<liferay-ui:search-container-results 
		results="<%=AdvPackageLocalServiceUtil.getAdvPackages(searchContainer.getStart(), searchContainer.getEnd())%>"
		/>
	<liferay-ui:search-container-row 
		className="com.bportal.kernel.model.AdvPackage"
		keyProperty="advPackageId"
		modelVar="advPackage"
		rowVar="row"
		>
	<liferay-portlet:renderURL var="showDetailURL">
		<liferay-portlet:param name="mvcPath" value="/admin/view_items.jsp"/>
		<portlet:param name="redirect" value="<%= currentURL %>" />
		<liferay-portlet:param name="advPackageId" value="<%=String.valueOf(advPackage.getAdvPackageId()) %>"/>
		<portlet:param name="showPackageDetail" value="true" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container-column-text 
		name="package-name" 
		value="<%=advPackage.getAdvPackageName() %>"
		href="<%=showDetailURL %>"
		/>
	<liferay-ui:search-container-column-text 
		name="status" 
		value="<%=advPackage.getStatus()==BPortalUtil.STT_ACTIVE? LanguageUtil.get(request, "active") :  LanguageUtil.get(request, "disable")%>"
		/>
	<%
		String layoutName = LanguageUtil.get(request, "all");
		if(advPackage.getLayoutId() != 0){
			Layout layoutActive = LayoutLocalServiceUtil.fetchLayout(advPackage.getLayoutId());
			layoutName = layoutActive.getFriendlyURL(locale);
		}
	%>	
	<liferay-ui:search-container-column-text 
		name="layout" 
		value="<%=layoutName %>"
		/>	
	<liferay-ui:search-container-column-text 
		name="begin-date" 
		value="<%=dateTimeFormat.format(advPackage.getBeginDate()) %>"			
		/>
	<liferay-ui:search-container-column-text 
		name="exprised-date" 
		value="<%=dateTimeFormat.format(advPackage.getExpiredDate()) %>"			
		/>
	<%
		AdvTemplate advTemplate = AdvTemplateLocalServiceUtil.fetchAdvTemplate(advPackage.getTemplateId());
	%>
	<liferay-ui:search-container-column-text 
		name="template" 
		value="<%=advTemplate.getAdvTemplateName() %>"
		/>
	<liferay-ui:search-container-column-text>
		<liferay-portlet:renderURL var="editPackagePopupURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
				<liferay-portlet:param name="mvcPath" value="/admin/edit_advpackage.jsp"/>
				<liferay-portlet:param name="redirect" value="<%= currentURL %>" />
				<liferay-portlet:param name="advPackageId" value="<%= String.valueOf(advPackage.getAdvPackageId()) %>" />
		</liferay-portlet:renderURL>
	
		<liferay-ui:icon
			message="edit"
			url="<%=editPackagePopupURL %>"
			useDialog="true"
			icon="pencil"
		/>
	</liferay-ui:search-container-column-text>			
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator displayStyle="list" markupView="lexicon" type='regular'/>
</liferay-ui:search-container>
</aui:form>
<aui:script>
	function <portlet:namespace />deleteEntries() {
		if (confirm('<%= UnicodeLanguageUtil.get(request, "are-you-sure-you-want-to-delete-the-selected-entries") %>')) {
			var form = AUI.$(document.<portlet:namespace />fmPackage);
			form.attr('method', 'post');
			submitForm(form);
		}
	}
</aui:script>