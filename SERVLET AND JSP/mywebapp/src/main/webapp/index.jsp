<%@page import="java.util.Date"%>
<%!

public void jspInit(){
	System.out.println("init");
}

public void jspDestroy(){
	System.out.println("destroyed");
}
%>
<% int count=0; %>
<% Date date=new Date();%>
<html>
<body>
<h2>Hello World!</h2>
<h2> count value is=<%=count%></h2>
<h3>Current date and time is</h3>
<h2><%=date%></h2>

</body>
</html>
