package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAOJpaImp;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/deleteEmp")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeDAOJpaImp dao = new EmployeeDAOJpaImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session=req.getSession(false);
		if(session!=null) {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		boolean employeeInfoBean = dao.deleteEmployee(empId);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (employeeInfoBean != false) {

			out.println("<h3>Employee Data for employee Id" + empId + "deleted"+"</h3>");
			
		}

		else {
			out.println("<h3>Employee Data for employee Id" + empId + "Not found!!!" + "</h3>");
		}
		out.println("</body>");
		out.println("</html>");
		}else {
			resp.sendRedirect("./LoginForm.html");
		}
		
	}
}
