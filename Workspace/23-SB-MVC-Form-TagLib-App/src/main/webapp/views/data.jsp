<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<table>
		<tr>
			<td>Customer Name :</td>
			<td>${customerObj.customerName}</td>
		</tr>
		<tr>
			<td>Customer Email :</td>
			<td>${customerObj.customerEmail}</td>
		</tr>
		<tr>
			<td>Customer Phno :</td>
			<td>${customerObj.customerPhno}</td>
		</tr>
	</table>

	<a href="customer">Go Back</a>

</body>
</html>