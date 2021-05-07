


public class RandNumGen {
	
	public static String getUniqe(String input) {
		int output = 0;
		for(int i = 1; i < 11; i++) {
			if (input.contains(String.valueOf(i))){
				output++;
			}
		}
		return String.valueOf(output);
	
	}
	
	public static String getFreq(String input) {
		String output = "";
		for (int i = 1; i< 11; i++) {
			if(input.contains(String.valueOf(i))) {
				int tmpCount = 0;
				output += String.valueOf(i)+"->";
				for (int j = 0; j < input.length();j++) {
					if (Character.getNumericValue(input.charAt(j)) == i){
						tmpCount++;
					}
				}
				output += tmpCount + "\n";
			}
		}
		
		return output;
	}
	
	
	public static String deleteMedian(String input) {
		String output = input;
		int ind4 = Integer.parseInt(String.valueOf(output.charAt(4)));
		int ind5 = Integer.parseInt(String.valueOf(output.charAt(5)));
		int median = ((ind4 + ind5)/2) + 1;
		String getRid = ","+median;
		System.out.println(getRid);
		while(output.contains(getRid)) {
			output = output.replace(getRid,"");
		}
		return output;
	}

	public static String generateNumbers(){
		String output = "Input Random Numbers = ";
		String totNumInput = "Total Numbers Entered = 10";
		String unique = "Total unique Numbers = ";
		String freq = "";
		String delete = "Deleting the numbers with Median Frequency.";
		String finNum = "Final Random Numbers = ";
		String nl = "\n";
		int min = 1;
		int max = 10;
		for (int i = 0; i < 10; i++) {
			double toAdd = Math.random() * (max - min + 1) + min;
			if(i != 9) {
				output += String.valueOf((int)toAdd)+",";
			}else {
				output += String.valueOf((int)toAdd);
			}
		}
		unique += RandNumGen.getUniqe(output);
		freq += RandNumGen.getFreq(output);
		finNum = RandNumGen.deleteMedian(output);
		return output + nl + totNumInput + nl + unique + nl + freq + delete + nl +finNum;
	}
	
	public static void main(String[] args) {
		String test = RandNumGen.generateNumbers();
		System.out.println(test);

	}

}
