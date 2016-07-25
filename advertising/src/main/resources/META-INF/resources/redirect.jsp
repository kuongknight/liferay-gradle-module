<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />
<%
portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(ParamUtil.getString(renderRequest, "redirect"));
%>