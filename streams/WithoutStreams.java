package streams;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreams {
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
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i :l)
		{
			if(i%2==0)
			{
				l1.add(i);
			}
		}
		System.out.println("Filtered List : "+l1);
		List<Integer> l2 = new ArrayList<Integer>();
		for(int i :l)
		{
			i=i*2;
			l2.add(i);
		}
		System.out.println("Map List : "+l2);
	}
}
