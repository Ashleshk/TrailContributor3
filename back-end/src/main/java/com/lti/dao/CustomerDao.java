package com.lti.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Address;
import com.lti.model.Customer;
 

public class CustomerDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;
	 
	/*public void addACustomer(Customer c)
	{
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.persist(c);  
		tx.commit();
	}*/
	
	public void addOrUpdateACustomer(Customer c){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(c);  
		tx.commit();
	 
	}
	
	public Customer findCustomerById(int customerId){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		Customer c = em.find(Customer.class, customerId);
		return c;
	}
	public List<Customer> viewAllCustomer(){
 
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		String jpql ="select c from Customer c";
		Query query = em.createQuery(jpql);
		List<Customer> customers = query.getResultList();
		return customers;
	}
	
	public void addOrUpdateAAddressWithACustomer(Address address){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(address);
		tx.commit();
		
	}
}
