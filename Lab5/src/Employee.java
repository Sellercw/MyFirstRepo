/**
 * 
 * @author sellercw
 *
 */
public class Employee extends Person{
	private double salary;
	/**
	 * default constructor
	 */
	public Employee() {
		super();
		this.setSalary(0);
	}
	/**
	 * full constructor
	 * @param name
	 * @param year
	 * @param salary
	 */
	public Employee(String name, int year, double salary) {
		super(name, year);
		this.setSalary(salary);
	}
	/**
	 * 
	 * @return
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * 
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * checks to see if two employees are the same
	 * @param e
	 * @return
	 */
	public boolean equals(Employee e) {
		return(super.equals(e) && this.getSalary() == e.getSalary());
	}
	/**
	 * outputs a string 
	 */
	public String toString() {
		return "I am an employee and have a salary of $" + this.getSalary() + ". " + super.toString();
	}
}
