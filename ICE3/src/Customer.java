/**
 * 
 * @author gakutokusumi
 *
 *This class stores customer information when they purchase a car
 */
public class Customer {
	
	private String name;
	private String city;
	private String date;
	private double price;
	private int vehicleID;
	/**
	 * 
	 * @param name name of customer
	 * @param city city of dealership
	 * @param date date of purchase
	 * @param price price of car
	 * @param ID ID of car
	 * 
	 * constructor
	 */
	public Customer(String name, String city, String date) {
		this.name = name;
		this.city = city;
		this.date = date;
		this.price = 0;
		this.vehicleID = 0;
	}
	
	/**
	 * constructor with no args
	 */
	public Customer() {
		this.name = "";
		this.city = "";
		this.date = "";
		this.price = 0;
		this.vehicleID = 0;
	}
	
	/**
	 * get name of customer
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set name of customer
	 * @param name name of customer
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get city of dealership/sale
	 * @return String city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * set city of sale
	 * @param city city of dealership
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * get date of sale
	 * @return String date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * set date of sale
	 * @param date date of purchase
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * get price of car
	 * @return double price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * set price of car
	 * @param price price of car
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * get uique ID of car sold
	 * @return int ID
	 */
	public int getVehicleID() {
		return vehicleID;
	}

	/**
	 * set ID of car 
	 * @param vehicleID ID of car
	 */
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	
	/**
	 * get customer data
	 * @return string of data of customer
	 */
	public String getAll() {
		return "Date: " + this.getDate() + " City: " + this.getCity() +" Name: " + this.getName() +" Price: " + this.getPrice() +" ID: "+ this.getVehicleID();
	}
	
}
