package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Program to iterate in ArrayList using various constructs
public class ArrayListIterationDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("James");
        names.add("Micheal");
        names.add("Andy");
        names.add("Jim");
        names.add("Robert");
       
        System.out.println(names);
        
        System.out.println("*** Display Collection using Iterator***");
        //Iterator Interface for Traversing
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println();
        System.out.println(names.get(1));
        
        names.add(3,"Kishan"); // adding element in specified index
        names.remove(0); // delete first element
        names.set(1, "Java"); // replace existing element
        
        System.out.println();
        System.out.println("*******Display collection using Enhanced For Loop*******");
        
        for(String i : names) {
        	System.out.println(i);
        }
        
        ArrayList<Double> marks=new ArrayList<Double>();
        marks.add(999.45);
        marks.add(500.20);
        marks.add(768.25);
        marks.add(871.90);
        marks.add(450.45);
       
        System.out.println();
        for(Double i:marks)
        {
            System.out.println(i);
        }
        
        Collections.sort(marks);
        System.out.println();
        
        System.out.println("Sorted Marks after Iteration");
        Iterator<Double> itr2 = marks.iterator();
        
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }
        
        System.out.println();
        System.out.println(marks);

	}

}
