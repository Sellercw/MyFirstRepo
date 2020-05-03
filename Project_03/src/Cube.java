/**
 * 
 * @author sellercw
 *
 */
public class Cube extends Square implements Volume{

	/**
	 * Constructor
	 * @param side a double variable 
	 * @param name a String variable
	 */
	public Cube (double side, String name){
		super(side, name);
	}

	/**
	 * toString method
	 * @param c a Cube object
	 * @return returns a string of a Cube object
	 */
	public String toString(Cube c){
		return (c.getName()+"[Side length: "+c.getSide()+"]");
	}
	
	/**
	 * getVolume 
	 * @return returns the volume of a Cube
	 */
	public double getVolume() {
		return (this.side*this.side*this.side);
	}
}
