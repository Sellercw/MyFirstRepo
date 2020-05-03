/**
 * 
 * @author sellercw
 *
 */
public class Manager extends Employee{
	private String department;
	/**
	 * default construcor
	 */
	public Manager() {
		super();
		this.setDepartment(null);
	}
	/**
	 * full constructor
	 * @param name
	 * @param year
	 * @param salary
	 * @param department
	 */
	public Manager(String name, int year, double salary, String department) {
		super(name,year,salary);
		this.setDepartment(department);
	}
	/**
	 * 
	 * @return
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * 
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * checks if two managers are the same
	 * @param m
	 * @return
	 */
	public boolean equals(Manager m) {
		return (super.equals(m) && this.getDepartment().equals(m.getDepartment()));
	}
	/**
	 * returns a string
	 */
	public String toString() {
		return "I am a manager of the " + department + " department. " + super.toString();
	}
	
}
