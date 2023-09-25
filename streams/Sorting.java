package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(50);
		marks.add(90);
		marks.add(45);
		marks.add(20);
		marks.add(25);
		marks.add(65);
		marks.add(30);
		marks.add(45);
		List<Integer> noOfFailedStudents = marks.stream().filter(i->i<35).sorted().collect(Collectors.toList());
		System.out.println(noOfFailedStudents);
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedMarks);
		
		/* Custom Sorting */
		List<Integer> sortingDescending = marks.stream().sorted((i1,i2)->i1<i2?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(sortingDescending);
		
		/* Sorting with compareTo */
		List<Integer> sortingCompareTo = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortingCompareTo);
		
		/* Sorting with compareTo using -ve */
		List<Integer> sortingCompareTo1 = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortingCompareTo1);
		
		/* Sorting with compareTo using interchange i1 and i2 */
		List<Integer> sortingCompareTo2 = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(sortingCompareTo2);
	}
}
