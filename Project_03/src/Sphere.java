/**
 * 
 * @author sellercw
 *
 */
public class Sphere extends Circle implements Volume{
	/**
	 * Constructor
	 * @param radius a double variable
	 * @param name a String variable
	 */
	public Sphere(double radius, String name){
		super(radius,name);
	}

	/**
	 * toString method
	 * @param s a Sphere object
	 * @return returns a string of the Sphere object
	 */
	public String toString(Sphere s){
		return (this.name+"[Radius: "+this.radius);
	}

	/**
	 * getVolume method
	 * @return returns the volume of a Sphere
	 */
	public double getVolume() {
		return (1.5) * Math.PI * Math.pow(this.radius, 3);
	}


}
