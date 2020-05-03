/**
 * This is my first class in java
 * @author sellercw
 *
 */
public class Date {
	int day;
	String month;
	int year;
	/**
	 * 
	 * @param date is an object from the same class Date.
	 * @return will return true if the two dates are equal and not otherwise.
	 */
	public boolean equal(Date anotherDate) {
		return((day == anotherDate.day) && (month.equals(anotherDate.month)) && (year == anotherDate.year));
	}
	/**
	 * @return this function  returns a string formatted as day_month_year
	 */
	public String toString() {
		return day + " " + month + " " + year;
	}
}
