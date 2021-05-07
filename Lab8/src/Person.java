
public class Person implements Measurable, Comparable<Person>{

	private String name;
	private double height;
	
	/**
	 * constructor
	 * @param String name
	 * @param double height
	 */
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	/**
	 * gets the name of Person
	 * @return String name
	 */
	public String getName() {
		return name;
	}


	/**
	 * sets the name of Person
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the height of Person in cm
	 * @return double height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * sets the height of Person
	 * @param double height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return height of Person for Measurable
	 */
	@Override
	public double getMeasure() {
		return this.height;
	}

	/**
	 * Comparable override to compare height
	 * @param Person arg
	 * @return int 
	 */
	@Override
	public int compareTo(Person arg0) {
		if (this.height < arg0.getHeight()) {
			return 1;
		}
		else if(this.height == arg0.getHeight()) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
