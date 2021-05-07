import java.util.*;

public class Quiz implements Comparable<Quiz>{
	
	private int quizNumber;
	private int month;
	private int day;
	private int totalPoints;
	
	public Quiz(int number, int month,int day, int points) {
		this.quizNumber = number;
		this.month = month;
		this.day = day;
		this.totalPoints = points;
	}
	
	
	
	/**
	 * gets quiz number
	 * @return int quiz number
	 */
	public int getQuizNumber() {
		return quizNumber;
	}



	/**
	 * sets quiz number
	 * @param int quizNumber
	 */
	public void setQuizNumber(int quizNumber) {
		this.quizNumber = quizNumber;
	}

	/**
	 * gets the month of due date
	 * @return int month
	 */
	public int getMonth() {
		return this.month;
	}
	
	/**
	 * gets the day of due date
	 * @return int day
	 */
	public int getDay() {
		return this.day;
	}


	/**
	 * sets the month
	 * @param int month
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	
	/**
	 * sets the day
	 * @param int day
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * gets total points
	 * @return int total points
	 */
	public int getTotalPoints() {
		return totalPoints;
	}



	/**
	 * sets total points
	 * @param int totalPoints
	 */
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	/**
	 * makes string format of date
	 * @return string date
	 */
	public String toDate() {
		return this.month + "/" + this.day;
	}

	public String toString() {
		return "Quiz " + this.quizNumber + " due date: " + this.toDate() + " point total: " + this.totalPoints;
	}
	

	@Override
	public int compareTo(Quiz obj) {
		if (this.totalPoints > obj.getTotalPoints()) {
			return -1;
		}
		else if(this.totalPoints == obj.getTotalPoints()) {
			if (this.getMonth() > obj.getMonth()) {
				return -1;
			}
			else if(this.getMonth() == obj.getMonth()) {
				if (this.getDay() > obj.getDay()) {
					return -1;
				}
				else {
					return 1;
				}
			}
			else {
				return 1;
			}
		}
		else {
			return 1;
		}
	}
	
	
	public static void main(String[] args) {
		PriorityQueue<Quiz> test = new PriorityQueue<>();
		test.add(new Quiz(1,1,31,20));
	    test.add(new Quiz(2,2,7,40));
	    test.add(new Quiz(3,2,14,40));
	    test.add(new Quiz(4,2,21,30));
	    test.add(new Quiz(5,2,28,40));
	    test.add(new Quiz(6,3,07,25));
	    test.add(new Quiz(7,3,14,25));
	    test.add(new Quiz(8,3,21,25));
	    test.add(new Quiz(9,3,28,25));
	    test.add(new Quiz(10,4,4,25));
	    test.add(new Quiz(11,4,12,25));
	    test.add(new Quiz(12,4,19,25));
	    test.add(new Quiz(13,4,26,20));
	    test.add(new Quiz(14,5,1,30));
	    
	    Iterator<Quiz> it = test.iterator();
	    while (it.hasNext()) {
	    	System.out.println(it.next().toString());
	    }
	}
	
	
	
	
}
