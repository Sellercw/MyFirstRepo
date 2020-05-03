/**
 * 
 * @author sellercw
 *
 */

public class Car {
	int yearModel;
	String make;
	int speed;
	/**
	 * @return increases the speed of the car by a value of 5. 
	 */
	public void accelerate() {
		speed = speed + 5; 
	}
	/**
	 * @return decreases the speed of the car by a value of 5. 
	 */
	public void brake() {
		speed = speed - 5;
	}
	/**
	 * 
	 * @param c
	 * @return returns true if the make and model of two cars are the same. 
	 */
	public boolean equals(Car c) {
		return ((make.equals(c.make)) && (yearModel == c.yearModel));
	}
	/**
	 * @return a string outputing the make, year, and speed of the car. 
	 */
	public String toString() {
		return "Make: " + make + ", Year: " + yearModel + ", Speed: " + speed;
	}
}
