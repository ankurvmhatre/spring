<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ include file="header.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
<br>
<br>
<br>
	<H1> List of Sport Equipment</H1>
	<!--  use JSTL tags -->
	<!--  iterate list of objects -->
	<!--  For each book b in books -->
	<table class="table table-bordered">
		<tr>
		    <th>IMAGE</th>
			<th>ISBN </th>
			<th>SPORT NAME</th>
			<th>ITEM NAME</th>
			<th>CATEGORY NAME</th>
			<th>add To Cart</th>
		</tr>
		
		<c:forEach items="${items}" var="b">
		<tr>
         <c:url value="resources/images/${b.isbn }.jpg" var="src" />
		<td ><img src="${src }"/></td>
		
        <td><a href="getItemByIsbn/${b.isbn}" >${b.isbn}</a></td>
		
		<td>${b.sportname }</td>
		
		<td>${b.itemname }</td>
		<td>${b.category.categoryName}</td>
	
	<td>
	    
		<a href="add/${b.isbn}"><span class="glyphicon glyphicon-shopping-cart"></span>add To Cart</a>
		
	</td>
		</tr>
		
		</c:forEach>
	</table>

	
</body>
</html>