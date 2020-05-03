/**
 * 
 * @author sellercw
 *
 */
public class Person {
	private String name;
	private int year;
	/**
	 * default constructor
	 */
	public Person() {
		this(null,0);
	}
	/**
	 * full constructor
	 * @param name
	 * @param year
	 */
	public Person(String name, int year) {
		this.setName(name);
		this.setYear(year);
	}
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return
	 */
	public int getYear() {
		return year;
	}
	/**
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * returns true of both objects are the same
	 * @param p
	 * @return
	 */
	public boolean equals(Person p) {
		return(this.name.equals(p.name) && this.year == p.year); 
	}
	/**
	 * returns a string output
	 */
	public String toString() {
		return "I am a person whose name is " + name + " and was born in " + year + ".";
	}
}
