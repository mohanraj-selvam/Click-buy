<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.button {
  
  padding: 5px 10px;
  font-size: 20px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  
}

</style>
	</head>
<body>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<ul class="nav navbar-nav ">
			
			<li ><a  href="${pageContext.request.contextPath}/about"><p class="button">About us</p></a></li>
			<li ><a href="${pageContext.request.contextPath}/home"><p class="button">HOME</p></a></li>
				<security:authorize access="hasRole('ROLE_ADMIN')">
				<li><a href="${pageContext.request.contextPath}/addProduct"><p class="button">Add Product</p></a>
				</li>
				</security:authorize>
			<li ><a href="${pageContext.request.contextPath}/allProduct"><p class="button">Shop Now</p></a></li>
			
			<security:authorize access="isAnonymous()" >
			<li >
			<a href="${pageContext.request.contextPath}/login"><p class="button">login</p></a></li>
			<li ><a href="register"><p class="button">register</p></a></li>
			</security:authorize>
			
			<li><security:authorize access="hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')">
			<p align="right">
			 
			<form action="${pageContext.request.contextPath}/j_spring_security_logout" method="post">
			<input class="button" type="submit" value="LOGOUT" >
			</security:authorize>
			</form>
			</P></li>			
		</ul>
		
	</div>
	</nav>

</body>
</html>