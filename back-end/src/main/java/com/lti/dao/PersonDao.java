package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Passport;
import com.lti.model.Person;

public class PersonDao {

	
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;
	 
	
	/*public void addAperson(Person person){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.persist(person); //add new record in DB table.
		tx.commit();
	}*/
	
	public void addOrUpdateAperson(Person person){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(person); //add or update record in DB table.
		tx.commit();
		//id not in table, so insert with id generated by 
		//generatedvalue
		// if id is present in table, then update record.
	}
	
	public Person findPersonById(int personId){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		Person person = em.find(Person.class, personId);
		//find work on pk-key only return object of type Person.class if id=personId
		return person;
	}
	public List<Person> viewAllPerson(){
		//JPQL(HQL) - if readymade method is not avaliable
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		String jpql ="select p from Person p";
		Query query = em.createQuery(jpql);
		List<Person> persons = query.getResultList();
		return persons;
	}
	
	public void addOrUpdateAPassportWithAPerson(Passport passport){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(passport);
		tx.commit();
	}
}
