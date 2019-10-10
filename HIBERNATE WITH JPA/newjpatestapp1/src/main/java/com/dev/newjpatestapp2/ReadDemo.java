package com.dev.newjpatestapp2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.newust.beans.StudentsData;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		

		try {
			StudentsData student = new StudentsData();

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
			/*
			 * student=entityManager.find(StudentsData.class,4);
			 * System.out.println(student.getClass());
			 */
			
			
			  student = entityManager.getReference(StudentsData.class, 3);
			 // System.out.println(student.getClass());
			  System.out.println(entityManager.contains(student));
			 entityManager.detach(student);
			 System.out.println(entityManager.contains(student));
			
			 entityManager.merge(student);
			 System.out.println(entityManager.contains(student));
			
			 
			/*
			 * student.setAge(9);
			 * 
			 * System.out.println(student.getRollno());
			 * System.out.println(student.getAge());
			 * System.out.println(student.getName());
			 */
			

			// System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}

}
