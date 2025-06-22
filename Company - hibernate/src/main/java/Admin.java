import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMIN")
//@DiscriminatorValue(value="A")
public class Admin extends Employee{

	@Column(name="allowance")
	float allowance;

	public Admin() {
		super();
	}

	public Admin(float allowance) {
		super();
		this.allowance = allowance;
	}
	
	

	public Admin(int id, String name, double salary,float allowance) {
		super(id, name, salary);
		this.allowance = allowance;

		// TODO Auto-generated constructor stub
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}
	
	
	
}
