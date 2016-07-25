/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bportal.kernel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AdvTemplateService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvTemplateService
 * @generated
 */
@ProviderType
public class AdvTemplateServiceWrapper implements AdvTemplateService,
	ServiceWrapper<AdvTemplateService> {
	public AdvTemplateServiceWrapper(AdvTemplateService advTemplateService) {
		_advTemplateService = advTemplateService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advTemplateService.getOSGiServiceIdentifier();
	}

	@Override
	public AdvTemplateService getWrappedService() {
		return _advTemplateService;
	}

	@Override
	public void setWrappedService(AdvTemplateService advTemplateService) {
		_advTemplateService = advTemplateService;
	}

	private AdvTemplateService _advTemplateService;
}