<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
	
	img{
	  border-radius: 50%;
	  height: 100px;
    width: 25%;
	
	}
	
	</style>
</head>
<body>
<%@include file="header.jsp" %>
<p style align="center">${s}</p>
<p style align="center">${cart}</p>
<p style align="center">${Update}</p>

<div class="container">
 <table class="table table-hover">
<tr>
      <th>PRODUCT NAME</th>
      <th>DESCRIPCTION</th>
      <th>PRICE</th>
      <th>MFG DATE</th>
      <security:authorize access="permitAll">
      <th>OPTIONS</th></security:authorize>
      </tr>
<tbody>
<c:forEach var="x" items="${data}">
<tr>

<td>
<c:url var="url" value="/details/${x.id }"></c:url>
<a href="${url}">
<img src="resources/Images/${x.id}.png"/>

${x.product_Name}</a></td>
<td>
${x.descripction}</td>
<td>
${x.price}</td>
<td>
${x.mfg_Date}
</td><td>
<security:authorize access="permitAll"> 
<c:url var="url" value="/details/${x.id }"></c:url>
<a href="${url}"><span class="glyphicon glyphicon-shopping-cart"></span></a></security:authorize>
<security:authorize access="hasRole('ROLE_ADMIN')">
<c:url var="url" value="product/delete/${x.id }"></c:url>
<a href=" ${url}"><span class="glyphicon glyphicon-remove"></span></a></security:authorize>
<security:authorize access="hasRole('ROLE_ADMIN')">
<c:url var="url" value="/editProduct/${x.id }"></c:url>
<a href="${url}"><span class="glyphicon glyphicon-pencil"></span></a></security:authorize>
</td>

<br/>
</tr></c:forEach>

</tbody>
</table></div>
</body>
</html>