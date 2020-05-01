<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Product Details</h1>
	<form:form method="GET" action="editProduct">
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
				<td>Salary :</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Designation :</td>
				<td><form:input path="finalPrice" /></td>
			</tr>

		</table>
	</form:form>

</body>
</html>