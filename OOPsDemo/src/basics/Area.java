package basics;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	
				Scanner s=new Scanner(System.in);
				float a, r;
				final float PI = 3.14f;
				
				System.out.println("Enter the Radius: ");
				r = s.nextFloat();
				
				a = PI*r*r;
				
				System.out.print("The Area Of the Circle: " );
				System.out.format("%.2f" ,a);
				}

}
