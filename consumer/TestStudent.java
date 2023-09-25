package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudent {
	public static void main(String[] args) 
	{
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student("Paurav",100));
		l.add(new Student("Anuj",75));
		l.add(new Student("Akshay",60));
		l.add(new Student("Parag",40));
		l.add(new Student("Parul",25));
		
		Function<Student,String> f= s-> {
			String grade = "";
			if(s.marks>=80)
			{
				grade= "A[Distinction]";
			}
			else if(s.marks>=70)
			{
				grade= "B[First class]";
			}
			else if(s.marks>=60)
			{
				grade= "C[Second class]";
			}
			else if(s.marks>=40)
			{
				grade= "A[Third class]";
			}
			else if(s.marks<=40)
			{
				grade= "A[Fail]";
			}
			return grade;	
		};
		Consumer<Student> c = s->{
			System.out.println("Student name: "+s.name);
			System.out.println("Student marks: "+s.marks);
			System.out.println("Student grade: "+f.apply(s));
			System.out.println();
		};
		for(Student s1 :l)
		{
			Predicate<Student> p = s -> s.marks>60;
			if(p.test(s1))
			{
				c.accept(s1);
			}
		}
	}
}
