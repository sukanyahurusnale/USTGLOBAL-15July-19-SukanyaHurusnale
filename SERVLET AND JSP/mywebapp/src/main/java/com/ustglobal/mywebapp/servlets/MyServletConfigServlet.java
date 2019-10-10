package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String nameVal = config.getInitParameter("configname");
		
		ServletContext context=getServletContext();
		String myparamval=context.getInitParameter("myParam");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Name Value in config is -" + nameVal + "</h3>");
		out.println("<h3>Name Value in context is -" + myparamval + "</h3>");
		out.println("</body>");
		out.println("</html>");

	}// End of doGet
}// End of class
