// Learning FileWriter from "Bro Code" Youtube

import java.io.FileWriter;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \n Violets are blue \n Test messages \n Flowers everywhere");
			writer.append("\n(A poem by Darren)");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
