package com.ustg.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyTest {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		p.setPid(1);
		p.setPencilname("apsara");

		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setPencilname("natraj");

		Pencil p2 = new Pencil();
		p2.setPid(3);
		p2.setPencilname("camline");

		ArrayList<Pencil> ape = new ArrayList<Pencil>();
		ape.add(p);
		ape.add(p1);
		ape.add(p2);

		PencilBox box = new PencilBox();
		box.setBid(1);
		box.setBoxname("apsarabox");
		box.setPencil(ape);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			System.out.println("unidirectional");

			entityManager.persist(box);

			System.out.println("saved");
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
