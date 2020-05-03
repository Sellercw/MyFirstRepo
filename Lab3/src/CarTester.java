public class CarTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		
		// set car1 fields
		car1.speed = 250;
		car1.make = "BMW";
		car1.yearModel = 2018;

		// set car2 fields
		car2.speed = 300;
		car2.make = "Tesla";
		car2.yearModel = 2018;

		
		System.out.println();
		
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		
		// Accelerate 4 times
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();

		// Brake 6 times
		car2.brake();
		car2.brake();
		car2.brake();
		car2.brake();
		car2.brake();
		car2.brake();
		
		System.out.println();
		
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		
		Car car3 = new Car();
		Car car4 = new Car();

		// set car3 fields
		car3.speed = 25;
		car3.make = "Google";
		car3.yearModel = 2020;

		// set car4 fields
		car4.speed = 20;
		car4.make = "Apple";
		car4.yearModel = 2020;

		System.out.println();
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());
		
		// Test equality
		if(car3.equals(car4)){
			System.out.println("The cars are equal");
		}
		else{
			System.out.println("The cars are not equal");
		}

		// Change car4 make
		car4.make = "Google";

		System.out.println();
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());

		// Test equality
		if(car3.equals(car4)){
			System.out.println("The cars are equal");
		}
		else{
			System.out.println("The cars are not equal");
		}

	}

}
