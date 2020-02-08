package com.infyBank;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="address")
public class Address {
	@Id
	private String addressId;
	private String addressLine;
	private String district;
	private String state;
	private String pincode;	
	
	Address(){
		
	}
	public Address(String addressId, String addressLine, String district, String state, String pincode) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
