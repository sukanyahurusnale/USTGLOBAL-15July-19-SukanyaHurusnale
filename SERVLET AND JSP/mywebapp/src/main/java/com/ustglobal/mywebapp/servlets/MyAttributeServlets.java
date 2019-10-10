package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;
@WebServlet("/myAttributesValue")
public class MyAttributeServlets extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		context.getAttribute("emp");
		
		EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) context.getAttribute("emp");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3> Employee Details are- </h3>");
		out.println("ID- "+employeeInfoBean.getEmp_id());
		out.println("name- "+employeeInfoBean.getEmp_name());
		out.println("age- "+employeeInfoBean.getEmp_age());
		out.println("sal- "+employeeInfoBean.getEmp_sal());
		out.println("designation- "+employeeInfoBean.getDesignation());
		out.println("</body>");
		out.println("</html>");
		
	}//end of doget
}//end of class
