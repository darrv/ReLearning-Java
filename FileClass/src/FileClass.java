/* Learning File Class from "Bro Code" Youtube */

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//file copied in project folder
		File file = new File("secret_message.txt"); // directory works too
		
		if(file.exists()) {
			System.out.println("That file exists :)");
			System.out.println(file.getPath()); // file name
			System.out.println(file.getAbsolutePath()); // file path
			System.out.println(file.isFile()); // is it a file? 
			file.delete(); // deletes file
			// more methods found at file.
		}
		else {
			System.out.println("That file doesn't exists :D");
		}
	}

}
