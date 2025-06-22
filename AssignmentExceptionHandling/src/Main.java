
import java.util.Scanner;

public class Main {

	public static void main(){
		
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		
		try
		{
			System.out.println("Enter the Expertise : ");
			String exp = sc.nextLine();
			p.chechEligiblity(exp);
			
			System.out.println("Enter the Education : ");
			String edu = sc.nextLine();
			
			System.out.println("Enter the Passing Year : ");
			int year=sc.nextInt();
			
			System.out.println("Enter the Language : ");
			String lang = sc.nextLine();
			
			System.out.println("Enter the Age : ");
			int age = sc.nextInt();
			
			System.out.println("Enter the Expertise : ");
			String Exper = sc.nextLine();
			
		}
		catch()
		{
			
		}
		
	}
}
