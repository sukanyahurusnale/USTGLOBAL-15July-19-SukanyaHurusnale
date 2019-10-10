package com.ust.ustspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.ustspringmvc.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public Employee auth(String email, String password) {
		;
		String jpql = "from Employee where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);

		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			return (Employee) query.getSingleResult();

		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if (checkEmail(employee.getEmail())) {
			return false;
		}

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		manager.persist(employee);
		transaction.commit();

		return true;
	}// End of registerEmployee()

	private boolean checkEmail(String email) {
		String jpql = "from Employee where email=:email";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);

		try {
			Employee employee = (Employee) query.getSingleResult();
			return true;
		} catch (Exception e) {

			return false;
		}

	}// End of checkEmail()

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		Employee employee = manager.find(Employee.class, id);
		if (employee == null) {
			return false;
		}
		manager.remove(employee);
		transaction.commit();
		return true;
	}// End of deleteEmployee()

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		Employee emp = manager.find(Employee.class, employee.getId());
		if (emp == null) {
			return false;
		}

		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());

		transaction.commit();
		return true;
	}// End of updateEmployee()

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {

		String jpql = "from Employee";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		List<Employee> employees = query.getResultList();

		return employees;
	}// End of getAllEmployee()

}// ENd of Class
