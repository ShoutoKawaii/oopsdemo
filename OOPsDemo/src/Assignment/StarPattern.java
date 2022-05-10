package Assignment;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int rows = s.nextInt();
		s.close();;
		
		for(int i=1; i<=rows; i++)
			{
			for(int j=rows; j>i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++) 
			{
				System.out.print("*");
			}
				System.out.println("");
			}
		for(int i=rows-1; i>=1; i--)
		{
		for(int j=rows; j>i;j--) 
		{
			System.out.print(" ");
		}
		for(int k=1; k<=(i*2)-1; k++) 
		{
			System.out.print("*");
		}
			System.out.println("");
		}
	}
}
