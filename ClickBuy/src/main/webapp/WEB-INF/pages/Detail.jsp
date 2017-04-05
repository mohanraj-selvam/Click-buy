<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
	<style type="text/css">
<title>Insert title here</title>
<style type="text/css">
	
	img{
	  border-radius: 100%;
	  height: 300px;
    width: 75%;
	
	}
	
	.c{
	text-align: center;
	
	}
	
	tr{
	text-align: center;
	
	}
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
	img{
	 display: block;
  max-width: 246px;
  height: 205px;
	}
	</style>
</head>
<body>
<%@include file="header.jsp" %>

<div class="container">

<table  style align="center" class="table table-bordered">
<p style align="center">
<th class="c">Specification</th>
<th class="c">Detail</th>      
<tbody>
<%-- <c:forEach var="x" items="${prdt}"> --%>
<h3 Style align="center"><c:out value="${prdt.product_Name}"/></h3><hr>


<img src="${pageContext.request.contextPath}/resources/Images/${prdt.id}.png" class="center-block" /><hr>

<div class="col-md-" align="center">
<input type= "button" Value="Buy Now" class="button"/>
<input type= "button" Value="Add to cart" class="button"/></td>
</div>
<tr><td>
Product Name:</td><td>
<c:out value="${prdt.product_Name}"/></td>
</tr>
<tr>
<td>
Descripcition:</td><td>
<c:out value="${prdt.descripction}"/></td></tr>
<tr><td>Price:</td><td>
<c:out value="${prdt.price}"/></td></tr>
<tr><td>Manufacture Date:</td><td>
<c:out value="${prdt.mfg_Date}"/>
</td></tr>

<%-- </c:forEach> --%>
</p>
</table>
</div>

</body>
</html>