package com.infyBank;

import java.util.Calendar;

import org.hibernate.Session;

public class ClientDemo {
	public static void main(String args[]) {
		CustomerDAO cd1 = new CustomerDAO();
		/*Customer c1 = new Customer("Mathew","Los Wages");
		Customer c2 = new Customer("Monica","Toronto");
		Customer c3 = new Customer("Micheal","Sydney");
		Customer c4 = new Customer("Mike","London");*/
		/*System.out.println(cd1.addCustomer(c1));
		System.out.println(cd1.addCustomer(c2));
		System.out.println(cd1.addCustomer(c3));
		System.out.println(cd1.addCustomer(c4));*/
		
		/*Customer c = cd1.viewCustomer(1000);
		System.out.println(c.getCustomerId()+" :: "+c.getCustomerName());*/
		
		/*cd1.updateCustomer(1000);*/
		
		/*cd1.delete(1000);*/
		
		/*cd1.viewCustomerHQL(2000);*/
		
		/*cd1.updateCustomerHQL(2000);*/
		
		
		/*cd1.addCustomerloanPK();*/
		
		Customer c = new Customer();
		c.setCustomerName("Abhishek");
		Calendar cal = Calendar.getInstance();
		cal.set(1995, 05, 17);
		c.setDateOfBirth(cal);
		c.setAddress("Kolkata");
		c.setPhoneNo(9999999l);
		Locker l = new Locker("LOC103", "medium", 1200.0);
		cd1.addNewCustomerNewLocker(c, l);
		//cd1.addNewLocker(l);
		//cd1.deleteCustomerLocker(2);
	}
}
