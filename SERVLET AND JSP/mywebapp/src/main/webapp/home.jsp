<%@page import="com.ustglobal.mywebapp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="employeeInfoBean"
	class="com.ustglobal.mywebapp.dto.EmployeeInfoBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div align="right">
		<a href="./deletej?id=<%=employeeInfoBean.getEmp_id()%>"> Delete
			Profile</a>
	</div>
	
	<div align="right">
		<a href="./logoutj">LogOut</a>
	</div>
	
	<h1>
		welcome Home
		<%=employeeInfoBean.getEmp_name()%>dear!!
	</h1>
</body>
</html>