/**
 * driver/tester for vending machine
 */
import java.util.Scanner;

public class VendingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Money cash = new Money();
		VendingMachine machine = new VendingMachine();
		machine.addItem(new Item("Snickers",1,1.99,10));
		machine.addItem(new Item("Lays",2,1.99,10));
		machine.addItem(new Item("Crackers",3,.99,10));
		String menu = "To add item press 1\nTo get machine balance press 2\nTo remove Money press 3\nPress 4 to exit";
		boolean on = true;
		while (on) {
			System.out.println(menu);
			int menuChoice = sc.nextInt();
			if (menuChoice == 4) {
				on = false;
			}
			else if (menuChoice == 1) {
				for (int i = 0; i < machine.getItems().size();i++) {
					System.out.println(machine.getItems().get(i).toString());
				}
				System.out.println("To restock press 1\nTo add new item press 2");
				int stock = sc.nextInt();
				if (stock == 1) {
					System.out.println("Enter option number");
					int option = sc.nextInt();
					Item reStock;
					reStock = machine.getItems().get(machine.findItemIndex(option));
					machine.removeItem(option);
					System.out.println("Enter amount to add");
					int amount = sc.nextInt();
					reStock.plus(amount);
					machine.addItem(reStock);
				}
				else if (stock == 2) {
					System.out.println("Enter name, option number, price, and quantity");
					String name = sc.next();
					int option = sc.nextInt();
					double price = sc.nextDouble();
					int qunat = sc.nextInt();
					machine.addItem(new Item(name,option,price,qunat));
				}
				else {
					System.out.println("ERROR: input not registered");
				}
			}
			else if (menuChoice == 2) {
				System.out.println("Cash Balance is "+machine.getCashBalance());
			}
			else if (menuChoice == 3) {
				System.out.println("Removed " + machine.getCashBalance() +" from machine");
				machine.setCashBalance(0);
			}
			else if (menuChoice == 4) {
				boolean moneyEnter = true;
				while (moneyEnter) {
					System.out.println("Enter money\n1 for a dollar\n2 for quarter\n3 for dime\n4 for nickle\n5 for penny\n6 when done");
					int input = sc.nextInt();
					if (input == 6) {
						moneyEnter = false;
					}
					else if (input == 1) {
						machine.add(cash.getDollar());
					}
					else if (input == 2) {
						machine.add(cash.getQuarter());
					}
					else if (input == 3) {
						machine.add(cash.getDime());
					}
					else if (input == 4) {
						machine.add(cash.getNickle());
					}
					else if (input == 5) {
						machine.add(cash.getPenny());
					}
					else {
						System.out.println("ERROR: input not registered");
					}
				}
				System.out.println("Choose option");
				for (int i = 0; i < machine.getItems().size();i++) {
					System.out.println(machine.getItems().get(i).toString());
				}
				int option = sc.nextInt();
				machine.buy(option);
				
			}
			else {
				System.out.println("ERROR: input not registered");
			}
		}
		
		
		
		
		
		sc.close();
	}

}
