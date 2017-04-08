<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login-Click Buy</title>
</head>
<body>
<h1 style align="center">WELCOME TO LOGIN</h1>
</br>
<p style align="center">${success}</p>
<p style align="center">${error}</p>
<hr></br></br></br>
<div class="col-md-6 ">
<div Style align="center">
<form action="j_spring_security_check" method="post">
	<label>Email</br></label><input type="text" name="email" class="form-control"/></br></br>
	<label>PassWord</label></br><input type="password" name="password" class="form-control"/></br></br>
	
	${logout}
	<input type="submit" class="btn btn-primary btn-block"  align="middle" name="loginUser" value="Login"/></br></br>
</form>

	</br>
	</br>
	</br>
		
</br></div></div></br><h1 style align="center" ><p ><a href="register"><Strong>REGISTER</Strong></a></h1>
</body>
</html>