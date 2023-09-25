package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortingOfString {
	public static void main(String[] args)
	{
		ArrayList<String> l =new ArrayList<String>();
		l.add("Sunny");
		l.add("Anushka");
		l.add("Mallika");
		l.add("Disha");
		l.add("Alliya");
		System.out.println(l);
		System.out.println(l.stream().sorted().collect(Collectors.toList()));
		System.out.println();
		
		//Sorting based on length of String
		ArrayList<String> l1 =new ArrayList<String>();
		l1.add("Sunny Leone");
		l1.add("Anushka Sharma");
		l1.add("Mallika Sherawat");
		l1.add("Disha Patani");
		l1.add("Alliya Bhatt");
		System.out.println(l1);
		System.out.println(l1.stream().sorted((s1,s2)->
		(s1.length()>s2.length())?1:(s1.length()<s2.length())?-1:0).collect(Collectors.toList()));
		System.out.println();
		
		//if length are same then sort according to alphabetical order
		System.out.println(l1.stream().sorted((s1,s2)->
		(s1.length()>s2.length())?1:(s1.length()<s2.length())?-1:s1.compareTo(s2)).collect(Collectors.toList()));
		System.out.println();
	}
}
