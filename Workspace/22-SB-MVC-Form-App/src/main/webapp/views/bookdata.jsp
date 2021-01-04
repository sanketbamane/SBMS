<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Book Details</h3>

	<table>
		<tr>
			<td>Book Name :</td>
			<td>${book.bookName}</td>
		</tr>
		<tr>
			<td>Author Name :</td>
			<td>${book.authorName}</td>
		</tr>
		<tr>
			<td>Book Price :</td>
			<td>${book.bookPrice}</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</table>

	<a href="loadForm">Go Back</a>

</body>
</html>