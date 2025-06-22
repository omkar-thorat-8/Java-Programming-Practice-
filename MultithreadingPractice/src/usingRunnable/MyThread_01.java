package usingRunnable;
import usingThread.*;
public class MyThread_01 implements Runnable {

	@Override
	public void run() {

		
		for(int i = 1; i <= 10 ; i++) {
			
			System.out.println("Thread : " + i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.getMessage();
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		
		MyThread_01 myThread = new MyThread_01();
		
		Thread thread = new Thread(myThread);
		
		MyThread_02 thread2 = new MyThread_02();
		
//		thread.start();
//		thread2.start();
//		
		
		Thread thread3 =thread.currentThread();
//		
//		String string = thread3.getName();
//		
//		System.out.println(string);
//		System.out.println(thread3.getId());
//		show();
		
		thread.start();
		thread2.start();
		thread3.start();
	}

	static public void show() {
		
		Thread thread4 = Thread.currentThread();
		
		System.out.println(thread4.getName());
		System.out.println(thread4.getId());
	}
	
	
}
