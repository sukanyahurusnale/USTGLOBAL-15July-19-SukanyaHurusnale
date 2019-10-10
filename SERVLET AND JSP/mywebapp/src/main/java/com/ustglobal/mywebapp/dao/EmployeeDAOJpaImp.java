package com.ustglobal.mywebapp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;
import com.ustglobal.mywebapp.servlets.AddEmployeeservlets;

public class EmployeeDAOJpaImp implements EmployeeDao {

	@Override
	public EmployeeInfoBean serachEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = em.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeInfoBean;
	}// End of searchEmployee()

	@Override
	public EmployeeInfoBean login(int empId, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		EmployeeInfoBean employeeInfoBean = null;
		String jpql = "from EmployeeInfoBean where emp_id=:id and password=:pwd";
		Query query = em.createQuery(jpql);
		query.setParameter("id", empId);
		query.setParameter("pwd", password);

		try {

			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return employeeInfoBean;

	}

	@Override
	public EmployeeInfoBean addEmployee(EmployeeInfoBean e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		/*
		 * EmployeeInfoBean employeeInfoBean = null; Scanner sc = new
		 * Scanner(System.in);
		 */
		try {
			transaction.begin();
			/*
			 * e.setEmp_id(e.getEmp_id()); e.setEmp_name(e.getEmp_name());
			 * e.setEmp_age(e.getEmp_age()); e.setEmp_sal(e.getEmp_sal());
			 * e.setDesignation(e.getDesignation());
			 */
			em.persist(e);

			System.out.println("data inserteed");
			transaction.commit();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		return e;
	}// end of addEmployee

	@Override
	public boolean deleteEmployee(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		EmployeeInfoBean employeeInfoBean = null;
		Scanner sc = new Scanner(System.in);

		try {
			transaction.begin();
			EmployeeInfoBean eib = em.find(EmployeeInfoBean.class, id);
			em.remove(eib);
			System.out.println("data deleted");
			transaction.commit();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		return true;
	}// end of deleteEmployee()

	@Override
	public boolean updateEmployee(EmployeeInfoBean eb) {

		Scanner sc = new Scanner(System.in);

		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			// EmployeeInfoBean e1=new EmployeeInfoBean();

			EmployeeInfoBean e = em.find(EmployeeInfoBean.class, eb.getEmp_id());

			e.setEmp_id(eb.getEmp_id());
			e.setEmp_name(eb.getEmp_name());
			e.setEmp_age(eb.getEmp_age());
			e.setEmp_sal(eb.getEmp_sal());
			e.setDesignation(eb.getDesignation());
			e.setPassword(eb.getPassword());

			if (e != null) {
				transaction.begin();
				em.persist(e);
				System.out.println("data updated");
				transaction.commit();
				return true;
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}

		return true;
	}

}// end of class
