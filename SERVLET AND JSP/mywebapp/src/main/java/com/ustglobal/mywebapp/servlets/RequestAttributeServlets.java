package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/requestAttr")
public class RequestAttributeServlets extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) req.getAttribute("employee");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3> Employee Details are- </h3>");
		out.println("ID- "+employeeInfoBean.getEmp_id());
		out.println("ID- "+employeeInfoBean.getEmp_name());
		out.println("ID- "+employeeInfoBean.getEmp_age());
		out.println("ID- "+employeeInfoBean.getEmp_sal());
		out.println("ID- "+employeeInfoBean.getDesignation());
		out.println("</body>");
		out.println("</html>");
	}
}
