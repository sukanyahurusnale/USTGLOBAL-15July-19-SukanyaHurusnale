package com.ustglobal.ustspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.ustspringboot.dto.Employee;
import com.ustglobal.ustspringboot.dto.EmployeeResponse;
import com.ustglobal.ustspringboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins="*",allowedHeaders = "*",allowCredentials = "true")
public class EmployeeController {

	@Autowired
	@Qualifier("jpa")
	private EmployeeService service;

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatusCode("401");
			response.setMessage("failure");
			response.setDescription("data not found in DB");
		} else {
			response.setStatusCode("201");
			response.setMessage("success");
			response.setDescription("data found in DB!!!");
			response.setEmployees(Arrays.asList(employee));
		}

		return response;

	}// End of getEmployee()

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		List<Employee> employee =   service.getAllEmployee();
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatusCode("401");
			response.setMessage("failure");
			response.setDescription("data not found in DB");
		} else {
			response.setStatusCode("201");
			response.setMessage("success");
			response.setDescription("data found in DB!!!");
			response.setEmployees(employee);
		}

		return response;
	}// End of getAllemployee()

	
	@GetMapping(path = "/get-all-name", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployeesByName(String name) {
		List<Employee> employee =   service.getEmployeesByName(name);
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatusCode("401");
			response.setMessage("failure");
			response.setDescription("data not found in DB");
		} else {
			response.setStatusCode("201");
			response.setMessage("success");
			response.setDescription("data found in DB!!!");
			response.setEmployees(employee);
		}

		return response;
	}// End of getemployeeByName()

	
	
	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {

		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(employee)) {
			response.setStatusCode("201");
			response.setMessage("success");
			response.setDescription("data added into db!!!");
			response.setEmployees(Arrays.asList(employee));
		} else {
			response.setStatusCode("401");
			response.setMessage("failure");
			response.setDescription("data not added");
		}

		return response;

	}// end of addEmployee()

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {

		EmployeeResponse response = new EmployeeResponse();
		if (service.modifyEmployee(employee)) {
			response.setStatusCode("201");
			response.setMessage("success");
			response.setDescription("data modify!!!");
			response.setEmployees(Arrays.asList(employee));
		} else {
			response.setStatusCode("401");
			response.setMessage("failure");
			response.setDescription("data not modify");
		}

		return response;

	}// end of modifyEmployee()

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) {

		EmployeeResponse response = new EmployeeResponse();
		if (service.removeEmployee(id)) {
			response.setStatusCode("201");
			response.setMessage("success");
			response.setDescription("removed!!!");

		} else {
			response.setStatusCode("401");
			response.setMessage("failure");
			response.setDescription("not removed");
		}

		return response;

	}// end of deleteEmployee()
	
	@GetMapping("/exce")
	public String exceptionExample() throws Exception {
		throw new Exception();
	}

}// End of class
