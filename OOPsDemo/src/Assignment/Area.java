package Assignment;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l, b, area;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length in fractions: ");
		l = s.nextDouble();
		System.out.println("Enter Breadth in fractions: ");
		b = s.nextDouble();
		s.close();
		
		area = l*b;
		System.out.println("Area of Rectangle: "+(int)area);
	}

}
