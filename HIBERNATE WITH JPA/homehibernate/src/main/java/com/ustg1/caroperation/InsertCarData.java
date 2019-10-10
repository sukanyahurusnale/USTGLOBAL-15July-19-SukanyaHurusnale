package com.ustg1.caroperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg1.beans.CarData;

public class InsertCarData {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			CarData car = new CarData();
			car.setId(1);
			car.setModel("zs");
			car.setName("audi");
			car.setPrice(3300000);

			CarData car1 = new CarData();
			car1.setId(2);
			car1.setModel("zsgg");
			car1.setName("jaquar");
			car1.setPrice(5500000);

			entityManager.persist(car);
			entityManager.persist(car1);

			System.out.println("car id: " + car.getId());
			System.out.println("car name: " + car.getName());
			System.out.println("car model: " + car.getModel());
			System.out.println("car price: " + car.getPrice());
			System.out.println("*********************************");

			System.out.println("car id: " + car1.getId());
			System.out.println("car name: " + car1.getName());
			System.out.println("car model: " + car1.getModel());
			System.out.println("car price: " + car1.getPrice());

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			
		}

	}

}
