package com.dev.collections;

import java.util.HashMap;

public class InterfaceChild implements EmpIneterface {

	HashMap<String, Employee> hs = new HashMap<String, Employee>();

	@Override
	public boolean addEmployee(String i, Employee e) {

		if (e != null) {
			hs.put(i, e);
			// hs.put("2",e);
			return true;
		}
		return false;
	}

	@Override
	public void getEmployee() {

		System.out.println(hs);

	}

	@Override
	public boolean removeEmployee(Employee e) {
		hs.remove(e);
		// System.out.println(hs);
		return true;
	}

	@Override
	public boolean updateEmployee() {

		return false;
	}

}
