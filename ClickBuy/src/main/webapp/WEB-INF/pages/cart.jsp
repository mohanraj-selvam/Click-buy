<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	
	img{
	  border-radius: 50%;
	  height: 100px;
    width: 25%;
	
	}
	
	</style>
</head>
<body><%@include file="header.jsp" %>

<div class="container">
<div class="col-md-4 ">
<table  class="table table-responsive">

<tr>
<h4  align="center">Customer Details</h4></tr>
<tboby>
<tr>
<td >
Name</td>
<td><c:out value="${cust.firstName}"/> <c:out value="${cust.lastName}"/></td>
</tr>
<tr><td>Mobile</td>
<td><c:out value="${cust.mobile}"/></td>
</tr>
<tr>
<td >
E-mail</td>
<td><c:out value="${cust.email}"/></td>
</tr>
</tboby>
</table></div>

<div class="col-md-4 ">
<table   align="center" class="table table-responsive">

<tr >
<h4 style align="center">Delivery Address Details</h4>
<td >
Street Name</td>
<td><c:out value="${cust.delAdderss.lineOne}"/></td>
</tr>
<tr>
<td >
City</td>
<td><c:out value="${cust.delAdderss.city}"/></td>
</tr>
<tr>
<td >
State</td>
<td><c:out value="${cust.delAdderss.state}"/></td>
</tr>
<tr>
<td >
Country</td>
<td><c:out value="${cust.delAdderss.country}"/> <c:out value="${cust.delAdderss.zipcode}"/></td>

</tr>
</table>
</div>
<div class="col-md-4 ">
<br>
<button type="button" class="btn btn-primary btn-lg">Place Order</button>
<h4>Total Price: Rs ${cart.total}</h4>
</div>

<div class='row'>
        <div class='col-lg-12 '>
        <hr>
       </div>
       </div>
       <h3 align="center">Products in cart</h3>
       <div class='col-lg-2 '></div>
      <div class='col-lg-8 '>
    <table class="table table-responsive">
     
    <thead>
    <th>Product Name</th>
    <th>Quantity</th>
    <th>Price</th>
    </thead>
    <tbody>
    <c:forEach var="prdt" items="${product}">
    <c:url var="url" value="removeFromCart/${prdt.id}"></c:url>
    
    <tr><td>
    <img src="resources/Images/${prdt.id}.png"/>
    ${prdt.product_Name}
    <abbr title="Remove from cart"><a href=" ${url}">
    <span class="glyphicon glyphicon-remove"></span></a></abbr></td>
    <c:url var="url" value="setQuantity/${prdt.id}/${qnt}"></c:url>
    <td>
      <div class="col-xs-4">
      <abbr title="Submit After Enter Value">  <input class="form-control" name="qnt" type="text"/></abbr>
     <a href="${url}"> <input type="submit" class="btn btn-primary btn-xs"/></a>
    </div></td>
    <td>${prdt.price}</td>
    </tr>    
    </c:forEach>
    <tr><td></td><td><h3>Total Price</h3></td>
    <td><h3>${cart.total}</h3>
    </td></tr>
     </tbody>
    </table>
</div></div>
</body>
</html>