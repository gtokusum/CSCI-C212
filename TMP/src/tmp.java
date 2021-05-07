import java.util.*;
public class tmp {

	public tmp() {
		
	}
	
	public static void test(Scanner in) {
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a+b);
	}
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("Enter");
			String first = in.nextLine();
			if (first.equals("yea")) {
				tmp.test(in);
			}
			else if (first.equals("no")) {
				run = false;
			}
			else {
				System.out.println("nope");
			}
		}
	}
}
