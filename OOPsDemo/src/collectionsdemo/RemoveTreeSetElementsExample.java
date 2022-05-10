package collectionsdemo;

import java.util.TreeSet;

public class RemoveTreeSetElementsExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(42);
        numbers.add(49);
        numbers.add(50);

        System.out.println("numbers TreeSet : " + numbers);

        // Remove an element from the TreeSet
        boolean isRemoved = numbers.remove(49);
        if(isRemoved) {
            System.out.println("After Removing 49 : " + numbers);
        }

        // Remove all elements divisible by 3
        numbers.removeIf(number -> number % 3 == 0);
        System.out.println("After removeIf() : " + numbers);

	}

}
