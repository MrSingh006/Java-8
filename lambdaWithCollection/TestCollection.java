package lambdaWithCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>(); 
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(45);
		l.add(35);
		l.add(25);
		l.add(15);
		l.add(5);
		System.out.println(l);
		MyComparator comp = new MyComparator();
		l.sort(comp);
		System.out.println(l);
		/* OR */
		Collections.sort(l, comp);
		System.out.println(l);
		
//		Comparator<Integer> c = (i1,i2)-> {
//			if(i1<i2) {
//				return -1;
//			}
//			else if(i2>i1)
//			{
//				return 1;
//			}
//			else
//			{
//				return 0;
//			}
//		};
		Comparator<Integer> c = (i1,i2) -> { return (i1<i2) ? -1:((i1>i2) ? 1:0);};
		l.sort(c);
		System.out.println("sorting by lambda");
		System.out.println(l);
	}

}
