import static org.junit.Assert.*;

import org.junit.Test;
//Tester for my Address class
public class AddressTester {

	@Test
	public void testAddress() {
		Address a1 = new Address();
		assertEquals(0, a1.getStreetNumber());
		assertEquals(null, a1.getStreetName());
		assertEquals(null, a1.getCity());
		assertEquals(null, a1.getState());
		assertEquals(null, a1.getZipCode());
	}

	@Test
	public void testAddressIntStringStringStringString() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		assertEquals(1234, a1.getStreetNumber());
		assertEquals("Main Street", a1.getStreetName());
		assertEquals("Oxford", a1.getCity());
		assertEquals("Ohio", a1.getState());
		assertEquals("45056", a1.getZipCode());
		
	}

	@Test
	public void testAddressAddress() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Address a2 = a1;
		assertEquals(a2.getStreetNumber(), a1.getStreetNumber());
		assertEquals(a2.getStreetName(), a1.getStreetName());
		assertEquals(a2.getCity(), a1.getCity());
		assertEquals(a2.getState(), a1.getState());
		assertEquals(a2.getZipCode(), a1.getZipCode());
	}

	@Test
	public void testGetStreetNumber() {
		Address a1 = new Address();
		assertEquals(0, a1.getStreetNumber());
	}

	@Test
	public void testSetStreetNumber() {
		Address a1 = new Address();
		a1.setStreetNumber(2);
		assertEquals(2, a1.getStreetNumber());
	}

	@Test
	public void testGetStreetName() {
		Address a1 = new Address();
		assertEquals(null, a1.getStreetName());
	}

	@Test
	public void testSetStreetName() {
		Address a1 = new Address();
		a1.setStreetName("first");
		assertEquals("first", a1.getStreetName());

	}

	@Test
	public void testGetCity() {
		Address a1 = new Address();
		assertEquals(null, a1.getCity());
	}

	@Test
	public void testSetCity() {
		Address a1 = new Address();
		a1.setCity("Akron");
		assertEquals("Akron", a1.getCity());
	}

	@Test
	public void testGetState() {
		Address a1 = new Address();
		assertEquals(null, a1.getState());
	}

	@Test
	public void testSetState() {
		Address a1 = new Address();
		a1.setState("indiana");
		assertEquals("indiana", a1.getState());
	}

	@Test
	public void testGetZipCode() {
		Address a1 = new Address();
		assertEquals(null, a1.getZipCode());
	}

	@Test
	public void testSetZipCode() {
		Address a1 = new Address();
		a1.setZipCode("45056");
		assertEquals("45056", a1.getZipCode());
	}

	@Test
	public void testEqualsAddress() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Address a2 = new Address(4321, "First street", "Topeka", "Kansas", "44224");
		assertFalse(a1.equals(a2));
		a2.setStreetNumber(1234);
		assertFalse(a1.equals(a2));
		a2.setStreetName("Main Street");
		assertFalse(a1.equals(a2));
		a2.setCity("Oxford");
		assertFalse(a1.equals(a2));
		a2.setState("Ohio");
		assertFalse(a1.equals(a2));
		a2.setZipCode("45056");
		assertTrue(a1.equals(a2));
		
	}

	@Test
	public void testToString() {
		Address a1 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		Address a2 = new Address(1234, "Main Street", "Oxford", "Ohio", "45056");
		a1.toString().equals(a2.toString());
	}

}
