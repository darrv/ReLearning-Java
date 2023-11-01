/* Learning Super keyword from "Bro Code" Youtube */

public class Hero extends Person { // child class of parent class Person
	String power;
	
	Hero(String name, int age, String power) {
		
		super(name, age);
		this.power = power; // assignment of values to each attributes that Hero have
	}
	
	public String toString() {
		return super.toString() +this.power;
		}
}
