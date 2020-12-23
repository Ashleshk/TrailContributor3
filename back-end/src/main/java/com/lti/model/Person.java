package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   // tells obj of this class take part in Object-Persistance
@Table(name="table_person")  //this will specifically tb1_person
public class Person {
	
	@Id                                 //Key attribute of table
	//@GeneratedValue// (auto/identity/sequence) 		//AutoGenerated value only for Primary ID
	//@GeneratedValue(strategy=GenerationType.AUTO) //global sequence
	
	@SequenceGenerator(name="seq_person", initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_person") 
	@Column(name="person_id")
	int personId;
	
	@Column(name="person_name")
	String personName;
	
	int personAge;
	String personCity;
	
	@OneToOne(mappedBy="person") //do not create FK here since 'person' is therein passport
	Passport passport;
		
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", personCity=" + personCity + "]";
	}
	
	 
	
}
