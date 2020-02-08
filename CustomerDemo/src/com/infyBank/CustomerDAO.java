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
	
	public void addCustomerloanPK() {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		CustomerLoanPK customerLoanPk = new CustomerLoanPK();
		customerLoanPk.setCustomerId(101);
		customerLoanPk.setLoanId(5001);
		CustomerLoan customerLoan = new CustomerLoan();
		customerLoan.setPk(customerLoanPk);
		customerLoan.setAmountAvailed(1500000);
		customerLoan.setLoanIdEligible(25000000);
		customerLoan.setTenureInYears(20);
		CustomerLoanPK id = (CustomerLoanPK)session.save(customerLoan);
		System.out.println("id :: "+id);
	}
	public void addNewCustomerNewLocker(Customer c,Locker l) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		c.setLocker(l);
		Transaction t = session.beginTransaction();
		int id = (Integer)session.save(c);
		t.commit();
		System.out.println("id:: "+id);
	}
	
	public void addNewLocker(Locker l) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String id = (String)session.save(l);
		t.commit();
		System.out.println("L_id:: "+id);
	}
	public void deleteCustomerLocker(Integer cid) {
		HibernateUtil hibernateUtil = new HibernateUtil();
		Session session = hibernateUtil.getSessionFactory().openSession();
		Customer c = (Customer)session.load(Customer.class, cid);
		System.out.println(c.getCustomerName());
		Transaction t = session.beginTransaction();
		session.delete(c);
		t.commit();
		System.out.println("Delete Successfull");		
	}
}
