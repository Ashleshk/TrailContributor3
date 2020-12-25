package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="table_ticket")
public class Ticket {
	
	@Id
	@SequenceGenerator(name="seq_tick",initialValue=200,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_tick") 
	@Column(name="ticket_id")
	int ticketNo;
	String Destination;
	LocalDate travelDate;
	int price;
	
	@OneToOne   // Passport to person  // 1 passport to 1 person
	@JoinColumn(name="passengerid")
	Passenger passenger;

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
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

 

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", Destination=" + Destination + ", travelDate=" + travelDate
				+ ", price=" + price + ", passengerPhone=" + ", passenger=" + passenger + "]";
	}

}
