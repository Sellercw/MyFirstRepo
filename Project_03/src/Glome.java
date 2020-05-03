/**
 * 
 * @author sellercw
 *
 */
public class Glome extends Sphere implements Volume{
	/**
	 * Constructor
	 * @param radius a double value
	 * @param name a String variable
	 */
	public Glome(double radius, String name){
		super(radius, name);
	}

	/**
	 * toString method
	 * @param g a Glome object
	 * @return returns a String of a Glome
	 */
	public String toString(Glome g){
		return(g.getName()+"[Radius: " + g.getRadius()+"]");
	}

	/**
	 * getVolume method
	 * @return returns the volume of the Glome
	 */
	public double getVolume() {
		return ((.5)*(Math.PI*Math.PI)*((this.radius)*(this.radius)*(this.radius)*(this.radius)));
	}
}
