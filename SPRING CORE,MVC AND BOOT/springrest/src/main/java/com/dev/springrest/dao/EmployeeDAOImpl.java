package com.dev.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dev.springrest.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(Employee employee) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(employee);
			transaction.commit();
			return true;
		}

		catch (Exception e) {

			return false;
		}
	}// End of addEmployee()

	@Override
	public boolean removeEmployee(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			Employee emp = em.find(Employee.class, id);
			em.remove(emp);
			transaction.commit();
			return true;

		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}// End of removeEmployee()

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Employee emp = em.find(Employee.class, employee.getId());

		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());

		transaction.commit();
		return true;
	}

	@Override
	public Employee getEmployee(int id) {

		/*
		 * String jpql = "from Employee where id=:id"; EntityManager em =
		 * factory.createEntityManager(); em.find(Employee.class, id);
		 * 
		 * Query query = em.createQuery(jpql); query.setParameter("id", id); Employee
		 * emp = (Employee) query.getSingleResult(); return emp;
		 */
		EntityManager em = factory.createEntityManager();
	
			 return em.find(Employee.class,id);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		EntityManager em = factory.createEntityManager();
		String jpql = "from Employee";
		
		Query query = em.createQuery(jpql);
		List<Employee> employees = query.getResultList();

		return employees;

	}

}
