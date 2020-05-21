<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1 align="center">Please add your product here</h1>
	<hr>
 
	<form:form action="result" method="post" modelAttribute="userReg">
	
	<div align="center">

		<label> Product Name :</label>
		<form:input path="pName" />
		
		
		<br/>
		
		<label>Product ID</label>
		<form:input path="pId" />

		<br />
		
		<label>Price</label>
		<form:input path="price" />

		<br />
		

		<br />
		<br />
		<input type="submit" value="Add Product">
		
		</div>
	
	

	</form:form>

</body>
</html>