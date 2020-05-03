import static org.junit.Assert.*;

import org.junit.Test;

public class CarTester {
	
	public static final double delta = 0.0001;
	//checks to see if default constructor works
	@Test
	public void testCar() {
		Car c1 = new Car();
		assertEquals(null, c1.getOwner());
		assertEquals(null, c1.getMake());
		assertEquals(null, c1.getModel());
		assertEquals(2020, c1.getYearModel());
		assertEquals(1.0f, c1.getFuelLevel(), delta);
		assertEquals(0, c1.getSpeed());
		assertFalse(c1.getStart());
	}
	//checks to see if constructor works
	@Test
	public void testCarStringStringStringInt() {
		Car c1 = new Car("Colin", "Honda", "Accord", 2008);
		assertEquals("Colin", c1.getOwner());
		assertEquals("Honda", c1.getMake());
		assertEquals("Accord", c1.getModel());
		assertEquals(2008, c1.getYearModel());
		assertEquals(1.0f, c1.getFuelLevel(), delta);
		assertEquals(0, c1.getSpeed());
		assertFalse(c1.getStart());
		
	}
	//checks values of constructor to make sure they filled correctly
	@Test
	public void testCarStringStringStringIntFloat() {
		Car c1 = new Car("Colin", "Honda", "Accord", 2008, 0.5f);
		assertEquals("Colin", c1.getOwner());
		assertEquals("Honda", c1.getMake());
		assertEquals("Accord", c1.getModel());
		assertEquals(2008, c1.getYearModel());
		assertEquals(0.5f, c1.getFuelLevel(), delta);
		assertEquals(0, c1.getSpeed());
		assertFalse(c1.getStart());
	}
	//tests every given value to make sure it is implemented correctly
	@Test
	public void testCarStringStringStringIntFloatIntBoolean() {
		Car c1 = new Car("Colin", "Honda", "Accord", 2008, 0.5f, 20, false);
		assertEquals("Colin", c1.getOwner());
		assertEquals("Honda", c1.getMake());
		assertEquals("Accord", c1.getModel());
		assertEquals(2008, c1.getYearModel());
		assertEquals(0.5f, c1.getFuelLevel(), delta);
		assertEquals(20, c1.getSpeed());
		assertFalse(c1.getStart());
	}
	//checks to see if the copy constructor works
	@Test
	public void testCarCar() {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		assertEquals(c2.getOwner(), c1.getOwner());
		assertEquals(c2.getMake(), c1.getMake());
		assertEquals(c2.getModel(), c1.getModel());
		assertEquals(c2.getYearModel(), c1.getYearModel());
		assertEquals(c2.getFuelLevel(), c1.getFuelLevel(), delta);
		assertEquals(c2.getSpeed(), c1.getSpeed());
		assertEquals(c2.getStart(), c1.getStart());
	}
	//checks if getOwner returns name
	@Test
	public void testGetOwner() {
		Car c1 = new Car();
		assertEquals(null, c1.getOwner());
	}
	//checks to see if set owner changes name
	@Test
	public void testSetOwner() {
		Car c1 = new Car();
		c1.setOwner("Colin");
		assertEquals("Colin", c1.getOwner());
	}
	//tests that the right make is returned
	@Test
	public void testGetMake() {
		Car c1 = new Car();
		assertEquals(null, c1.getMake());
	}
	//tests that the right make is set
	@Test
	public void testSetMake() {
		Car c1 = new Car();
		c1.setMake("Honda");
		assertEquals("Honda", c1.getMake());
	}
	//test if the model value is returned
	@Test
	public void testGetModel() {
		Car c1 = new Car();
		assertEquals(null, c1.getModel());
	}
	//tests if the set model works
	@Test
	public void testSetModel() {
		Car c1 = new Car();
		c1.setModel("Accord");
		assertEquals("Accord", c1.getModel());
	}
	//checks if the method returns properly
	@Test
	public void testGetYearModel() {
		Car c1 = new Car();
		assertEquals(2020, c1.getYearModel());
	}
	//tests that the right year is set
	@Test
	public void testSetYearModel() {
		Car c1 = new Car();
		c1.setYearModel(2008);
		assertEquals(2008, c1.getYearModel());
	}
	//makes sure the right fuel level is returned
	@Test
	public void testGetFuelLevel() {
		Car c1 = new Car();
		assertEquals(1.0f, c1.getFuelLevel(), delta);
		
	}
	//checks to see if the fuel level is set
	@Test
	public void testSetFuelLevel() {
		Car c1 = new Car();
		c1.setFuelLevel(0.5f);
		assertEquals(0.5f, c1.getFuelLevel(), delta);

	}
	//checks to see if speed is returned 
	@Test
	public void testGetSpeed() {
		Car c1 = new Car();
		assertEquals(0, c1.getSpeed());
	}
	//checks that the speed can be set correctly
	@Test
	public void testSetSpeed() {
		Car c1 = new Car();
		c1.setSpeed(10);
		assertEquals(10, c1.getSpeed());
	}
	//checks that the start returns correctly 
	@Test
	public void testGetStart() {
		Car c1 = new Car();
		assertFalse(c1.getStart());
	}
	//makes sure the set works 
	@Test
	public void testSetStart() {
		Car c1 = new Car();
		c1.setStart(true);
		assertTrue(c1.getStart());
	}
	//checks if the car accelerates with and without the proper speed and fuel level
	@Test
	public void testAccelerate() {
		Car c1 = new Car();
		assertFalse(c1.accelerate());
		c1.setFuelLevel(1.0f);
		c1.setStart(true);
		assertTrue(c1.accelerate());
	}
	//checks if the car brakes when it can, and doesnt when it cannot
	@Test
	public void testBrake() {
		Car c1 = new Car();
		assertFalse(c1.brake());
		c1.setStart(true);
		c1.setSpeed(10);
		assertTrue(c1.brake());
	}
	//checks if the proper return value is sent
	@Test
	public void testIsGasTankEmpty() {
		Car c1 = new Car();
		assertFalse(c1.isGasTankEmpty());
		c1.setFuelLevel(0);
		assertTrue(c1.isGasTankEmpty());
	}
	//checks if the right name is given or not
	@Test
	public void testSameOwner() {
		Car c1 = new Car("Scott", "Honda", "Accord", 2008);
		Car c2 = new Car("Colin", "Honda", "Accord", 2008);
		assertFalse(c1.sameOwner(c2));
		c1.setOwner("Colin");
		assertTrue(c1.sameOwner(c2));
	}
	//checks if the car has the same make year and model 
	@Test
	public void testEqualsCar() {
		Car c1 = new Car("Scott", "Ford", "Explorer", 2009);
		Car c2 = new Car("Colin", "Honda", "Accord", 2008);
		assertFalse(c1.equals(c2));
		c1.setYearModel(2008);
		assertFalse(c1.equals(c2));
		c1.setMake("Honda");
		assertFalse(c1.equals(c2));
		c1.setModel("Accord");
		assertTrue(c1.equals(c2));
	}
	//checks if the toString method works
	@Test
	public void testToString() {
		Car c1 = new Car("Colin", "Honda", "Accord", 2008);
		Car c2 = new Car("Colin", "Honda", "Accord", 2008);
		c1.toString().equals(c2.toString());
	}
	//tests if the set year exception gets thrown
	@Test (expected=IllegalArgumentException.class)
	public void testSetYearModelException()
	{
		Car c1 = new Car();
		c1.setYearModel(2025);
	}
	//checks if the set fuel level exception gets thrown 
	@Test (expected=IllegalArgumentException.class)
	public void testSetFuelLevelExeption() {
		Car c1 = new Car();
		c1.setFuelLevel(2);
	}
	//checks if the set speed exception is thrown
	@Test (expected=IllegalArgumentException.class)
	public void testSetSpeedException() {
		Car c1 = new Car();
		c1.setSpeed(255);
	}
}
