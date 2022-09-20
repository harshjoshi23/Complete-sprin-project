<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Tab</title>
</head>
<body>
	<form method="post" action="/payment/srch">
		<div>
			<label>Search: </label>
			<input type="text" id="paymentId" name="paymentId" />
		</div>
		<div>
			<input type="submit" value="Search">
		</div>
	</form>

</body>
</html>