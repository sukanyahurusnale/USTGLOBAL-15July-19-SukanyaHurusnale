package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean eib=new EmployeeInfoBean();
		eib.setEmp_id(9);
		eib.setEmp_name("rohini");
		eib.setEmp_age(22);
		req.setAttribute("employee", eib);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/requestAttr");
		dispatcher.forward(req, resp);
			
	}//End of doGEt
}//end of class

