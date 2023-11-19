/*
  File name: CommissionProgrammer.java
 Author: Sreelakshmi Odatt Venu 
 Student number: 041093516
 Course: CST8284 – OOP
 Assignment: Lab 5
 Date: 10/16/2023
 Professor: Veda Vasavi Erukulla
 Description:This is is the CommissionProgrammer class which extends from the Programmer class .
 */
/**
 * This is is the CommissionProgrammer class which extends from the Programmer
 * class .
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */

public class CommissionProgrammer extends Programmer {
	/**
	 * declearation of grossSales
	 */
	private double grossSales; // gross weekly sales
	/**
	 * declearation of commissionRate
	 */
	private double commissionRate; // commission percentage

	/**
	 *   constructor 
	 * 
	 * @param firstName            the firstname for this programmer.
	 * @param lastName             the lastname for this programmer.
	 * @param socialSecurityNumber the ocialSecurityNumber for this programmer.
	 * @param grossSales           the grossSales for this programmer.
	 * @param commissionRate       the commissionRate for this programmer.
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {

		super(firstName, lastName, socialSecurityNumber);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * set gross sales amount on the creation of apps
	 * 
	 * @param grossSales the grossSales
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

	/**
	 * return gross sales amount
	 * 
	 * @return grossSales 
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * set commission rate
	 * 
	 * @param commissionRate the commisionRate 
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/**
	 * return commission rate
	 * 
	 * @return commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

//calculate earnings; override abstract method earnings in Programmer.

	/**
	 * WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION? This method
	 * overides the getPaymentAmount from the Programmer class and is used to set
	 * the salary for each of the programmers who has diiferent salary .
	 * 
	 */

	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}

	/**
	 * return String representation of CommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(
				" \ncommission programmer: " + getFirstName() + getLastName() + "\n" + "social security number: "
						+ getSocialSecurityNumber() + "\n" + "gross sales: $" + getGrossSales() + " commission rate: "
						+ getCommissionRate() + "\n" + "payment due: $" + String.format("%.2f", getPaymentAmount()));
	}

}
