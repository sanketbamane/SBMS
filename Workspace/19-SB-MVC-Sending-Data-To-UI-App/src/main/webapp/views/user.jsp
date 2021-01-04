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
			<td>User ID :</td>
			<td>${userdata.userId}</td>
		</tr>
		<tr>
			<td>First Name :</td>
			<td>${userdata.firstName}</td>
		</tr>
		<tr>
			<td>Last Name :</td>
			<td>${userdata.lastName}</td>
		</tr>
		<tr>
			<td>DOB :</td>
			<td>${userdata.dob}</td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td>${userdata.gender}</td>
		</tr>
	</table>

</body>
</html>