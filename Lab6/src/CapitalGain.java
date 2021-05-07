import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * class to buy and sell stock and compute the capital gain
 * @author gakutokusumi
 *
 */
public class CapitalGain {

	private ArrayList<Stock> portfolio;
	private double income;
	private boolean isMarried;//true if filing joint, false if filing single
	
	/**
	 * consturctor
	 * @param double income
	 * @param boolean isMarried
	 */
	public CapitalGain(double income, boolean isMarried) {
		this.income = income;
		this.isMarried = isMarried;
		this.portfolio = new ArrayList<Stock>();
	}
	
	/**
	 * method to buy a stock
	 * @param Stock stock
	 */
	public void buyStock(Stock stock) {
		portfolio.add(stock);
	}
	
	/**
	 * returns String format of Stocks in portfolio
	 * @return String 
	 */
	public String showPortfolio() {
		String output = "";
		for (int i = 0; i < portfolio.size();i++) {
			output += portfolio.get(i).toString() + "\n";
		}
		return output;
	}
	
	public String sellStock(Stock stock) {
		String ave = Average(stock);
		String lifo = LIFO(stock);
		String fifo = FIFO(stock);
		
		return ave +"\n" +lifo+"\n"+fifo;
	}
	
	public ArrayList<Stock> findStock(Stock stock){
		ArrayList<Stock> output = new ArrayList<Stock>();
		for (Stock i: portfolio) {
			if (i.getTicker().equals(stock.getTicker())) {
				output.add(i);
			}
		}
		return output;
	}
	
	public String Average(Stock stock) {
		ArrayList<Stock> toSell = findStock(stock);
		double purchaseAve = 0;
		int totalQuant = 0;
		for (Stock i:toSell) {
			purchaseAve += i.getQuantity()*i.getPrice();
			totalQuant += i.getQuantity();
		}
		double perShare = purchaseAve/totalQuant;
		double sellPrice = stock.getQuantity() * stock.getPrice();
		int left = totalQuant - stock.getQuantity();
		double profit = sellPrice - perShare*stock.getQuantity();
		return "profit of " + profit + ". You have " +left + " shares left";
	}
	
	public String LIFO(Stock stock) {
		ArrayList<Stock> toSell = findStock(stock);
		Collections.sort(toSell);
		double purchaseAve = 0;
		int totalQuant = 0;
		int i = toSell.size();
		while(totalQuant<stock.getQuantity()) {
			totalQuant += toSell.get(i).getQuantity();
			purchaseAve += totalQuant * toSell.get(i).getQuantity();
		}
		
		return purchaseAve + " ";
	}
	
	public String FIFO(Stock stock) {
		return "";
	}
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter income");
		double income = in.nextDouble();
		System.out.println("Filing status. true for married, false for single");
		boolean status = in.nextBoolean();
		CapitalGain test = new CapitalGain(income,status);
		String menu = "1:Purchase Stock\n2:Show current investments\n3:Sell stock\n4:To quit";
		boolean run = true;
		while (run) {
			System.out.println(menu);
			int choice = in.nextInt();
			if (choice == 1) {
				System.out.println("Enter stock ticker");
				String tick = in.next();
				System.out.println("Stock price");
				double price = in.nextDouble();
				System.out.println("Enter quantity");
				int quant = in.nextInt();
				System.out.println("Date of purchase (MM/DD/YYYY");
				String date = in.next();
				int year = Integer.parseInt(date.substring(6));
				int day = Integer.parseInt(date.substring(3,5));
				int month = Integer.parseInt(date.substring(0,3));
				Stock toAdd = new Stock(tick,price,quant,new DateTime(year,month,day));
				test.buyStock(toAdd);
			}
			else if (choice == 2) {
				test.showPortfolio();
			}
			else if (choice == 3) {
				System.out.println("Enter stock ticker");
				String tick = in.next();
				System.out.println("Stock price");
				double price = in.nextDouble();
				System.out.println("Enter quantity");
				int quant = in.nextInt();
				System.out.println("Date of sell (MM/DD/YYYY");
				String date = in.next();
				int year = Integer.parseInt(date.substring(6));
				int day = Integer.parseInt(date.substring(3,5));
				int month = Integer.parseInt(date.substring(0,3));
				Stock toSell = new Stock(tick,price,quant,new DateTime(year,month,day));
				test.sellStock(toSell);
			}
			else if (choice == 4) {
				run = false;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		
		
		
		in.close();
	}
	
	
}
