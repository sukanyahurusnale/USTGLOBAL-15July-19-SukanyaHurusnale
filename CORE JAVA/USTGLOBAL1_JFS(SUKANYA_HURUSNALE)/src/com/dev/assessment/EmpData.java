package com.dev.assessment;

public class EmpData {

	public static void main(String[] args) {
		EmpIntfImplemnt ei=new EmpIntfImplemnt();
		Employee e=new Employee();
		e.setEmpid(1);
		e.setEname("Suknaya@gmail.com");
		e.setName("sukanya");
		e.setPassword("12345");
		e.setSalary(100000.00);

		ei.addEmployee("1", e);
		ei.getEmpoyee("1");
		
		//insert data
		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setEname("shweta@gmail.com");
		e1.setName("Shweta");
		e1.setPassword("1234545");
		e1.setSalary(800000.00);

		//adding into hashmap
		ei.addEmployee("2", e1);
		

		//for display
		ei.getEmpoyee("2");
		ei.removeEmployee("1", e1);
		ei.getEmpoyee("1");

		//update email
		e.setEname("sukanyahurusnaleNew@gmail.com");
		e1.setEname("shwetnew@gmail.com");
		ei.updateEmployee();

		//calculate salgrade
		ei.calulateSalGrade(e,100000.00);

		//calculate tax
		ei.calulateTax(e1, 800000.00);

		//calculate Pf
		ei.calculateNetPay(e1,800000.00 );
	}

}
