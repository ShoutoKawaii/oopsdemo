package oopsdemo3;

class SoftwareEngineer{
	
	
	protected String name, tech;
	double salary;
	
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void display() {
		System.out.println(name+" "+tech+" "+salary);
	}
	
	
	void work() {
		System.out.println("Coding and Testing");
	}
	
	
}

class Developer extends SoftwareEngineer{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	
	
	void work() {
		System.out.println("Coding using : "+tech);
	}
}
	
class Tester extends SoftwareEngineer{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	void work() {
		System.out.println("Coding using : "+tech);
	
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		SoftwareEngineer s1 = new SoftwareEngineer("Naveen", "Java Full Stack", 35000);
		Developer d1 = new Developer("Gosling", "Java", 25000);
		Tester t1 = new Tester("Mike", "JMeter", 20000);
		
		s1.display();
		s1.work();
		
		d1.display();
		d1.work();
		
		t1.display();
		t1.work();

	}

}
