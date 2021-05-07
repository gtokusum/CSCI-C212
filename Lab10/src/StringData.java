
public class StringData implements Comparable<StringData>{

	private String word;
	private int length;
	private int count;
	
	/**
	 * constructor
	 * @param word
	 * @param length
	 * @param count
	 */
	public StringData(String word, int length,int count) {
		this.word = word;
		this.length = length;
		this.count = count;
	}

	/**
	 * gets the word
	 * @return String word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * sets the word
	 * @param String word
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * gets the length of word
	 * @return int length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * sets the length of word
	 * @param int length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * gets the count
	 * @return int count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * sets the count 
	 * @param count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * overrides the compareTo method to sort words
	 * @param obj
	 * @return int 
	 */
	@Override
	public int compareTo(StringData obj) {
		// TODO Auto-generated method stub
		if (this.count > obj.getCount()) {
			return 1;
		}
		else if(this.count == obj.getCount()){
			if (this.length > obj.getLength()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
	
}
