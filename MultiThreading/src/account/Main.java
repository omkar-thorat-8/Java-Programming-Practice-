package account;

public class Main {
	
	public static void main(String[] args) {
		
		Account a1 = new Account(101,"Ankit",1000);
		
		Thread t1 = new Thread(new SyncDemo(a1,1000));
		Thread t2 = new Thread(new SyncDemo(a1,400));

		t1.setName("User1");
		t2.setName("User2");

		t1.start();
		t2.start();
		
	}

}
