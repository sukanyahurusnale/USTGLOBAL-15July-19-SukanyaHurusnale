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

@WebServlet("/searchEmp")
public class SearchEmployee extends HttpServlet {

	private EmployeeDAOJpaImp dao = new EmployeeDAOJpaImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		// get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EmployeeInfoBean employeeInfoBean = dao.serachEmployee(empId);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (employeeInfoBean != null) {

			out.println("<h3>Employee Data for employee Id" + empId + "</h3>");
			out.println("Employee Id: " + employeeInfoBean.getEmp_id());
			out.println("Employee name: " + employeeInfoBean.getEmp_name());
			out.println("Employee age: " + employeeInfoBean.getEmp_age());
			out.println("Employee salary: " + employeeInfoBean.getEmp_sal());
			out.println("Employee designation: " + employeeInfoBean.getDesignation());
		}
		else {
			out.println("<h3>Employee Data for employee Id" + empId + "Not found!!!" + "</h3>");
		}
		out.println("</body>");
		out.println("</html>");
		}else {
			resp.sendRedirect("./LoginForm.html");
		}
	}// End of doGet

}// ENd of Class
