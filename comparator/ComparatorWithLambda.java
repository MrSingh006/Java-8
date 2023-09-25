package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithLambda {
	/*
	 * Here note that we have not implemented any comparator interface nor we have
	 * made any MyComparator class since Comparator is f.i. we can directly use
	 * lambda expression for concise code.
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(25);
		al.add(20);
		al.add(45);
		al.add(35);
		al.add(30);
		al.add(40);
		al.add(45);
		al.add(10);
		al.add(5);
		al.add(55);
		al.add(50);
		System.out.println("Original ArrayList : ");
		System.out.println(al);
		Comparator<Integer> c = (i1,i2)-> (i1>i2)?1:(i2>i1)?-1:0;
		Collections.sort(al, c);
		System.out.println("Sorted ArrayList : ");
		System.out.println(al);
	}
}
