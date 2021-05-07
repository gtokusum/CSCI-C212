/**
 * creates DateTime object to keep track of purchase dates and sale dates of stocks
 * @author gakutokusumi
 *
 */
public class DateTime {
	
	private int year;
	private int month;
	private int day;
	
	/**
	 * constructor 
	 * @param int year
	 * @param int month
	 * @param int day
	 */
	public DateTime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * get year
	 * @return int year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * set year
	 * @param int year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * get month
	 * @return int month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * set month
	 * @param int month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * get day
	 * @return int day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * set day
	 * @param int day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * @override
	 * @return string format of DateTime object. Format YYYY/MM/DD
	 */
	public String toString() {
		return this.year + "/" + this.month + "/" + this.day;
	}
	
//	/**
//	 * compares instance with another DateTime to see if instance is after argument datetime
//	 * @param DateTime date
//	 * @return boolean
//	 */
//	public boolean after(DateTime date) {
//		if (this.getYear() > date.getYear()) {
//			return true;
//		}
//		else if(this.getYear() == date.getYear() && this.getMonth() > date.getMonth()) {
//			return true;
//		}
//		else if(this.getYear() == date.getYear() && this.getMonth() == date.getMonth() && this.getDay() > date.getDay()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	/**
//	 * compares instance with another DateTime to see if instance is before argument DateTime
//	 * @param DateTime date
//	 * @return boolean
//	 */
//	public boolean before(DateTime date) {
//		if (this.getYear() < date.getYear()) {
//			return true;
//		}
//		else if(this.getYear() == date.getYear() && this.getMonth() < date.getMonth()) {
//			return true;
//		}
//		else if(this.getYear() == date.getYear() && this.getMonth() == date.getMonth() && this.getDay() < date.getDay()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	/**
//	 * compares if instance is atleast a year before from argument date
//	 * @param DateTime date
//	 * @return boolean
//	 */
//	public boolean pastYear(DateTime date) {
//		if (date.getYear() - this.getYear() >= 1 && date.getMonth() - this.getMonth() >= 0 && date.getDay() - this.getDay() >= 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//
//	@Override
//	public int compareTo(DateTime arg0) {
//		if (before(arg0)) {
//			return -1;
//		}else if(after(arg0)) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
	
}
