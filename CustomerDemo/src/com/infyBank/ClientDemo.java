package com.infyBank;

import java.util.Date;

public class ClientDemo {
	public static void main(String args[]) {
		CustomerDAO cd1 = new CustomerDAO();
		/*Customer c1 = new Customer("Mathew","Los Wages");
		Customer c2 = new Customer("Monica","Toronto");
		Customer c3 = new Customer("Micheal","Sydney");
		Customer c4 = new Customer("Mike","London");
		System.out.println(cd1.addCustomer(c1));
		System.out.println(cd1.addCustomer(c2));
		System.out.println(cd1.addCustomer(c3));
		System.out.println(cd1.addCustomer(c4));*/
		
		/*Customer c = cd1.viewCustomer(1000);
		System.out.println(c.getCustomerId()+" :: "+c.getCustomerName());*/
		
		/*cd1.updateCustomer(1000);*/
		
		/*cd1.delete(1000);*/
		
		/*cd1.viewCustomerHQL(2000);*/
		
		/*cd1.updateCustomerHQL(2000);*/
		Address add = new Address("A102", "A-708", "Pune", "Maharastra", "411057");
		Date date = new Date();		
		Customer c1 = new Customer();
		c1.setCustomerName("Shyam");
		c1.setDateOfBirth(date);
		c1.setAddress(add);
		//cd1.newCustomerNewAddress(c1, add);
		//cd1.deleteCustomerAndAddress(1);
		cd1.updateCustomerAndAddress(32768);
	}
}
