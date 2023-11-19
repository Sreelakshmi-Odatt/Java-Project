/*
 File name: BasePlusCommissionProgrammer.java
 Author: Sreelakshmi Odatt Venu 
 Student number: 041093516
 Course: CST8284 – OOP
 Assignment: Lab 5
 Date: 10/16/2023
 Professor: Veda Vasavi Erukulla
 Description:This is is the BasePlusCommissionProgrammer class which extends from the CommissionProgrammer class .
 */

/**
 * This is is the BasePlusCommissionProgrammer class which extends from the
 * CommissionProgrammer class .
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer {
	/**
	 * decleration of baseSalary
	 */
	private double baseSalary; // base salary per week

	/**
	 * constructor for the BasePlusCommissionProgrammer
	 * 
	 * @param firstName            the firstName of this programmer
	 * @param lastName             the lastName of this programmer
	 * @param socialSecurityNumber the socialSecurityNumber of this programmer
	 * @param grossSales           the grossSales of this programmer
	 * @param commissionRate       the commissionRate of this programmer
	 * @param baseSalary           the baseSalary of this programmer
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * set base salary
	 * 
	 * @param baseSalary the basse salary
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * return base salary
	 * 
	 * @return baseSalary the basesalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

 
	/**
	 * WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION? This method
	 * overides the getPaymentAmount from the Programmer class and is used to set
	 * the salary for each of the programmers who has diiferent salary .
	 * 
	 */

	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

	/**
	 * return String representation of BasePlusCommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format(" \nbase-plus commission programmer: " + getFirstName() + getLastName() + "\n"
				+ "social security number: " + getSocialSecurityNumber() + "\n" + "gross sales: $" + getGrossSales()
				+ ";" + " commission rate: " + getCommissionRate() + ";" + " base salary: " + getBaseSalary() + "\n"
				+ "payment due: $" + String.format("%.2f", getPaymentAmount()));
	}

//END

}
