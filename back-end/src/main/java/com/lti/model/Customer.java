package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   
@Table(name="tb1_customer")
public class Customer {
	
	@Id
	@SequenceGenerator(name="seq_cust", initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_cust") 
	@Column(name="customer_id")
	int customerId;
	
	@Column(name="customer_name")
	String customerName;
	
	int customerAge;
	String customerEmail;
	String customerCity;
	String customerPhone;
	
		
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
	public String getPersonCity() {
		return customerCity;
	}
	public void setPersonCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerEmail=" + customerEmail + ", personCity=" + customerCity + ", customerPhone=" + customerPhone
				+ "]";
	}
	
}
