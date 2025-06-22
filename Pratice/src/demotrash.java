import java.time.LocalDateTime;

public class BankSystem 
{
    private Account[] accounts;
    private int accountCount;
    private String[] operationHistory;

    public BankSystem(int maxAccounts) 
    {
        accounts = new Account[maxAccounts];
        operationHistory = new String[maxAccounts];
        accountCount = 0;
    }

    public void addAccount(Account account) 
    {
        if (accountCount < accounts.length)
        {
            accounts[accountCount] = account;
            operationHistory[accountCount] = "Account Opened: " + LocalDateTime.now();
            accountCount++;
        } 
        else 
        {
            System.out.println("Cannot add more accounts. Maximum limit reached.");
        }
    }

    public Account login(String accountNumber) 
    {
        for (int i = 0; i < accountCount; i++)
        {
            if (accounts[i].getAccountNumber().equals(accountNumber))
            {
                return accounts[i];
            }
        }
        return null;
    }

    public boolean closeAccount(String accountNumber) 
    {
        for (int i = 0; i < accountCount; i++) 
        {
            if (accounts[i].getAccountNumber().equals(accountNumber)) 
            {
                System.out.println("Account " + accountNumber + " closed successfully.");
                
                for (int j = i; j < accountCount - 1; j++)
                {
                    accounts[j] = accounts[j + 1];
                    operationHistory[j] = operationHistory[j + 1];
                }
                
                accounts[--accountCount] = null;
                operationHistory[accountCount] = null;
                return true;
            }
        }
        return false;
    }

    public void performEndOfDay() 
    {
        System.out.println("\nEnd-of-Day Report:");
        
        for (int i = 0; i < accountCount; i++)
        {
            accounts[i].calculateInterest();
            System.out.println(accounts[i].getAccountDetails());
            System.out.println("Operation History: " + operationHistory[i]);
        }
    }

    public String[] getOperationHistory() {
        return operationHistory;
    }
}



import java.util.Scanner; 

public class Main {
	
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        BankSystem bankSystem = new BankSystem(20);

        bankSystem.addAccount(new SavingsAccount("101", "Ankit", 12000));
        bankSystem.addAccount(new SalaryAccount("102", "Sarvesh", 15000));
        bankSystem.addAccount(new CurrentAccount("103", "Aditya", 5000, 10000));
        bankSystem.addAccount(new LoanAccount("104", "Sumit", 50000, 5));

        while (true) 
        {
        	System.out.println();
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|                                                               |");
            System.out.println("|              ~~ Welcome to FirstBit Bank ~~                   |");
            System.out.println("|                                                               |");
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|                                                               |");
            System.out.println("|             1. Login to your account                          |");
            System.out.println("|                                                               |");
            System.out.println("|             2. Create a new account                           |");
            System.out.println("|                                                               |");
            System.out.println("|             3. End of Day Report                              |");
            System.out.println("|                                                               |");
            System.out.println("|             4. Close Account                                  |");
            System.out.println("|                                                               |");
            System.out.println("|             5. Exit                                           |");
            System.out.println("|                                                               |");
            System.out.println("+---------------------------------------------------------------+");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1: 
                    System.out.print("Enter your account number: ");
                    String accountNumber = scanner.nextLine();
                    Account loggedInAccount = bankSystem.login(accountNumber);

                    if (loggedInAccount != null) 
                    {
                        System.out.println("Login successful! Welcome, " + loggedInAccount.getAccountHolderName() + ".");
                        boolean exit = false;
                        
                        while (!exit) 
                        {
                            System.out.println("\n1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. View Account Details");
                            System.out.println("4. Exit");
                            System.out.print("Choose an option: ");
                            int operation = scanner.nextInt();

                            try {
                                switch (operation) {
                                    case 1:
                                        System.out.print("Enter amount to deposit: ");
                                        double depositAmount = scanner.nextDouble();
                                        loggedInAccount.deposit(depositAmount);
                                        break;

                                    case 2:
                                        System.out.print("Enter amount to withdraw: ");
                                        double withdrawAmount = scanner.nextDouble();
                                        loggedInAccount.withdraw(withdrawAmount);
                                        break;

                                    case 3:
                                        System.out.println("Account Details: ");
                                        System.out.println(loggedInAccount.getAccountDetails());
                                        break;

                                    case 4:
                                        exit = true;
                                        System.out.println("Logging out.");
                                        break;

                                    default:
                                        System.out.println("Invalid option.");
                                }
                            } catch (CustomException e)
                            {
                                System.out.println(e);
                            }
                        }
                    } 
                    else 
                    {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 2: 
                	
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter initial deposit amount: ");
                    double initialBalance = scanner.nextDouble();
                    
                    System.out.print("Choose account type (1: Savings, 2: Salary, 3: Current, 4: Loan): ");
                    int accountType = scanner.nextInt();
                    
                    Account newAccount = null;

                    switch (accountType)
                    {
                        case 1:
                        	
                            newAccount = new SavingsAccount("10" + (bankSystem.getOperationHistory().length + 1), name, initialBalance);
                            break;

                        case 2:
                        	
                            newAccount = new SalaryAccount("10" + (bankSystem.getOperationHistory().length + 1), name, initialBalance);
                            break;

                        case 3:
                        	
                            System.out.print("Enter overdraft limit: ");
                            double overdraftLimit = scanner.nextDouble();
                            
                            newAccount = new CurrentAccount("10" + (bankSystem.getOperationHistory().length + 1), name, initialBalance, overdraftLimit);
                            break;

                        case 4:
                        	
                            System.out.print("Enter loan amount: ");
                            double loanAmount = scanner.nextDouble();
                            
                            System.out.print("Enter interest rate: ");
                            double interestRate = scanner.nextDouble();
                            
                            newAccount = new LoanAccount("10" + (bankSystem.getOperationHistory().length + 1), name, loanAmount, interestRate);
                            break;

                        default:
                        	
                            System.out.println("Invalid account type.");
                    }

                    if (newAccount != null) 
                    {
                        bankSystem.addAccount(newAccount);
                        System.out.println("Account created successfully! Your account number is: " + newAccount.getAccountNumber());
                    }
                    break;

                case 3: 
                    bankSystem.performEndOfDay();
                    break;

                case 4: 
                	
                    System.out.print("Enter account number to close: ");
                    String closeAccountNumber = scanner.nextLine();
                    
                    if (!bankSystem.closeAccount(closeAccountNumber)) 
                    {
                        System.out.println("Account not found or already closed.");
                    }
                    break;

                case 5:
                	
                    System.out.println("Thank you for using FirstBit Bank. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

