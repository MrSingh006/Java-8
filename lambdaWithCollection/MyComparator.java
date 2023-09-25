package lambdaWithCollection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
//		if(i1<i2) {
//			return -1;
//		}
//		else if(i2>i1)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
		
		return (i1<i2) ? -1:((i1>i2) ? 1:0);
	}
	
	public int myMethod() {
		return 0;
	}
}
