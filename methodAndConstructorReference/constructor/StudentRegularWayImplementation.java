package methodAndConstructorReference.constructor;

public class StudentRegularWayImplementation implements StudentInterf{

	public Student get(String name, int rollNo, int marks, int age) {
		/* Here I have to provide whole implementation by making object */
		
		Student s = new Student(name, age, age, age);
		return s;
	}

}
