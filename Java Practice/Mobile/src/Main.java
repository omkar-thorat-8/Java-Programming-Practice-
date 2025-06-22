import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		mobile m =new mobile();
		
		Scanner sc = new Scanner(System.in);
		
		

		String brand;
		int model;
		int year;
		
		System.out.println("Enter the Brand of Mobile :");
		brand = sc.next();
		
		System.out.println("Enter the Model of Mobile : ");
		model = sc.nextInt();
		
		System.out.println("Enter the year of Mobile : ");
		year = sc.nextInt();
		
		m.display(brand,model,year);
		 
		
		
	}

}
