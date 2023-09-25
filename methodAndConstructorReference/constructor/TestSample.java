package methodAndConstructorReference.constructor;

public class TestSample {
	public static void main(String[] args)
	{
		SampleInterface i = Sample::new;
		Sample s1= i.get();
		Sample s2= i.get();
	}
}
