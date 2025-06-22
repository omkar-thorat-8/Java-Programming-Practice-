
public class Account {
	
	private String accountType;
	private int ActId;
	private int accountNumber;
	private int balance;	

	public Account(int i, String string) {
		// TODO Auto-generated constructor stub
	}



	


	public int getActId() {
		return ActId;
	}






	public void setActId(int actId) {
		ActId = actId;
	}






	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public void withdraw(int amount) throws LowBalanceException{
		
		//this.balance = balance - amount ;
		
		if(balance<amount) {
			
			//try {
				throw new LowBalanceException();
			//}
//			catch(LowBalanceException e) {
//				
//				e.showMessage();
//			}
		}
		else
		{
			balance = balance-amount;
		}
	}
	
	public void checkBalance() {
		
		System.out.println("balance is " + this.balance);
	}
}
