package com.lti.dao;
 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 

import com.lti.model.Passenger;
import com.lti.model.Ticket;
 

public class PassengerDao {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;
	
	public void addOrUpdateAPassenger(Passenger passenger){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(passenger);  
		tx.commit();
	}
	public void updateATicketDetails(Ticket ticket)
	{
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(ticket);  
		tx.commit();
	}
	public void addorUpdateATicketWithPassenger(Ticket ticket){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		tx.begin();
		em.merge(ticket);
		tx.commit();
	}
	 
	public Passenger findPassengerById(int passengerId){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
	 
		Passenger passenger = em.find(Passenger.class, passengerId);
		//find work on pk-key only return object of type Person.class if id=personId
		System.out.println(passenger);
		 
		return passenger;
	}
	public Ticket findTicketById(int ticketNo){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
		Ticket ticket = em.find(Ticket.class, ticketNo);
		System.out.println(ticket);
		return ticket;
	}
	
	 
}

