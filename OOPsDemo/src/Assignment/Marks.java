package Assignment;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, c, total;
		float per;
		System.out.println("Enter Marks for First Subject(out of 100): ");
		a = s.nextInt();
		System.out.println("Enter Marks for Second Subject(out of 100): ");
		b = s.nextInt();
		System.out.println("Enter Marks for Third Subject(out of 100): ");
		c = s.nextInt();
		s.close();
		
		total = a+b+c;
		per = ((float)total*100)/300;
		
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+per);
	}

}
