package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="table_passport")
public class Passport {

	@Id
	@SequenceGenerator(name="seq_pass",initialValue=10001,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_pass") 
	int passportId;
	
	LocalDate validFrom;
	LocalDate validTill;
	String nationality;
	
	@OneToOne   // Passport to person  // 1 passport to 1 person
	@JoinColumn(name="person_id")  //for the foreignKey changing defaultname;
	Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public LocalDate getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}
	public LocalDate getValidTill() {
		return validTill;
	}
	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", validFrom=" + validFrom + ", validTill=" + validTill
				+ ", nationality=" + nationality + "]";
	}
	
	
}
