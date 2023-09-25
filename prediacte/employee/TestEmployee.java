package prediacte.employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Paurav",3000));
		l.add(new Employee("Anuj",2000));
		l.add(new Employee("Akshay",1000));
		l.add(new Employee("Parul",4000));
		l.add(new Employee("parag",5000));
		Predicate<Employee> p = e->e.salary>3000;
		for(Employee e1:l)
		{
			if(p.test(e1)) {
				System.out.println(e1);
			}
		}
	}

}
