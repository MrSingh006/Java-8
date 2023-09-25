package biFunction;
import java.util.ArrayList;
import java.util.function.*;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<Integer,String,Employee> bf = (eno,name)->new Employee(eno,name);
		l.add(bf.apply(001, "Paurav"));
		l.add(bf.apply(002, "Anuj"));
		l.add(bf.apply(003, "Akshay"));
		l.add(bf.apply(004, "parag"));
		l.add(bf.apply(005, "parul"));
		for(Employee e:l)
		{
			System.out.println(e.eno);
			System.out.println(e.name);
			System.out.println();
		}
	}
}
