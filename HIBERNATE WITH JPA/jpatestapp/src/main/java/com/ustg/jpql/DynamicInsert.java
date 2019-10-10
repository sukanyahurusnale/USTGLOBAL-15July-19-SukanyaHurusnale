package com.ustg.jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpatestapp.dto.Movie;

public class DynamicInsert {

	
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);

		try {
			Movie movie = new Movie();
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			transaction = entityManager.getTransaction();
			transaction.begin();

			// update dynamically
			String jpql1 = "insert into Movie(id,name,rating) values(id=:id,name=:name,rating=:rating)";
			Query query1 = entityManager.createQuery(jpql1);

			System.out.println("enter id");
			int id1 = sc.nextInt();
			query1.setParameter("id", id1);
			
			
			System.out.println("enter name");
			String id2 = sc.nextLine();
			query1.setParameter("name", id2);
			
			
			System.out.println("enter rating");
			String id3 = sc.nextLine();
			query1.setParameter("rating", id3);

			//int resultList1 = query1.executeUpdate();
			 
			  
			 List<Movie> resultList = query1.getResultList();

			

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
			;
		}

	}
	
	
}
