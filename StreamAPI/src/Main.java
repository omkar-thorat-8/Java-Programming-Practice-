import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		
		emplist.add(new Employee(101,"Ankit",50000, "IT"));
		emplist.add(new Employee(102,"Vedant",60000," Mech"));

		emplist.add(new Employee(103,"Ajay",70000,"IT"));

		emplist.add(new Employee(104,"Sankalp",80000, "Electrical"));
		emplist.add(new Employee(105,"jivaji",90000,"IT"));

		emplist.add(new Employee(106,"ketan",1000000,"Mech"));

		for(Employee e : emplist)
		{
			System.out.println(e);
		}
		
		System.out.println("Employee in IT Department...");
		
		List<Employee> itEmps = emplist.stream()
				.filter(emp-> emp.getDepartment().equals("IT"))
				.collect(Collectors.toList());
		
		
		
	}

}
