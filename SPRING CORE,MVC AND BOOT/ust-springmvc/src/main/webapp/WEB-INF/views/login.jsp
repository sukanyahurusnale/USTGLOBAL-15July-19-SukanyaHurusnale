<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>
	<fieldset>
		<legend>Login-Form</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" required="required"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" name="Sign In"></td>
					<td><a href="./register">Sign Up</a></td>
				</tr>
			</table>
		</form>
	
	</fieldset>
	<h3>${msg}</h3>
</body>
</html>