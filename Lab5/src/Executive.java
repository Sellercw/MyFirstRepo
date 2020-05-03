/**
 * 
 * @author sellercw
 *
 */
public class Executive extends Manager{
	private String officeLocation;
	/**
	 * default constructor
	 */
	public Executive() {
		super();
		this.setOfficeLocation(null);
	}
	/**
	 * full constructor
	 * @param name
	 * @param year
	 * @param salary
	 * @param department
	 * @param officeLocation
	 */
	public Executive(String name, int year, double salary, String department, String officeLocation) {
		super(name,year,salary,department);
		this.setOfficeLocation(officeLocation);
	}
	/**
	 * 
	 * @return
	 */
	public String getOfficeLocation() {
		return officeLocation;
	}
	/**
	 * 
	 * @param officeLocation
	 */
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	/**
	 * checks if two Executives are the same
	 * @param e
	 * @return
	 */
	public boolean equals(Executive e) {
		return(super.equals(e) && this.getOfficeLocation().equals(e.getOfficeLocation()));
	}
	/**
	 * returns a string
	 */
	public String toString() {
		return "I am an executive and my office location is " + this.getOfficeLocation() + ". " + super.toString();
	}
}
