package comparable;

import java.util.ArrayList;
import java.util.Collections;

import comparator.MyComparator;

public class MyComparable{
	
	/*
	 * To sort an ArrayList of Integer objects using the Comparable interface, you
	 * don't need to implement Comparable for Integer itself since Integer already
	 * implements Comparable. You can simply use the Collections.sort() method to
	 * sort the ArrayList
	 */
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        System.out.println("Original ArrayList : ");
		System.out.println(numbers);
		// Sort the ArrayList of Integer objects
        Collections.sort(numbers);
		System.out.println("Sorted ArrayList : ");
		System.out.println(numbers);
        
	}
}
