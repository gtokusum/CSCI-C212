
public class GetReward {

	public static boolean checkElig(String input) {
		//initialize variables
		int countA = 0;
		boolean countConseq = false;
		
		//iterate through input
		for (int i = 0; i < input.length()-2;i++) {
		
			//if char at i is A add to count
			if(input.charAt(i) == 'A') {
				countA++;
			}
			
			//check if more than 2 consecutive lates
			if (input.charAt(i) == 'L' && input.charAt(i+1) == 'L' && input.charAt(i+2) == 'L'){
				countConseq = true;
			}
		}
		return countA < 2 && !countConseq;
	}
	
	
	public static void main(String[] args) {
		boolean test = GetReward.checkElig("PAPLPLLP");
		System.out.println(test);

	}

}
