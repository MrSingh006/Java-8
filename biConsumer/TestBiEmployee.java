package biConsumer;

import java.util.ArrayList;
import java.util.function.*;

public class TestBiEmployee {
	public static void main(String[] args)
	{
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		BiConsumer<Employee,Double> bc = (e,d)->e.salary=e.salary+d;
		for(Employee e :l)
		{
			bc.accept(e, 1000.0);
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println();
		}
	}
	
	public static void populate(ArrayList<Employee> l)
	{
		l.add(new Employee("Paurav",5000));
		l.add(new Employee("Anuj",4000));
		l.add(new Employee("Akshay",3000));
		l.add(new Employee("Parag",2000));
		l.add(new Employee("Parul",1000));
	}
}
