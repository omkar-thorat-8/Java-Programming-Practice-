import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		    Lense l =new Lense();
			
			Scanner sc = new Scanner(System.in);
			
			

			String brand;
			int model;
			int year;
			
			System.out.println("Enter the Brand of Lense :");
			brand = sc.next();
			
			System.out.println("Enter the Model of Lense : ");
			model = sc.nextInt();
			
			System.out.println("Enter the year of Lense : ");
			year = sc.nextInt();
			
			l.display(brand,model,year);
			 
			
	}

}
