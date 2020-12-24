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
		person.setPersonName("Rockey");
		person.setPersonCity("indore");
		person.setPersonAge(21);
		personDao.addOrUpdateAPerson(person);
	}
	

	@Test
	public void updateAPerson() {
		Person person = new Person();
		person.setPersonId(1002);
		person.setPersonName("Mark");
		person.setPersonCity("maxico");
		person.setPersonAge(30);
		personDao.addOrUpdateAPerson(person);
	}
	@Test
	public void addANewPersonWithNewAPassport() { //if a person get added , a passport shd also get added
		Person person = new Person();
		person.setPersonName("Anjum");
		person.setPersonCity("Hyderabad");
		person.setPersonAge(22);
		
		Passport passport = new Passport();
		passport.setNationality("India");
		passport.setValidFrom(LocalDate.of(2005,12,04));
		passport.setValidTill(LocalDate.of(2015, 12, 03));
		
		person.setPassport(passport);//assigning person a passport
		passport.setPerson(person);
		personDao.addOrUpdateAPerson(person);
	}

	@Test
	public void addAPassportWithAPerson() {
		Passport passport = new Passport();
		passport.setNationality("Australia");
		passport.setValidFrom(LocalDate.of(1999, 10, 02));
		passport.setValidTill(LocalDate.of(2009, 10, 01));

		Person person = personDao.FindPersonById(1006);
		if (person.getPassport() == null) {
			passport.setPerson(person); // assigning passport to a person
			personDao.addOrUpdateAPassportWithAPerson(passport);
		} else {
			System.out.println("person already hv passport");
		}

	}

}
