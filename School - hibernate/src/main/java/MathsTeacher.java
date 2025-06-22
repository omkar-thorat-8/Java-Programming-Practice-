import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "MathTeacher")
public class MathsTeacher extends Teacher{

	@Column(name = "problem")
	String problems;

	public MathsTeacher() {
		super();
	}

	public MathsTeacher(int id, String name,String problems) {
		super(id, name);
		this.problems = problems;
		// TODO Auto-generated constructor stub
	}

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}
	
	
}
