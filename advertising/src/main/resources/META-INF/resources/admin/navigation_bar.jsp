<%@ include file="init.jsp" %>
<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
	<portlet:renderURL var="mainURL" />
	<portlet:renderURL var="templateURL">
		<portlet:param name="templateTab" value="true"/>
	</portlet:renderURL>

	<aui:nav cssClass="navbar-nav">
		<aui:nav-item href="<%= mainURL.toString() %>" label="package" selected="<%= !isTemplateTab %>" />
		<aui:nav-item href="<%= templateURL.toString() %>" label="template" selected="<%= isTemplateTab %>" />
	</aui:nav>

	<aui:nav-bar-search>
		<liferay-portlet:renderURL varImpl="searchURL" >
			<portlet:param name="templateTab" value="<%=String.valueOf(isTemplateTab) %>"/>
		</liferay-portlet:renderURL>

		<aui:form action="<%= searchURL.toString() %>" method="get" name="searchFm">
			<liferay-portlet:renderURLParams varImpl="searchURL" />
			<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
			<liferay-ui:input-search markupView="lexicon" placeholder='<%= LanguageUtil.get(request, "search") %>' />
		</aui:form>
	</aui:nav-bar-search>
</aui:nav-bar>