package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   
@Table(name="table_address")
public class Address {

	@Id
	@SequenceGenerator(name="seq_addr", initialValue=100, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_addr") 
	@Column(name="address_id")
	int addressId;
	
	 
	String HouseNo;
	String landmark;
	String city;
	String state;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	 Customer customer;


	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", HouseNo=" + HouseNo + ", landmark=" + landmark + ", city=" + city
				+ ", state=" + state + ", customer=" + customer + "]";
	}
	
}
