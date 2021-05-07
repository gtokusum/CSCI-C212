import java.util.ArrayList;
import java.util.Random;

public class Computer extends Controller{

	private ArrayList<String> lossBoard;
	
	/**
	 * constructor
	 */
	public Computer() {
		this.lossBoard = new ArrayList<String>();
	}
	
	/**
	 * sets the array of losing games
	 * @param stringList
	 */
	public void setLossBoard(ArrayList<String> stringList) {
		this.lossBoard = stringList;
	}
	
	/**
	 * gets the array of losing games
	 * @return ArrayList<String> lossBoard
	 */
	public ArrayList<String> getLossBoard(){
		return lossBoard;
	}

	/**
	 * simulates input 
	 * @param board
	 */
	public void playerInput(String board) {
		int input = this.random();
		
		while (!board.contains(String.valueOf(input) )&& this.compareList(board, input)) {
			input = this.random();
		}
		super.setInput(input);
	}
	
	/**
	 * add losing game to array
	 * @param board
	 */
	public void addToList(String board) {
		this.lossBoard.add(board);
	}
	
	/**
	 * gets random number between 1-9
	 * @return int number
	 */
	public int random() {
		int input = 0;
		Random rand = new Random();
		while (input != 0) {
			input = rand.nextInt(10);
		}
		return input;
	}
	
	/**
	 * compares the current game and checks if game is in lossBoard array
	 * @param board
	 * @param input
	 * @return boolean
	 */
	public boolean compareList(String board,int input) {
		boolean output = false;
		for (int i = 0; i < lossBoard.size();i++) {
			String update = board;
			update.replace(String.valueOf(input), "o");
			if (lossBoard.get(i).equals(update)) {
				output = true;
			}
		}
		return output;
	}
	
	

}
