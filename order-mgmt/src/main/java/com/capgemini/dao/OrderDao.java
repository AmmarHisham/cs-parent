package com.capgemini.dao;

import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import com.capgemini.entity.OrderEntity;

@Component
public class OrderDao {

	public String getOrders(int id) throws Exception {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			OrderEntity order = session.load(OrderEntity.class, id);
			session.update(order);
			tx.commit();
			return order.toString();

		} catch (RuntimeException e) {
			try {
				tx.rollback();
			} catch (NullPointerException ex) {

				java.util.logging.Logger.getLogger("Test").log(Level.INFO, "No Order Found with this order Id!", e);

			}
		}

		finally {
			session.close();

		}
		return "Order NOT Found";

	}

	public String getOrdersByStatus(int userId, String status) throws Exception {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			OrderEntity order = session.byNaturalId(OrderEntity.class).using("userId", userId).using("status", status)
					.load();

			session.update(order);

			System.out.println("Order obj: " + order);
			tx.commit();
			return order.toString();
		}

		catch (RuntimeException e) {
			try {
				tx.rollback();
			} catch (NullPointerException ex) {

				java.util.logging.Logger.getLogger("Test").log(Level.INFO, "No Order Found with this Status!", e);

			}
		}

		finally {
			session.close();

		}
		return "OrderDetails NOT Found";

	}
}