import java.util.Scanner; // scanner class

public class AcceptUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("May I know your name?");
		String name = scanner.nextLine(); // getting user to input a String 
		
		System.out.println("What is your age?");
		int age = scanner.nextInt(); // getting user to input an integer 
		scanner.nextLine(); // calling this method again to clear out the "\n"
		
		System.out.println("Please tell me your favourite food."); // getting user to input a String 
		String food = scanner.nextLine();
		
		System.out.println("Welcome to Java, " +name); 
		System.out.println("Your age is " +age);
		System.out.println("Your favourite food is " +food);
	}

}
