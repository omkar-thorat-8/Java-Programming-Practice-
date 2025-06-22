import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		car c1 = new car();
		Scanner sc = new Scanner(System.in);
		
		
		String brand;
		int model;
		int year;
		
		System.out.println("Enter the Brand of Car :");
		brand = sc.next();
		
		System.out.println("Enter the Model of Car : ");
		model = sc.nextInt();
		
		System.out.println("Enter the year of Car : ");
		year = sc.nextInt();
		
		c1.display(brand,model,year);
		
		
	}

}
