/*
 File name: PaymeInterfaceTest.java
 Author: Sreelakshmi Odatt Venu 
 Student number: 041093516
 Course: CST8284 – OOP
 Assignment: Lab 5
 Date: 10/16/2023
 Professor: Veda Vasavi Erukulla
 Description:This is is the PaymeInterfaceTest class .
 */
/**
 * This is is the PaymeInterfaceTest class .
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */

public class PaymeInterfaceTest {
	/**
	 * This is the entry point for the application. the main method
	 * 
	 * @param args the command line arguments passed to the program.
	 */
	public static void main(String[] args) {

		// TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 

		Payme[] paymeObjects = new Payme[6];
		paymeObjects[0] = new Invoice(" 22776 ", "brakes", 3, 300.00);
		paymeObjects[1] = new Invoice(" 33442", "gear ", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer(" Chioma", " Chidimma", "345-67-0001", 320.00);
		paymeObjects[3] = new HourlyProgrammer(" Amara", " Chukwu", "234-56-7770", 18.95, 40.00);
		paymeObjects[4] = new CommissionProgrammer(" Peter", "Goodman", "123-45-6999", 16500.00, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Sreelakshmi ", " Odatt Venu", " 102-34-5888",
				1200.00, 0.04, 720.00);

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

		// START CODE

		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

		// generically process each element in array paymeObjects

		for (Payme currentPayme : paymeObjects) {
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s \n", currentPayme.toString());

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to
				// BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.05 * oldBaseSalary);
				System.out.printf("new base salary with 5%% increase is: $%,.2f\n", programmer.getBaseSalary());
			} else if (currentPayme instanceof Invoice) {

				Invoice invoice = (Invoice) currentPayme;
				System.out.printf("payment due: %.2f \n", invoice.getPaymentAmount());
			}

		}

// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

	}
}
