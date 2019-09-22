package com.ustglobal.hotelbilling.operation;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.*;
import javax.persistence.Query;

import com.ustglobal.hotebilling.dao.HotelBillInterface;
import com.ustglobal.hotelbilling.beans.Hotel_Bill;

public class HotelOperation implements HotelBillInterface {

	Hotel_Bill bill = new Hotel_Bill();

	public void showAllItems() {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			String query = "from Hotel_Bill";
			Query query1 = entityManager.createQuery(query);
			List<Hotel_Bill> rs = query1.getResultList();

			for (Hotel_Bill hb : rs) {
				System.out.println("Item Code: " + hb.getItem_code());
				System.out.println("Item Food_Name: " + hb.getFood_name());
				System.out.println("Item Price: " + hb.getPrice());
				System.out.println("************************");
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	public void takeOrder() {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			System.out.println("enter order code");
			int item_code1 = Integer.parseInt(sc.nextLine());

			while (item_code1 != 0) {

				String query = "  from Hotel_Bill where item_code=:item_code";
				Query query1 = entityManager.createQuery(query);
				System.out.println("enter item code");
				int item_code = Integer.parseInt(sc.nextLine());

				query1.setParameter("item_code", item_code);

				List<Hotel_Bill> rs = query1.getResultList();
				for (Hotel_Bill hb : rs) {
					System.out.println("Item code: " + hb.getItem_code());
					System.out.println("name"+hb.getFood_name());
					System.out.println("Item price:"+hb.getPrice());

					System.out.println("************************");
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	public void operateOnFood() {

	}

	public void addFoodItem() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/hotel_db1?user=root&password=root";

			conn = DriverManager.getConnection(dbUrl);

			String query = "insert into hotel_bill values(?,?,?)";

			ps = conn.prepareStatement(query);

			System.out.println("enter the item_code");
			ps.setInt(1, Integer.parseInt(sc.nextLine()));

			System.out.println("enter the food_name ");
			ps.setString(2, sc.nextLine());

			System.out.println("enter the price");
			ps.setInt(3, Integer.parseInt(sc.nextLine()));

			int rs = ps.executeUpdate();

			// process the resultset via preparedstmnt
			if (rs > 0) {
				System.out.println("Query OK," + rs + " row affected");

			} else {
				System.out.println("someting went wrong");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void removeFoodItem() {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String query = " delete from Hotel_Bill where item_code=:item_code";
			Query query1 = entityManager.createQuery(query);
			System.out.println("enter item code");
			int item_code = sc.nextInt();
			query1.setParameter("item_code", item_code);
			int rs = query1.executeUpdate();
			if (rs > 0) {
				System.out.println("item removed" + rs);
			} else {
				System.out.println("something went wrong");
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

	public void modifyFoodItem() {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String query = "update Hotel_Bill set food_name=:food_name where item_code=:item_code";
			Query query1 = entityManager.createQuery(query);

			System.out.println("enter new name of item");
			String food_name = sc.nextLine();
			query1.setParameter("food_name", food_name);

			System.out.println("enter item code");
			int item_code = sc.nextInt();
			query1.setParameter("item_code", item_code);

			int rs = query1.executeUpdate();
			if (rs > 0) {
				System.out.println("item upadated" + rs);
			} else {
				System.out.println("something went wrong");
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

	public void totalBill() {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String query = " select sum(price) from Hotel_Bill";
			Query query1 = entityManager.createQuery(query);
			List<Double> rs = query1.getResultList();

			for (Double hb : rs) {

				System.out.println("Item Price: " + hb);
				System.out.println("************************");
			}

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
