package com.sapient.aem.service;

import java.time.LocalDate;


/*
 * POJO (Plain Old Java Object) class
 * Default values of the data members:
 * 	Numeric fields: 0 or 0.0
 * 	boolean: false
 *  Reference variables: null
 * 
 */
public class Person implements Comparable<Person> {
	private Long adharCard;
	private String name;
	private LocalDate birthdate;
	private String address;
	private String email;
	private Long mobile;
	private static String colonyName;
	
	static {
		colonyName="Sapient Colony";
	}
	
	
	public Person() {
		
	}


	public Person(Long adharCard) {
		super();
		this.adharCard = adharCard;
	}


	public Person(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}


	public Long getAdharCard() {
		return adharCard;
	}


	public String getName() {
		return name;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public String getAddress() {
		return address;
	}


	public String getEmail() {
		return email;
	}


	public Long getMobile() {
		return mobile;
	}


	public static String getColonyName() {
		return colonyName;
	}


	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public static void setColonyName(String colonyName) {
		Person.colonyName = colonyName;
	}


	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", birthdate=" + birthdate + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}


	@Override
	public int compareTo(Person o) {
		
		return this.getAdharCard().compareTo(o.getAdharCard());
	}
}