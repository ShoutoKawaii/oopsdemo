package oopsdemo2;

public class CanditateTest {

	public static void main(String[] args) {
		System.out.println("****Candidate Details****");
		JavaCanditate jc1 = new JavaCanditate(1111, "Gavin King", 5000, "Hibernate");
		jc1.display();
		jc1.getperks();
		
		AccountsCanditate ac1=new AccountsCanditate(2222, "Mike John", 3000);
		ac1.display();
		ac1.getperks();

	}

}
