package employee;
public class Main {

	public static void main(String[] args) 
	{

		Employee e1 = new Employee(10,"Ankit",5000);
		SalesManager s1=new SalesManager();
		Hr h = new Hr(10,"Prem",10000,50);
		
		
		e1.display();
		System.out.println("-----------------");
		s1.display();
		System.out.println("-----------------");
		h.display();
		
	}

}
