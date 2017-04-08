
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#mfg" ).datepicker();
  } );
  </script>
</head>
<body>
<br>

<h2 align="center">PRODUCT FORM</h2><hr>
<div class="col-md-2 "></div>
<div align="center"><div class="container"><div class="col-md-8 ">


<form:form method="POST" action="${pageContext.request.contextPath}/edit/product/${d.id}success" commandName="updt" enctype="multipart/form-data" >
<table class="table table-hover">

<tr>
<td> <form:label  path="product_Name"> Enter Product Name</form:label></td>
<td><form:input type="text" path="product_Name" class="form-control" value="${d.product_Name }"/></td>
</tr>
<tr>
<td> <form:label path="descripction"> Enter Product Descripction</form:label></td>
<td><form:input type="text" path="descripction"  class="form-control" value="${d.descripction }"/></td>
</tr>
<tr>
 <td> <form:label  path="price"> Enter Product Price</form:label></td>
<td><form:input type="text" path="price"  class="form-control" value="${d.price }" />
</td></tr>
<tr>
<td> <form:label  path="mfg_Date"> Enter Manufacture Date</form:label></td>
<td><form:input type="text" id="mfg" path="mfg_Date" class="form-control" value ="${d.mfg_Date}"/></td>

</tr>
<tr>
<td> <label> Choose Image</label></td>
<td><form:input type="file" path="image" class="form-control" /></td>
</tr>

</table>
 <input type="submit" class="btn btn-primary btn-block" value="Save Changes" class="form-control"/>

</form:form>

</div></div></div></body>
</html>