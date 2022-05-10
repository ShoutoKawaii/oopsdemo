package oopsdemo2;

//parent class base class
class Animal{
	String name;
	
	public void eat() {
		System.out.println("I can Eat");
	}
}

//inherits Animal class 
//child class
	class Duck extends Animal{
		void display() {
			System.out.println("My name is: "+name);
		}
		
	}

public class SingleInheritanceTest {

	public static void main(String[] args) {
		Duck duck = new Duck();
		//access field of superclass
		duck.name = "UwU";
		duck.display();
		
		//calling method of superclass using derived class object
		duck.eat();

	}

}
