<%@include file="/html/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Manufacturer manufacturer = (Manufacturer)row.getObject();

long groupId = manufacturer.getGroupId();
String name = Manufacturer.class.getName();
long manufacturerId = manufacturer.getManufacturerId();

String redirect = PortalUtil.getCurrentURL(renderRequest);

List<Part> t = PartLocalServiceUtil.getPartsByManufacturer(manufacturerId, groupId);
boolean hasNoParts = t.size() == 0;

%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/manufacturer/edit_manufacturer.jsp" />
		<portlet:param name="manufacturerId" value="<%= String.valueOf(manufacturerId) %>"/>
		<portlet:param name="redirect" value="<%= redirect %>"/>
	</portlet:renderURL>
	
	<liferay-ui:icon image="edit" url="<%=editURL.toString() %>" />

<%-- 	<c:if test="<%=hasNoParts %>"> --%>

	<c:if test="<%=hasNoParts %>">
		<portlet:actionURL name="deleteManufacturer" var="deleteURL" >
			<portlet:param name="manufacturerId" value="<%= String.valueOf(manufacturerId) %>" />
			<portlet:param name="redirect" value="<%= redirect %>"/>
		</portlet:actionURL>
			
		<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" confirmation="Are you sure you want to delete this?" />
	</c:if>
</liferay-ui:icon-menu>