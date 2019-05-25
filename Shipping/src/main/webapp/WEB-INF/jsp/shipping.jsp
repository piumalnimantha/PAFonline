<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping Management</title>
</head>
<body>
<h1>Shipping Details</h1>
<form:form action="shipping.do" method="POST" commandName="shipping">
	<table>
		<tr>
			<td>Shipping ID</td>
			<td><form:input path="shippingID"/></td>
		</tr>
		<tr>
			<td>Postal Code</td>
			<td><form:input path="postal_code"/></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="address"/></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><form:input path="phone_no"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
		</tr>
	</table>

</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>Postal Code</th>
	<th>Addess</th>
	<th>Phone No</th>
	<c:forEach items="$(shippingList)" var="shipping">
		<tr>
			<td>${shipping.shippingId}</td>
			<td>${shipping.postalCode}</td>
			<td>${shipping.address}</td>
			<td>${shipping.phoneNo}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>