package basics;
import java.util.Scanner;;
public class DoWhileDemo1 {
	//Java program to find the sum of positive numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			sum+=number;
			System.out.println("Enter no: ");
			number = s.nextInt();
			
		}
		while(number>=0);
		System.out.println("Sum of nos: "+sum);
		s.close();
		
	}

}
