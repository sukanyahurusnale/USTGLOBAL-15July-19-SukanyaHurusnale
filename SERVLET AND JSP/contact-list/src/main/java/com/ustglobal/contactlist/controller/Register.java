package com.ustglobal.contactlist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.contactlist.dao.ContactListInt;
import com.ustglobal.contactlist.dao.ContactListIntImp;
import com.ustglobal.contactlist.dto.ContactBean;

@WebServlet("/register")
public class Register extends HttpServlet {

	ContactListInt contact = new ContactListIntImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String number = req.getParameter("number1");
		String group = req.getParameter("group1");
		String password = req.getParameter("password");
		
		ContactBean bean = new ContactBean();
		bean.setName(name);
		bean.setGroup1(group);
		bean.setNumber1(number);
		bean.setPassword(password);
		
	    contact.register(bean);
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
}
