/**
 * Triangle class
 * @author sellercw
 *
 */
public class Triangle implements Shape{
	double base;
	double height;
	/**
	 * constructor for making a triangle object
	 * @param base a double variable holding the base
	 * @param height a double variable holding the height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	/**
	 * gets the area of the triangle
	 * @return returns a double value holding the area of a triangle which is base times height divided by 2
	 */
	public double getArea() {
		return(0.5 * base * height);
	}
	/**
	 * equals method that checks if one object is equal to a triangle object
	 * @return returns true if the object is an instance of triangle and has the same base and height. false otherwise
	 * @param otherObject an Object used to check if it is equal to the rectangle
	 */
	public boolean equals(Object otherObject) {
		if (otherObject instanceof Triangle) {
			return(this.base == ((Triangle)otherObject).base && this.height == ((Triangle)otherObject).height);
		}
		return false;
	}
	/**
	 * To String method for writing the values of a triangle object to a string 
	 */
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
}
