package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.PassengerDao;
import com.lti.model.Passenger;
import com.lti.model.Ticket;
 

public class PassengerTest {

	PassengerDao passengerDao = new PassengerDao();
	@Test
	public void addAPassenger() {
		Passenger passenger = new Passenger();
		passenger.setPassengerName("apu");
		passenger.setPassengerAge(22);
		passenger.setPassengerPhone("12345");
		passengerDao.addOrUpdateAPassenger(passenger);
	}
	@Test
	public void updateAPassenger(){
		Passenger passenger = new Passenger();
		passenger.setPassengerName("Apurva");
		passenger.setPassengerId(900);
		passenger.setPassengerAge(18);
		passenger.setPassengerPhone("123456789");
		passengerDao.addOrUpdateAPassenger(passenger);
	}
	@Test
	public void updateATicketDetails(){
		Ticket ticket = new Ticket();
		ticket.setPrice(200);
		ticket.setTicketNo(200);
		ticket.setDestination("Nagpur");
		ticket.setTravelDate(LocalDate.of(2005, 6, 25));
		
		Passenger passenger = passengerDao.findPassengerById(901);
		passenger.setTicket(ticket);
		ticket.setPassenger(passenger);
		passengerDao.addOrUpdateAPassenger(passenger);
		 
	}
	
	@Test
	public void findPassengerById(){
		 passengerDao.findPassengerById(900);
		//System.out.println(p);
	}
	@Test
	public void findTicketById(){
		 passengerDao.findTicketById(201);
		//System.out.println(t);
	}
	
	@Test
	 public void addNewPassengerWithNewTicket(){
		Passenger passenger = new Passenger();
		passenger.setPassengerName("Ap00rrva");
		passenger.setPassengerAge(18);
		passenger.setPassengerPhone("123456789");
		
		Ticket ticket = new Ticket();
		ticket.setPrice(2000);
		ticket.setDestination("Nagpur");
		ticket.setTravelDate(LocalDate.of(2005, 12, 25));
		
		passenger.setTicket(ticket);
		ticket.setPassenger(passenger);
		
		passengerDao.addOrUpdateAPassenger(passenger);
		
	}
    
	
	@Test
	public void addATicketWithExistingPassenger(){
		Passenger passenger  = passengerDao.findPassengerById(900);
		
		Ticket ticket = new Ticket();
		ticket.setPrice(2500);
		ticket.setDestination("Dehadun");
		ticket.setTravelDate(LocalDate.of(2005, 2, 25));
		
		passenger.setTicket(ticket);
		ticket.setPassenger(passenger);
		
		passengerDao.addOrUpdateAPassenger(passenger);
	}
	
	@Test
	public void findPassengerDetailsByTicketId() {
		int[] ticketNos = {201, 202, 207 };
		for (int i : ticketNos) {
			Ticket t = passengerDao.findTicketById(i);
			if (t == null) {
				System.out.println("\nNo Ticket booked with Id " + i);
			} else {
				Passenger p = t.getPassenger();
				System.out.print("Name: " + p.getPassengerName() + "\t");
				System.out.print("Age: " + p.getPassengerAge() + "\t");
				System.out.print("Phone: " + p.getPassengerPhone() + "\n");
			}
		}
	}

	@Test
	public void findTicketDetailsByPassengerId() {
		int[] passengerIds = { 101, 102, 103 };
		for (int i : passengerIds) {
			Passenger p = passengerDao.findPassengerById(i);
			if (p == null) {
				System.out.println("\nNo Passenger found with Id" + i);
			} else {
				Ticket t = p.getTicket();
				//System.out.print("Source: " + t.getSource() + "\t");
				System.out.print("Destination: " + t.getDestination() + "\t");
				System.out.print("Travel Date: " + t.getTravelDate() + "\t");
				System.out.print("Price: " + t.getPrice() + "\n");
			}
		}
	}
}
/*addNewPassenger()
 * updateAPassenger()
 * findPassengerById()
 *  addNewPassengerWithNewTicket();
updateATicketDetails()
addATicketWithExistingPassenger()


findTicketById()

findPassengerDetailsByTicketId()
findTicketDetailsByPassengerId()
 * */