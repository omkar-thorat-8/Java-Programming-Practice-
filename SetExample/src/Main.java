import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {


		Set<Employee> emp=new HashSet<Employee>();
		
		emp.add(new Employee(101,"Ankit",1000));
		Employee e1= new Employee(102,"Rushi",2000);
		emp.add(new Employee(103,"Ajay",30000));
		Employee e2= new Employee(102,"Rushi",2000);
		
		emp.add(e1);
		emp.add(e2);
		
		System.out.println(e1.hashCode() + "\n" + e2.hashCode());

		
	}

}
