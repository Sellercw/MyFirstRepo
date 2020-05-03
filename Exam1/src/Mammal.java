
public class Mammal {
	String name;
	int age;
	
	public Mammal() {
		name = null;
		age = 0;
	}
	public Mammal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Mammal mammal) {
		return(this.name.equals(mammal.name) && this.age == mammal.age);
	}
	public String toString() {
		return "My name is " + name + " and I am " + age + " years old. I belong to the class mammalia in the Animal kingdom.";
	}
	
}
