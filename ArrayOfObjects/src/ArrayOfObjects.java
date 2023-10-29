/* Learning Array of Objects from "Bro Code" Youtube */

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = new int[3];
//		char[] characters = new char[4];
//		String[] strings = new String[5];
		
//		food[] refrigerator = new food[3]; //array object called refrigerator
		

		
		food food1 = new food("Pizza");  // object food1 with constructor Pizza
		food food2 = new food("Burger"); // object food2
		food food3 = new food("Fries");  // object food3
		
		food[] refrigerator = {food1, food2, food3}; // object refrigerator having an array of objects
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;

		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
	}

}
