package com.infyBank;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locker {
	@Id
	private String LockerId;
	private String lockerType;
	
	public Locker() {
		
	}
	public Locker(String lockerId, String lockerType, Double rent) {
		super();
		LockerId = lockerId;
		this.lockerType = lockerType;
		this.rent = rent;
	}
	public String getLockerId() {
		return LockerId;
	}
	public void setLockerId(String lockerId) {
		LockerId = lockerId;
	}
	public String getLockerType() {
		return lockerType;
	}
	public void setLockerType(String lockerType) {
		this.lockerType = lockerType;
	}
	public Double getRent() {
		return rent;
	}
	public void setRent(Double rent) {
		this.rent = rent;
	}
	private Double rent;
	
	
}
