/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.training.parts.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.training.parts.model.Manufacturer;
import com.liferay.training.parts.service.ManufacturerLocalServiceUtil;

/**
 * The extended model base implementation for the Manufacturer service. Represents a row in the &quot;Inventory_Manufacturer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManufacturerImpl}.
 * </p>
 *
 * @author Shanon Mathai
 * @see ManufacturerImpl
 * @see com.liferay.training.parts.model.Manufacturer
 * @generated
 */
public abstract class ManufacturerBaseImpl extends ManufacturerModelImpl
	implements Manufacturer {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a manufacturer model instance should use the {@link Manufacturer} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ManufacturerLocalServiceUtil.addManufacturer(this);
		}
		else {
			ManufacturerLocalServiceUtil.updateManufacturer(this);
		}
	}
}