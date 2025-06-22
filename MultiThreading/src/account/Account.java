package account;

public class Account {

	private int accountNumber;
	private String name;
	private int balance;
	
	
	public Account(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public synchronized void withdraw(int amt)
	{
		if(amt > balance) {
			System.out.println(Thread.currentThread().getName() +": Insufficient Balance !!");
			return ; 
		}
		System.out.println(Thread.currentThread().getName()+ ": is withdrawing " + amt + "Rs");
		balance = balance - amt ; 
		System.out.println(Thread.currentThread().getName() +": Withdral successfull !! Remaining Balance is "+ balance) ;
	}
}
