import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) 
	{
		//Scanner sc =new Scanner(System.in);
		
	 	employee e1=new employee();
	 	employee e2=new employee(102,"Ankit",20000);
	 	
	 	new employee();
	 	new employee();
	 	
	 	
	 	System.out.println();
	 	
	 	//setters
	 	e1.setId(101);
	 	e1.setName("Ankit");
	 	e1.setSalary(10000);
	 	
	 	//getters
	 	e1.getId();
	 	e1.getName();
	 	e1.getSalary();
	 	
	 	
	 	int i= e1.getId();
	 	String n= e1.getName();
	 	int s = e1.getSalary();
	 
	 	System.out.println("Id is "+i+"\nName is "+n+"\nSalary is "+s);
	 	
	 	System.out.println();
	 	e1.display();
	 	System.out.println();
	 	e2.display();
	}

}
