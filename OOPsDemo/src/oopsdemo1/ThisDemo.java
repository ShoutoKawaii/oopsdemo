package oopsdemo1;

public class ThisDemo {
	
	int age;
	
	void init(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		ThisDemo td1 = new ThisDemo();
		
		td1.init(20);
		
		System.out.println("Age: "+td1.age);

	}

}
