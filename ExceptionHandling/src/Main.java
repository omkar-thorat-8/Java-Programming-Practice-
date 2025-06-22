import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		
		try {
			a.withdraw(1000);
		} 
		catch (LowBalanceException e) {

			e.showMessage();
		}
		a.checkBalance();
		
		System.out.println("Enter the initial balance");
		int initialBalance=sc.nextInt();
		a.setBalance(initialBalance);
		
		// ( here also we wanted to handle the Exception because we has throws 
		// the Exception (Otherwise no Need to handle the Exception here )
		try {
			a.withdraw(1000);
		} catch (LowBalanceException e) {
			// TODO Auto-generated catch block
			e.showMessage();
		}
	
		a.checkBalance();
		
	}

}
