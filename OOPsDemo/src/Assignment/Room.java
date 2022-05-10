package Assignment;

import java.util.Scanner;

public class Room {
	Scanner s = new Scanner(System.in);
	private int roomNo;
	private float area;
	private String roomType;
	boolean isACMachine;
	
	public void getData() {
		System.out.println("Enter Room Details");
		System.out.println("Enter your room no: ");
		roomNo = s.nextInt();
		System.out.println("Enter area in sq meters");
		area = s.nextFloat();
		System.out.println("Enter your Room type: ");
		roomType = s.nextLine();
		s.nextLine();
		System.out.println("Does your room have AC: ");
		isACMachine = s.nextBoolean();
	}
	public void display() {
		System.out.println("Room no: "+roomNo);
		System.out.println("Room type: "+roomType);
		System.out.println("Room area: "+area);
		System.out.println("AC Machine Availability: "+isACMachine);
	}
	
	
	

}
