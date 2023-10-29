/* Learning Object Passing from "Bro Code" Youtube */

public class ObjectPassing {
	
public static void main(String[] args) {
	
	Garage garage = new Garage();
	Car car1 = new Car("Toyota");
	Car car2 = new Car("Hyundai");
	
	garage.park(car1);
	garage.park(car2);

	}
}
