import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
        Watch w =new Watch();
		
		Scanner sc = new Scanner(System.in);
		
		

		String brand;
		int model;
		int year;
		
		System.out.println("Enter the Brand of Watch :");
		brand = sc.next();
		
		System.out.println("Enter the Model of Watch : ");
		model = sc.nextInt();
		
		System.out.println("Enter the year of Watch : ");
		year = sc.nextInt();
		
		w.display(brand,model,year);
		 
		
		
	}

}
