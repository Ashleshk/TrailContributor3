package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   
@Table(name="table1_customer")
public class Customer {
	
	@Id
	@SequenceGenerator(name="seq_cust", initialValue=501, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_cust") 
	@Column(name="customer_id")
	int customerId;

	String customerName;
	int customerAge;
	String customerEmail;
	String customerCity;
	String customerPhone;
	
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL)
	Address address;
	
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerAge() {
		return customerAge;
	}



	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}



	public String getCustomerEmail() {
		return customerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public String getCustomerCity() {
		return customerCity;
	}



	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}



	public String getCustomerPhone() {
		return customerPhone;
	}



	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerEmail=" + customerEmail + ", personCity=" + customerCity + ", customerPhone=" + customerPhone
				+ "]";
	}
	
}
