package com.lti.main;

import java.util.Iterator;
import java.util.List;
//import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.dao.CustomerDao;
import com.lti.dao.PersonDao;
import com.lti.model.Customer;
import com.lti.model.Person;

public class MainClass {
	public static void main(String[] args) {
	//	PersonDao personDao = new PersonDao();
		
//		Person p = new Person();
//		p.setPersonName("Chris");
//		p.setPersonAge(18);
//		p.setPersonCity("NYC");
//	
//		personDao.addAperson(p);
//		System.out.println("Person Added");
//		
//		p = new Person();
//		p.setPersonName("Steve");
//		p.setPersonAge(42);
//		p.setPersonCity("USA");
//		personDao.addAperson(p);
//		System.out.println("Person Added");
//		
//		p = new Person();
//		p.setPersonName("chandler");
//		p.setPersonAge(27);
//		p.setPersonCity("Florida");
//		personDao.addAperson(p);
//		System.out.println("Person Added");
		
//		Person p = new Person();
//		p.setPersonName("MrBeast");
//		p.setPersonAge(32);
//		p.setPersonCity("california");
//		personDao.addAperson(p);
//		System.out.println("Person Added");
		
//		System.out.println("Update in table");
//		Person person = new Person();
//		person.setPersonId(13);  
//		person.setPersonName("Ironman");
//		person.setPersonAge(42);
//		person.setPersonCity("Malibu");
//		personDao.updateAperson(person);
//		System.out.println("Person Updated....");
		
//		System.out.println("Find by ID");
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter id : ");
//		int id = sc.nextInt();
//		Person person=personDao.findPersonById(id);
//		if(person !=null)
//			System.out.println(person.getPersonName()+" "+person.getPersonCity());
//		else
//			System.out.println("Person not found..");
		
		
		// List all Persons
//		List<Person> persons= personDao.viewAllPerson();
//		Iterator<Person> items = persons.iterator();
//		while(items.hasNext())
//		{
//			Person p = items.next();
//			System.out.println(p.getPersonId()+" "+p.getPersonName()+" "+p.getPersonAge()+" "+p.getPersonCity());
//		}
//		
		CustomerDao dao = new CustomerDao();
//		Customer c = new Customer();
//		c.setCustomerName("Ashlesh");
//		c.setCustomerAge(12);
//		c.setCustomerEmail("ash@lnt.com");
//		c.setPersonCity("Pune");
//		c.setCustomerPhone("916800");
// 		dao.addACustomer(c);
//		System.out.println("Customer Added");
//		
//		c = new Customer();
//		c.setCustomerName("apoorva");
//		c.setCustomerAge(16);
//		c.setCustomerEmail("apu@lnt.com");
//		c.setPersonCity("nashik");
//		c.setCustomerPhone("989770");
// 		dao.addACustomer(c);
//		System.out.println("Customer Added");
		
//		Customer j = new Customer();
//		j.setCustomerId(1001);
//		j.setCustomerName("Ashleshuk");
//		j.setCustomerAge(12);
//		j.setCustomerEmail("ashuk@lnt.com");
//		j.setPersonCity("Puneri");
//		j.setCustomerPhone("916800");
// 		dao.updateACustomer(j);
//		System.out.println("Customer Updated");
//		
//		System.out.println("Customer by ID");
//		Customer cs=dao.findCustomerById(1002);
//		if(cs !=null)
//			System.out.println(cs.getCustomerName()+" "+cs.getCustomerEmail());
//		else
//			System.out.println("Customer not found..");
//		
//		System.out.println("All Customer List");
//		List<Customer> clist= dao.viewAllCustomer();
//		Iterator<Customer> items = clist.iterator();
//		while(items.hasNext())
//		{
//			Customer c = items.next();
//			 System.out.println(c);
//		}
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		tx.commit();
	}
}
