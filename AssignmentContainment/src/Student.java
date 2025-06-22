

import com.SY.SYMARKS;

public class Student {

	private int rollNo;
	private String name;
	private SYMARKS syMarks;
	
	public Student() {
		
	}

	public Student(int rollNo, String name, SYMARKS syMarks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.syMarks = syMarks;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SYMARKS getSyMarks() {
		return syMarks;
	}

	public void setSyMarks(SYMARKS syMarks) {
		this.syMarks = syMarks;
	}


	public double calTotalMarks() {
		
		double total= syMarks.getTOtalMarks();
		return total;
	}
	
	 public double getAverageMarks() 
	 {
	        double totalMarks = this.calTotalMarks();
	        
	        double totalSubjectsMarks = 600 ; 
	        double averageMarks = (totalMarks / totalSubjectsMarks)*100;
	        
	        return averageMarks;
	    }

	
	public String calGrade()
	{	
		double averageMarks = this.getAverageMarks();
		
        if (averageMarks >= 70) 
        {
            return "A";
        } 
        else if (averageMarks >= 60) 
        {
            return "B";
        } 
        else if (averageMarks >= 50) 
        {
            return "C";
        } 
        else if (averageMarks >= 40) 
        {
            return "Pass Class";
        } 
        else 
        {
            return "Fail";
        }
		
	}
	
	
	
	void display()
	{	
		System.out.println("+---------------------------------+");
		System.out.println("     Roll Number :" + this.rollNo);
		System.out.println("     Name : " + this.name);
		System.out.println("+---------------------------------+");
		System.out.println("     Computer Marks :" +  syMarks.getComputerMarks());
		System.out.println("     Maths Marks : " + syMarks.getMathsMarks());
		System.out.println("     Electronics Marks :" + syMarks.getElectronicsMarks());
		System.out.println("+---------------------------------+");
		System.out.println("+---------------------------------+");
		System.out.println("     Total Marks : " + this.calTotalMarks());
		System.out.println("+---------------------------------+");
		System.out.println();
		System.out.println("     Average : " + this.getAverageMarks());
		System.out.println();
		System.out.println("     Grades are :"  + this.calGrade());
		System.out.println("+----------------------------------+");
		
	}
	
}
