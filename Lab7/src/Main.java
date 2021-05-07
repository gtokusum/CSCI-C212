import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void inOrder(ArrayList<Employee> list) {
		ArrayList<Employee> output = new ArrayList<Employee>();
		ArrayList<Employee> tmpList = list;
		while(tmpList.size() != 0) {
			Employee tmpEmp = tmpList.get(0);
			int index = 0;
			for (int i = 0; i < tmpList.size();i++) {
				if (tmpEmp.getAnnualSalary() < tmpList.get(i).getAnnualSalary()) {
					tmpEmp = tmpList.get(i);
					index = i;
				}
			}
			output.add(tmpEmp);
			tmpList.remove(index);
		}
		System.out.println("Salary in decending order.");
		for (int i = 0; i < output.size();i++) {
			System.out.println(output.get(i).getFirstName() +" " + output.get(i).getLastName() + ": " + output.get(i).getAnnualSalary());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		String empInfoSalary = "First name: \nLast name: \nBirthDate: \nCompany: \nTitle:"
				+ " \nID: \nAnnualSalary: ";
		String empInfoCommission = "First name: \nLast name: \nBirthDate: \nCompany: \nTitle:"
				+ " \nID: \nAnnualSalary: \nCommission percent: \nSales total: ";
		String empInfoHourly = "First name: \nLast name: \nBirthDate: \nCompany: \nTitle:"
				+ " \nID: \nNumber of hours worked: \nPay rate: ";
		System.out.print("Enter the number of Employees: ");
		int num = sc.nextInt();
		int count = 0;
		while (count < num) {
			System.out.print("Enter pay type: ");
			String empType = sc.next();
			if (empType.equals("Salaried")) {
				System.out.println(empInfoSalary);
//				System.out.print("First Name: ");
				String first = sc.next();
//				System.out.print("\nLast Name: ");
				String last = sc.next();
				String birth = sc.nextLine();
				String company = sc.nextLine();
				String title = sc.nextLine();
				sc.nextLine();
				int tmpID = sc.nextInt();
				double salary = sc.nextDouble();
				String ID = String.valueOf(tmpID);
				SalariedEmployee emp = new SalariedEmployee(first,last,birth,ID,title,company,"Salaried",salary);
				empList.add((Employee)emp);
			}
			else if(empType.equals("Commission")) {
				System.out.println(empInfoCommission);
				String first = sc.next();
				String last = sc.next();
				String birth = sc.nextLine();
				String company = sc.nextLine();
				String title = sc.nextLine();
				sc.nextLine();
				int tmpID = sc.nextInt();
				double salary = sc.nextDouble();
				double percent = sc.nextDouble();
				double sales = sc.nextDouble();
				String ID = String.valueOf(tmpID);
				CommissionEmployee emp = new CommissionEmployee(first,last,birth,ID,title,company,empType,salary,sales,percent);
				empList.add((Employee)emp);
			}
			else {
				System.out.println(empInfoHourly);
				String first = sc.next();
				String last = sc.next();
				String birth = sc.nextLine();
				String company = sc.nextLine();
				String title = sc.nextLine();
				sc.nextLine();
				int tmpID = sc.nextInt();
				int hours = sc.nextInt();
				double payRate = sc.nextDouble();
				String ID = String.valueOf(tmpID);
				HourlyEmployee emp = new HourlyEmployee(first,last,birth,ID,title,company,empType,payRate,hours);
				empList.add((Employee)emp);
			}
			count++;
		}
		sc.close();
		inOrder(empList);
	}

}
