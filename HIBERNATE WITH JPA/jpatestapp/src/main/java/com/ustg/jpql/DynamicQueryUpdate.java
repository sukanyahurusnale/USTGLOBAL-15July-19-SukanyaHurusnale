package com.ustg.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpatestapp.dto.Movie;

public class DynamicQueryUpdate {

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
			String jpql1 = "update Movie  set name=:nm where id=:id";
			Query query1 = entityManager.createQuery(jpql1);

			System.out.println("enter new name");
			String name = sc.nextLine();

			query1.setParameter("nm", name);

			System.out.println("enter id");
			int id1 = sc.nextInt();
			query1.setParameter("id", id1);

			int resultList1 = query1.executeUpdate();

			if (resultList1 > 0) {
				System.out.println("query updated" + resultList1);
			} else {
				System.out.println("something went wrong");
			}

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
			
		}

	}
}
