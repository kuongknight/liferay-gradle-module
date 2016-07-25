package com.bportal.portlet.advertising.admin;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.bportal.kernel.service.AdvItemLocalServiceUtil;
import com.bportal.kernel.service.AdvPackageLocalServiceUtil;
import com.bportal.kernel.service.AdvTemplateLocalServiceUtil;
import com.bportal.kernel.util.BPortalUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.hidden",
		"javax.portlet.display-name=Advertising", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/admin/view.jsp", "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.header-portlet-css=/admin/css/chosen.min.css",
		"com.liferay.portlet.header-portlet-javascript=/admin/js/jquery.min.js",
		"com.liferay.portlet.header-portlet-javascript=/admin/js/chosen.jquery.min.js"
		
		}, service = Portlet.class)
public class AdvertisingAdminPortlet extends MVCPortlet {
	public void editTemplate(ActionRequest actionRequest, ActionResponse actionResponse) {
		long advTemplateId = ParamUtil.getLong(actionRequest, "advTemplateId");
		String advTemplateName = ParamUtil.getString(actionRequest, "advTemplateName");
		String description = ParamUtil.getString(actionRequest, "description");
		String content = ParamUtil.getString(actionRequest, "content");
		boolean isDraf = ParamUtil.getBoolean(actionRequest, "isDraf");
		int status = BPortalUtil.STT_ACTIVE;
		if(isDraf){
			status = BPortalUtil.STT_DISABLE;
		}
		if (Validator.isNotNull(content) && Validator.isNotNull(advTemplateName)) {
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
				AdvTemplateLocalServiceUtil.addOrUpdate(advTemplateId, advTemplateName, content, description, 0, status,
						serviceContext);
				BPortalUtil.setPostBack(actionRequest);
				actionResponse.sendRedirect(ParamUtil.getString(actionRequest, "redirect"));
			} catch (Exception e) {
				SessionErrors.add(actionRequest, e.getClass());
			}
		}
	}

	public void editPackage(ActionRequest actionRequest, ActionResponse actionResponse) {
		long advPackageId = ParamUtil.getLong(actionRequest, "advPackageId");
		String advPackageName = ParamUtil.getString(actionRequest, "advPackageName");
		String description = ParamUtil.getString(actionRequest, "description");
		long layoutId = ParamUtil.getLong(actionRequest, "layoutId");
		long templateId = ParamUtil.getLong(actionRequest, "templateId");
		Date beginDate = BPortalUtil.getDateFromUi(actionRequest, "beginDate");
		Date expiredDate = BPortalUtil.getDateFromUi(actionRequest, "expiredDate");
		boolean isDraf = ParamUtil.getBoolean(actionRequest, "isDraf");
		int status = BPortalUtil.STT_ACTIVE;
		if(isDraf){
			status = BPortalUtil.STT_DISABLE;
		}
		if (Validator.isNotNull(advPackageName)) {
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
				AdvPackageLocalServiceUtil.addOrUpdate(advPackageId, layoutId, templateId, advPackageName, description,
						beginDate, expiredDate, status, serviceContext);
				BPortalUtil.setPostBack(actionRequest);
				actionResponse.sendRedirect(ParamUtil.getString(actionRequest, "redirect"));
			} catch (Exception e) {
				e.printStackTrace();
				SessionErrors.add(actionRequest, e.getClass());
			}
		}
	}

	public void editItem(ActionRequest actionRequest, ActionResponse actionResponse) {
		long advPackageId = ParamUtil.getLong(actionRequest, "advPackageId");
		long advItemId = ParamUtil.getLong(actionRequest, "advItemId");
		String content = ParamUtil.getString(actionRequest, "content");
		String targetLink = ParamUtil.getString(actionRequest, "targetLink");
		int duaration = ParamUtil.getInteger(actionRequest, "duaration");
		int order = ParamUtil.getInteger(actionRequest, "order");
		String advItemName = ParamUtil.getString(actionRequest, "advItemName");
		String description = ParamUtil.getString(actionRequest, "description");
		if (Validator.isNotNull(advItemName) && Validator.isNotNull(content)) {
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
				AdvItemLocalServiceUtil.addOrUpdate(advItemId,advPackageId, advItemName, description, targetLink, content, duaration,
						order, 0, serviceContext);
				BPortalUtil.setPostBack(actionRequest);
				actionResponse.sendRedirect(ParamUtil.getString(actionRequest, "redirect"));
			} catch (Exception e) {
				e.printStackTrace();
				SessionErrors.add(actionRequest, e.getClass());
			}
		}
	}
	public void deleteEntry(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, IOException{
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		long entryId = ParamUtil.getLong(actionRequest, "entryId");;
		String redirect  =ParamUtil.getString(actionRequest, "redirect");
		long[] deleteEntryIds = ParamUtil.getLongValues(
				actionRequest, "rowIds");
		if(entryId!=0 || deleteEntryIds.length > 0){
			switch (cmd) {
			case "deletePackage":
				for (long itemId : deleteEntryIds){
					AdvPackageLocalServiceUtil.deleteAdvPackage(itemId);
				}
				break;
			case "deleteTemplate":
				AdvTemplateLocalServiceUtil.deleteAdvTemplate(entryId);
				break;
			case "deleteItem":
				AdvItemLocalServiceUtil.deleteAdvItem(entryId);
				break;

			default:
				break;
			}
		}
		System.out.println(redirect);
		if(Validator.isNotNull(redirect)){
			actionResponse.sendRedirect(redirect);
		}
		
	}
}