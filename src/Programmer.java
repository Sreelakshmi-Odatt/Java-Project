/*
 File name: Programmer.java
 Author: Sreelakshmi Odatt Venu 

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


}
