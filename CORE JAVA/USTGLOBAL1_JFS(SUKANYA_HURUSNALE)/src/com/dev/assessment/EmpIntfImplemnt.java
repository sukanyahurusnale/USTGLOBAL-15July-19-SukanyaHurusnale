package com.dev.assessment;

import java.util.HashMap;

public class EmpIntfImplemnt implements EmpInterface{

	HashMap<String,Employee> hm=new HashMap<String,Employee>();
	public static void main(String[] args) {
		
	}

	@Override
	public boolean addEmployee(String id, Employee e) {
		if(e!=null) {
			hm.put(id,e);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeEmployee(String id, Employee e) {
		hm.remove(id,e);
		return true;
	}

	@Override
	public void calculateNetPay(Employee e,double d) {
		
		if(d>100000) {
			System.out.println("Pf is=: 5619");
		}
		
		else if(d>99999.00 && d<=86000.00) {
			System.out.println("Pf is=: 4876");
		}
		else if(d>850000.00 && d<=540000.00) {
			System.out.println("Pf is=: 4321");
		}
		else if(d>530000.00 && d<=380000.00) {
			System.out.println("Pf is=: 3765");
		}
		
		else if(d>370000.00 && d<=180000.00) {
			System.out.println("Pf is=: 3189");
		}
		else {
			System.out.println("no Pf");
		}
		
		
	}

	@Override
	public void calulateTax(Employee e,double d) {
		if(d>100000) {
			System.out.println("tax is=: 9.35%");
		}
		
		else if(d>99999.00 && d<=86000.00) {
			System.out.println("tax is: 8.87%");
		}
		else if(d>850000.00 && d<=540000.00) {
			System.out.println("tax is: 8.19%");
		}
		else if(d>530000.00 && d<=380000.00) {
			System.out.println("tax is: 7.34%");
		}
		
		else if(d>370000.00 && d<=180000.00) {
			System.out.println("tax is: 5.4%");
		}
		else {
			System.out.println("no tax");
		}
		
	}

	@Override
	public void getEmpoyee(String id) {
		System.out.println(id+""+hm);
		
	}

	@Override
	public void calulateSalGrade(Employee e,double sal) {
		if(sal>100000.00) {
			System.out.println("sal grade is : AA");
		}
		else if(sal>=860000.00 &&sal<99999.00) {
			System.out.println("your sal grade is: A");
		}
		else if(sal>=540000.00 && sal<86999.00) {
			System.out.println("your sal grade is: B");
		}
		else if(sal>=38999.00 && sal<53000.00) {
			System.out.println("your sal grade is: C");
		}
		else if(sal>=16000.00 && sal<38998.00) {
			System.out.println("your sal grade is: D");
		}
		else {
			System.out.println("invalid grade");
		}
		
		
	}

	@Override
	public void updateEmployee() {
       
		System.out.println("updated email"+hm);
		
		
	}

}
