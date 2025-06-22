
public class employee 
{
	private int id;
	private String name;
	private int salary;
	
	
	public employee() 
	{
		System.out.println("Default constructor");
		this.id=000;
		this.name="Not Given";
		this.salary=00;
		
	}
	
	public employee(int id, String name, int salary) 
	{
		System.out.println("Paramerterize constructor");
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	//setter
	public void setId(int id) 
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public void setSalary(int salary) 
	{
		this.salary= salary;
	}
	
	//getter
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSalary()
	{
		return this.salary;
	}

	//display
	public void display() 
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}
	
	

}
