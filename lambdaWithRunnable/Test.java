package lambdaWithRunnable;

public class Test {
//	public static void main(String[] args)
//	{
//		Runnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
//		for(int i =0; i<10; i++)
//		{
//			System.out.println("Main Thread");
//		}
//	}
	
	/* Implementation of MyRunable using Lambda. Now we do not need MyRunnable class*/
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
/* Here while running this class order is not specified */

