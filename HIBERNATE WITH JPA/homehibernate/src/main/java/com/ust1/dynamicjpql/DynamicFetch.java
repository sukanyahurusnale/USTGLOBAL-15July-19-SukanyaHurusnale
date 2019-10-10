package com.ust1.dynamicjpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustg1.beans.CarData;

public class DynamicFetch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			String query = "from CarData";
			Query query1 = entityManager.createQuery(query);
			List<CarData> rs = query1.getResultList();

			for (CarData car : rs) {

				System.out.println(car.getId());
				System.out.println(car.getModel());
				System.out.println(car.getName());
				System.out.println(car.getPrice());
				System.out.println("************************");
			}

			// **************************************************************************

			String query2 = "select name from CarData where id=:id";
			Query q2 = entityManager.createQuery(query2);

			System.out.println("enter id");
			int id = sc.nextInt();
			q2.setParameter("id", id);

			List<String> rs1 = q2.getResultList();

			for (String car1 : rs1) {

				System.out.println(car1);

				System.out.println("************************");

			}

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
