import java.util.ArrayList;
/**
 * 
 * @author gakutokusumi
 *
 *This is the dealership class that stores inventory and past sales/customers
 */
public class CarDealership {
	
	private ArrayList<Car> inventory;
	private ArrayList<Customer> pastCustomers;
	/**
	 * @param inventory inventory of cars 
	 * @param pastCustomers customers that bough a car
	 * 
	 * constructor 
	 */
	public CarDealership() {
		this.inventory = new ArrayList<Car>();
		this.pastCustomers = new ArrayList<Customer>();
	}

	/**
	 * constructor with Car argument, adds car to inventory
	 * @param car Car
	 */
	public CarDealership(Car car) {
		this.inventory.add(car);
		pastCustomers = new ArrayList<Customer>();
	}
	
	/**
	 * adds car to inventory
	 * @param car Car
	 */
	public void addCar(Car car) {
		this.inventory.add(car);
	}
	
	/**
	 * remove car from inventory
	 * @param vehicle ID
	 */
	public void removeCar(int ID) {
		for (int i = 0; i < this.inventory.size(); i++) {
			if (this.inventory.get(i).getID() == ID) {
				this.inventory.remove(i);
				break;
			}
		}
	}
	
	/**
	 * adds customer to pastCustomer
	 * @param cust
	 */
	public void addCustomer(Customer cust) {
		this.pastCustomers.add(cust);
	}
	
	/**
	 * prints each car in inventory
	 */
	public void printInventory() {
		for (int i = 0;i < this.inventory.size();i++) {
			System.out.println(this.inventory.get(i).getAll());
		}
	}
	
	/**
	 * prints all past customers
	 */
	public void printCustomers() {
		for (int i = 0; i < this.pastCustomers.size(); i++) {
			System.out.println(this.pastCustomers.get(i).getAll());
		}
	}
	
	/**
	 * prints customer that bought car with Car ID
	 * @param car ID
	 */
	public void printCustomers(int ID) {
		Customer tmpCust = new Customer();
		for (int i = 0; i < this.pastCustomers.size(); i++) {
			if (this.pastCustomers.get(i).getVehicleID() == ID) {
				tmpCust = this.pastCustomers.get(i);
				break;
			}
		}
		System.out.println(tmpCust.getAll());
	}
	
	/**
	 * make sale 
	 * @param Customer cust, ID of car
	 */
	public void makeSale(Customer cust, int ID){
		Car tmpCar = new Car();
		for (int i = 0; i < this.inventory.size();i++) {
			if (this.inventory.get(i).getID() == ID) {
				tmpCar = this.inventory.get(i);
				this.removeCar(ID);
				break;
			}
		}
		cust.setVehicleID(ID);
		cust.setPrice(tmpCar.getPrice());
		this.addCustomer(cust);
		System.out.println("Sale Complete");
	}
	 
	public static void main(String[] args) {
		CarDealership test = new CarDealership();
		Car car1 = new Car(2020, "Honda","Civic","new",20000.99,1);
		Car car2 = new Car(2008,"Ford","Explorer","old",10000.99,2);
		test.addCar(car1);
		test.addCar(car2);
		test.printInventory();
		Customer cust1 = new Customer("Jack","Bloomington","1/1/21");
		test.makeSale(cust1, 1);
		test.printCustomers(1);
		test.printInventory();
	}
}
