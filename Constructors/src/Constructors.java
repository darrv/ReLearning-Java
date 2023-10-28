/* Learning Java constructors from "Bro Code" Youtube */

public class Constructors {
	
	public static void main(String[] args) {
		Human human1 = new Human("Darren", 30, 70.0);
		Human human2 = new Human("Peter", 35, 55.6);
		
		//System.out.println(human1.name);
		//System.out.println(human2.name);
		
		human1.eat();
		human2.drink();
	}
}
