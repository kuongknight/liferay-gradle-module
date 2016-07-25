<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bportal.kernel.service.AdvItemLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvItem"%>
<%@ include file="init.jsp" %>
<%
	long advItemId = ParamUtil.getLong(request, "advItemId");
	AdvItem advItem = AdvItemLocalServiceUtil.fetchAdvItem(advItemId);
	if(advItem !=null){
		detailPackageId = advItem.getAdvPackageId();
	}
	
%>
<liferay-portlet:renderURL varImpl="redirectURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<liferay-portlet:param name="mvcPath" value="/admin/edit_item.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:actionURL var="editItemURL" name="editItem">
</liferay-portlet:actionURL>
<div class="closed container-fluid-1280 sidenav-container sidenav-right" >
	<aui:form name="fmItem" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveItem();" %>'>
		<aui:model-context bean="<%=advItem %>" model="<%=AdvItem.class %>"></aui:model-context>
		<aui:input name="redirect" type="hidden" value="<%=redirectURL.toString() %>"></aui:input>
		<aui:input name="advPackageId" type="hidden" value="<%= detailPackageId%>"></aui:input>
		<aui:input name="advItemId" type="hidden"></aui:input>
		<aui:input name="advItemName">
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input name="description">
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input name="targetLink" ></aui:input>
		<aui:input name="duaration" ></aui:input>
		<aui:input name="order" ></aui:input>
		<aui:field-wrapper label="content">
			<liferay-ui:input-editor contents="<%=advItem!=null? advItem.getContent() : StringPool.BLANK %>">
			</liferay-ui:input-editor>
			<aui:input name="content" type="hidden"></aui:input>
		</aui:field-wrapper>
		<aui:button type="submit" value="save"></aui:button>
	</aui:form>
</div>
<aui:script>
	function <portlet:namespace />getContent() {
		return window.<portlet:namespace />editor.getHTML();
	}
	function <portlet:namespace />saveItem() {
		document.<portlet:namespace />fmItem.action = '<%=editItemURL%>';
		document.<portlet:namespace />fmItem.target = '';
		document.<portlet:namespace />fmItem.<portlet:namespace />content.value = <portlet:namespace />getContent();
		submitForm(document.<portlet:namespace />fmItem);
	}

</aui:script>
<c:if test="<%=isPostBack %>">
	<aui:script>
		Liferay.Util.getOpener().<portlet:namespace />refreshPortlet(Liferay.Util.Window);
	</aui:script>
</c:if>