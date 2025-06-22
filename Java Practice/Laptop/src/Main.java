import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{

		
		Laptop l =new Laptop();
		
		Scanner sc = new Scanner(System.in);
		
		

		String brand;
		int model;
		int year;
		
		System.out.println("Enter the Brand of Laptop :");
		brand = sc.next();
		
		System.out.println("Enter the Model of Laptop : ");
		model = sc.nextInt();
		
		System.out.println("Enter the year of Laptop : ");
		year = sc.nextInt();
		
		l.display(brand,model,year);
		 
	}

}
