<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ include file="header.jsp"%>
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
<div class="row vertical-offset-100">
   <div class="col-md-4 col-md-offset-4">
     <div class="panel panel-default">
		<div class="panel-heading">
			    	
		<center><h3 class="panel-title">Please sign in</h3></center>
			 	
		</div>
			  	
	    <div class="panel-body">
			    	
<br>
<br>
			      	
<form action="perform_login" method="post">
<h1>Login Form</h1>
<div>
	<input type="text" placeholder="Username" required id="username" name="username" 
	 class="form-control input-sm floatlabel" title="minimum length for username is 5"/>
</div>

<br>
		
<div>
     <input type="password" placeholder="Password" class="form-control input-sm floatlabel" 
     required id="password" name="password" title="Enter Valid credentials"/>
</div>
				
<br>
				
<div>
	<input type="submit" class="btn btn-sm btn-info btn-block" value="Login" /> <br>
	<input class="btn btn-sm btn-info btn-block" type="button" value="Forget Password">
			   
<br>
	
	<a href="SignUp" class="btn btn-sm btn-info btn-block">SignUp</a><br>
					
</div>
				
</form>
			      	
			      
			      	
		</div>
    </div>
  </div>
 </div>
</div>

<br>
<br>
<br>
<br>
<br>


<%@include file="footer.jsp" %>


</body>
</html>