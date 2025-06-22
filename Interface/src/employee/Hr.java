package employee;


public class Hr extends Employee 
{
	
	int commision;

	
	public Hr() 
	{
		this.commision=0;
	}

	public Hr(int id, String name, double salary, int commision) 
	{
		
		super(id, name, salary);
		this.commision = commision;
	}

	public void setCommision(int commision)
	{
		this.commision = commision;
	}
	
	public int getCommision() 
	{
		return commision;
	}

	public void display()
	{
		System.out.println();
		System.out.println("---HR---");
		System.out.println();
		super.display();
		System.out.println("Commission ="+commision);
		System.out.println();

	}
	
	

}
