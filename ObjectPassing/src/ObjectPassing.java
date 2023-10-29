/* Learning Object Passing from "Bro Code" Youtube */

public class ObjectPassing {
	
public static void main(String[] args) {
	
	Garage garage = new Garage(); // object garage 
	
	Car car1 = new Car("Toyota");  // object car1
	Car car2 = new Car("Hyundai"); // object car2
	
	garage.park(car1); // object garage using method park, and passing object car1
	garage.park(car2); // object garage using method park, and passing object car2

	}
}
