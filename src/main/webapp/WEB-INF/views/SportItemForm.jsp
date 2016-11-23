<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ include file="AdminHeader.jsp" %>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport Equipment Library</title>
</head>
<br>
<br>
<br>
<br>
<br>
<body>

	<c:url value="/addItem" var="url"></c:url> 
	<form:form method="post" action="${url}" commandName="SportItemFormObj" enctype="multipart/form-data">

		<table>
         <tr>
         <td><form:input type="file" path="itemImage" /></td>
         
         
         </tr>		
		 <tr>
			<td><form:label path="isbn"></form:label></td>
			<td><form:hidden path="isbn"/></td>
        </tr>
        <tr>
        <td><form:label path="sportname">SPORT NAME</form:label>  </td>
        <td><form:input path="sportname" class="form-control input-sm" ></form:input></td>
	    </tr>
	     <tr>
        <td><form:label path="brand">BRAND</form:label>  </td>
        <td><form:input path="brand" class="form-control input-sm" ></form:input></td>
	    </tr>
	     <tr>
        <td><form:label path="price">PRICE</form:label>  </td>
        <td><form:input path="price" class="form-control input-sm" ></form:input></td>
	    </tr>
	     <tr>
        <td><form:label path="itemname">ITEM NAME</form:label>  </td>
        <td><form:input path="itemname" class="form-control input-sm" ></form:input></td>
	    </tr>
	    
	    <tr>
	    <td><form:label path="category">CATEGORY</form:label></td>
	    <td>
	    <form:radiobutton path="category.cid" value="1"/>New Arrivals
	     <form:radiobutton path="category.cid" value="2"/>Special Edition	
	      <form:radiobutton path="category.cid" value="3"/>Discount Sale
	       <form:radiobutton path="category.cid" value="4"/>General
	    </td>
	    </tr>
	    <tr>
	    <td colspan="2"><input type="submit" value="AddItem" class="btn btn-info btn-block"></td>
	    </tr>
		</table>
	</form:form>

	
</body>
</html>