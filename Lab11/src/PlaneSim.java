import java.util.*;

public class PlaneSim {
	

	

	public static void main(String[] args) {
		//initialize variables
		PriorityQueue<Integer> land = new PriorityQueue<Integer>();
		PriorityQueue<Integer> takeoff = new PriorityQueue<Integer>();
		Scanner in = new Scanner(System.in);
		boolean started = true;
		int count = 1;
		
		//simulation loop
		while (started) {
			System.out.print("Enter a Command:");
			String input = in.next();
			if (input.equals("LAND")){
				land.add(count);
				System.out.println("Plane " + count + " added to landing queue");
				count++;
			}
			else if(input.equals("TAKEOFF")) {
				if(takeoff.isEmpty()) {
					System.out.println("No planes in takeoff queue");
				}
				else {
					int num = takeoff.poll();
					System.out.println("Plane " + num + " has taken off");
				}
			}
			else if(input.equals("NEXT")) {
				if (!land.isEmpty()) {
					int num = land.poll();
					System.out.println("Plane " + num + " has landed and is ready for takeoff");
					takeoff.add(num);
				}
				else if (land.isEmpty() && !takeoff.isEmpty()) {
					int num = takeoff.poll();
					System.out.println("Plane " + num + " has taken off");
				}
				else {
					System.out.println("No planes in queue");
				}
			}
			else if(input.equals("EXIT")) {
				started = false;
			}
			else {
				System.out.println("Command not valid");
			}
			
		}
		
		
		
		
		in.close();
	}

}
