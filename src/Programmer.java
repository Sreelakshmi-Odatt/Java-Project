/*
 File name: Programmer.java
 Author: Sreelakshmi Odatt Venu 
 Student number: 041093516
 Course: CST8284 – OOP
 Assignment: Lab 5
 Date: 10/16/2023
 Professor: Veda Vasavi Erukulla
 Description:This is is the  abstract Programmer superclass class which implements  the Payme interface .
 */
/**
 * This is is the abstract Programmer superclass class which implements the
 * Payme interface .
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */

public abstract class Programmer implements Payme {
	/**
	 * decleration of the firstName
	 */
	private String firstName;
	/**
	 * decleration of the lastName
	 */
	private String lastName;
	/**
	 * decleration of the socialSecurityNumber
	 */
	private String socialSecurityNumber;

	/**
	 * the three argument constructor
	 * 
	 * @param first the firstname
	 * @param last  the lastname
	 * @param ssn   the social security number
	 */
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/***
	 * overloaded constructor
	 * 
	 * @param month the month  
	 * @param year the year 
	 */
	public Programmer(int month, int year) {

	}

	/**
	 * return the firstname
	 * 
	 * @return firstName the firstname
	 */
	public String getFirstName() {
		return firstName;
	};

	/**
	 * return the lastName
	 * 
	 * @return lastName the lastName
	 */
	public String getLastName() {
		return lastName;
	};

	/**
	 * return the socialSecurityNumber
	 * 
	 * @return socialSecurityNumber the socialSecurityNumber
	 */

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	};

	/**
	 * return String representation of Programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	/**
	 * Note: We do NOT implement Payme method getPaymentAmount() here. THEREFORE, TO
	 * AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....?? Answer : We
	 * declare this class as abstract class public abstract double earnings(); /**
	 * No implementation here. DO YOU KNOW WHY? What should this method be? Answer:
	 * abstrract methods does not have any implementations
	 */

}
