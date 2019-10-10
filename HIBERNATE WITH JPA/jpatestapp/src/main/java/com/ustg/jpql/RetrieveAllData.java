package com.ustg.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpatestapp.dto.Movie;

public class RetrieveAllData {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			Movie movie = new Movie();
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			transaction = entityManager.getTransaction();
			transaction.begin();
			// String jpql="from Movie"; //select all the data

			/*
			 * String jpql = "select name from Movie"; // select name
			 * 
			 * Query query = entityManager.createQuery(jpql); 
			 * List<String> resultList =query.getResultList();
			 * 
			 */
			// *********************************************************************************
			/*
			 * for iterate all the onject
			 * 
			 * String jpql="from Movie"; Query query = entityManager.createQuery(jpql);
			 * List<Movie> resultList = query.getResultList();
			 * 
			 * 
			 * //select all the data
			 * 
			 * 
			 * 
			 * for (Movie movie1 : resultList) {
			 * 
			 * System.out.println(movie1.getId());
			 * 
			 * System.out.println(movie1.getName());
			 * 
			 * System.out.println(movie1.getRating());
			 * 
			 * System.out.println("************************");
			 * 
			 * }
			 */

			// *********************************************************************************

			// for selecting only one name

			/*
			 * String jpql = "select name from Movie"; // select name
			 * 
			 * Query query = entityManager.createQuery(jpql); 
			 * 
			 * List<String> resultList = query.getResultList();
			 * 
			 * for (String obj : resultList) { System.out.println(obj);
			 * 
			 * 
			 * 
			 * 
			 * System.out.println("************************");
			 * 
			 * }
			 */
			// **********************************************************************************************

			/*
			 * update data
			 * 
			 * String jpql1 = "update Movie set name='newname' where id=2"; Query query1 =
			 * entityManager.createQuery(jpql1); int resultList1=query1.executeUpdate();
			 * if(resultList1>0) { System.out.println("query upadted"+resultList1); } else {
			 * System.out.println("something went wrong"); }
			 */
			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
			;
		}

	}

}
