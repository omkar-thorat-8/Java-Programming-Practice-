package account;

public class SyncDemo implements Runnable{

	
	Account ref ;
	int amt;
	
	
	
	public SyncDemo() {
		super();
	}

	public SyncDemo(Account ref, int amt) {
		super();
		this.ref = ref;
		this.amt = amt;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ref.withdraw(amt);
	}

}
