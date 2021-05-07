import java.util.ArrayList;


public class VendingMachine {

	private ArrayList<Item> items;
	private double cashBalance;
	private double tmpBalance;
	
	/**
	 * constructor
	 * @param ArrayList<Item> items list
	 * @param double cashBalance
	 */
	public VendingMachine(ArrayList<Item> items, double cash) {
		this.items = items;
		this.cashBalance = cash;
		this.tmpBalance = 0;
	}
	
	/**
	 * default constructor
	 */
	public VendingMachine() {
		this.items = new ArrayList<Item>();
		this.cashBalance = 0;
		this.tmpBalance = 0;
	}

	/**
	 * gets the list of items
	 * @return ArrayList<Item> items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}

	/**
	 * sets the list of items
	 * @param ArrayList<Item> items
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	/**
	 * gets the cash balance 
	 * @return double cashBalance
	 */
	public double getCashBalance() {
		return cashBalance;
	}

	/**
	 * sets the cash balance
	 * @param double cashBalance
	 */
	public void setCashBalance(double cashBalance) {
		this.cashBalance = cashBalance;
	}
	
	/**
	 * sets tmp balance
	 * @param double balance
	 */
	public void setTmpBalance(double balance) {
		this.tmpBalance = balance;
	}
	
	/**
	 * gets tmpBalance
	 * @return double tmpBalance
	 */
	public double getTmpBalance() {
		return tmpBalance;
	}
	
	/**
	 * adds cash to tmpBalance
	 * @param cash
	 */
	public void add(double cash) {
		this.tmpBalance += cash;
	}
	
	/**
	 * subtracts cash from tmpBalance
	 * @param cash
	 */
	public void minus(double cash) {
		this.tmpBalance -= cash;
	}
	
	/**
	 * adds item to vending machine list
	 * @param Item item
	 */
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	/**
	 * removes item 
	 * @param int index 
	 */
	public void removeItem(int option) {
		this.items.remove(option);
	}
	
	/**
	 * buy method
	 * @param option
	 * @return String 
	 */
	public String buy(int option) {
		Item toBuy = null;
		int i = 0;
		while (i <= items.size()) {
			if (items.get(i).getOption_number() == option) {
				toBuy = items.get(i);
				items.remove(i);
				break;
			}
			if (i == items.size()) {
				return "Item not available";
			}
			i++;
		}
		if (toBuy.getPrice() > tmpBalance) {
			return "Not enough Funds";
		}
		else {
			this.cashBalance += tmpBalance;
			tmpBalance = 0;
			toBuy.minus(1);
			this.addItem(toBuy);
			return "Item bought";
		}
	}
		
		/**
		 * finds item's index with option number
		 * @return int index
		 */
		public int findItemIndex(int option) {
			for (int i = 0; i < items.size();i++) {
				if (items.get(i).getOption_number() == option) {
					return i;
				}
			}
			return 0;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
