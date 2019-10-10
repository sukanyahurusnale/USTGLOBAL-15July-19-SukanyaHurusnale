<%@page import="com.ustglobal.mywebapp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page errorPage="error.jsp" %>
 <%@include file="index.jsp" %>
 <jsp:useBean id="emp" class="com.ustglobal.mywebapp.dto.EmployeeInfoBean" scope="application"/>
 <%-- <%@taglib url="" %> --%>
 <% int i=1/0; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=emp %>
<%=emp.getEmp_name() %>
<%=emp.getEmp_id() %>
</body>
</html>