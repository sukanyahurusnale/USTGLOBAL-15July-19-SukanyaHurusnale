import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.newust.beans.StudentsData;

public class ReattachDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			StudentsData student = new StudentsData();

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
            transaction=entityManager.getTransaction();
			transaction.begin();
			
			student = entityManager.find(StudentsData.class, 3);

			System.out.println(entityManager.contains(student));
			entityManager.detach(student);
			System.out.println(entityManager.contains(student));

			student.setAge(9);
			student=entityManager.merge(student);
			System.out.println(entityManager.contains(student));
			System.out.println(student.getAge()); 
			System.out.println(student.getName());

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}

}
