package secondHeighestSalary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSalary {
	public static void main(String[] args) {
		ArrayList<EmployeeSalary> l = new ArrayList<EmployeeSalary>();
		l.add(new EmployeeSalary(105, "Parul", (long) 999900));
		l.add(new EmployeeSalary(103, "Akshay", (long) 999990));
		l.add(new EmployeeSalary(102, "Anuj", (long) 999996));
		l.add(new EmployeeSalary(101, "Paurav", (long) 999999));
		l.add(new EmployeeSalary(104, "Parag", (long) 999995));
		System.out.println(l);
//		Comparator<EmployeeSalary> c = (e1,e2)->(e1.id<e2.id)?-1:((e1.id>e2.id)?1:0);
//		l.sort(c);
		
//		Collections.sort(null);
//		Collections.sort(null, null);
		
		Collections.sort(l,(e1,e2)->(e1.id<e2.id)?-1:((e1.id>e2.id)?1:0));
		System.out.println(l);
		System.out.println(l.get(l.size()-2));
	}
}
