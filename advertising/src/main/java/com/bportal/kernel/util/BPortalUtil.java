package com.bportal.kernel.util;

import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;

public class BPortalUtil {
	public static final int STT_ACTIVE = 0;
	public static final int STT_DISABLE = -1;
	public static final int STT_PENDING = 9;
	
	public static Date getDateFromUi(ActionRequest actionRequest, String controlUi) {
		int month = ParamUtil.getInteger(actionRequest, controlUi + "Month");
		int day = ParamUtil.getInteger(actionRequest, controlUi + "Day");
		int year = ParamUtil.getInteger(actionRequest, controlUi + "Year");
		int hrs = ParamUtil.getInteger(actionRequest, controlUi + "Hour");
		int min = ParamUtil.getInteger(actionRequest, controlUi + "Minute");
		int dateAmPm = ParamUtil.getInteger(actionRequest, controlUi + "AmPm");

		if (dateAmPm == Calendar.PM) {
			hrs += 12;
		}
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day, hrs, min);
		return cal.getTime();
	}

	public static void setPostBack(PortletRequest portletRequest) {
		portletRequest.getPortletSession().setAttribute("isPostBack", true);
	}

	public static boolean isPostBack(PortletRequest portletRequest) {
		boolean isPostBack = GetterUtil.getBoolean(portletRequest.getPortletSession().getAttribute("isPostBack"),
				false);
		portletRequest.getPortletSession().removeAttribute("isPostBack");
		return isPostBack;
	}
}
