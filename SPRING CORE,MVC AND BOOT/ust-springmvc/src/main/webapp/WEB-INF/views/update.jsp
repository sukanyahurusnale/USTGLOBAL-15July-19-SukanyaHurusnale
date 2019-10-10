<%@page import="com.ust.ustspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Employee employee = (Employee) session.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>

</head>
<body>
	<div>
		<span><a href="./home">Home</a></span> <span style="float: right;"><a
			href="./logout">Log out</a></span>
	</div>
	<fieldset>
		<legend>Update-Form</legend>
		<form action="./update" method="post">
			<table>

				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"
						value="<%=employee.getId()%>" readonly="readonly"></td>
				</tr>

				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"
						value="<%=employee.getName()%>"></td>
				</tr>

				<tr>
					<td>DOB:</td>
					<td><input type="date" name="dob"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"
						value="<%=employee.getPassword()%>"></td>
				</tr>

				<tr>
					<td><input type="submit" name="Update"></td>
				</tr>

			</table>
		</form>
	</fieldset>
</body>
</html>