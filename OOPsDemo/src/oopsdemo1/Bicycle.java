package oopsdemo1;
//define attributes, methods & Objects in a same class
public class Bicycle {
	int gear;
	   
    void applyBrake()
    {
        System.out.println("Applying Brakes.... ");
    }
   
    public void startCycling()
    {
        gear=gear+1;
        System.out.println("Cycling in Gear No :"+gear);
    }
    
    public static void main(String[] args) {
		Bicycle sportCycle = new Bicycle();
		
		sportCycle.startCycling();
		sportCycle.startCycling();
		
		sportCycle.applyBrake();
	}

}

