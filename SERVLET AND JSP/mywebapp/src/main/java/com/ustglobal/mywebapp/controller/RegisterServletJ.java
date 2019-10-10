package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dao.EmployeeDAOJpaImp;
import com.ustglobal.mywebapp.dao.EmployeeDao;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/registerj")
public class RegisterServletJ extends HttpServlet {

	EmployeeDao dao = new EmployeeDAOJpaImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String salary = req.getParameter("salary");
		String designation = req.getParameter("designation");
		String password = req.getParameter("password");

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmp_id(Integer.parseInt(id));
		employeeInfoBean.setEmp_name(name);
		employeeInfoBean.setEmp_age(Integer.parseInt(age));
		employeeInfoBean.setEmp_sal(Double.parseDouble(salary));
		employeeInfoBean.setDesignation(designation);
		employeeInfoBean.setPassword(password);
		dao.addEmployee(employeeInfoBean);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);

	}
}
