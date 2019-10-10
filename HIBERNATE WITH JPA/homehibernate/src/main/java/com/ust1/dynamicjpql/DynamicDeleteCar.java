package com.ust1.dynamicjpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustg1.beans.CarData;

public class DynamicDeleteCar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);

		try {
			CarData car = new CarData();
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			String q1 = "delete from CarData where id=:id ";
			Query q2 = entityManager.createQuery(q1);

			System.out.println("enter id");
			int id1 = sc.nextInt();
			q2.setParameter("id", id1);

			int resultList1 = q2.executeUpdate();

			if (resultList1 > 0) {
				System.out.println("query deleted" + resultList1);
			} else {
				System.out.println("something went wrong");
			}

			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();

		}finally {
			entityManager.close();
		}

	}

}
