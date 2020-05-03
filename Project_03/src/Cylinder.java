/**
 * 
 * @author sellercw
 *
 */
public class Cylinder extends Circle implements Volume {
	/**
	 * instance variables
	 */
		double height;

		/**
		 * Constructor
		 * @param height a double value
		 * @param radius a double value
		 * @param name a String variable
		 */
		public Cylinder(double height, double radius, String name){
			super(radius, name);
			this.height = height;
		}

		/**
		 * 
		 */
		public void setName(String name){
			this.name = name;
		}

		public void setHeight(double height){
			this.height = height;
		}

		public double getHeight(){
			return this.height; 
		}

		public String getName(){
			return this.getName();
		}
		public void setRadius(double radius){
			this.radius = radius;
		}
		
		public double getRadius(){
			return this.radius;
		}
		
	/**
	 * @Equals method 
	 * @param s
	 * @return true if both Square
	 * shapes are equals, false otherwise
	 */
		public boolean equals(Cylinder c){
			if(this.name == c.getName() && this.height == c.getHeight() && this.radius == c.getRadius())
			{
				return true;
			}
			return false;
		}

	/**
	 * @toString method 
	 * @return string representation of radius of circle
	 */
		public String toString(Cylinder c){
			return (c.getName()+"[Height: "+c.getHeight()+"]");
		}
		
	public double getVolume() {
		return (Math.PI*(this.radius*this.radius)*this.height);
	}
}
