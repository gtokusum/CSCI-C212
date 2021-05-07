import java.util.*;

/**
	 * driver and tester for Data,Measurable and Person
	 */
public class MeasureableTester {

	
	public static void main(String[] args) {
		Person[] inOrder= new Person[5];
		inOrder[0] = new Person("Jack",72.3);
		inOrder[1] = new Person("Tyrone",107.34);
		inOrder[2] = new Person("Shrek",239);
		inOrder[3] = new Person("Adam",183.4);
		inOrder[4] = new Person("Kelly",134.59);
		Measurable[] people = inOrder;
		double averageHeight = Data.average(people);
		System.out.println("Average height: "+averageHeight);
		Arrays.sort(inOrder);
		System.out.println("Name in decending height");
		for(Person obj: inOrder) {
			System.out.println(obj.getName());
		}
	}
}
