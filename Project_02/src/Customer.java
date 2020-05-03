/**
 * 
 * @author sellercw
 *
 */
public class Customer {
	private int id;
	private String name;
	private Address address;
	private String ssn;
	static int tempID = 1000;
	/**
	 * empty constructor sets all items to null but sets an id.
	 */
	public Customer() {
		this.id = tempID;
		tempID++;
		this.name = null;
		this.address = null;
		this.ssn = null;
	}
	/**
	 * full constructor, sets name, address and ssn
	 * @param name A string of your name
	 * @param address an address variable holding street number, name, city, state and zip code
	 * @param ssn a string of you ssn 
	 */
	public Customer(String name, Address address, String ssn) {
		this.id = tempID; 
		tempID++;
		this.name = name;
		this.address = address;
		this.ssn = ssn;
	}
	/**
	 * copy constructor 
	 * @param customer makes another customer class
	 */
	public Customer(Customer customer) {
		this.id = tempID;
		tempID++;
		this.name = customer.name;
		this.address = customer.address;
		this.ssn = customer.ssn;
	}
	/**
	 * gets the name
	 * @return A string of the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets the name
	 * @param name A string variable of the name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * gets the address
	 * @return the address of the object
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * sets the address
	 * @param address a variable that holds street number, name, city, state and zip code
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * gets the ssn
	 * @return a String of the ssn 
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * sets ssn 
	 * @param ssn A string variable holding the ssn 
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * gets the id
	 * @return returns an integer of the id 
	 */
	public int getId() {
		return id;
	}
	/**
	 * equals method to check if two customers have the same name, address and ssn 
	 * @param customer a object that holds customer information
	 * @return returns true if customers are equal, false otherwise. 
	 */
	public boolean equals(Customer customer) {
		return ((this.name.equals(customer.getName())) && (this.address.equals(customer.getAddress())) && (this.ssn.equals(customer.getSsn())));
	}
	/**
	 * to String method that outputs the customers information in a String 
	 */
	public String toString() {
		return this.getId() + ", " + this.getName() + ", " + this.getAddress().toString() + ", " + this.getSsn();
	}
}
