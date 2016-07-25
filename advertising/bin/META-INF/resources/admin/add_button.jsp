<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="init.jsp" %>
<liferay-portlet:renderURL varImpl="editPackgeURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<liferay-portlet:param name="mvcPath" value="/admin/edit_advpackage.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL varImpl="editTemplateURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<liferay-portlet:param name="mvcPath" value="/admin/edit_template.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL varImpl="editItemURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<liferay-portlet:param name="mvcPath" value="/admin/edit_item.jsp"/>
	<liferay-portlet:param name="advPackageId" value="<%=String.valueOf(detailPackageId) %>"/>
</liferay-portlet:renderURL>
<%
	boolean isShowPackageDetail = ParamUtil.getBoolean(request, "showPackageDetail");
	String dialogtitle = LanguageUtil.get(request, "new-package");
	if(isTemplateTab){
		editPackgeURL = editTemplateURL;
		dialogtitle = LanguageUtil.get(request, "new-template");
	}
	if(isShowPackageDetail){
		editPackgeURL = editItemURL;
		dialogtitle = LanguageUtil.get(request, "new-item");
	}
	
%>
<liferay-frontend:add-menu>
	<liferay-frontend:add-menu-item id="addPackage" url="javascript:;" title="add"></liferay-frontend:add-menu-item>
</liferay-frontend:add-menu>
<aui:script>
AUI().use('aui-base',
		'liferay-util-window',
		function(A) {
		A.one('#<portlet:namespace />addPackage').on('click',function(){
			openDialog({
				uri:'<%=editPackgeURL.toString()%>',
				title:'<%=dialogtitle%>',
				id:'advDialog',
				width:980
			});
		});
		
		
		function openDialog(config, callback){
			 var configDefault = {
					 centered: true,
					 constrain2view: true,
					 modal: true,
					 resizable: false
		 		};
			 if(config.width){
				 configDefault.width = config.width;
			 }
			 if(config.height){
				 configDefault.height = config.height;
			 }
			 var popUpWindow=Liferay.Util.Window.getWindow({
					dialog: configDefault,
			 		id: '<portlet:namespace/>'+config.id,
			 		title: config.title,
			 		uri: config.uri
			});
			if(callback){
				callback();
			}
		}
		
});
</aui:script>