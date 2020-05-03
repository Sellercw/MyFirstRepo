/**
 * This is my tester Class
 * @author sellercw
 *
 */
public class Tester{

	/**
	 * Main method used for testing Shape, Triangle, and Rectangle classes
	 * @param args an Array of strings
	 */
	public static void main(String[] args) {
		System.out.println("-----Testing Rectangle toString and getArea-----");
		Rectangle r1 = new Rectangle(5.0, 3.0);
		Rectangle r2 = new Rectangle(6.0, 4.0);
		Rectangle r3 = new Rectangle(5.0, 3.0);
		Triangle t1 = new Triangle(5.0,3.0);
		Triangle t2 = new Triangle(6.0,4.0);
		Triangle t3 = new Triangle(5.0,3.0);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println("Area of r1: " + r1.getArea());
		System.out.println("Area of r2: " + r2.getArea());
		System.out.println("-----Testing equals method-----");
		System.out.println("Two Rectangles, different length, width: " + r1.equals(r2));
		System.out.println("Two Rectangles, same length, width: " + r1.equals(r3));
		System.out.println("Triangle and Rectangle: " + r1.equals(t1));
		System.out.println("Rectangle and null: " + r1.equals(null));
		
		System.out.println("-----Testing Triangle ToString and getArea-----");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println("Area of t1: " + t1.getArea());
		System.out.println("Area of t2: " + t2.getArea());
		System.out.println("-----Testing equals method-----");
		System.out.println("Two Triangles, different base, height: " + t1.equals(t2));
		System.out.println("Two Triangles, same base, height: " + t1.equals(t3));
		System.out.println("Triangle and Rectangle: " + t1.equals(r1));
		System.out.println("Triangle and null: " + t1.equals(null));
		

		
		

	}

}
