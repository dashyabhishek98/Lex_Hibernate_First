package com.infyBank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Customer_Details")
@GenericGenerator(name="hibhilo",strategy="hilo",
					parameters= {@Parameter(name="max_hi",value="32763")})
public class Customer {
	@Id
	@Column(name = "CUSTOMERID")
	@GeneratedValue(generator="hibhilo")
	
	private int customerId;
	@Column(name="CUSTOMERNAME")
	private String customerName;
	@Column(name="CITY")
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	Customer(){
		
	}
	public Customer(String customerName,String city) {
		super();
		/*this.customerId = customerId;*/
		this.customerName = customerName;
		this.city = city;
	}
	/*public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}*/
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
