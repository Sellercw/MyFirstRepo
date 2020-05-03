/**
 * 
 * @author sellercw
 *
 */
public class Account {
	private int id; 
	static int tempID = 1000;
	private Customer customer;
	private double balance;
	/**
	 * Constructor to set customer information into an account and sets id. 
	 * @param customer
	 */
	public Account(Customer customer) {
		this.id = tempID;
		tempID = tempID + 10;
		this.customer = customer;
		this.balance = 0.00;
	}
	/**
	 * Constructor that takes a customer and a balance  
	 * @param customer a Customer object 
	 * @param balance a double of the balance of the account
	 */
	public Account(Customer customer, double balance) {
		this.id = tempID;
		tempID = tempID + 10;
		this.customer = customer;
		this.balance = balance;
	}
	/**
	 * copy construcor 
	 * @param account makes a new account with a new id but same customer info and balance
	 */
	public Account(Account account) {
		this.id = tempID;
		tempID = tempID + 10;
		this.customer = account.getCustomer();
		this.balance = account.getBalance();
		
	}
	/**
	 * gets balance 
	 * @return a double of the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * gets the id
	 * @return an integer of the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * gets the customer
	 * @return returns the customer object
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * sets the customer object
	 * @param customer an object with name, address and ssn 
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * sets the balance 
	 * @param balance a double variable holding the balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * deposits a specified amount into a balance
	 * @param amount a double of money to be deposited 
	 */
	public void deposit(double amount){
		this.setBalance(this.getBalance() + amount);
	}
	/**
	 * takes out the desired amount from the balance if there is sufficient funds
	 * @param amount a double variable of the amount wanting to be withdrawn 
	 * @return returns true if money was able to be taken out, false otherwise
	 */
	public boolean withdraw(double amount) {
		if(this.getBalance() >= amount) {
			this.setBalance(this.getBalance() - amount);
			return true;
		}
		return false;
	} 
	/**
	 * checks to see if two accounts have the same id and customer information
	 * @param account an account object
	 * @return returns true if the id and customer info are the same, false otherwise. 
	 */
	public boolean equals(Account account) {
		return ( (this.getId() == account.getId()) && (this.getCustomer().equals(account.getCustomer())));
	} 
	/**
	 * to string method that returns the account information in a string. 
	 */
	public String toString() {
		return this.getId() + ", " + this.getCustomer().toString() + ", " + this.getBalance();
	}
}
