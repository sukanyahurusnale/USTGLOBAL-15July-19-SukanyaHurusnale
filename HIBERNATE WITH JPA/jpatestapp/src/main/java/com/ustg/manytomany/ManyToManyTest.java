package com.ustg.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyTest {

	public static void main(String[] args) {

		Course c = new Course();
		c.setCid(1);
		c.setCname("java");

		Course c1 = new Course();
		c1.setCid(2);
		c1.setCname("hibernate");
		Course c2 = new Course();
		c2.setCid(3);
		c2.setCname("angular");

		ArrayList<Course> course = new ArrayList<Course>();
		course.add(c);
		course.add(c1);
		course.add(c2);

		Student s = new Student();
		s.setSid(1);
		s.setSname("java full stack");
		s.setCourse(course);

		Student s1 = new Student();
		s1.setSid(2);
		s1.setSname("jjjjj");
		s1.setCourse(course);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			System.out.println("manytomany");

			
			  Course cs = entityManager.find(Course.class, 1);
			  System.out.println(cs.getStudent().get(0).getSname());
			 
			// entityManager.persist(s1);

			System.out.println("saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
