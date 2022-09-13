<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= request.getParameter("header.html") %>
<%= request.getParameter("message") %>

<%@ include file="header.html" %>
<form action="login" method="post">
        <label for="">User Name</label>
        <input type="text" name="userName" required="required"/>
        <label for="">Password</label>
        <input type="password" required="required" name="password"/>
        <input type="submit" value="login" />
    </form>

</body>
</html>