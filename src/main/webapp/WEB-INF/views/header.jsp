<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>Sport Equipment Library</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- <meta name="viewport" content="width=device-width, initial-scale=1">
 -->
 
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
    <li><a href="Aboutus">About us</a></li>
    <li><a href="displayAllProducts">display All Products</a></li>
   </ul>
    </div>
    <ul class="nav navbar-nav navbar-right">
<c:if test="${sessionScope.UserLoggedIn }">
<li class="text-info">Welcome ${user} !!!  </li>
</c:if>
<c:if test="${not sessionScope.UserLoggedIn}">
<li>
<a href="Login"><span class="glyphicon glyphicon-off">  SignIn</span></a>
</li>
<li>
<a href="SignUp"><span class="glyphicon glyphicon-user">  SignUp</span></a>
</li>
</c:if>
			<c:if test="${pageContext.request.userPrincipal.name ==null }">
			<li><a href = "<c:url value="/login"></c:url>">Login</a></li>
			
			<c:url value="/registration" var="url"></c:url>
			<li><a href="${url }">Register</a></li>
			</c:if>
			

<c:if test="${sessionScope.UserLoggedIn}">
<li>
<a href="perform_logout">Logout</a>
</li>
</c:if>
</ul>
</nav>
<!--  <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul>
        </li> -->
</body>
</html>