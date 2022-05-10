package oopsdemo2;

public class AccountantTest {

	public static void main(String[] args) {
		Accountant a1 = new Accountant(201,"Gaurav Sharma","Process Salary of Employees","SAP");
		Accountant a2 = new Accountant(205,"Mary John","Payment to Vendors","Tally");
		
		a1.print();
		a2.print();

	}

}
