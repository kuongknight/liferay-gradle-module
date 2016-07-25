package com.bportal.portlet.advertising.admin;

import org.osgi.service.component.annotations.Component;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;

@Component(
		immediate = true, 
		property = { 
				"panel.category.key=site_administration.content",
				"panel.app.order:Integer=1" 
				},
		service = PanelApp.class
	)
public class AdvertisingAdminAppPanel extends BasePanelApp {

	@Override
	public String getPortletId() {
		return "com_bportal_portlet_advertising_admin_AdvertisingAdminPortlet";
	}

}
