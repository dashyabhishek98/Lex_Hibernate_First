package com.infyBank;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Customer_Details")
@GenericGenerator(name="idgen",strategy="increment")
public class Customer {
	@Id
	@Column(name = "CUSTOMERID")
	@GeneratedValue(generator="idgen")	
	private int customerId;
	@Column(name="CUSTOMERNAME")
	private String customerName;
	@Temporal(TemporalType.DATE)
	private Calendar dateOfBirth;
	private String address;
	private Long phoneNo;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="lockerId" , unique=true)
	private Locker locker;
	
	public Locker getLocker() {
		return locker;
	}
	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	Customer(){
		
	}
	public Customer(String customerName,Calendar dateOfBirth,String address,Long phoneNo,Locker locker) {
		super();
		/*this.customerId = customerId;*/
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNo = phoneNo;
		this.locker = locker;
	}
	public int getCustomerId() {
		return customerId;
	}
	/*public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}*/
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
