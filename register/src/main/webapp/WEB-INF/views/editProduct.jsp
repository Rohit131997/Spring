<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Product Details</h1>
	<form:form method="POST" action="/register/editProduct">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="pid" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="pname" /></td>
			</tr>
			<tr>
				<td>price :</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>FinalPrice :</td>
				<td><form:input path="finalPrice" /></td>
			</tr>

             <tr>
				<td><input type="submit" value="Edit Save" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>