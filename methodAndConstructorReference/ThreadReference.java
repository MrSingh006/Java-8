package methodAndConstructorReference;

public class ThreadReference {
	public void m1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("ChildThread-1");
		}
	}
	private static int m2()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("ChildThread-2");
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		ThreadReference tr =new ThreadReference();
		Runnable r = tr::m1;
		Thread t =new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread-1");
		}
		
		System.out.println("**************************************************************");
		Runnable r1 = ThreadReference::m2;
		Thread t1 =new Thread(r1);
		t1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread-2");
		}
	}

}
