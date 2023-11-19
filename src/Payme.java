/*
 File name: Payme.java
 Author: Sreelakshmi Odatt Venu 
 Student number: 041093516
 Course: CST8284 – OOP
 Assignment: Lab 5
 Date: 10/16/2023
 Professor: Veda Vasavi Erukulla
 Description:This is is the Payme Interface .
 */

/**
 * This is is the Payme Interface
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */
/**
 * 
 */
public interface Payme {
	/**
	 * the getPaymentAmount method
	 * 
	 * @return no return since it is a interface method Explain the reason why you
	 *         had to change the name of the earning method to getPaymentAmount() in
	 *         each class ? 
	 *         Since we implement the Payme interface in the Programmer
	 *         class , we have to implemenet th egetPaymentAmount() method .
	 * 
	 */
	public double getPaymentAmount();

}
