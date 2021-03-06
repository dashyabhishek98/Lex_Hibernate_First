package com.infyBank;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO implements ICustomer{
	
	public int addCustomer(Customer custObj) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		Transaction tnx = session.beginTransaction();
		int custId = (Integer)session.save(custObj);
		tnx.commit();
		session.close();
		return custId;
	}
	public Customer viewCustomer(Integer custId) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		Customer c = (Customer)session.get(Customer.class , custId);
		session.close();
		return c;		
	}
	
	public void updateCustomer(Integer custId) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		Customer c = (Customer)session.load(Customer.class, custId);
		c.setCustomerName("Stephen");
		Transaction tnx = session.beginTransaction();
		session.update(c);
		tnx.commit();
		session.close();
		/*Session session1 = hibernateUtil.getSessionFactory().openSession();
		Transaction tnx = session1.beginTransaction();
		session1.merge(c);
		tnx.commit();
		session1.close();*/
	}
	
	public void delete(int custId) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		Customer c = (Customer)session.get(Customer.class, custId);
		session.delete(c);
		Transaction tnx = session.beginTransaction();
		tnx.commit();
		session.close();
	}
	
	public void viewCustomerHQL(int custId) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		String queryString ="select customerId,customerName,city from Customer where customerId = ?";
		Query query = session.createQuery(queryString);
		query.setInteger(0, custId);
		List<Object[]> cust = query.list();
		//System.out.println(cust);
		for(Object[] c:cust) {
			System.out.println(c[0]+" :: "+c[1]+" :: "+c[2]);
		session.close();
		}
	}
	
	public int updateCustomerHQL(int custId) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		String updateQuery = "update Customer set customerName=? where customerId=?";
		Query query = session.createQuery(updateQuery);
		query.setParameter(0, "Abhishek");
		query.setParameter(1, custId);
		Transaction tnx = session.beginTransaction();
		int rowsAffected = query.executeUpdate();
		tnx.commit();
		return rowsAffected;
	}
	
}	
