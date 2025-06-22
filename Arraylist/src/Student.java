
public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private double Marks;
	
	
	public Student(){
		
	}
	
	public Student(int rollNo, String name, double d) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		Marks = d;
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

	public double getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", Marks=" + Marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.rollNo > o.rollNo)
			return 1;
		else if(this.rollNo < o.rollNo)
		    return -1;
		else
			return 0;
		
	}
	
	
	
}
