<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Student Registration</h3>

	<form:form action="studentReg" method="POST" modelAttribute="student">

		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fname"/> </td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lname"/> </td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email"/> </td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<%-- <form:radiobutton path="gender" value="M"/> Male
					<form:radiobutton path="gender" value="F"/> Fe-Male --%>
					<form:radiobuttons path="gender" items="${genders}"/>
				</td>
			</tr>
			<tr>
				<td>Course:</td>
				<td>
					<form:select path="course">
						<%-- <form:option value="">-Select-</form:option>
						<form:option value="java">Java</form:option>
						<form:option value=".net">.Net</form:option>
						<form:option value="testing">Testing Tools</form:option> --%>
						<form:options items="${courses}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Timings:</td>
				<td>
					<%-- <form:checkbox path="timings" value="morning"/>Morning
					<form:checkbox path="timings" value="afternoon"/>Afternoon
					<form:checkbox path="timings" value="evening"/>Evening --%>
					<form:checkboxes path="timings" items="${timings}" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>

	</form:form>


</body>
</html>