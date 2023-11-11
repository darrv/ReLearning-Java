/* Learning Polymorphism from "Bro Code" Youtube */

public class Polymorphism {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		for(Vehicle x : racers) {
			x.go();
		}
	}
}
