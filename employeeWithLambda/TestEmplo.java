package employeeWithLambda;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmplo {

	public static void main(String[] args) {
		ArrayList<Employee> l =new ArrayList<Employee>();
		l.add(new Employee(105,"Parul"));
		l.add(new Employee(101,"Paurav"));
		l.add(new Employee(103,"Akshay"));
		l.add(new Employee(102,"Anuj"));
		l.add(new Employee(104,"Parag"));
		System.out.println(l);
		Collections.sort(l,(e1,e2) -> (e1.id<e2.id)?-1:(e1.id>e2.id?1:0));
		System.out.println(l);
		System.out.println("******Compare with name******");
		Collections.sort(l, (e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
	}

}
