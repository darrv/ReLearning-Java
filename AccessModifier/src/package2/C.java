package package2;
import package1.*;

public class C {
	
	public String publicMessage = "Public message"; 
	
 // protected: accessible to different class/package as long as that class is a child class of this class(C)	
	protected String protectedMessage = "Protected Message";
	
	String defaultMessage = "This is the default";
// only visible to its own class
	private String privateMessage = "Private Message";

	
}
