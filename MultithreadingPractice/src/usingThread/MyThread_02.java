package usingThread;
public class MyThread_02 extends Thread{

	@Override
	public void run() {

		for(int i=0 ; i<= 10 ; i++) {
			
			System.out.println("Thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}

}
