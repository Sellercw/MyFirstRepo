/**
 * 
 * @author sellercw
 *
 */
public class Student extends Person{
	private String major;
	/**
	 * default constructor
	 */
	public Student() {
		super();
		this.setMajor(null);
	}
	/**
	 * full constructor
	 * @param name
	 * @param year
	 * @param major
	 */
	public Student(String name, int year, String major) {
		super(name,year);
		this.setMajor(major);
	}
	/**
	 * 
	 * @return
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * 
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * returns a string output
	 */
	public String toString() {
		return "I am a student majoring in " + this.major + ". " + super.toString();
	}
	/**
	 * checks to see if two objects are the same
	 * @param s
	 * @return
	 */
	public boolean equals(Student s) {
		return (super.equals(s) && this.getMajor().equals(s.getMajor()));
	}
}
