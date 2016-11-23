<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
      <%@include file="header.jsp" %>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Sport Equipment Library</title>

</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="container">

<div class="row centered-form">
    <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
      <div class="panel panel-default">
       <div class="panel-heading">
		<h3 class="panel-title"> Sign up </h3>
	   </div>
	  <div class="panel-body">
	    <form:form  action="SignUp" method="post" commandName="userDetail">
		 <div class="row">
		 <div class="col-xs-6 col-sm-6 col-md-6">
		 <div class="form-group">
<form:input type="text"  readonly="true" path="userId" class="form-control input-sm floatlabel" placeholder="ID" required="true"></form:input>
		</div>
		</div>
<div class="col-xs-6 col-sm-6 col-md-6">
<div class="form-group">
<form:input type="text" name="Cust_name" path="custName" class="form-control input-sm" placeholder="Customer Name"></form:input>
</div>
</div>
</div>

<div class="form-group">
<form:input type="email" name="email" path="email" class="form-control input-sm" placeholder="Email Address"></form:input>
</div>

<div class="row">
<div class="col-xs-6 col-sm-6 col-md-6">
<div class="form-group">
<form:input type="password" name="password" path="pass" class="form-control input-sm" placeholder="Password"></form:input>
</div>
</div>
			    				
<div class="col-xs-6 col-sm-6 col-md-6">
<div class="form-group">
<form:input type="text" name="phone" path="phone" class="form-control input-sm" placeholder="phone" ></form:input>
</div>
</div>
</div>
<div class="form-group">
			    						
<form:textarea path="address" name="address" class="form-control input-sm" placeholder="address"></form:textarea>
</div>
<br/>
			    			
<input type="submit" value="Register" class="btn btn-primary">
			    		
</form:form>
</div>
</div>
</div>
</div>
</div>

				
<%@include file="footer.jsp" %>
	
</body>
</html>
