/* Learning Static Keyword from "Bro Code" Youtube */

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Friend friend1 = new Friend("Patrick"); // create object friend1 with constructor Patrick
		Friend friend2 = new Friend("Bob"); // create object friend2 with constructor Bob
		Friend friend3 = new Friend("Squid"); // create object friend2 with constructor Squid
		Friend friend4 = new Friend("John"); // create object friend2 with constructor John

		
//		System.out.println(Friend.numberOfFriends);
		Friend.displaceFriends();
		

	}
	
}
