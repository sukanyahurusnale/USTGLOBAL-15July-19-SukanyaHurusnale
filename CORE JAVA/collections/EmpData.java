package com.dev.collections;

public class EmpData {

	public static void main(String[] args) {
		InterfaceChild ic = new InterfaceChild();
		Employee e1 = new Employee();
		e1.setName("abc");
		e1.setId(1);
		e1.setEmail("ssss@gmail.com");
		e1.setPassword("345667");
		ic.addEmployee("1", e1);
		ic.getEmployee();

		Employee e11 = new Employee();
		e11.setName("suka");
		e11.setId(2);
		e11.setEmail("suka@gmail.com");
		e11.setPassword("355667");

		ic.addEmployee("2", e11);
		ic.getEmployee();
		ic.removeEmployee(e1);

		e11.setName("sukanya");
		ic.addEmployee("2", e11);
		ic.getEmployee();

	}

}
