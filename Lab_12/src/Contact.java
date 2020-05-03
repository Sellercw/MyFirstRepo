import java.io.Serializable;

/**
 * 
 * @author sellercw
 *
 */
public class Contact implements Serializable{
	String firstName;
	String lastName;
	String phone;
	String email;
	String address;

	/**
	 * empty constructor
	 */
	public Contact(){
		address = "";
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
		address = "";
	}

	/**
	 * equals method
	 * @param contact a contact method
	 * @return returns true if two contacts have the same name and phone number
	 */
	public boolean equals(Contact contact){
		return( (this.getFirstName().equals(contact.getFirstName())) && (this.getLastName().equals(contact.getLastName())) && (this.getPhone().equals(contact.getPhone())) );   
	}
	/**
	 * toString method
	 * @param c a contact method
	 * @return returns a string representation of a contact
	 */
	public String toString(Contact c){
		return (c.getFirstName()+" "+c.getLastName()+", "+c.getAddress()+", "+c.getEmail()+", "+c.getPhone());
	}

	/**
	 * getFirstName
	 * @return returns first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setFirstName
	 * @param firstName a string
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getLastName
	 * @return a string
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * setLastName
	 * @param lastName a string
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getPhone
	 * @return a string
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * setPhone
	 * @param phone a string
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * getEmail
	 * @return a string
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * setEmail
	 * @param email a string
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * getAddress
	 * @return a string
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * setAddress
	 * @param address a string
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
