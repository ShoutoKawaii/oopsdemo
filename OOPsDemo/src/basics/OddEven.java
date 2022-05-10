package basics;
import java.util.Scanner;

public class OddEven {
	/*
	 * Program to check entered number is Odd or Even & use of Modulus Operator
	 */

	public static void main(String[] args) {
		int a;
        Scanner scan=new Scanner(System.in);
       
        System.out.println("Enter a Number :");
        a=scan.nextInt();
       
        scan.close();
        if(a%2==0) {
        	System.out.println(+a+" is Even no.");
        }
        else {
        	System.out.println(+a+" is Odd");
        }

	}

}
