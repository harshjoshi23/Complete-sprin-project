<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">

table,tr,th,td{
border: 2px solid blue;
margin-left: auto;
margin-right: auto;
border-collapse: collapse;
padding: 5px;
}
</style>

<title>Restaurants</title>
</head>
<body>

<h1 style="text-align: center">Restaurants List</h1>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Restaurant Name</th>
			<th>PinCode</th>
			<th>Cuisine</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${list}" var="eachItem">
		<tr>
			<td>${eachItem.id}</td>
			<td>${eachItem.restaurantName}</td>
			<td>${eachItem.pinCode}</td>
			<td>${eachItem.cuisine}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>