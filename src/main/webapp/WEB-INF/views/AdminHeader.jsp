<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Sport Equipment Library</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


 </head>
<body>

  <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
     
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
     <li><a href="addItem">Add New Sport Equipment</a></li>
    <li><a href="getAllItems">Browse All Sport Equipment</a></li>
    
  </ul>
</div>
<ul class="nav navbar-nav navbar-right">

<c:if test="${sessionScope.Administrator }">
<li class="text-info">Welcome ${user} !!!  </li>
</c:if>
<c:if test="${not sessionScope.LoggedIn}">
<li>
<a href="Login"><span class="glyphicon glyphicon-off">  SignIn</span></a>
</li>
<li>
<a href="SignUp"><span class="glyphicon glyphicon-user">  SignUp</span></a>
</li>
			<li><a href="<c:url value="/cart/getCartId"/>"><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
</c:if>
<c:if test="${sessionScope.LoggedIn}">
<li>
<a href="perform_logout">Logout</a>
</li>
</c:if>
</ul>
</nav>
</body>
</html>