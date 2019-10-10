package com.ustg.simplecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpatestapp.dto.Movie;

public class App {

	static EntityTransaction transaction = null;
	static EntityManager entityManager=null;

	public static void main(String[] args) {
		try {
			Movie movie = new Movie();
			movie.setId(3);
			movie.setName("abcd");
			movie.setRating("good");
			
			Movie movie1 = new Movie();
			movie.setId(1);
			movie.setName("abcd2");
			movie.setRating("good or bad");
			
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			entityManager.persist(movie1);
			System.out.println("saved");
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();

		}
		finally {
			entityManager.close();
		}
	}

}
