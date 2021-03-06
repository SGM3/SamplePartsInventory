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

package com.liferay.training.parts.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Manufacturer. This utility wraps
 * {@link com.liferay.training.parts.service.impl.ManufacturerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Shanon Mathai
 * @see ManufacturerLocalService
 * @see com.liferay.training.parts.service.base.ManufacturerLocalServiceBaseImpl
 * @see com.liferay.training.parts.service.impl.ManufacturerLocalServiceImpl
 * @generated
 */
public class ManufacturerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.training.parts.service.impl.ManufacturerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the manufacturer to the database. Also notifies the appropriate model listeners.
	*
	* @param manufacturer the manufacturer
	* @return the manufacturer that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.parts.model.Manufacturer addManufacturer(
		com.liferay.training.parts.model.Manufacturer manufacturer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addManufacturer(manufacturer);
	}

	/**
	* Creates a new manufacturer with the primary key. Does not add the manufacturer to the database.
	*
	* @param manufacturerId the primary key for the new manufacturer
	* @return the new manufacturer
	*/
	public static com.liferay.training.parts.model.Manufacturer createManufacturer(
		long manufacturerId) {
		return getService().createManufacturer(manufacturerId);
	}

	/**
	* Deletes the manufacturer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param manufacturerId the primary key of the manufacturer
	* @return the manufacturer that was removed
	* @throws PortalException if a manufacturer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.parts.model.Manufacturer deleteManufacturer(
		long manufacturerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteManufacturer(manufacturerId);
	}

	/**
	* Deletes the manufacturer from the database. Also notifies the appropriate model listeners.
	*
	* @param manufacturer the manufacturer
	* @return the manufacturer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.parts.model.Manufacturer deleteManufacturer(
		com.liferay.training.parts.model.Manufacturer manufacturer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteManufacturer(manufacturer);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.training.parts.model.impl.ManufacturerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.training.parts.model.impl.ManufacturerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.training.parts.model.Manufacturer fetchManufacturer(
		long manufacturerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchManufacturer(manufacturerId);
	}

	/**
	* Returns the manufacturer with the primary key.
	*
	* @param manufacturerId the primary key of the manufacturer
	* @return the manufacturer
	* @throws PortalException if a manufacturer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.parts.model.Manufacturer getManufacturer(
		long manufacturerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getManufacturer(manufacturerId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the manufacturers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.training.parts.model.impl.ManufacturerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of manufacturers
	* @param end the upper bound of the range of manufacturers (not inclusive)
	* @return the range of manufacturers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.parts.model.Manufacturer> getManufacturers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManufacturers(start, end);
	}

	/**
	* Returns the number of manufacturers.
	*
	* @return the number of manufacturers
	* @throws SystemException if a system exception occurred
	*/
	public static int getManufacturersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManufacturersCount();
	}

	/**
	* Updates the manufacturer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param manufacturer the manufacturer
	* @return the manufacturer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.parts.model.Manufacturer updateManufacturer(
		com.liferay.training.parts.model.Manufacturer manufacturer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateManufacturer(manufacturer);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Adds the Manufacturer to the database incrementing the primary key
	*
	* @throws PortalException
	*/
	public static com.liferay.training.parts.model.Manufacturer addManufacturer(
		com.liferay.training.parts.model.Manufacturer newManufacturer,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addManufacturer(newManufacturer, userId);
	}

	/**
	* Gets a list with all the Manufacturers in a group
	*/
	public static java.util.List<com.liferay.training.parts.model.Manufacturer> getManufacturersByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManufacturersByGroupId(groupId);
	}

	/**
	* Gets a list with a range of Manufacturers from a group
	*/
	public static java.util.List<com.liferay.training.parts.model.Manufacturer> getManufacturersByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManufacturersByGroupId(groupId, start, end);
	}

	/**
	* Gets the number of Manufacturers in a group
	*/
	public static int getManufacturersCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManufacturersCountByGroupId(groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ManufacturerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ManufacturerLocalService.class.getName());

			if (invokableLocalService instanceof ManufacturerLocalService) {
				_service = (ManufacturerLocalService)invokableLocalService;
			}
			else {
				_service = new ManufacturerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ManufacturerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ManufacturerLocalService service) {
	}

	private static ManufacturerLocalService _service;
}