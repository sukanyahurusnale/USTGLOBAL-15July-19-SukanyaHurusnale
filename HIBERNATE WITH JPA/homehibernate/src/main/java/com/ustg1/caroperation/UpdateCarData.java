package com.ustg1.caroperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg1.beans.CarData;

public class UpdateCarData {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CarData car=entityManager.find(CarData.class, 1);
			entityManager.contains(car);
			car.setModel("newsuk");
			System.out.println(car.getModel());
			
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			System.err.print(e);
		}finally {
			entityManager.close();
		}

	}

}
