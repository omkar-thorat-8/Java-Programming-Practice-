import java.util.Scanner;

import com.SY.ComputerTotal;
import com.SY.ElectronicsTotal;
import com.SY.MathsTotal;
import com.SY.SYMARKS;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Computer Parctical & Theory Marks : ");
		int computerPracticalMarks = sc.nextInt();
		int computerTheoryMarks = sc.nextInt();
		
		System.out.println("Enter the Maths Parctical & Theory Marks : ");
		int MathsPracticalMarks = sc.nextInt();
		int MathsTheoryMarks = sc.nextInt();
		
		System.out.println("Enter the Electronics Parctical & Theory Marks : ");
		int ElectronicsPracticalMarks = sc.nextInt();
		int ElectronicsTheoryMarks = sc.nextInt();
		
		ComputerTotal computer = new ComputerTotal(computerPracticalMarks,computerTheoryMarks);
		MathsTotal maths = new MathsTotal(MathsPracticalMarks,MathsTheoryMarks);
		ElectronicsTotal electronics = new ElectronicsTotal(ElectronicsPracticalMarks,ElectronicsTheoryMarks); 
		
		SYMARKS sy = new SYMARKS(computer,maths,electronics);
		Student stud = new Student(03,"Ankit",sy);
		
		stud.display();
				
		
	}
	
}
