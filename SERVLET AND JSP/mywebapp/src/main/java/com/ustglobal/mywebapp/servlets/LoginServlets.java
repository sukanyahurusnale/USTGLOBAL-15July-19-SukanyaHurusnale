package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAOJpaImp;
import com.ustglobal.mywebapp.dao.EmployeeDao;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/login")
public class LoginServlets extends HttpServlet {
	EmployeeDao dao = new EmployeeDAOJpaImp();
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the data
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");
		int empId = Integer.parseInt(empIdVal);

		EmployeeInfoBean employeeInfoBean = dao.login(empId, password);
		if (employeeInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeinfo", employeeInfoBean);
			resp.sendRedirect("./homepage.html");

		} else {
			resp.sendRedirect("./LoginForm.html");
		}

	}// End of dopost
}// end of class
