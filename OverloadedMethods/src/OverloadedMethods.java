/* 
 * Overloaded Methods from "Bro Code" in youtube 
   Overloaded methods = same method name, but different parameters
*/

public class OverloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = add(1.0,2.0,3.0,4.0);
	}

	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;	
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;	
	}
	
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;	
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;	
	}
	
	
}