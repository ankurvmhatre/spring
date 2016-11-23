<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@ page isELIgnored="false" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Register Customer</h1>

            <p class="lead">Please fill in your information below:</p>
        </div>
        <c:url value="/registration" var="url"></c:url>
        <form:form action="${url }"
                   method="post" commandName="customer">

        <h3>Basic Info:</h3>

        <div class="form-group">
            <label for="name">Name</label>
            <form:errors path="customerName" cssStyle="color: #ff0000" />
            <form:input path="customerName"  class="form-Control" />
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            
            <form:errors path="customerEmail" cssStyle="color: #ff0000" />
            <form:input path="customerEmail"  class="form-Control" />
        </div>

        <div class="form-group">
            <label for="phone">Phone</label>
            <form:input path="customerPhone"  class="form-Control" />
        </div>

        <div class="form-group">
            <label for="username">Username</label>
            <form:errors path="userdetail.custName" cssStyle="color: #ff0000" />
            <form:input path="userdetail.custName"  class="form-Control" />
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <form:errors path="userdetail.pass" cssStyle="color: #ff0000" />
            <form:password path="userdetail.pass" class="form-Control" />
        </div>


        <br/>
        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/" />" class="btn btn-default">Cancel</a>
        </form:form>
</body>
</html>