/**
 * 
 * @author sellercw
 *
 */
public class Circle extends Shape implements Area{
	/**
	 * instance variables
	 */
		double radius;
		
	/**
	 * Constructor
	 * @param radius radius of circle
	 * @param name name of circle
	 */
		public Circle(double radius, String name) 
		{
			super(name);
			this.radius = radius;
		}
		
	/**
	 * @return a string of the name
	 */
		public String getName()
		{
			return this.name;
		}
		
	/**
	 * @param name a string variable
	 */
		public void setName(String name){
			this.name = name;
		}

	/**
	 * @return double value of circle shape radius 
	 */
		public double getRadius(){
			return this.radius;
		}

	/** 
	 * @param rad becomes new radius value 
	 */
		public void setRadius(double rad){
			this.radius = rad;
		}

	/**
	 * Equals method 
	 * @param c a Circle Object
	 * @return returns true if both circle name and radius is the same
	 * shapes are equals, false otherwise
	 */
		public boolean equals(Circle c){
			return(this.name == c.getName() && this.radius == c.getRadius());
		}

	/**
	 * @return string representation of radius of circle
	 */
		public String toString(Circle c ){
			return (c.getName()+"[Radius: "+c.getRadius()+"]");
		}

	/**
	 * @return returns the area of a circle	
	 */
	public double getArea() {
		return ((this.radius*this.radius)* Math.PI) ;
	}
}
