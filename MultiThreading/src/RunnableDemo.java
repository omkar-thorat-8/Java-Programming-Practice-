
public class RunnableDemo implements Runnable{

	public static void main(String[] args) {

		Runnable r1 = new RunnableDemo();
		Runnable r2 = new RunnableDemo();

		Thread t1 =new Thread (r1);
		Thread t2 =new Thread (r2);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");

		
		t1.start();
		t2.start();
		
		try {
			t2.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		process5();
		process6();
		

	}
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("Thread 1"))
		{
			process1();
			process2();
		}
		else 
		{
			process3();
			process4();
		}
		
	}
	
	public static void process1()
	{
		System.out.println("UI Preperation");
	}
	
	public static void process2()
	{
		System.out.println("Accept String, That is SQL Query");
	}
	
	public static void process3()
	{
		System.out.println("Connect to remote MAchine ");
	}
	
	public static void process4()
	{
		System.out.println("Connect to Database Remote");
	}

	public static void process5()
	{
		System.out.println("Accept the output remote MAchine ");
	}
	
	public static void process6()
	{
		System.out.println("Display the Output");
	}
}
