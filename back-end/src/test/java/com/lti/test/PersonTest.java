package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.PersonDao;
import com.lti.model.Passport;
import com.lti.model.Person;

public class PersonTest {
	PersonDao personDao = new PersonDao();
	@Test
	public void addAPerson() {
		Person person = new Person();
		person.setPersonName("Apoorva");
		person.setPersonAge(22);
		person.setPersonCity("mumbai");
		personDao.addOrUpdateAperson(person);
	}
	
	@Test
	public void addAPassportWithAPerson(){
		Passport passport = new Passport();
		passport.setNationality("Australia");
		passport.setValidFrom(LocalDate.of(2009, 12, 22));
		passport.setValidTill(LocalDate.of(2029, 12, 21));
		
		Person person = personDao.findPersonById(1001);
		if(person !=null && person.getPassport()==null){
			passport.setPerson(person);
			personDao.addOrUpdateAPassportWithAPerson(passport);
		}else if(person == null){
			System.out.println("Person Not Exist");
		}else{
			System.out.println("Person already has a passport");
		}
		
	}
	
	@Test
	public void UpdateAPerson() {
		Person person = new Person();
		person.setPersonId(1003);
		person.setPersonName("JenniferLo");
		person.setPersonAge(18);
		person.setPersonCity("Calcutta");
		personDao.addOrUpdateAperson(person);
	}

	@Test
	public void FindPersonById() {
		personDao.findPersonById(1003);
	}
	
	@Test
	public void ListAllPersons() {
		personDao.viewAllPerson();
	}
	
	/*
	 we want to add Person, also add Passport along with it 
	*/
	
	@Test
	public void addNewPersonWithNewPassport(){
		Person person = new Person();
		person.setPersonName("JackSparrow");
		person.setPersonAge(20);
		person.setPersonCity("Carribean");
		
		Passport passport = new Passport();
		passport.setNationality("Indian");
		passport.setValidFrom(LocalDate.of(2005, 12, 25));
		passport.setValidTill(LocalDate.of(2050, 11, 26));
		
		//Necessary Lines for Hibernate to cascade obj
		person.setPassport(passport); 
		passport.setPerson(person);
		//Aisa Lines Likhna Padta hai
		//This line Actully give references to each other to cascade
		
		personDao.addOrUpdateAperson(person);
	}
	
	
}
