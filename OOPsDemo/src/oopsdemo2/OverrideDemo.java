package oopsdemo2;

class Bank{
	int getRateOfInterest() {
		
		return 0;
		}
	void display(){
        
		System.out.println("Welcome to Bank");
    }
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 5;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class Axis extends Bank{
	int getRateOfInterest() {
		return 6;
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		SBI b1=new SBI();
        ICICI b2=new ICICI();
        Axis b3=new Axis();
       
        b1.display();
        System.out.println("The Interest Rate of SBI is : "+b1.getRateOfInterest());
       
        b2.display();
        System.out.println("The Interest Rate of ICICI is : "+b2.getRateOfInterest());
       
        b3.display();
        System.out.println("The Interest Rate of Axis is : "+b3.getRateOfInterest());

	
	}
}

