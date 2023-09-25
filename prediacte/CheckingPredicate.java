package prediacte;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckingPredicate {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
//		Integer I=sc.nextInt();
		Predicate<Integer> p = i -> i%2==0;
		System.out.println("Enter ur value : "+p.test(sc.nextInt()));
		System.out.println(p.test(5));
	}

}
