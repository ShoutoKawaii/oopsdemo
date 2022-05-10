package Assignment;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = s.nextInt();
		System.out.println("Enter second number: ");
		b = s.nextInt();
		s.close();
		
		if(b%a==0) {
			System.out.println("First number is a Multiple of Second Number");
		}
		else {
			System.out.println("First number is not a Multiple of Second Number");
		}

	}

}
