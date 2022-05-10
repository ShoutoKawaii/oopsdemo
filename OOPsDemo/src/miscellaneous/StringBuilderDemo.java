package miscellaneous;

/*
 * StringBuilder is a mutable sequence of characters.
 * StringBuilder is used when we want to modify Java strings in-place.
 *  StringBuffer is a thread-safe equivalent similar of StringBuilder.
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String s1 = "rock";
		String s2 = s1.replace('r', 'd');
		System.out.println("The original string: "+s1+ " The modified String: "+s2);
		
		StringBuilder sb = new StringBuilder("rock");
		sb.replace(0, 1, "d");
		
		System.out.println("The modified String: "+sb);
		
		String s3 = "There is a Red FOX in the forest";
		StringBuilder sb1 = new StringBuilder(s3);
		
		sb1.insert(19, "and a Wolf ");
		System.out.println(sb1);
		
		sb1.append(" of Western Ghat");
		System.out.println(sb1);
		
		int pos = sb1.indexOf("Wolf");
		System.out.println("The position of Wolf in sb1: "+pos);
		
		int i = sb1.indexOf("Wolf");
		int j = "Wolf".length();
		
		sb1.replace(i, i+j, "Dog");
		
		System.out.println(sb1);
		
		String s4 = sb1.substring(10, 28);
		
		System.out.println("The Substring of sb1: "+s4);
		
		sb1.reverse();
		System.out.println(sb1);

	}

}
