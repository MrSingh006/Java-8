package methodAndConstructorReference.constructor;

public class TestStudent {

	public static void main(String[] args) {
		
		/* Constructor Reference Way */
		StudentInterf i = Student::new;
		i.get(null, 0, 0, 0);
		
		/* Lambda expression way */
		StudentInterf si = (name, rollNo, marks, age) -> new Student(name, rollNo, marks, age);	
		si.get(null, 0, 0, 0);
		
		/* General way of doing things */
		StudentRegularWayImplementation regular = new StudentRegularWayImplementation();
		regular.get(null, 0, 0, 0);

	}

}
