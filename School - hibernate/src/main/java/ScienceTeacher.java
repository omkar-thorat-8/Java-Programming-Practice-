import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ScienceTeacher")
public class ScienceTeacher extends Teacher{

	@Column(name = "practicals")
	String practicals;

	public ScienceTeacher() {
		super();
	}

	public ScienceTeacher(int id, String name,String practicals) {
		super(id, name);
		this.practicals = practicals;
		// TODO Auto-generated constructor stub
	}

	public String getPracticals() {
		return practicals;
	}

	public void setPracticals(String practicals) {
		this.practicals = practicals;
	}
	
	
	
	
}
