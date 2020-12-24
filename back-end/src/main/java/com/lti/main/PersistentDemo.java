package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Person;

public class PersistentDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		/*tx.begin();
		//Transient State
		Person person= new Person();
		person.setPersonName("Jack");
		person.setPersonAge(42);
		person.setPersonCity("Carribean");
		
		//Persistent State
		em.persist(person);  //object "person" is in persistent state
		person.setPersonCity("tortuga");
		person.setPersonAge(33);
		
		tx.commit();*/
		
		
		/*
		tx.begin();
		System.out.println("----Transient State -----");
		Person person= new Person();
		person.setPersonName("Ash");
		person.setPersonAge(22);
		person.setPersonCity("MH");
		 
		System.out.println(person);  //person is java obj
		
		System.out.println("------ persistent State------");
		em.persist(person);         // it is a persistent object now,
									// whatever in DB it, will be here..
		System.out.println(person); 
		person.setPersonAge(25);      
		person.setPersonName("Ashlesh"); //this two are responisble for update query
		System.out.println(person);
		person.setPersonAge(24); //this is also responsible
		System.out.println(person); //only 1 update command before commiyt
		tx.commit();
		
		em.detach(person); //now person obj is in detached state
		
		// 2nd Transaction Scope - but same object use
		tx.begin();
		person.setPersonName("SuperMan");  //person is still in peristent state.
		System.out.println(person);
		
		em.merge(person); //taking object from detach state back to persistent
						  //state temporarilry 
		person.setPersonName("hanuman");
		em.merge(person);
		// we cant use persist here obj, becoz perist require obj to be in
		// transient
		//em.persist(person);  //ERROR : detached entity passed to persist
		//person.setPersonName("batman");
		tx.commit();
		*/
		
		/*Person person= new Person();
		person.setPersonName("Astrology");
		person.setPersonAge(50);
		person.setPersonCity("Maharashtra");
		 
		tx.begin();
			 em.persist(person);
			 em.remove(person);
			 //em.merge(person); //ERROR : deleted instance passed to merge
			 em.persist(person);
		tx.commit();*/
		
		
		Person person= new Person();
		person.setPersonName("space");
		person.setPersonAge(1);
		person.setPersonCity("Nigeria");
		tx.begin();
		 em.persist(person);
		 tx.commit();
	}

}
