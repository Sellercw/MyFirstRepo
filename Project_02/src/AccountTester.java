import static org.junit.Assert.*;

import org.junit.Test;
//this is my tester for the account class
public class AccountTester {
	double delta = 00001;
	@Test
	public void testAccountCustomer() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1);
		assertEquals(c1, ac1.getCustomer());
		
	}
	@Test
	public void testAccountCustomerDouble() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		assertEquals(c1, ac1.getCustomer());
		assertEquals(1200.00, ac1.getBalance(),delta);
	}

	@Test
	public void testAccountAccount() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		Account ac2 = ac1;
		assertEquals(ac1.getCustomer(), ac2.getCustomer());
		assertEquals(ac1.getBalance(), ac2.getBalance(), delta);
	}

	@Test
	public void testGetBalance() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		assertEquals(1200.00, ac1.getBalance(),delta);
	}

	@Test
	public void testGetId() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		Account ac2 = new Account(c1, 1200.00);
		assertEquals(1010, ac1.getId());
		assertEquals(1020, ac2.getId());
	}

	@Test
	public void testGetCustomer() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		assertEquals(c1, ac1.getCustomer());
	}

	@Test
	public void testSetCustomer() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Customer c2 = new Customer("Coln", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		ac1.setCustomer(c2);
		assertEquals(c2, ac1.getCustomer());
	}

	@Test
	public void testSetBalance() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		ac1.setBalance(100);
		assertEquals(100, ac1.getBalance(),delta);
	}

	@Test
	public void testDeposit() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		ac1.deposit(100);
		assertEquals(1300.00, ac1.getBalance(), delta);
	}

	@Test
	public void testWithdraw() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		assertTrue(ac1.withdraw(100.00));
		ac1.setBalance(0.00);
		assertFalse(ac1.withdraw(100.00));
	}

	@Test
	public void testEqualsAccount() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Address a2 = new Address(124, "Maintreet", "Oord", "Oho", "4556");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Customer c2 = new Customer("Coln", a2,"12-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		Account ac2 = new Account(c2, 1000.00);
		assertFalse(ac1.equals(ac2));
		ac2.setCustomer(c1);
		assertFalse(ac1.equals(ac2));
	}

	@Test
	public void testToString() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Account ac1 = new Account(c1, 1200.00);
		Account ac2 = new Account(c1, 1200.00);
		ac1.toString().equals(ac1.toString());
	}

}
