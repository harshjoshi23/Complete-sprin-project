<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Id Input</title>
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
  display:inline-block;
  padding:7px 20px;
  text-transform:uppercase;
  font-weight:600;
  letter-spacing:1.5px;
  text-align:center;
  line-height:17px;
  background:#FFF;
  color:#F58549;
  border:4px solid;
  border-image-source: linear-gradient(to right,#08fdd8,#F58549, red);
  border-image-slice:1;
  cursor:pointer;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
.top{
  position:absolute;
  top:40%;
  left:50%;
  transform:translate(-50%,-50%);
  text-align:center;
  color:#CCC9DC;
}
button{
  display:inline-block;
  padding:7px 20px;
  text-transform:uppercase;
  font-weight:600;
  letter-spacing:1.5px;
  text-align:center;
  line-height:17px;
  background:#FFF;
  color:#F58549;
  border:4px solid;
  border-image-source: linear-gradient(to right,#08fdd8,#F58549, red);
  border-image-slice:1;
  cursor:pointer;
 }


</style>

</head>
<body>
<button onclick="window.location.href='/'" class="btn btn-primary">Home Page</button>
<button onclick="window.location.href='/order-menu'" class="btn btn-primary">Order Menu Page</button>	
<h3>Enter User details and page size;-</h3>
	<form action="/order-by-id/id" method="POST">
	<label for="orderId">Order Id: </label>
	<input type="text" id="orderId" name="orderId"/>
	<br>
	<input type="submit" value="submit"></input>
	</form>
</body>
</html>