
public class Carnivora extends Mammal {
	String type;
	boolean isWild;
	public Carnivora(String name, int age, String type, boolean isWild) {
		super(name, age);
		this.type = type;
		this.isWild = isWild;
	}
	public Carnivora(Carnivora carnivora) {
		this.name = carnivora.name;
		this.age = carnivora.age;
		this.type = carnivora.type;
		this.isWild = carnivora.isWild;
	}
	public boolean equals(Carnivora carnivora) {
		return((this.name.equals(carnivora.name) && (this.age == carnivora.age) && (this.type.equals(carnivora.type))));
	}
	public String toString() {
		if(isWild) {
			return super.toString() + " I belong to the " + type + " family and a wild memeber.";
		}
		else {
			return super.toString() + " I belong to the " + type + " family and not a wild memeber.";
		}
	}
	
}
