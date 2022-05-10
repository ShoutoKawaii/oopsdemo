package basics;

public class TernaryDemo {

	public static void main(String[] args) {
		int a=10,b=20,max;
		
		System.out.println("First no: "+a);
		System.out.println("Second no: "+b);
		
		max = (a>b) ? a:b;
		String msg = (a>b)? "A is greatest":"B is greatest";
		
		System.out.println("Greatest no: "+max);
		System.out.println("Greatest no: "+msg);

	}

}
