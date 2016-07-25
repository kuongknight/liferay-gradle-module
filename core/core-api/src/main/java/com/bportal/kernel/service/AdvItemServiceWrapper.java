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
 * Provides a wrapper for {@link AdvItemService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemService
 * @generated
 */
@ProviderType
public class AdvItemServiceWrapper implements AdvItemService,
	ServiceWrapper<AdvItemService> {
	public AdvItemServiceWrapper(AdvItemService advItemService) {
		_advItemService = advItemService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advItemService.getOSGiServiceIdentifier();
	}

	@Override
	public AdvItemService getWrappedService() {
		return _advItemService;
	}

	@Override
	public void setWrappedService(AdvItemService advItemService) {
		_advItemService = advItemService;
	}

	private AdvItemService _advItemService;
}