
public abstract class Shape {
	/**
	 * @Instance Variables 
	 */
		String name; 
		
	/**
	 * Constructor #1	
	 * @param name
	 * changes name value to @param value
	 */
		public Shape(String name){
			this.name = name;
		}

	/**
	 * @getName method declaration
	 * @return
	 */
		public String getName(){
			return this.name;
		}
}
