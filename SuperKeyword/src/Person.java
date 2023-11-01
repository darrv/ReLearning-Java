
public class Person {
	String name;
	int age;
	
	Person(String name, int age) { // method 
		this.name = name; 
		this.age = age;
	}
	
	public String toString() { // method
		return this.name + "\n" + this.age + "\n";
	}
}
