
public class Friend {
	String name;
	static int numberOfFriends; // Static: Single copy of variable/method is created and shared
	
	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	static void displaceFriends() {
		System.out.println("You have " +numberOfFriends+ " friends.");
	}
}
