
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION</title>
</head>
<body>
<h1 style align="center">REGISTRATION FORM</h1><hr><br>
<div class="col-md-2"></div>
<div align="center" class="container">
<div class="col-md-8">
<form:form method="POST" action="register/addcustomer" commandName="cust">
   <table class="table table-hover">
   <form class="form-horizontal">
    
    <tr>
    	<td><form:label  path="firstName">NAME</form:label></td>
    	
    	<td><form:input class="form-control" path="firstName" placeholder="First Name"/></td>
    
      	<td><form:input class="form-control" path="lastName" placeholder="Last Name"/></td></tr>
  
    <tr>
    	<td><form:label  path="firstName">EMAIL</form:label></td>
    	<td><form:input class="form-control" path="email" placeholder="Enter email"/></td>
    </tr>

    <tr>
    	<td><form:label  path="firstName">PASSWORD</form:label></td>
        <td><form:input type="password" class="form-control" placeholder="Enter Password" path="password" /></td>
    </tr>
     <tr>
    	<td><form:label  path="firstName">MOBILE</form:label></td>
        <td><form:input type="text" class="form-control"  path="mobile" /></td>
    </tr>
    <tr>
    	<td><form:label  path="firstName">ADDRESS</form:label></td>
        <td><form:input type="text" class="form-control" placeholder="Address Line" path="delAdderss.lineOne" /></td>
    </tr>
    <tr><td></td>
        <td><form:input type="text" class="form-control" placeholder="City" path="delAdderss.city" /></td>
    </tr>
    <tr><td></td>
        <td><form:input type="text" class="form-control" placeholder="State" path="delAdderss.state" /></td>
    </tr>
    <tr><td></td>
        <td><form:input type="text" class="form-control" placeholder="Country" path="delAdderss.country" /></td>
    </tr>
    <tr><td></td>
        <td><form:input type="text" class="form-control" placeholder="Zip Code" path="delAdderss.zipcode" /></td>
    </tr>
    <tr>
        
            <input type="submit" class="btn btn-primary btn-block" value="Register" align="middle" />
        
    </tr></form></table>

</form:form>
</div></div>
<div class="col-md-2"></div>
</body>

	
</html>