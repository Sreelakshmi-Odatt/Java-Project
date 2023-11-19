/*
 File name: SalariedProgrammer.java
 Author: Sreelakshmi Odatt Venu 
 Student number: 041093516
 Course: CST8284 – OOP
 Assignment: Lab 5
 Date: 10/16/2023
 Professor: Veda Vasavi Erukulla
 Description:This is is the SalariedProgrammer class which extends from  the Programmer class .
 */

/**
 * This is is the SalariedProgrammer class which extends from the Programmer
 * class .
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */

public class SalariedProgrammer extends Programmer {
	/**
	 * decleration of the  weeklySalary
	 */
	private double weeklySalary;

/**
 * constructor for the SalariedProgrammer
 * @param firstName the firstName
 * @param lastName the lastName
 * @param socialSecurityNumber the socialSecurityNumber
 * @param weeklySalary the weeklySalary
 */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

/**
 * set salary 
 * @param weeklySalary the weekly salary 
 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

/**
 * return salary
 * @return weeklySalary
 */
	public double getWeeklySalary() {
		return weeklySalary;
	}

//calculate earnings; override abstract method earnings in Programmer
	/**
	 * WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	 *  This method overides the getPaymentAmount from the Programmer class and is used to set
	 * the salary for each of the programmers who has diiferent salary .
	 */
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

/**
 * return String representation of SalariedProgrammer object   
 */
	@Override
	public String toString() {
		return String.format(" \nsalaried programmer: " + getFirstName() + getLastName() + "\n"
				+ "social security number: " + getSocialSecurityNumber() + "\n" + "weekly salary: $" + getWeeklySalary()
				+ "\n" + "payment due: $" + String.format("%.2f", getPaymentAmount()));
	}
			
}
