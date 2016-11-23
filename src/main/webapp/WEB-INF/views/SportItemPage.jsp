<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@ page isELIgnored="false" %>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js">

</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<br>
<br>
<br><br>
<br>
<br><br>
<br>
<br>
<br>
<div ng-app="myapp">
<c:url var="url" value="/resources/images/${itemObj.isbn}.png"></c:url>
		<img src="${url }"/><br>
ISBN : ${itemObj.isbn } <br>
SPORT NAME : ${itemObj.sportname } <br>
ITEM NAME : ${itemObj.itemname }<br>
Price : ${itemObj.price } <br>
<c:url value="/add/${itemObj.isbn }" var="url"></c:url>
<div ng-controller="itemController">

<a href="#" ng-click="addToCart(${itemObj.isbn})" class="btn btn-warning btn-large"><span class="glyphicon glyphicon-shopping-cart"></span></a>

<a href="<c:url value="/getAllItems"></c:url>">Back</a>
</div>
</div>
<script src="<c:url value="/resources/js/controller.js" /> "></script>
</body>
</html>
