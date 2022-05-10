package basics;

public class WhileDemo1 {
	/*
	 * Program to display numbers from 1 to 10.
	 *
	 * Understand the concept of Loop.
	 * Loop - A set of statements executing repeatedly , until a particular
	 * condition is TRUE.
	 */

	public static void main(String[] args) {
		int i = 1;
		while(i<10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("");
		System.out.println("Reverse loop");
		int j = 10;
		while(j>0) {
			System.out.print(j+" ");
			j--;
		}

	}

}
