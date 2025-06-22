import java.util.Objects;

public class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee() 
	{
		this.id = 0;
		this.name = null;
		this.salary = 0;
	}
	
	public Employee(int id, String name, double salary) 
	{
		this.id = id; 
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {

		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
				
	}
	
	
	
	
}
