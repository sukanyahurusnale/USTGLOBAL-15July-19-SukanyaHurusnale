package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookies")
public class ReadCookiesServlets extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookie = req.getCookies();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("<head>");
		out.println("<body>");
		if (cookie != null) {
			for (Cookie c : cookie) {

				out.println("<h1>cookie name=:" + c.getName() + "</h1><br/>");
				out.println("<h1>cookie value=:" + c.getValue() + "</h1>");

			}
		} else {
			out.println("<h1>cookie not found</h1>");
		}
		out.println("</body>");
		out.println("</head>");

	}// end of doget
}// end of class
