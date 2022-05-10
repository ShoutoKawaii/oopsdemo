package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		Trainee t1 = new Trainee();
		t1.display();
		Trainee t2 = new Trainee(111, "Kishan", "Java", 5000);
		t2.display();
		Trainee t3 = new Trainee(111, "Shoto", "Hibernate", 8000);
		t3.display();
		

	}

}
