
/*
 File name: Invoice.java
 Author: Sreelakshmi Odatt Venu 

 Description:This is is the invoice class .
 */

/**
 * This is is the invoice class .
 * 
 * @author SREELAKSHMI ODATT VENU.
 * @version 1.0
 * @since javac 17.0.7
 */


public class Invoice implements Payme {
/**
 * decleration of partNumber 
 */
	private String partNumber;
	/**
	 * decleration of partDescription 
	 */
	private String partDescription;
	/**
	 * decleration of quantity 
	 */
	private int quantity;
	/**
	 * decleration of pricePerItem 
	 */
	private double pricePerItem;

/**
 * four-argument constructor
 * @param part the part 
 * @param description the description 
 * @param count the description 
 * @param price the price 
 */
	public Invoice(String part, String description, int count, double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}

/**
 * set the partnumber
 * @param part the part number
 */
	public void setPartNumber(String part) {
		partNumber = part; // should validate
	}

/**
 * get part number
 * @return partNumber
 */
	public String getPartNumber() {
		return partNumber;
	}

/**
 * set description
 * @param description the description of the part 
 */
	public void setPartDescription(String description) {
		partDescription = description; // should validate
	}

/**
 * get description
 * @return description
 */
	public String getPartDescription() {
		return partDescription;
	}

/**
 * set quantity
 * @param count the quantity 
 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

/**
 * get quantity
 * @return quantity
 */
	public int getQuantity() {
		return quantity;
	}

/**
 * set price per item
 * @param price the price 
 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

/**
 * get price per item
 * @return  pricePerItem 
 */
	public double getPricePerItem() {
		return pricePerItem;
	}

/**
 * return String representation of Invoice object
 */
	@Override
	public String toString() {
		return String.format(" \n%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number", getPartNumber(),
				getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
	}

/**
 * method required to carry out contract with interface Payme
 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
