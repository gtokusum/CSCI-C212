
public abstract class Employee extends Person{

	
	private String employeeId;
	private String jobTitle;
	private String company;
	private String employeeType;
	
	/**
	 * overloaded constructor
	 * @param String firstName
	 * @param String lastName
	 * @param String birthdate
	 * @param String employeeID
	 * @param String jobTitle
	 * @param String company
	 * @param String employeeType
	 */
	public Employee(String firstName, String lastName, String birthdate, String employeeID, String jobTitle, String company, String employeeType) {
		super(firstName, lastName, birthdate);
		this.employeeId = employeeID;
		this.jobTitle = jobTitle;
		this.company = company;
		this.employeeType = employeeType;
	}
	
	/**
	 * default constructor
	 */
	public Employee() {
		super();
		this.employeeId = "";
		this.jobTitle = "";
		this.company = "";
		this.employeeType = "";
	}

	/**
	 * gets employee id
	 * @return String employee id
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * sets employee id
	 * @param String employeeId
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * gets job title
	 * @return String jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * sets job title
	 * @param String jobTitle
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * gets company
	 * @return String company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * sets the company
	 * @param String company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * gets employee type
	 * @return String employeeType
	 */
	public String getEmployeeType() {
		return employeeType;
	}

	/**
	 * sets employee type
	 * @param String employeeType
	 */
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public abstract double getAnnualSalary();
	
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
