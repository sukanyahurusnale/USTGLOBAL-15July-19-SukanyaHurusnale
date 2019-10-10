package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/contextAttr")
public class MyContextAttrServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean eib = new EmployeeInfoBean();
		eib.setEmp_id(102);
		eib.setEmp_name("rohinihurusnale");
		eib.setEmp_age(18);
		req.setAttribute("employee", eib);

		ServletContext context = getServletContext();
		context.setAttribute("emp", eib);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3> context attribute has been set....- </h3>");
		out.println("</body>");
		out.println("</html>");
	}// End of doGet

}// end of Class
