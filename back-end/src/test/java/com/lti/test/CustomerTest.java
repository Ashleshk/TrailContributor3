package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.model.Address;
import com.lti.model.Customer;
import com.lti.model.Passport;
import com.lti.model.Person;

public class CustomerTest {
	CustomerDao c_dao = new CustomerDao();

	@Test
	public void addACustomer() {
		Customer customer = new Customer();
		customer.setCustomerName("steve");
		customer.setCustomerCity("pune");
		customer.setCustomerPhone(321);

		c_dao.addOrUpdateACustomer(customer);
	}
	@Test
	public void addANewCustomerWithNewAAddress() { //if a person get added , a passport shd also get added
		Customer customer = new Customer();
		customer.setCustomerName("Mark");
		customer.setCustomerCity("Bhopal");
		customer.setCustomerPhone(231);
		
		Address address = new Address();
		address.setCity("bhopal");
		address.setHouseNo(401);
		address.setLandmark("Hotel22");
		address.setState("AP");

		customer.setAddress(address);
		address.setCustomer(customer);
		c_dao.addOrUpdateACustomer(customer);
	}
	


	@Test
	public void addAAddressWithACustomer() {
		Address address = new Address();
		address.setCity("HBD");
		address.setHouseNo(404);
		address.setLandmark("Hotel12");
		address.setState("MP");

		Customer customer = c_dao.FindcustomerById(107);
		if (customer.getAddress() == null) {
			address.setCustomer(customer); // assigning passport to a person
			c_dao.addOrUpdateACustomerWithAddress(address);
		} else {
			System.out.println("customer already hv address");
		}

	}

}
