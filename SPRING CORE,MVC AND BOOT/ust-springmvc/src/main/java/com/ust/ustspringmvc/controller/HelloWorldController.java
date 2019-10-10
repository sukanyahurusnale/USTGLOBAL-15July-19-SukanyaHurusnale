package com.ust.ustspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.ustspringmvc.dto.Employee;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);

	}//End of initBinder()

	@RequestMapping(path = "/world", method = RequestMethod.GET)
	public String hello(ModelMap map) {
		map.addAttribute("msg", "hello World!!!..");
		return "index";
	}// End of hello()

	@RequestMapping(path = "/query", method = RequestMethod.GET)
	public String getInfo(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap map) {
		map.addAttribute("id", id);
		map.addAttribute("name", name);
		return "info";
	}// End of getInfo()

	@RequestMapping(path = "/form-page", method = RequestMethod.GET)
	public String getForm() {

		return "form";
	}// End of getForm()

	@RequestMapping(path = "/form", method = RequestMethod.POST)
	public String fromData(Employee emp, ModelMap map) {

		map.addAttribute("id", emp.getId());
		map.addAttribute("name", emp.getName());
		 map.addAttribute("dob", emp.getDob());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("password", emp.getPassword());
       
		return "info";
	}// End of getForm()

	@RequestMapping(path = "/add-cookie", method = RequestMethod.GET)
	public String addCookie(HttpServletResponse response, ModelMap map) {

		Cookie cookie = new Cookie("name", "devi");
		response.addCookie(cookie);

		map.addAttribute("msg", "cookie added to the browser");
		return "cookie";

	}// End of adddCookie()

	@RequestMapping(path = "/get-cookie", method = RequestMethod.GET)
	public String getCookie(@CookieValue(name = "name", required = false) String name, ModelMap map) {

		if (name == null) {
			map.addAttribute("msg", "cookie not present");
		} else {
			map.addAttribute("msg", "cookie value= " + name);
		}

		return "cookie";

	}// End of adddCookie()

	@RequestMapping(path = "/path/{id}/{name}", method = RequestMethod.GET)
	public String getPathValues(@PathVariable("id") int id, @PathVariable("name") String name, ModelMap map) {
		map.addAttribute("id", id);
		map.addAttribute("name", name);
		return "info";
	}// End of getPath()

	@RequestMapping(path = "/set-session", method = RequestMethod.GET)
	public String setSessionAttribute(HttpSession session, ModelMap map) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("sukanya");
		employee.setEmail("suk@gmail.com");
		employee.setPassword("12345");
		session.setAttribute("emp", employee);

		map.addAttribute("msg", "sesssion attribute added");

		return "index";

	}// End of setSessionAttribute()

	@RequestMapping(path = "/get-session", method = RequestMethod.GET)
	public String getSessionAttribute(@SessionAttribute(name = "emp", required = false) Employee employee,
			ModelMap map) {

		if (employee == null) {

			System.out.println("no attribute present");

		} else {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());

			map.addAttribute("id", employee.getId());
			map.addAttribute("name", employee.getName());
			map.addAttribute("msg", "Got the attribute");
		}

		return "index";

	}// End of getSessionAttribute()

	@RequestMapping(path = "/forward", method = RequestMethod.GET)
	public String forward() {

		return "forward:add-cookie";
	}// end of forward()

	@RequestMapping(path = "/redirect", method = RequestMethod.GET)
	public String redirectMethod() {

		return "redirect:http://www.google.com";
	}// end of redirect()

}// End of class
