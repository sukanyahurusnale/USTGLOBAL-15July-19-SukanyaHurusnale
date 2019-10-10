package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAOJpaImp;
import com.ustglobal.mywebapp.dao.EmployeeDao;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/loginj")
public class LoginServletsJ extends HttpServlet {
	EmployeeDao dao = new EmployeeDAOJpaImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal = req.getParameter("id");
		String password = req.getParameter("password");

		int empId = Integer.parseInt(empIdVal);
		EmployeeInfoBean employeeInfoBean = dao.login(empId, password);
		String url = null;
		if (employeeInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			url = "/home.jsp";

		} else {
			url = "/login.jsp";
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}

}
