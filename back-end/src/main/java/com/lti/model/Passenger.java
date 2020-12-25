package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="table_passenger")
public class Passenger {


	@Id
	@SequenceGenerator(name="seq_psg",initialValue=900,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_psg") 
	@Column(name="passenger_id")
	int passengerId;
	String passengerName;
	int passengerAge;
	String passengerPhone;
	
	@OneToOne(mappedBy="passenger",cascade=CascadeType.ALL)
	 Ticket Ticket;

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

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public Ticket getTicket() {
		return Ticket;
	}

	public void setTicket(Ticket ticket) {
		Ticket = ticket;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerPhone=" + passengerPhone + ", Ticket=" + Ticket + "]";
	}
	
	
}
