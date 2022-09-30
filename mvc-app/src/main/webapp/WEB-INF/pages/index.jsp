<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecommerce App</title>
<!--  
<link href="index.css" rel="stylesheet"> -->

<style>
* {
	padding: 0;
	margin: 0;
}

body {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	position: relative;
	min-height: 100vh;
	font-family: Hack, monospace;
}

div {
	color: #727272;
	text-align: center;
}

p {
	margin: 16px;
	font-size: 96px;
	color: #ccc;
	text-transform: uppercase;
	font-weight: 600;
	transition: all 1s ease-in-out;
	position: relative;
}

p::before {
	content: attr(data-item);
	transition: all 1s ease-in-out;
	color: #8254ff;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	width: 0;
	overflow: hidden;
}

p:hover::before {
	width: 100%;
}

nav {
	margin: 25px;
	background: #f9f9f9;
	padding: 16px;
}

nav .menuItems {
	list-style: none;
	display: flex;
}

nav .menuItems li {
	margin: 50px;
}

nav .menuItems li a {
	text-decoration: none;
	color: #8f8f8f;
	font-size: 24px;
	font-weight: 400;
	transition: all 0.5s ease-in-out;
	position: relative;
	text-transform: uppercase;
}

nav .menuItems li a::before {
	content: attr(data-item);
	transition: 0.5s;
	color: #8254ff;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	width: 0;
	overflow: hidden;
}

nav .menuItems li a:hover::before {
	width: 100%;
	transition: all 0.5s ease-in-out;
}
</style>
</head>
<body>
	<h1 class="container" style="text-align: center;">Welcome to
		Vardhan's App</h1>
	<section>
		<nav>
			<ul class="menuItems">
				<li><a href="/product-menu" data-item='Product Menu'>Product
						Menu </a></li>
				<li><a href="/OrderMenu" data-item='Order Menu'>Order
						Menu </a></li>

				<!-- 
				<li><a href='#' data-item='About'>About</a></li>
				<li><a href='#' data-item='Projects'>Projects</a></li>
				<li><a href='#' data-item='Blog'>Blog</a></li>
				<li><a href='#' data-item='Contact'>Contact</a></li>
				 -->
			</ul>
		</nav>
	</section>

</body>
</html>