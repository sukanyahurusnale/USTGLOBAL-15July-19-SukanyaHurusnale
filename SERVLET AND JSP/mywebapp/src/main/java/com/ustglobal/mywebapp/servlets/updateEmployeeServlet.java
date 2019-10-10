package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dao.EmployeeDAOJpaImp;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/updateemp")
public class updateEmployeeServlet extends HttpServlet {
	private EmployeeDAOJpaImp dao1 = new EmployeeDAOJpaImp();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean ebean = new EmployeeInfoBean();
		String id = req.getParameter("eid");
		int eid = Integer.parseInt(id);

		String name = req.getParameter("ename");

		String age = req.getParameter("eage");
		int age1 = Integer.parseInt(age);

		String sal = req.getParameter("esal");
		double sal1 = Double.parseDouble(sal);

		String designation = req.getParameter("edesignation");

		String password = req.getParameter("epassword");
		ebean.setEmp_id(eid);
		ebean.setEmp_name(name);
		ebean.setEmp_age(age1);
		ebean.setEmp_sal(sal1);
		ebean.setDesignation(designation);
		ebean.setPassword(password);
		
		boolean condition = dao1.updateEmployee(ebean);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if(condition) {
			System.out.println("updated");
		}
		else {
			System.out.println("not updated");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
