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

@WebServlet("/addemp")
public class AddEmployeeservlets extends HttpServlet {
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

		ebean.setEmp_id(eid);
		ebean.setEmp_name(name);
		ebean.setEmp_age(age1);
		ebean.setEmp_sal(sal1);
		ebean.setDesignation(designation);

		EmployeeInfoBean employeeInfoBean = dao1.addEmployee(ebean);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		if (employeeInfoBean != null) {

			if (eid != employeeInfoBean.getEmp_id()) {

				out.println("<h3>Employee Data for employee Id" + id + "</h3>");
				out.println("Employee Id: " + id);
				out.println("Employee name: " + name);
				out.println("Employee age: " +age);
				out.println("Employee salary: " + sal);
				out.println("Employee designation: " +designation);
				out.println("<h2>data inserted" + id + "</h2>");
			}
		} else if(eid==employeeInfoBean.getEmp_id()){
			out.println("<h3>Employee Data for employee Id already present" + id + "</h3>");
		}else {
			out.println("<h3>Employee Dat");
		}
		out.println("</body>");
		out.println("</html>");
	}

}
