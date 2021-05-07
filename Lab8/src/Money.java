/**
 * money class for inputing money into vending machine
 * @author gakutokusumi
 *
 */
public class Money {

	private int dollar;
	private double quarter;
	private double dime;
	private double nickle;
	private double penny;
	
	/**
	 * constructor
	 */
	public Money() {
		this.dollar = 1;
		this.quarter = .25;
		this.dime = .1;
		this.nickle = .05;
		this.penny = .01;
	}

	/**
	 * gets dollar amount
	 * @return int 1
	 */
	public int getDollar() {
		return dollar;
	}

	/**
	 * sets dollar amount
	 * @param int dollar
	 */
	public void setDollar(int dollar) {
		this.dollar = dollar;
	}

	/**
	 * get quarter amount
	 * @return 0.25
	 */
	public double getQuarter() {
		return quarter;
	}


	/**
	 * sets quarter amount
	 * @param double quarter
	 */
	public void setQuarter(double quarter) {
		this.quarter = quarter;
	}


	/**
	 * get dime amount
	 * @return .10
	 */
	public double getDime() {
		return dime;
	}

	/**
	 * sets dime value
	 * @param double dime
	 */
	public void setDime(double dime) {
		this.dime = dime;
	}

	/**
	 * gets nickle value
	 * @return .05
	 */
	public double getNickle() {
		return nickle;
	}

	/**
	 * sets nickel amount
	 * @param double nickle
	 */
	public void setNickle(double nickle) {
		this.nickle = nickle;
	}

	/**
	 * gets penny value
	 * @return 0.01
	 */
	public double getPenny() {
		return penny;
	}

	/**
	 * sets penny value
	 * @param double penny
	 */
	public void setPenny(double penny) {
		this.penny = penny;
	}
	
	
}
