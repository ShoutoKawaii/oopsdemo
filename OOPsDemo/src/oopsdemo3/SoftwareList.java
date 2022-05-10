package oopsdemo3;

import com.wipro.training.microsoft.OperatingSystem;
import com.wipro.training.oracle.Database;

//Demonstrate the use of package
public class SoftwareList {

	public static void main(String[] args) {


		Database d1 = new Database();
		d1.printSoftware();
		
		System.out.println("--------------");
		
		OperatingSystem o1 = new OperatingSystem();
		o1.listSoftware();
		
		System.out.println("--------------");

	}

}
