
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread();
		thread.run();
		try {
			 Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyThread my = new MyThread();
		my.start();
		thread.start();
	}

}
