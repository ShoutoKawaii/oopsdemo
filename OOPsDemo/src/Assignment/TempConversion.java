package Assignment;
import java.util.Scanner;
public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Temperature to be Converted: ");
		double temp = s.nextDouble();
		s.close();
		
		res = (temp-32)*0.5555;
		
		System.out.print("Temperature in Celcius: ");
		System.out.format("%.3f", res);
		
	}

}
