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

package com.bportal.kernel.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AdvItem service. Represents a row in the &quot;BPortal_AdvItem&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemModel
 * @see com.bportal.kernel.model.impl.AdvItemImpl
 * @see com.bportal.kernel.model.impl.AdvItemModelImpl
 * @generated
 */
@ImplementationClassName("com.bportal.kernel.model.impl.AdvItemImpl")
@ProviderType
public interface AdvItem extends AdvItemModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.bportal.kernel.model.impl.AdvItemImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AdvItem, Long> ADV_ITEM_ID_ACCESSOR = new Accessor<AdvItem, Long>() {
			@Override
			public Long get(AdvItem advItem) {
				return advItem.getAdvItemId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AdvItem> getTypeClass() {
				return AdvItem.class;
			}
		};
}