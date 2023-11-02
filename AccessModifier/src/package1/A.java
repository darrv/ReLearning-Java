/* Learning Access Modifiers from "Bro Code" Youtube */

package package1;
import package2.*;

public class A {
	
	protected String protectedMessage = "Protected Message";  	
	public static void main(String[] args) {
		
		B b = new B();
		
		// does not work because it is on a different class
		System.out.println(b.privateMessage); 
	}

}
