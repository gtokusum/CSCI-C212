/**
 * Item class for VendingMachine
 * @author gakutokusumi
 *
 */
public class Item {

	private String name;
	private int option_number;
	private double price;
	private int quantity;
	
	/**
	 * constuctor
	 * @param String name
	 * @param int option option number
	 * @param double price
	 * @param int quant quantity
	 */
	public Item(String name, int option,double price, int quant) {
		this.name = name;
		this.option_number = option;
		this.price = price;
		this.quantity = quant;
	}

	/**
	 * gets name of item 
	 * @return String item
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of item
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * gets the option number of item
	 * @return int option_number
	 */
	public int getOption_number() {
		return option_number;
	}

	/**
	 * sets the option number of item
	 * @param int option_number
	 */
	public void setOption_number(int option_number) {
		this.option_number = option_number;
	}
	/**
	 * gets the price of item
	 * @return double price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * sets the price of item
	 * @param double price 
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * gets the quantity of item
	 * @return int quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * sets the quantity of item
	 * @param int quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Adds quantity to the existing quantity
	 * @param int quantity
	 */
	public void plus(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	/**
	 * removes the specified quantity
	 * @param int quantity
	 */
	public void minus(int quantity) {
		this.quantity -= quantity;
	}

	/**
	 * toString method
	 * @return String description of item
	 */
	public String toString() {
		return this.option_number +": "+this.name; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
