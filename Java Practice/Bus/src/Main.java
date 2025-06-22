import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		
		Bus b1 = new Bus();
		Scanner sc = new Scanner(System.in);
		
		
		String brand;
		int model;
		int year;
		
		System.out.println("Enter the Brand of Bus :");
		brand = sc.next();
		
		System.out.println("Enter the Model of Bus : ");
		model = sc.nextInt();
		
		System.out.println("Enter the year of Bus : ");
		year = sc.nextInt();
		
		b1.display(brand,model,year);
		
		
	}

}
