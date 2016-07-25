<%@page import="com.bportal.kernel.service.persistence.AdvTemplateUtil"%>
<%@page import="com.bportal.kernel.service.AdvTemplateServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.bportal.kernel.service.AdvTemplateLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvTemplate"%>
<%@page import="java.util.List"%>
<%@page import="com.bportal.kernel.service.AdvPackageLocalServiceUtil"%>
<%@page import="com.bportal.kernel.model.AdvPackage"%>
<%@ include file="init.jsp" %>
<%
	long idPackage = ParamUtil.getLong(request, "advPackageId");
	AdvPackage advPackage = AdvPackageLocalServiceUtil.fetchAdvPackage(idPackage);
	List<AdvTemplate> templates = AdvTemplateLocalServiceUtil.findByStatus(BPortalUtil.STT_ACTIVE);
	List<Layout> listSLLayout = LayoutLocalServiceUtil.getLayouts(scopeGroupId, false);
	renderRequest.setAttribute("packageLayoutId", advPackage == null? 0 : advPackage.getLayoutId());
%>
<liferay-portlet:renderURL varImpl="redirectURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<liferay-portlet:param name="mvcPath" value="/admin/edit_advpackage.jsp"/>
</liferay-portlet:renderURL>
<portlet:actionURL var="editPakageURL" name="editPackage"></portlet:actionURL>
<div class="closed container-fluid-1280 sidenav-container sidenav-right" >
	<aui:form name="fmPakage" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "savePackage();" %>'>
		<aui:model-context bean="<%=advPackage %>" model="<%=AdvPackage.class %>"></aui:model-context>
		<aui:input name="redirect" type="hidden" value="<%=redirectURL.toString() %>"></aui:input>
		<aui:input name="advPackageId" type="hidden"></aui:input>
		<aui:input name="templateId" type="hidden"></aui:input>
		<aui:input name="advPackageName">
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input name="description">
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<div class="row">
			<div class="col-md-6">
			<aui:select name="templateId">
				<c:forEach items="<%=templates %>" var="item">
					<aui:option value="${item.getAdvTemplateId() }" >
						${item.getAdvTemplateName() }
					</aui:option>
				</c:forEach>
			</aui:select>
			</div>
			<div class="col-md-6">
				<aui:select name="layoutId" multiple="true" id="slLayout" data-placeholder="Select layout (Empty is All)">
					<c:forEach items="<%=listSLLayout %>" var="slLayout">
						<aui:option value="${slLayout.getPlid()}" selected="${slLayout.getLayoutId() == packageLayoutId }">${ slLayout.getName(locale) }</aui:option>
					</c:forEach>
				</aui:select>
			</div>
		</div>
		<aui:input name="beginDate"></aui:input>
		<aui:input name="expiredDate"></aui:input>
		<aui:input name="isDraf" type="hidden" value="false"/>
		<aui:button-row>
			<aui:button cssClass="btn-lg" type="submit" value="save"></aui:button>
			<aui:button cssClass="btn-lg" onClick='<%= renderResponse.getNamespace() + "savePackage(true);" %>' value='<%= LanguageUtil.get(request, "save-draft") %>' />
		</aui:button-row>
	</aui:form>
</div>
<aui:script>
Liferay.provide(
        window,
        '<portlet:namespace />savePackage',
    	function(isDraf) {
        	if(isDraf){
        		document.<portlet:namespace />fmPakage.<portlet:namespace />isDraf.value = true;
        	}
    		document.<portlet:namespace />fmPakage.action = '<%=editPakageURL%>';
    		document.<portlet:namespace />fmPakage.target = '';
    		submitForm(document.<portlet:namespace />fmPakage);
    	}
    );
$("#<portlet:namespace/>slLayout").chosen();
</aui:script>
<c:if test="<%=isPostBack %>">
	<aui:script>
		Liferay.Util.getOpener().<portlet:namespace />refreshPortlet(Liferay.Util.Window);
	</aui:script>
</c:if>