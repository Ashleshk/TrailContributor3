package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
@Entity

public class Ticket {

	@Id
	@SequenceGenerator(name =  "seq_tic",initialValue = 1000,allocationSize = 5)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "deq_tic")
	int ticketNo;
	
	String source;
	String destination;
	LocalDate travelDate;
	int price;
	
	@OneToOne
	@JoinColumn(name="passengerId")
	Passenger passenger;
	
	
	
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", source=" + source + ", destination=" + destination + ", travelDate="
				+ travelDate + ", price=" + price + "]";
	}
	
	
	
}
