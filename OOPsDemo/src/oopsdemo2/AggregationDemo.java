package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1 = new Address("Belgaum","Karnataka","India", 590006);
		
		Student s1 = new Student(69, "Kishan", ad1);
		
		s1.display();

	}

}
