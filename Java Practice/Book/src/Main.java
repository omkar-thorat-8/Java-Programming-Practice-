import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		Book b = new Book();
		
		Scanner sc = new Scanner(System.in);
		
		int pages;
		String colour;
		String type;
		
		System.out.println("Enter the No. of Pages  of Book : ");
		pages=sc.nextInt();
		System.out.println("Enter the Colour of Book : ");
		colour=sc.next();
		System.out.println("Enter the Type of Book : ");
		type=sc.next();
		
		b.display(pages,colour,type);

	}

}
