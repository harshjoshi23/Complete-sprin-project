<%@page import="java.util.*,com.project.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	List<Restaurant> list = 
		(List<Restaurant>)request.getAttribute("list");
	for(Restaurant eachRestaurant : list){
		out.println(eachRestaurant.getId());
		out.println(eachRestaurant.getRestaurantName());
		out.println(eachRestaurant.getPinCode());
		out.println(eachRestaurant.getCuisine());
	}
%>

</body>
</html>