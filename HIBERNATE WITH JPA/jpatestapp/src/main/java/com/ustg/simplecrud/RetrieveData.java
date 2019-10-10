package com.ustg.simplecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpatestapp.dto.Movie;

public class RetrieveData {

	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entitymanager = null;
	static EntityTransaction transaction = null;

	public static void main(String[] args) {

		Movie movie = new Movie();
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entitymanager = entityManagerFactory.createEntityManager();
		movie=entitymanager.find(Movie.class, 1);
		System.out.println(movie.getId());
		System.out.println(movie.getName());
		

	}

}
