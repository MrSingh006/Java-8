package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println("Original List : "+l);
		List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Filtered List : "+l1);
		List<Integer> l2 = l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("Map List : "+l2);
	}

}
