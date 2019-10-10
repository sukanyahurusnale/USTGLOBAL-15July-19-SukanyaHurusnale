<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<legend>Register here</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>name:</td>
					<td><input type="text" name="name" placeholder="enter name " />
						<br /></td>
				</tr>

				<tr>
					<td>number:</td>
					<td><input type="text" name="number1"
						placeholder="enter number " /> <br /></td>
				</tr>

				<tr>
					<td>group:</td>
					<td><input type="text" name="group1" placeholder="enter group" />
						<br /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"
						placeholder="enter password " /> <br /></td>
				</tr>

				<tr>
					<td><input type="submit" name="Register" /> <br /></td>
				</tr>

			</table>
		</form>
	</fieldset>

</body>
</html>