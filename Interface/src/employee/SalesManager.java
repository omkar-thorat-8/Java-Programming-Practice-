package employee;

public class SalesManager extends Employee 
{
	int incentive;
	int target;
	
	
	public SalesManager() 
	{
		this.incentive = 0;
		this.target = 0;
	}
	
	public SalesManager(int id, String name, double salary,int incentive, int target)
	{ 
		super(id,name,salary);
		
		this.incentive = incentive;
		this.target = target;
	}
	

	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	
	public void display()
	{
		System.out.println();
		System.out.println("---SalesManager---");
		System.out.println();
		super.display();
		System.out.println("Incentive ="+this.incentive);
		System.out.println("Target = "+this.target);
		System.out.println();

	}
	

}
