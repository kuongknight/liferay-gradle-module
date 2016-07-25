<%@ include file="init.jsp" %>
<liferay-frontend:management-bar
    includeCheckBox="<%= true %>"
    searchContainerId="advpackageSC"
>
    <liferay-frontend:management-bar-buttons>
        <liferay-frontend:management-bar-sidenav-toggler-button 
        	icon="info-circle"
			label="info"
        	/>
    </liferay-frontend:management-bar-buttons>
	
    <liferay-frontend:management-bar-filters>
        <liferay-frontend:management-bar-navigation
            navigationKeys='<%= new String[] {"all"} %>'
            portletURL="<%=iteratorURL  %>"
        />
        <liferay-frontend:management-bar-sort
            orderByCol="expiredDate"
            orderByType="asc"
            orderColumns='<%= new String[] {"expired-date"} %>'
            portletURL="<%= iteratorURL %>"
        />
    </liferay-frontend:management-bar-filters>

    <liferay-frontend:management-bar-action-buttons>
        <liferay-frontend:management-bar-sidenav-toggler-button 
        	icon="info-circle"
			label="info"
        	/>
        <liferay-frontend:management-bar-button href='<%= "javascript:" + liferayPortletResponse.getNamespace() + "deleteEntries();" %>'
        icon="trash" id="deleteSelectedPackage" label="delete" />
    </liferay-frontend:management-bar-action-buttons>
    
</liferay-frontend:management-bar>