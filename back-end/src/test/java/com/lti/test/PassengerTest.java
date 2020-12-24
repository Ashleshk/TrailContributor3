package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.PassengerDao;
import com.lti.dao.PersonDao;
import com.lti.model.Passenger;
import com.lti.model.Passport;
import com.lti.model.Person;
import com.lti.model.Ticket;

public class PassengerTest {

	PassengerDao passengerDao = new PassengerDao();

	@Test
	public void addAPassenger() {
		Passenger passenger = new Passenger();
		passenger.setPassengerName("luckey");
		passenger.setPassengerAge(23);
		passenger.setPassengerPhone(321);

		passengerDao.addOrUpdateAPassenger(passenger);
	}

	@Test
	public void addATicketWithExistingPassenger() {
		Ticket t = new Ticket();
		t.setTraveldate(LocalDate.of(2020, 12, 25));
		t.setSource("Mumbai");
		t.setDetination("Pune");
		t.setPrice(2000);

		Passenger passenger = passengerDao.FindPassengerById(1004);
		if (passenger.getTicket() == null) {
			t.setPassenger(passenger); // assigning ticket to a passenger
			passengerDao.addATicketWithExistingPassenger(t);
		} else {
			System.out.println("passenger already hv ticket");
		}

	}

	@Test
	public void addANewPassengerWithNewTicket() { // if a person get added , a passport shd also get added
		Passenger passenger = new Passenger();
		passenger.setPassengerName("Honey");
		passenger.setPassengerAge(24);
		passenger.setPassengerPhone(456);

		Ticket ticket = new Ticket();
		ticket.setDetination("Hyd");
		ticket.setPrice(3000);
		ticket.setSource("rewa");
		ticket.setTraveldate(LocalDate.of(2004, 04, 12));

		passenger.setTicket(ticket);// assigning person a passport
		ticket.setPassenger(passenger);
		;
		passengerDao.addOrUpdateAPassenger(passenger);
	}

	@Test
	public void updateAPassenger() {
		Passenger passenger = new Passenger();
		passenger.setPassengerName("Ronak");
		passenger.setPassengerAge(20);
		passenger.setPassengerPhone(231);
		passenger.setPassengerId(1001);

		passengerDao.addOrUpdateAPassenger(passenger);
	}
	@Test
	public void updateATicketDetails() {
		Ticket t=new Ticket();
		t.setSource("Bhopal");
		t.setDetination("Pachmadi");

		passengerDao.UpdateATicketDetails(t);;
	}

	@Test
	public void findTicketById() {
		Ticket t = new Ticket();
		t = passengerDao.FindTicketById(1001);
		System.out.println(t.getPrice());
	}

	@Test
	public void PassengerById() {
		Passenger p = new Passenger();
		p = passengerDao.FindPassengerById(1005);
		System.out.println(p.getPassengerName());
	}

	@Test
	public void findPassengerDetailsByTicketId() {
		Ticket t = passengerDao.FindTicketById(1002);
		Passenger p = t.getPassenger();
		System.out.println( " passenger name= " + p.getPassengerName());
	}

	@Test
	public void findTicketByPassengerId() {
		Passenger p = passengerDao.FindPassengerById(1004);
		Ticket t = p.getTicket();
		System.out.println("ticket id =" + t.getTicketNo());

	}

}
