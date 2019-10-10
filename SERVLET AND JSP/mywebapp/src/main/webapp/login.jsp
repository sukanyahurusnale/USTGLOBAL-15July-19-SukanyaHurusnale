<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="./loginj" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="number" name="id"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>

		</table>
	</form>

	<a href="./registerj">Signup</a>
</body>
</html>