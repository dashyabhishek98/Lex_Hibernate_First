package com.infyBank;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address; 
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer(int customerId, String customerName, Date dateOfBirth, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	Customer(){
		
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
