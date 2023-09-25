package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
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
		MyComparator comparator = new MyComparator();
		Collections.sort(al, comparator);
		System.out.println("Sorted ArrayList : ");
		System.out.println(al);
	}

}
