import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		Scanner sc = new Scanner(System.in);
		
		
		String brand;
		int model;
		int year;
		
		System.out.println("Enter the Brand of Bike :");
		brand = sc.next();
		
		System.out.println("Enter the Model of Bike : ");
		model = sc.nextInt();
		
		System.out.println("Enter the year of Bike : ");
		year = sc.nextInt();
		
		b1.display(brand,model,year);
		

	}

}
