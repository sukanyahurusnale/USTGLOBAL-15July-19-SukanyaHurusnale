package com.ust1.dynamicjpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustg1.beans.CarData;

public class DynamicUpdateCardata {

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

			String q1="update CarData set name=:name where id=:id and price=:price";
			Query q2=entityManager.createQuery(q1);

			System.out.println("enter new name");
			String name = sc.nextLine();

			q2.setParameter("name", name);

			System.out.println("enter id");
			int id1 = sc.nextInt();
			q2.setParameter("id", id1);

			System.out.println("enter price");
			int pp = sc.nextInt();
			q2.setParameter("price", pp);

			
			int resultList1 = q2.executeUpdate();

			if (resultList1 > 0) {
				System.out.println("query updated" + resultList1);
			} else {
				System.out.println("something went wrong");
			}

			transaction.commit();
					
			
		} catch (Exception e) {

			System.out.println("Exception:"+e);
			transaction.rollback();
			
		}
	}

}
