/**
 * 
 * @author sellercw
 *
 */
public class Address {
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
	/**
	 * Empty constructor, sets default values to 0 and null.
	 */
	public Address() {
		this(0,null,null,null,null);
	}
	/**
	 * full constructor
	 * @param streetNumber an integer of your street number
	 * @param streetName A String of a street name
	 * @param city a String variable holding a city name
	 * @param state a String variable holding a state name
	 * @param zipCode a string variable holding a zip code
	 */
	public Address(int streetNumber, String streetName, String city, String state, String zipCode) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	/**
	 * the copy construcor
	 * @param address takes an address and makes a copy of it
	 */
	public Address(Address address) {
		this.streetNumber = address.getStreetNumber();
		this.streetName = address.getStreetName();
		this.city = address.getCity();
		this.state = address.getState();
		this.zipCode = address.getZipCode();
	}
	/**
	 * returns street number
	 * @return an integer value holding the street number
	 */
	public int getStreetNumber() {
		return streetNumber;
	}
	/**
	 * sets the street number
	 * @param streetNumber an integer value holding the street number
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	/**
	 * gets the street name
	 * @return returns a string of the street name
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * sets the street name
	 * @param streetName a string value holding the street name
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * gets the city name 
	 * @return a string value holding the city name
	 */
	public String getCity() {
		return city;
	}
	/**
	 * sets the city name
	 * @param city A string variable holding the city name
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * gets the state 
	 * @return a String variable of the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * sets the state variable
	 * @param state A string that holds the state. 
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * gets the zip code
	 * @return a String holding the zipcode 
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * sets the zip code
	 * @param zipCode a String variable holding the zipcode 
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * checks to see if two address have the same street number, name, city, state and zip code
	 * @param address an address variable holding street number, name, city, state and zip code
	 * @return returns true if both address are the same, false otherwise. 
	 */
	public boolean equals(Address address) {
		return((this.streetNumber == address.getStreetNumber()) && (this.streetName.equals(address.getStreetName()) && (this.city.equals(address.getCity()))&& (this.state.equals(address.state))) && (this.zipCode.equals(address.getZipCode())));
	}
	/**
	 * to string function returns all the values in a list seperated by commas. 
	 */
	@Override
	public String toString() {
		return streetNumber + " " + streetName + ", " + city + ", " + state + ", " + zipCode; 
	}
		
	
}
