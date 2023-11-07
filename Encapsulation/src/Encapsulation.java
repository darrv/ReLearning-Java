/* Learning esncapsulation from "Bro Code" Youtube */

public class Encapsulation {
	
	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Camaro", 2023);
		
		car.setYear(2022);

		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());

		
	}
}
