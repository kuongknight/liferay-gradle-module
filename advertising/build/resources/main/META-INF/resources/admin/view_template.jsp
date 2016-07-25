<%@page import="com.bportal.kernel.service.AdvTemplateLocalServiceUtil"%>
<%@ include file="init.jsp" %>
<liferay-ui:search-container 
	total="<%=AdvTemplateLocalServiceUtil.getAdvTemplatesCount() %>"
	emptyResultsMessage="no-item"
	iteratorURL="<%=iteratorURL %>"
	>
	<%
		searchContainer.setEmptyResultsMessageCssClass("taglib-empty-search-result-message-header");
	%>
	<liferay-ui:search-container-results 
		results="<%=AdvTemplateLocalServiceUtil.getAdvTemplates(searchContainer.getStart(), searchContainer.getEnd())%>"
		/>
	<liferay-ui:search-container-row 
		className="com.bportal.kernel.model.AdvTemplate"
		keyProperty="advTemplateId"
		modelVar="advTemplate"
		rowVar="row"
		>
	<liferay-portlet:renderURL var="editTemplateURL">
		<liferay-portlet:param name="advTemplateId" value="<%=String.valueOf(advTemplate.getAdvTemplateId()) %>"/>
	</liferay-portlet:renderURL>
	<liferay-ui:search-container-column-text 
		name="template-name" 
		value="<%=advTemplate.getAdvTemplateName() %>"
		href="<%=editTemplateURL %>"
		/>	
	<liferay-ui:search-container-column-text 
		name="status" 
		value="<%=advTemplate.getStatus()==BPortalUtil.STT_ACTIVE? LanguageUtil.get(request, "active") :  LanguageUtil.get(request, "disable")%>"
		/>	
	<liferay-ui:search-container-column-text 
		name="description" 
		value="<%= advTemplate.getDescription() %>"
		/>
	<liferay-ui:search-container-column-text>	
		<liferay-ui:icon-menu direction="left-side" icon="" markupView="lexicon" message="" showWhenSingleIcon="<%= true %>">
			<liferay-portlet:renderURL var="editTemplatePopupURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
				<liferay-portlet:param name="mvcPath" value="/admin/edit_template.jsp"/>
				<liferay-portlet:param name="redirect" value="<%= currentURL %>" />
				<liferay-portlet:param name="advTemplateId" value="<%= String.valueOf(advTemplate.getAdvTemplateId()) %>" />
			</liferay-portlet:renderURL>
	
			<liferay-ui:icon
				message="edit"
				url="<%=editTemplatePopupURL %>"
				useDialog="true"
			/>
			<portlet:actionURL name="deleteEntry" var="deleteEntryURL">
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="entryId" value="<%= String.valueOf(advTemplate.getAdvTemplateId()) %>" />
				<portlet:param name="cmd" value="deleteTemplate" />
			</portlet:actionURL>
		
			<liferay-ui:icon-delete
				url="<%= deleteEntryURL %>"
				confirmation="true"
			/>
		</liferay-ui:icon-menu>
	</liferay-ui:search-container-column-text>
						
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator displayStyle="list" markupView="lexicon" type='regular'/>
</liferay-ui:search-container>