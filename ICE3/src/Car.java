/**
 * 
 * @author gakutokusumi
 *
 *This class stores information of a car
 */
public class Car {
	
	private int year;
	private String make;
	private String model;
	private String condition;
	private double price;
	private int ID;
	/**
	 * 
	 * @param year: int year of model
	 * @param make: String make of car
	 * @param model: String model of make
	 * @param condition: String "new" or "old"
	 * @param price: double price of car
	 * @param ID: unique ID of car
	 * 
	 * constructor
	 */
	public Car(int year, String make, String model, String condition, double price, int ID) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.condition = condition;
		this.price = price;
		this.ID = ID;
	}
	/**
	 * constructor with no args
	 */
	public Car() {
		this.year = 0;
		this.make = "";
		this.model = "";
		this.condition = "";
		this.price = 0;
		this.ID = 0;
	}
	
	/**
	 * @return the year of car
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * set year of car
	 * @param yearm year of car
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * get make of car
	 * @return String make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * set make of car
	 * @param make make of car
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * get model of car
	 * @return String model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * set model of car
	 * @param model model of car
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * get condition of car
	 * @return String condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * set condition of car
	 * @param condition current condition of car
	 */
	public void setCondition(String condition) {
		this.condition = condition;
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
	 * get ID of car
	 * @return int ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * set ID of car
	 * @param iD unique ID of car
	 */
	public void setID(int iD) {
		this.ID = iD;
	}
	
	/**
	 * return a string description of Car
	 * @return String 
	 */
	public String getAll() {
		return "ID: ["+ this.getID() + "] " +this.getCondition() + " " + this.getYear() + " " + this.getMake() + " " + this.getModel() + ": " + this.getPrice();
	}
}
