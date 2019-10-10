package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createcookies")
public class CreateCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("name", "sukanya");
		resp.addCookie(cookie);
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h2> cookie created succsessfully</h2>");

	}// end of doGet

}// End of class
