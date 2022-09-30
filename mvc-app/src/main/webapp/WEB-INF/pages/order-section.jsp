<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order By User</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
<button style="color: white; background-color: red;" onclick="window.location.href='/'" class="btn btn-primary">Home Page</button>
<button style="color: white; background-color: red;" onclick="window.location.href='/order-menu'" class="btn btn-primary">Order Menu Page</button>	
	<h3>Click here to see all Orders:-
	<button onclick="window.location.href='/order-section/orders'" class="btn btn-primary">check all orders</button>
	</h3>
	<br>
	<br>
	<h3>Enter User details and page size;-</h3>
	<form action="/order-section/orders-by-user" method="POST">
	<label for="username">username: </label>
	<input type="text" id="username" name="username"/>
	<br>
	<label for="pageSize">PageSize: </label>
	<input type="text" id="pageSize" name="pageSize" value="3"/>
	<br>
	<input type="submit" value="submit"></input>
	</form>
</body>
</html>