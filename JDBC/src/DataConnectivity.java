

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataConnectivity {

	public static void main(String[] args) {

		int tempEmpId;
		String tempEmpName;
		double tempEmpSalary;
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Ankit2631");
			String query = "select * from Employee";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				tempEmpId = rs.getInt(1);
				tempEmpName = rs.getString(2);
				tempEmpSalary = rs.getDouble(3);
				
				emplist.add(new Employee(tempEmpId,tempEmpName,tempEmpSalary));
				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Size of ArrayList :"+ emplist.size() );
	
		for (Employee e : emplist)
		{
			System.out.println(e);

		}
		
	}

}