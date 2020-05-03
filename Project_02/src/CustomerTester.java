import static org.junit.Assert.*;
import org.junit.Test;
//this is my tester for the customer class
public class CustomerTester {

	@Test
	public void testCustomer() {
		Customer c1 = new Customer();
		assertEquals(null, c1.getName());
		assertEquals(null, c1.getAddress());
		assertEquals(null, c1.getSsn());
}

	@Test
	public void testCustomerStringAddressString() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		assertEquals("Colin", c1.getName());
		assertEquals(a1, c1.getAddress());
		assertEquals("123-45-6789", c1.getSsn());
	}

	@Test
	public void testCustomerCustomer() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Customer c2 = c1;
		assertEquals(c2.getName(), c1.getName());
		assertEquals(c2.getAddress(), c1.getAddress());
		assertEquals(c2.getSsn(), c1.getSsn());
	}

	@Test
	public void testGetName() {
		Customer c1 = new Customer();
		assertEquals(null, c1.getName());		
	}

	@Test
	public void testSetName() {
		Customer c1 = new Customer();
		c1.setName("Colin");
		assertEquals("Colin", c1.getName());
	}

	@Test
	public void testGetAddress() {
		Customer c1 = new Customer();
		assertEquals(null, c1.getAddress());
	}

	@Test
	public void testSetAddress() {
		Customer c1 = new Customer();
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		c1.setAddress(a1);
		assertEquals(a1, c1.getAddress());
	}

	@Test
	public void testGetSsn() {
		Customer c1 = new Customer();
		assertEquals(null, c1.getSsn());
	}

	@Test
	public void testSetSsn() {
		Customer c1 = new Customer();
		c1.setSsn("123-45-6789");
		assertEquals("123-45-6789", c1.getSsn());
	}

	@Test
	public void testGetId() {
		Customer c1 = new Customer();
		assertEquals(1000, c1.getId());
		Customer c2 = new Customer();
		assertEquals(1001, c2.getId());
	}

	@Test
	public void testEqualsCustomer() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Address a2 = new Address(4321, "south Street", "xford", "hio", "4556");
		Customer c2 = new Customer("Coln", a2,"145-6789");
		assertFalse(c1.equals(c2));
		c2.setName("Colin");
		assertFalse(c1.equals(c2));
		c2.setAddress(a1);
		assertFalse(c1.equals(c2));
		c2.setSsn("123-45-6789");
		assertTrue(c1.equals(c2));
	}

	@Test
	public void testToString() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c1 = new Customer("Colin", a1,"123-45-6789");
		Address a2 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Customer c2 = new Customer("Colin", a1,"123-45-6789");
		c1.toString().equals(c2.toString());
	}

}
