package com.ustg.onetoone.beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(2);
		person.setName("ssd");

		VoterCard vc1 = new VoterCard();
		vc1.setVid(2);
		vc1.setVname("sukanyanew");
		person.setVc(vc1);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			// entityManager.persist(person);
			VoterCard votercard = entityManager.find(VoterCard.class, 2);
			System.out.println(votercard.getPerson().getName()); // bidirectional access person details through the votercard

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
