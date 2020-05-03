/**
 * 
 * @author sellercw
 *
 */
public class Square extends Shape implements Area{

	/**
	 * instance variables
	 */
	double side;

	/**
	 * Constructor
	 * @param side side of Square
	 * @param name name of a Square
	 */
	public Square(double side, String name) {
		super(name);
		this.side = side;
	}

	/**
	 * @return returns a double side value
	 */
	public double getSide(){
		return this.side;
	}

	/**
	 * @param side a double value of the side of a Square
	 */
	public void setSide(double side){
		this.side = side;
	}

	/**
	 * @param name A String variable 
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * @return a String of name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * @param s a Square object
	 * @return returns true if both Square
	 * shapes are equals, false otherwise
	 */
	public boolean equals(Square s){
		return(this.name == s.getName() && this.side == s.getSide());
	}

	/**
	 * @return returns a string with a Square object
	 */
	public String toString(Square s){
		return (s.getName()+"[Side Length: "+s.getSide()+"]");
	}
	/**
	 * @return returns the area of a square
	 */
	public double getArea() {
		return (this.side *this.side);
	}
}
