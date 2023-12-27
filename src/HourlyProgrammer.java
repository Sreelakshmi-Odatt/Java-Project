/*
 File name: HourlyProgrammer.java
 Author: Sreelakshmi Odatt Venu 

 Description:This is is the HourlyProgrammer class which extends from  the Programmer class .
 */

/**
 * This is is the HourlyProgrammer class which extends from the Programmer class
 * .
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */

public class HourlyProgrammer extends Programmer {
	/**
	 * // wage per hour
	 */
	private double wage;
	/**
	 * hours worked for week
	 */
	private double hours; 

	/**
	 * constructor for the HourlyProgrammer
	 * 
	 * @param firstName the firstname
	 * @param lastName the lastname
	 * @param socialSecurityNumber the  socialSecurityNumber
	 * @param wage the wage 
	 * @param hours teh hours
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	}

	/**
	 * set wage
	 * 
	 * @param wage the wage 
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}

	/***
	 * return wage
	 * 
	 * @return wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * set hours worked
	 * 
	 * @param hours the hours worked 
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

	/**
	 * return hours worked
	 * 
	 * @return hours
	 */
	public double getHours() {
		return hours;
	}

//calculate earnings; override abstract method earnings in Programmer
	

	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	/**
	 * return String representation of HourlyProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(" \nhourly programmer: " + getFirstName() + getLastName() + "\n"
				+ "social security number: " + getSocialSecurityNumber() + " \nhourly wage:" + getWage()
				+ " hours worked:" + getHours() + "\n" + "payment due: $" + String.format("%.2f", getPaymentAmount()));
	}

}
