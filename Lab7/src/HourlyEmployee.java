
public class HourlyEmployee extends Employee{
	
	
	private double hourlyRate;
	private int numberOfHoursPerWeek;
	
	/**
	 * overloaded constructor
	 * @param String firstName
	 * @param String lastName
	 * @param String birthdate
	 * @param String employeeID
	 * @param String jobTitle
	 * @param String company
	 * @param String employeeType
	 * @param String hourlyRate
	 * @param String NumWeek
	 */
	public HourlyEmployee(String firstName, String lastName, String birthdate, String employeeID, String jobTitle,
			String company, String employeeType, double hourlyRate,int NumWeek) {
		super(firstName, lastName, birthdate, employeeID, jobTitle, company, employeeType);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursPerWeek = NumWeek;
	}
	
	/**
	 * default constructor
	 */
	public HourlyEmployee() {
		super();
		this.hourlyRate = 0;
		this.numberOfHoursPerWeek = 0;
	}

	/**
	 * gets hourly rate
	 * @return double hourly rate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * sets hourly rate
	 * @param double hourlyRate
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * gets the number of hours worked per week
	 * @return int numberOfHoursPerWeek
	 */
	public int getNumberOfHoursPerWeek() {
		return numberOfHoursPerWeek;
	}

	/**
	 * sets the number of hours worked per week
	 * @param int numberOfHoursPerWeek
	 */
	public void setNumberOfHoursPerWeek(int numberOfHoursPerWeek) {
		this.numberOfHoursPerWeek = numberOfHoursPerWeek;
	}

	@Override
	public double getAnnualSalary() {
		// TODO Auto-generated method stub
		return this.hourlyRate * this.numberOfHoursPerWeek * 52;
	}
	
	/**
	 * returns String of annual salary
	 * @return String annualSalary
	 */
	public String toString() {
		return String.valueOf(this.getAnnualSalary());
	}
	
	/**
	 * compares if annual salary is the same
	 * @return boolean
	 */
	public boolean equals(Employee obj) {
		return obj.getAnnualSalary() == this.getAnnualSalary();
	}
}
