/**
 * Vehicle class 
 * stores customer's vehicle info
 */
public class Vehicle {
    
    private String type;
    private String make;
    private String model;
    private int year;

    /**
     * constructor
     * @param String type
     * @param String make
     * @param String model
     * @param String year
     */
    public Vehicle(String type, String make, String model, int year){
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * gets vehicle type
     * @return String type
     */
    public String getType() {
		return type;
	}

    /**
     * sets the type of vehicle
     * @param String type
     */
	public void setType(String type) {
		this.type = type;
	}

    /**
     * gets make of vehicle
     * @return String make
     */
	public String getMake() {
		return make;
	}

    /**
     * sets Make of vehicle
     * @param String make
     */
	public void setMake(String make) {
		this.make = make;
	}

    /**
     * gets model of vehicle
     * @return String model
     */
	public String getModel() {
		return model;
	}

    /**
     * sets the model of vehicle
     * @param String model
     */
	public void setModel(String model) {
		this.model = model;
	}

    /**
     * gets the year of vehicle
     * @return int year
     */
	public int getYear() {
		return year;
	}

    /**
     * sets the year of vehicle
     * @param int year
     */
	public void setYear(int year) {
		this.year = year;
	}

    /**
     * displays string format of vehicle
     * @return String 
     */
    public String toString(){
        return this.year + " " + this.make + " " + this.model + " ";
    }

}
