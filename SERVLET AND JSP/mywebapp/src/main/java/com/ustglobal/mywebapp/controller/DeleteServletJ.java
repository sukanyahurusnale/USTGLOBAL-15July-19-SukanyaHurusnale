package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAOJpaImp;
import com.ustglobal.mywebapp.dao.EmployeeDao;

@WebServlet("/deletej")
public class DeleteServletJ extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		EmployeeDao dao = new EmployeeDAOJpaImp();
		dao.deleteEmployee(Integer.parseInt(id));

		HttpSession session = req.getSession(false);
		session.invalidate();

		resp.sendRedirect("./loginj");
	}

}
