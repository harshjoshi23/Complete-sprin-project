<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filter and Listeners</title>
</head>
<h1>Using Filters and Listeners </h1>
<body>
<c:out value="${sessionScope.details }"></c:out>
<c:remove var="details" scope="session" />
<p>View Counter</p><c:out value="${count}" />

<a href="First.jsp">Next</a>
</body>
</html> 