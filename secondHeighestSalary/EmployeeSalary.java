package secondHeighestSalary;

public class EmployeeSalary {
	int id;
	String name;
	Long salary;
	
	public EmployeeSalary(int id,String name,Long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+":"+name+":"+salary;
	}
}
