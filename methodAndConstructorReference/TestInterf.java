package methodAndConstructorReference;

public class TestInterf {
	public static void sum(int x, int y)
	{
		System.out.println("Sum is : "+(x+y));
	}
	public static void main(String[] args)
	{
		Interf i1 = (a,b)->System.out.println("Addition is : "+(a+b));
		i1.add(10, 20);
		
		Interf i2 =TestInterf::sum;
		i2.add(20, 40);
	}
	
}
