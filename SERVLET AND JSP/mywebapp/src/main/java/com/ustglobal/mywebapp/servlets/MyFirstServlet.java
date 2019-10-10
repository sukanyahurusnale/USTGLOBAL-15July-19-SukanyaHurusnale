package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")
public class MyFirstServlet extends HttpServlet {

	public MyFirstServlet() {
		System.out.println("Instantitation");
	}

	@Override
	public void init() throws ServletException {

		System.out.println("init");
	}// End of init

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		System.out.println("changes");
	}// end if service

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		resp.setContentType("text/html");
         // resp.setHeader("refresh", "1");

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"refresh\" content=\"1\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Current System Date & Time <br/>");
		out.println(date);
		out.println("</b2>");
		out.println("</body>");
		out.println("</html>");

	}// end of doGet()

	@Override
	public void destroy() {
		System.out.println("destroyed");
	}// end of destroy

}// end of class
