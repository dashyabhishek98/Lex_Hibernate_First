package com.infyBank;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerLoanPK implements Serializable{
	private int customerId;
	private int loanId;
	public boolean equals() {
		return false;
	}
	public int hashCode() {
		return 123;
	}
	public CustomerLoanPK(int customerId, int loanId) {
		super();
		this.customerId = customerId;
		this.loanId = loanId;
	}
	public CustomerLoanPK() {
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
}
