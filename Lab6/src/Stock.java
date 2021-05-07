/**
 * creates an object of bought stocks 
 * @author gakutokusumi
 *
 */
public class Stock implements Comparable<Stock>{

	private String ticker;
	private double price;
	private int quantity;
	private DateTime date;
	
	/**
	 * constructor
	 * @param String ticker
	 * @param double price
	 * @param int quantity
	 * @param DateTime date
	 */
	public Stock(String ticker, double price, int quantity, DateTime date) {
		this.ticker = ticker;
		this.price = price;
		this.quantity = quantity;
		this.date = date;
	}

	/**
	 * get ticker of stock
	 * @return String ticker
	 */
	public String getTicker() {
		return ticker;
	}

	/**
	 * sets ticker 
	 * @param String ticker
	 */
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	/**
	 * gets the price of stock
	 * @return double price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * set the price of stock
	 * @param double price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * gets the quantity of stocks bought
	 * @return int quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * sets the quantity of stock bought
	 * @param int quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * gets the date at which stock was bought
	 * @return DateTime date
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * sets the date at which the stock was bought
	 * @param DateTime date
	 */
	public void setDate(DateTime date) {
		this.date = date;
	}
	
	/**
	 * @return the String format of Stock 
	 */
	public String toString() {
		return "Date: " + this.date.toString() + " Ticker: " + this.ticker + " Quantity: " + this.quantity + " Price: " + this.price;			
	}
	
	/**
	 * compare 2 stock objects to see if the ticker of the stock is the same
	 * @param Stock stock
	 * @return boolean
	 */
	public boolean isEqual(Stock stock) {
		if (stock.getTicker() == this.getTicker()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * compares instance with another DateTime to see if instance is after argument datetime
	 * @param DateTime date
	 * @return boolean
	 */
	public boolean after(Stock obj) {
		
		if (this.getDate().getYear() > obj.getDate().getYear()) {
			return true;
		}
		else if(this.getDate().getYear() == obj.getDate().getYear() && this.getDate().getMonth() > obj.getDate().getMonth()) {
			return true;
		}
		else if(this.getDate().getYear() == obj.getDate().getYear() && this.getDate().getMonth() == obj.getDate().getMonth() && this.getDate().getDay() > obj.getDate().getDay()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * compares instance with another DateTime to see if instance is before argument DateTime
	 * @param DateTime date
	 * @return boolean
	 */
	public boolean before(Stock obj) {
		if (this.getDate().getYear() < obj.getDate().getYear()) {
			return true;
		}
		else if(this.getDate().getYear() == obj.getDate().getYear() && this.getDate().getMonth() < obj.getDate().getMonth()) {
			return true;
		}
		else if(this.getDate().getYear() == obj.getDate().getYear() && this.getDate().getMonth() == obj.getDate().getMonth() && this.getDate().getDay() < obj.getDate().getDay()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * compares if instance is atleast a year before from argument date
	 * @param DateTime date
	 * @return boolean
	 */
	public boolean pastYear(Stock obj) {
		if (obj.getDate().getYear() - this.getDate().getYear() >= 1 && obj.getDate().getMonth() - this.getDate().getMonth() >= 0 && obj.getDate().getDay() - this.getDate().getDay() >= 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int compareTo(Stock arg0) {
		if (before(arg0)) {
			return -1;
		}else if(after(arg0)) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
