/**
 * Lab Assignment 04 Solution
 * Object-Oriented Programming, CSE 271, Spring 2020
 * Department of Computer Science and Engineering, Miami University
 * Oxford, OH
 * 
 * @author Md Osman Gani
 */

public class Car {
	// Instance variables
	private String owner;
	private String make;
	private String model;
	private int yearModel;
	private float fuelLevel;
	private int speed;
	private boolean start;
	
	/**
	 * The default or empty constructor
	 */
	public Car() {
		this(null, null, null, 2020, 1.0f, 0, false);
	}

	/**
	 * A parameterized constructor that takes owner, make, model and year 
	 * to initialize an object
	 * @param owner
	 * @param make
	 * @param model
	 * @param yearModel
	 */
	public Car(String owner, String make, String model, int yearModel) {
		this(owner, make, model, yearModel, 1.0f, 0, false);
	}

	/**
	 * A parameterized constructor that takes owner, make, model, year  
	 * and fuel level to initialize an object
	 * @param owner 
	 * @param make
	 * @param model
	 * @param yearModel
	 * @param fuelLevel
	 */
	public Car(String owner, String make, String model, int yearModel, float fuelLevel) {
		this(owner, make, model, yearModel, fuelLevel, 0, false);
	}

	/**
	 * A workhorse constructor that receives values for all instance variables
	 * and initializes the object.
	 * @param owner
	 * @param make
	 * @param model
	 * @param yearModel
	 * @param fuelLevel
	 * @param speed
	 * @param start
	 */
	public Car(String owner, String make, String model, int yearModel, float fuelLevel, int speed, boolean start) {
		this.owner = owner;
		this.make = make;
		this.model = model;
		setYearModel(yearModel);
		setFuelLevel(fuelLevel);
		setSpeed(speed);
		setStart(start);
	}
	
	/**
	 * The copy constructor that copies the values of another car object.
	 * @param anotherCar
	 */
	public Car(Car anotherCar) {
		setOwner(anotherCar.owner);
		setMake(anotherCar.make);
		setModel(anotherCar.model);
		setYearModel(anotherCar.yearModel);
		setFuelLevel(anotherCar.fuelLevel);
		setSpeed(anotherCar.speed);
		setStart(anotherCar.start);
	}

	/**
	 * Gets the owner of the car
	 * @return the owner of the car
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * Sets the owner of the car
	 * @param owner The owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * Gets the make of the car
	 * @return the make of the car
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Sets the make of the car
	 * @param make the make of the car to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Gets the model of the car
	 * @return the model of the car
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the model of the car
	 * @param model the model of the car to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Gets the year model of the car
	 * @return the year model of the car
	 */
	public int getYearModel() {
		return yearModel;
	}

	/**
	 * Sets the year model of the car
	 * @param yearModel the year model of the car to set
	 * @exception IllegalArugmentException if the value is not within the valid range
	 */
	public void setYearModel(int yearModel) {
		if(yearModel < 1885 || yearModel > 2021)
			throw new IllegalArgumentException("The year model is not valid.");
		this.yearModel = yearModel;
	}

	/**
	 * @return the fuelLevel
	 */
	public float getFuelLevel() {
		return fuelLevel;
	}

	/**
	 * @param fuelLevel the fuelLevel to set
	 * @exception IllegalArugmentException if the value is not within the valid range
	 */
	public void setFuelLevel(float fuelLevel) {
		if(fuelLevel < 0 || fuelLevel > 1.0)
			throw new IllegalArgumentException("The fuel level is not valid.");
		this.fuelLevel = fuelLevel;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 * @exception IllegalArugmentException if the value is not within the valid range
	 */
	public void setSpeed(int speed) {
		if(speed < 0 || speed > 250)
			throw new IllegalArgumentException("The speed cannot be negative or more than 250 mph.");
		this.speed = speed;
	}

	/**
	 * @return the start
	 */
	public boolean getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(boolean start) {
		this.start = start;
	}
	
	/**
	 * Increases the speed by 4 miles/hour. It can increase the speed by
	 * that amount only if the engine is on and there is enough gasoline
	 * and it is running at less than 250 miles/hour. No matter what, it
	 * burns 0.05 amount of fuel if the engine is on. 
	 * @return true if it can increase the speed by some amount. False, otherwise.
	 */
	public boolean accelerate() {
		if(!getStart())
			return false;
		if(isGasTankEmpty())
			return false;

		setFuelLevel((float) (fuelLevel - 0.05));
		if(speed == 250)
			return false;
		
		if(speed + 4 > 250)
			setSpeed(250);
		else setSpeed(speed + 4);

		return true;
	}
	
	/**
	 * Reduces the speed by 3 miles/hour. It can't reduce speed 
	 * if the speed is zero or the engine is turned off. 
	 * @return true if it can reduce the speed by some amount. False, otherwise.
	 */
	public boolean brake() {
		if(!getStart())
			return false;
		if(getSpeed() == 0)
			return false;
		
		if(speed > 3)
			setSpeed(speed - 3);
		else setSpeed(0);
		return true;		
	}
	
	/**
	 * Checks whether the tank is empty or not.
	 * @return true if the tank is empty. False, otherwise.
	 */
	public boolean isGasTankEmpty() {
		if(fuelLevel < 0.05)
			return true;
		return false;
	}
	
	/**
	 * Checks whether two cars have the same owner.
	 * @param anotherCar Another car object to compare with
	 * @return true if two cars have same owner. False, otherwise.
	 */
	public boolean sameOwner(Car anotherCar) {
		if(owner.equals(anotherCar.owner))
			return true;
		return false;
	}
	
	/**
	 * Compares two car objects
	 * @param anotherCar Another car object to compare with
	 * @return true if two cars are equal. False, otherwise.
	 */
	public boolean equals(Car anotherCar) {
		if(!make.equals(anotherCar.make))
			return false;
		if(!model.equals(anotherCar.model))
			return false;
		if(yearModel != anotherCar.yearModel)
			return false;

		return true;
	}
	
	/**
	 * Returns a string representation of the car.
	 */
	public String toString() {
		return "Owner: " + owner + ", Make: " + make +
			    ", Model: " + model + ", Year: " + yearModel +
			    ", Speed: " + speed + ", Fuel Level: " + fuelLevel;
	}

}
