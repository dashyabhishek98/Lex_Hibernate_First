package com.infyBank;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;


@Entity
public class CustomerLoan {
	@EmbeddedId
	private CustomerLoanPK pk;
	private int loanIdEligible;
	private int amountAvailed;
	private int tenureInYears;
	public CustomerLoan(CustomerLoanPK pk, int loanIdEligible, int amountAvailed ,int tenureInYears) {
		super();
		this.pk = pk;
		this.loanIdEligible = loanIdEligible;
		this.amountAvailed = amountAvailed;		
		this.tenureInYears = tenureInYears;
	}
	public CustomerLoan() {
		
	}
	public CustomerLoanPK getPk() {
		return pk;
	}
	public void setPk(CustomerLoanPK pk) {
		this.pk = pk;
	}
	public int getLoanIdEligible() {
		return loanIdEligible;
	}
	public void setLoanIdEligible(int loanIdEligible) {
		this.loanIdEligible = loanIdEligible;
	}
	public int getAmountAvailed() {
		return amountAvailed;
	}
	public void setAmountAvailed(int amountAvailed) {
		this.amountAvailed = amountAvailed;
	}	
	public int getTenureInYears() {
		return tenureInYears;
	}
	public void setTenureInYears(int tenureInYears) {
		this.tenureInYears = tenureInYears;
	}
	
}
