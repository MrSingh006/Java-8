package streams;

import java.util.ArrayList;

public class Count {

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
		long noOfFailedStudents = marks.stream().filter(i->i<35).count();
		System.out.println(noOfFailedStudents);
	}

}
