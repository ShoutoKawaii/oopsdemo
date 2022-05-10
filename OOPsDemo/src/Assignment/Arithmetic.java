package Assignment;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum, pro, diff;
		float div;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value oF a: ");
		a = s.nextInt();
		System.out.println("Enter Value of b: ");
		b = s.nextInt();
		s.close();
		
		sum = a+b;
		pro = a*b;
		diff = a-b;
		div = (float)a/b;
		
		System.out.println("Sum of the Numbers: "+sum);
		System.out.println("Product of the Numbers: "+pro);
		System.out.println("Difference of the Numbers: "+diff);
		System.out.println("Division of the Numbers: "+div);

	}

}
