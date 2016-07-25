<%@page import="com.bportal.kernel.service.AdvItemLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvItem"%>
<%@page import="com.bportal.kernel.service.AdvPackageLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvPackage"%>
<%@ include file="init.jsp" %>
<%@ include file="../redirect.jsp" %>
<div class="closed container-fluid-1280 sidenav-container sidenav-right" >

<liferay-util:include page="/admin/add_button.jsp" servletContext="<%= application %>" />
<%
	long advPackageId = ParamUtil.getLong(request, "advPackageId");
	AdvPackage advPackage = AdvPackageLocalServiceUtil.fetchAdvPackage(advPackageId);
%>
<c:if test="<%=advPackage!=null %>">
	<%
		renderResponse.setTitle(advPackage.getAdvPackageName());
	%>
	<liferay-ui:search-container 
	total="<%= AdvItemLocalServiceUtil.countByByPackageId(advPackage.getAdvPackageId())%>"
	emptyResultsMessage="no-item"
	>
	<%
		searchContainer.setEmptyResultsMessageCssClass("taglib-empty-search-result-message-header");
	%>
	<liferay-ui:search-container-results 
		results="<%=AdvItemLocalServiceUtil.findByPackageId(advPackage.getAdvPackageId() ,searchContainer.getStart(), searchContainer.getEnd())%>"
		/>
	<liferay-ui:search-container-row 
		className="com.bportal.kernel.model.AdvItem"
		keyProperty="advItemId"
		modelVar="advItem"
		rowVar="row"
		>
	<liferay-ui:search-container-column-text 
		name="item-name" 
		value="<%=advItem.getAdvItemName() %>"
		/>	
	<liferay-ui:search-container-column-text 
		name="status" 
		value="<%=advItem.getStatus()==0? LanguageUtil.get(request, "active") :  LanguageUtil.get(request, "disable")%>"
		/>	
	<liferay-ui:search-container-column-text 
		name="description" 
		value="<%= advItem.getDescription() %>"
		/>
	<liferay-ui:search-container-column-text 
		name="target-link" 
		value="<%= advItem.getTargetLink() %>"
		/>
	<liferay-ui:search-container-column-text 
		name="duaration" 
		value="<%= String.valueOf(advItem.getDuaration()) %>"
		/>
	<liferay-ui:search-container-column-text>	
		<liferay-ui:icon-menu direction="left-side" icon="" markupView="lexicon" message="" showWhenSingleIcon="<%= true %>">
			<liferay-portlet:renderURL var="editItemPopupURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
				<liferay-portlet:param name="mvcPath" value="/admin/edit_item.jsp"/>
				<liferay-portlet:param name="redirect" value="<%= currentURL %>" />
				<liferay-portlet:param name="advItemId" value="<%= String.valueOf(advItem.getAdvItemId()) %>" />
			</liferay-portlet:renderURL>
	
			<liferay-ui:icon
				message="edit"
				url="<%=editItemPopupURL %>"
				useDialog="true"
			/>
			<portlet:actionURL name="deleteEntry" var="deleteItemURL">
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="entryId" value="<%= String.valueOf(advItem.getAdvItemId()) %>" />
				<portlet:param name="cmd" value="deleteItem" />
			</portlet:actionURL>
		
			<liferay-ui:icon-delete
				url="<%=deleteItemURL %>"
				confirmation="true"
			/>
		</liferay-ui:icon-menu>
	</liferay-ui:search-container-column-text>
						
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator displayStyle="list" markupView="lexicon" type='regular'/>
</liferay-ui:search-container>
</c:if>
<aui:script>
Liferay.provide(
        window,
        '<portlet:namespace />refreshPortlet',
        function(win) {
            var curPortletBoundaryId = '#p_p_id<portlet:namespace />';
            Liferay.Portlet.refresh(curPortletBoundaryId);
            var popupDialog = Liferay.Util.Window.getById(win._name);
            popupDialog.destroy();
        },
        ['aui-dialog','aui-dialog-iframe']
    );
</aui:script>
</div>