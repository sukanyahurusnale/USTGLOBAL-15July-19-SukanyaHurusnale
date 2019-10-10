<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset> <legend> Login Form</legend>
	<form action="./login" method="post">
		<table>

			<tr>

				<td>name:</td>
				<td><input type="text" name="name" placeholder="Enter name..."></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"
					placeholder="Enter password..."></td>
			</tr>
			<tr>
				
				<td><input type="button" value="submit"></td>
			</tr>

		</table>
	</form>
          <a href="./register">Signup</a>
	</fieldset>
</body>
</html>