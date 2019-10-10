package com.dev.newjpatestapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.newust.beans.StudentsData;

public class AddDataDemo {
	static EntityTransaction transaction = null;
	static EntityManager entityManager = null;

	public static void main(String[] args) {
		try {
			StudentsData student = new StudentsData();
			StudentsData student1 = new StudentsData();
			StudentsData student3 = new StudentsData();
			
			
			student3.setRollno(1);
			student3.setName("abcd");
			student3.setAge(10);

			student1.setRollno(2);
			student1.setName("sukanya");
			student1.setAge(21);

			student.setRollno(6);
			student.setName("rohini");
			student.setAge(19);
			
			
			 student.setRollno(5); 
			 student.setName("sarthak"); 
			 student.setAge(10);
			

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(student3);
			entityManager.persist(student1);
			entityManager.persist(student);
			System.out.println("saved");
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();

		} finally {
			entityManager.close();
		}
	}

}
