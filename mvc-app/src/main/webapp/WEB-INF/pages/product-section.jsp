<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Products</title>
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

<div class="wrap">
  <h3><a href="/product-section/products">check all orders</a></h3>

<form action="/product-section/products-by-merchant" method="POST">

  <div>
    <label for="fname">Merchant Name</label>
    <input id="fname" type="text" class="cool" name="merchant"/>
  </div>

  <div>
    <label for="lname">Maximum Data in One Page</label>
    <input id="lname" type="text" class="cool" name="pageSize"/>
  </div>
  
  <div>
    <input type="submit" value="submit"></input>
  </div>

</form>

</div>

<!-- 
    <li>
    	<ul><a href="/product-section/products">check all orders</a></ul>
    	<br>
    	<ul>
    	<form action="/product-section/products-by-merchant" method="POST">
		<label for="merchant">Merchant Name</label>
		<input type="text" id="merchant" name="merchant"/>
		<label for="pageSize">Maximum Data in One Page</label>
		<input type="text" id="pageSize" name="pageSize"/>
		<input type="submit" value="submit"></input>
		</form>
    </li>
     -->
	
</body>
</html>