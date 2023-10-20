/* Simple Java GUI by "Bro Code" from youtube */

import javax.swing.JOptionPane; // import class

public class JavaGUI {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please tell me your name"); // get user input
		JOptionPane.showMessageDialog(null, "Welcome " +name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please tell me your age"));  // int conversion
		JOptionPane.showMessageDialog(null, "Your age is " +age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Please tell me your height(cm)"));  // double conversion
		JOptionPane.showMessageDialog(null, "Your height is " +height+ "cm tall");
		
	}
}
