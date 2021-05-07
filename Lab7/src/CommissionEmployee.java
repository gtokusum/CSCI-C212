
public class CommissionEmployee extends SalariedEmployee{

	private double salesTotal;
	private double commissionPercentage;
	
	/**
	 * default constructor
	 */
	public CommissionEmployee() {
		super();
		this.salesTotal = 0;
		this.commissionPercentage = 0;
	}
	
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
	 * @param String salesTotal
	 * @param String commissionPer
	 */
	public CommissionEmployee(String firstName, String lastName, String birthdate, String employeeID, String jobTitle,
			String company, String employeeType,double basePay,double salesTotal,double commissionPer) {
		super(firstName, lastName, birthdate, employeeID, jobTitle, company, employeeType,basePay);
		this.salesTotal = salesTotal;
		this.commissionPercentage = commissionPer;
	}

	/**
	 * gets total sales amount
	 * @return double sales total
	 */
	public double getSalesTotal() {
		return salesTotal;
	}

	/**
	 * sets sales total
	 * @param double salesTotal
	 */
	public void setSalesTotal(double salesTotal) {
		this.salesTotal = salesTotal;
	}

	/**
	 * gets commission percentage
	 * @return double commissionPercentage
	 */
	public double getCommissionPercentage() {
		return commissionPercentage;
	}

	/**
	 * sets commission percentage 
	 * @param double commissionPercentage
	 */
	public void setCommissionPercentage(double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	
	@Override
	public double getAnnualSalary() {
		return this.getBasePay() + (this.commissionPercentage * this.salesTotal);
	}
	
	/**
	 * gets the annual salary and returns as string
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
