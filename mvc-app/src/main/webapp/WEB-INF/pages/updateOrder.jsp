<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Order</title>
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

input[type=submit] {
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
<button style="color: white; background-color: red;" onclick="window.location.href='/order-menu'" class="btn btn-primary">Order Menu Page</button>
	<div style="text-align: center;">
	<h3>Update Order Details</h3>
	<form:form method="post" modelAttribute="command" action="/update-order/updated">
        <div>
            <label>Order Id</label>&nbsp;&nbsp;
            <form:input path="orderId"  id="orderId" />
        </div>
        <div>
            <label>Product Id</label>&nbsp;
            <form:input path="productId" id="productId" />
        </div>
        <div>
            <label>User Name</label>&nbsp;
            <form:input path="username" id="username" />
        </div>
        
        <div>
            <input type="submit" value="Update">
        </div>
    </form:form>
    </div>
</body>
</html>