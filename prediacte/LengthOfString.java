package prediacte;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
		Predicate<String> p = s-> s.length() >5;
		System.out.println(p.test("paurav"));
		System.out.println(p.test("anuj"));
		System.out.println(p.test("java"));
		
		
		Predicate<Integer> p1 = (i1) -> i1>5;
		System.out.println(p1.test(10));
		System.out.println(p1.test(5));
		
		
		String[] arr = {"Paurav","Anuj","Akshay","Parag","Parul"};
		Predicate<String> p2 = s3-> s3.length()>=5;
		for(String s1:arr)
		{
			if(p2.test(s1))
			{
				System.out.println(s1);
			}
		}

	}

}
