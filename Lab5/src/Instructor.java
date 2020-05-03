/**
 * 
 * @author sellercw
 *
 */
public class Instructor extends Person {
	private String rank;
	/**
	 * default constructor
	 */
	public Instructor() {
		super();
		this.setRank(null);
	}
	/**
	 * full constructor
	 * @param name
	 * @param year
	 * @param rank
	 */
	public Instructor(String name, int year, String rank) {
		super(name, year);
		this.setRank(rank);
	}
	/**
	 * 
	 * @return
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * 
	 * @param rank
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**
	 * checks to see if two instructors are the same
	 * @param instructor
	 * @return
	 */
	public boolean equals(Instructor instructor) {
		return (super.equals(instructor) && this.getRank().equals(instructor.getRank()));
	}
	/**
	 * returns a string output
	 */
	public String toString() {
		return "I am a " + rank + ". " + super.toString();
	}
	
}
