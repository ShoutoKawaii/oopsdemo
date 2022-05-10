package Assignment;
import java.util.Scanner;
public class Arithmetic2 {
	public static void main(String[] args) {
		int a, b, c, sum, pro;
		float avg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value oF a: ");
		a = s.nextInt();
		System.out.println("Enter Value of b: ");
		b = s.nextInt();
		System.out.println("Enter Value of c: ");
		c = s.nextInt();
		s.close();
		
		sum = a+b+c;
		pro = a*b*c;
		avg = sum/3;
		
		System.out.println("Sum of the Numbers: "+sum);
		System.out.println("Product of the Numbers: "+pro);
		System.out.println("Avergae of the Numbers: "+avg);
		
		if(a>b && a>c) {
			System.out.println(a+" is the Greatest");
		}
		else if(b>c) {
			System.out.println(b+" is Greatest");
		}
		else {
			System.out.println(c+" is Greatest");
		}
		if(a<b && a<c) {
			System.out.println(a+" is the Smallest");
		}
		else if(b<c) {
			System.out.println(b+" is Smallest");
		}
		else {
			System.out.println(c+" is Smallest");
		}
	}

}
