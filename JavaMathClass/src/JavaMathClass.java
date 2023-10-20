/* Java Math Class by "Bro Code" from youtube */

import java.util.Scanner;

public class JavaMathClass {

	public static void main(String[] args) {
		double x = 10.5;
		double y = 20.4;
		
		/* various Math classes below */ 
		double a = Math.max(x, y);
		double b = Math.min(x, y);
		double c = Math.abs(x);
		double d = Math.sqrt(y);
		double e = Math.round(x);
		double f = Math.ceil(x); // round up
		double g = Math.floor(x); // round down

		
		/* Simple program to calculate the hypotenuse of a triangle given 2 sides */
		double side1;
		double side2;
		double side3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side 1: ");
		side1 = scanner.nextDouble();
	
		System.out.println("Enter side 2: ");
		side2 = scanner.nextDouble();
		
		side3 = Math.sqrt((side1*side1) + (side2*side2));
		
		System.out.println("The calculated hypotenuse is: " + side3);
		
		scanner.close(); // good practice to close it
				
	}

}
