package com.ustglobal.contactlist.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.contactlist.dto.ContactBean;


public class ContactListIntImp implements ContactListInt {

	@Override
	public ContactBean login(String name, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		// EntityTransaction transaction = em.getTransaction();
		ContactBean bean = null;
		String jpql = "from ContactBean where name=:name and password=:password";

		Query query = em.createQuery(jpql);
		query.setParameter("name", name);
		query.setParameter("password", password);
		try {
			bean = (ContactBean) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return bean;
	}// End of Login method

	@Override
	public ContactBean register(ContactBean b) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		try {
			transaction.begin();
			em.persist(b);
			System.out.println("registration successfull!!..");
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}// End of register()

	@Override
	public boolean deleteContact(String name) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		ContactBean contactBean = null;
		Scanner sc = new Scanner(System.in);

		try {
			transaction.begin();
			ContactBean eib = em.find(ContactBean.class, name);
			em.remove(eib);
			System.out.println("contact deleted");
			transaction.commit();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		return true;
	}// end of deleteEmployee()

	@Override
	public ContactBean searchContact(String name) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		ContactBean contactBean = null;
		Scanner sc = new Scanner(System.in);

		try {
			transaction.begin();
			ContactBean eib = em.find(ContactBean.class, name);
			System.out.println("contact found"+eib);
			transaction.commit();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return new ContactBean();
	}

}// End of class
