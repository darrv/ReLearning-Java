
public class Cat extends Animal {
	
	@Override // good practice to let people know it overrides
	void speak() { // this method overrides the method by the parent class
		System.out.println("Cat goes meow!"); 
	}
	
}
