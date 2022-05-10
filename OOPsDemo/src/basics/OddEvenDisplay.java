package basics;

public class OddEvenDisplay {
	//prgm to display odd & even nos between 1 & 10
	/*
	ODD        EVEN
	---        ----
	1        2
	3        4
	5        6
	7        8
	9        10     
	*/   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("ODD \t EVEN");
		System.out.println("--- \t ----");
		
		while(i<=10) 
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			else 
			{
			System.out.println("\t "+i);
			}
			i++;
		}
	}
}
