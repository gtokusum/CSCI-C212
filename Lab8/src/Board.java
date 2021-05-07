

public class Board {

	private String row1;
	private String row2;
	private String row3;
	private int[] spots;
	
	/**
	 * constructor
	 */
	public Board() {
		this.row1 = "1|2|3";
		this.row2 = "4|5|6";
		this.row3 = "7|8|9";
		int[] nums = {1,2,3,4,5,6,7,8,9};
		this.spots = nums;
	}
	
	/**
	 * gets spots remaining 
	 * @return int[] spots
	 */
	public int[] getSpots() {
		return spots;
	}


	/**
	 * sets spots
	 * @param spots
	 */
	public void setSpots(int[] spots) {
		this.spots = spots;
	}

	/**
	 * prints board
	 * @return board
	 */
	public String getBoard() {
		return row1 + "\n" + "-----\n" + row2 + "\n" + "-----\n" + row3 + "\n";
	}
	
	/**
	 * updates board when move is played
	 * @param int spot
	 * @param String sign
	 */
	public void updateBoard(int spot, String sign) {
		if (spot <= 3 && spot >=1) {
			row1 = row1.replace(String.valueOf(spot), sign);
		}
		else if(spot >= 4 && spot <= 6) {
			row2 = row2.replace(String.valueOf(spot), sign);
		}
		else {
			row3 = row3.replace(String.valueOf(spot), sign);
		}
	}
	
	/**
	 * clears board 
	 */
	public void clearBoard() {
		this.row1 = "1|2|3";
		this.row2 = "4|5|6";
		this.row3 = "7|8|9";
	}
	
	/**
	 * check for winner
	 * @return String statement of who won 
	 */
	public String getWinner() {
		if (row1.equals("x|x|x")) {
			return "Player has won!";
		}
		else if (row2.equals("x|x|x")) {
			return "Player has won!";
		}
		else if (row3.equals("x|x|x")) {
			return "Player has won!";
		}
		else if(row1.equals("o|o|o")) {
			return "Computer has won!";
		}
		else if(row2.equals("o|o|o")) {
			return "Computer has won!";
		}
		else if(row3.equals("o|o|o")) {
			return "Computer has won!";
		}
		else if(row1.substring(0,1).equals("x") && row2.substring(2,3).equals("x") && row3.substring(row3.length()).equals("x")) {
			return "Player has won!";
		}
		else if(row1.substring(0,1).equals("o") && row2.substring(2,3).equals("o") && row3.substring(row3.length()).equals("o")) {
			return "Computer has won!";
		}
		else if(row3.substring(0,1).equals("x") && row2.substring(2,3).equals("x") && row1.substring(row3.length()).equals("x")) {
			return "Player has won!";
		}
		else if(row3.substring(0,1).equals("o") && row2.substring(2,3).equals("o") && row1.substring(row3.length()).equals("o")) {
				return "Computer has won!";
		}
		else {
			return "";
		}
		
	}

}
