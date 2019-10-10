package com.ustg.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpatestapp.dto.Movie;

public class UpdateDemo {

	
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
		
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			transaction=entityManager.getTransaction();
			transaction.begin();
			
			//update
			String jpql1 = "update Movie  set name='newname' where id=3";  
			Query query1 = entityManager.createQuery(jpql1);
			int resultList1 =query1.executeUpdate();
			
			if(resultList1>0) {
				System.out.println("query updated"+resultList1);
			}
			else {
				System.out.println("something went wrong");
			}
			
		transaction.commit();
			
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();;
		}

	}

}
