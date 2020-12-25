package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.model.Address;
import com.lti.model.Customer;
import com.lti.model.Passport;
import com.lti.model.Person;

public class CustomerTest {

	CustomerDao customerDao = new CustomerDao();
	 
	@Test
	public void addACustomer() {
		Customer c = new Customer();
		c.setCustomerName("ashlesh");
		c.setCustomerAge(22);
		c.setCustomerEmail("ash@lnt.com");
		c.setCustomerCity("mumbai");
		c.setCustomerPhone("12342");
		customerDao.addOrUpdateACustomer(c);
	}
	
	@Test
	public void addAAddresswithCustomer(){
		Address address = new Address();
		address.setCity("Mum");
		address.setHouseNo("C-123");
		address.setState("Karnatka");
		address.setLandmark("Stnad");
		 
		Customer customer = customerDao.findCustomerById(502);
		if(customer != null && customer.getAddress()==null){
			address.setCustomer(customer);
			customerDao.addOrUpdateAAddressWithACustomer(address);
		}else if(customer == null){
			System.out.println("Customer Not Exist");
		}else{
			System.out.println("Customer already has a address");
		}
		
	}
	
	@Test
	public void UpdateACustomer() {
		Customer c = new Customer();
		c.setCustomerName("sanji");
		c.setCustomerId(502);
		c.setCustomerAge(12);
		c.setCustomerEmail("sanj@lnt.com");
		c.setCustomerCity("Puneri");
		c.setCustomerPhone("123456");;
		customerDao.addOrUpdateACustomer(c);
	}

	@Test
	public void FindCustomerById() {
		customerDao.findCustomerById(501);
	}
	
	@Test
	public void ListAllCustomer() {
		customerDao.viewAllCustomer();
	}
	@Test
	public void addNewPersonWithNewPassport(){
		Customer c = new Customer();
		c.setCustomerName("apu");
		c.setCustomerAge(15);
		c.setCustomerEmail("apu@lnt.com");
		c.setCustomerCity("nashik");
		c.setCustomerPhone("15326");
		
		Address address = new Address();
		address.setCity("Mum");
		address.setHouseNo("C-123");
		address.setState("Karnatka");
		address.setLandmark("Stnad");
		
		//Necessary Lines for Hibernate to cascade obj
		c.setAddress(address);
		address.setCustomer(c);
		
		customerDao.addOrUpdateACustomer(c);
	}
	
}
