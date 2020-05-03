/**
 * Rectangle class
 * @author sellercw
 *
 */
public class Rectangle implements Shape{
	 double length;
	 double width;
	 /**
	  * constructor that fills a rectangle object with length and width
	  * @param length a positive double value
	  * @param width a positive double value
	  */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	/**
	 * gets the area of the rectangle
	 * @return returns the double value of length times width
	 */
	public double getArea() {
		return (length*width);
	}
	/**
	 * equals method to check if an object is the same as a rectangle
	 * @return returns true if the Object is an instance of rectangle and has the same length and width.
	 * @param otherObject an Object used to check if it is equal to the rectangle
	 */
	public boolean equals(Object otherObject) {
		if(otherObject instanceof Rectangle) {
		return(this.length == ((Rectangle)otherObject).length && this.width == ((Rectangle)otherObject).width);
		}
		return false;
	}
	/**
	 * To String method for outputting a rectangle object 
	 */
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
