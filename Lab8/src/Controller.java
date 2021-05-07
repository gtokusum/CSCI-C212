

public abstract class Controller {

	private int input;
	
	/**
	 * constructor
	 */
	public Controller() {
		this.input = 0;
	}
	
	/**
	 * gets input
	 * @return int input
	 */
	public int getInput() {
		return this.input;
	}

	/**
	 * sets the input 
	 * @param int input
	 */
	public void setInput(int input) {
		this.input = input;
	}
	
}
