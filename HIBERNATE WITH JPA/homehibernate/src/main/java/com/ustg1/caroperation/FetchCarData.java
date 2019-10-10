package com.ustg1.caroperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustg1.beans.CarData;

public class FetchCarData {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =entityManagerFactory.createEntityManager();
			CarData car=entityManager.find(CarData.class, 1);
			System.out.println("car id: " + car.getId());
			System.out.println("car name: " + car.getName());
			System.out.println("car model: " + car.getModel());
			System.out.println("car price: " + car.getPrice());
			System.out.println("*********************************");



		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
