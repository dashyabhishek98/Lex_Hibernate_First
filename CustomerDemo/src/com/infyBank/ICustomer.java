package com.infyBank;

public interface ICustomer {
	public int addCustomer(Customer custObj);
	public Customer viewCustomer(Integer custId);
	public void updateCustomer(Integer custId);
}
