<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bportal.kernel.service.AdvTemplateLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvTemplate"%>
<%@ include file="init.jsp" %>
<%
	long advTemplateId = ParamUtil.getLong(request, "advTemplateId");
	AdvTemplate advTemplate = AdvTemplateLocalServiceUtil.fetchAdvTemplate(advTemplateId);
%>
<liferay-portlet:renderURL varImpl="redirectURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<liferay-portlet:param name="mvcPath" value="/admin/edit_template.jsp"/>
</liferay-portlet:renderURL>
<div class="closed container-fluid-1280 sidenav-container sidenav-right" >
	<aui:form name="fmTemplate" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveTemplate();" %>'>
		<aui:model-context bean="<%=advTemplate %>" model="<%=AdvTemplate.class %>"></aui:model-context>
		<aui:input name="redirect" type="hidden" value="<%=redirectURL.toString() %>"></aui:input>
		<aui:input name="advTemplateId" type="hidden"></aui:input>
		<aui:input name="advTemplateName">
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input name="description">
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input name="content" type="hidden">
		</aui:input>
		<aui:input name="isDraf" type="hidden" value="false"/>
		<liferay-util:include page="/admin/edit_template_display.jsp" servletContext="<%=application %>"></liferay-util:include>
		<aui:button-row>
			<aui:button cssClass="btn-lg" type="submit" value="save"></aui:button>
			<aui:button cssClass="btn-lg" onClick='<%= renderResponse.getNamespace() + "saveTemplate(true);" %>' value='<%= LanguageUtil.get(request, "save-draft") %>' />
		</aui:button-row>
	</aui:form>
</div>
<c:if test="<%=isPostBack %>">
	<aui:script>
		Liferay.Util.getOpener().<portlet:namespace />refreshPortlet(Liferay.Util.Window);
	</aui:script>
</c:if>