import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	
	public static void main(String args[])
	{
		 ArrayList<Student> studentList = new ArrayList<>();

	        
	        studentList.add(new Student(1, "Ankit", 75.5));
	        studentList.add(new Student(5, "Rushi", 77));
	        studentList.add(new Student(9, "Akash", 90.2));
	        studentList.add(new Student(3, "Ajay", 78.2));
	        studentList.add(new Student(4, "Sankalp", 78.2));
	        studentList.add(new Student(10, "Ketan", 95.2));
	        studentList.add(new Student(6, "Sarvesh", 78.2));
	        studentList.add(new Student(7, "Jivaji", 74));
	        studentList.add(new Student(8, "Vedant", 88.2));
	        studentList.add(new Student(2, "Sumedh", 90.0));
	      
	              
	        System.out.println("Student List:");
	        
	        for (Student student : studentList) 
	        {
	            System.out.println(student);
	        }
	        
	        Collections.sort(studentList);
	        
	        System.out.println();
	        
	        System.out.println("After sorting");
	        
	        for (Student student : studentList) 
	        {
	            System.out.println(student);
	        }
	             
	        
	}

}
