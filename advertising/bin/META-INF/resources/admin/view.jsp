<%@ include file="init.jsp" %>
<div class="closed container-fluid-1280 sidenav-container sidenav-right" >
	<liferay-util:include page="/admin/add_button.jsp" servletContext="<%= application %>" />
	<liferay-util:include page="/admin/navigation_bar.jsp" servletContext="<%= application %>" />
	<c:if test="<%=!isTemplateTab %>">
		<liferay-util:include page="/admin/view_package.jsp" servletContext="<%= application %>" />
	</c:if>
	<c:if test="<%=isTemplateTab %>">
		<liferay-util:include page="/admin/view_template.jsp" servletContext="<%= application %>" />
	</c:if>
</div>
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