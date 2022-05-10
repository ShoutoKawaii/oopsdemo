package basics;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Program to find sum of series .. 1 + 2 + 3 + ..... + n
		 */
		int i=1,n,sum=0;
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter Value for N : ");
        n=s.nextInt();
        s.close();
        
        while(i<=n) {
        	sum = sum+i;
        	 System.out.println("Sum of series in "+i+": "+sum);
        	i++;
        }
        System.out.println("Sum of N nos: "+sum);

	}

}
