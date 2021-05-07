
public class Person {

	private String firstName;
	private String lastName;
	private String birthdate;
	/**
	 * overloaded constructor
	 * @param String firstName
	 * @param String lastName
	 * @param String birthdate
	 */
	public Person(String firstName, String lastName, String birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
	}
	
	/**
	 * default constructor
	 */
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.birthdate = "";
	}

	/**
	 * gets first name
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * sets first name
	 * @param String firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * gets last name
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * sets lastName
	 * @param String lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * gets birth date in string form
	 * @return String birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * sets birthdate
	 * @param String birthdate
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
}
