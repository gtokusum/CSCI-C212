
public class SalariedEmployee extends Employee{

	private double basePay;
	
	
	/**
	 * overloaded constructor
	 * @param String firstName
	 * @param String lastName
	 * @param String birthdate
	 * @param String employeeID
	 * @param String jobTitle
	 * @param String company
	 * @param String employeeType
	 * @param String basePay
	 */
	public SalariedEmployee(String firstName, String lastName, String birthdate, String employeeID, String jobTitle,
			String company, String employeeType,double basePay) {
		super(firstName, lastName, birthdate, employeeID, jobTitle, company, employeeType);
		this.basePay = basePay;
	}
	
	/**
	 * default constructor
	 */
	public SalariedEmployee() {
		super();
		this.basePay = 0;
	}

	/**
	 * gets the base pay amount
	 * @return double basePay
	 */
	public double getBasePay() {
		return basePay;
	}

	
	/**
	 * sets the base pay amount
	 * @param double basePay
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	@Override
	public double getAnnualSalary() {
		// TODO Auto-generated method stub
		return this.basePay;
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
