package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Passenger {

	
	@Id
	@SequenceGenerator(name="seq_pas",initialValue = 2000,allocationSize = 5)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_pas")
	int passengerId;
	
	String passengerName;
	int passengerAge;
	int passengerPhone;
	
	@OneToOne(mappedBy = "passenger",cascade = CascadeType.ALL)
	Ticket ticket;
	
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(int passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerPhone=" + passengerPhone + "]";
	}
	
	
	
	
}
