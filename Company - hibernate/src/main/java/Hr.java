import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="HR")
//@DiscriminatorValue(value="H")
public class Hr extends Employee {

	@Column(name="incentive")
	float incentive;

	public Hr() {
		super();
	}

	public Hr(float incentive) {
		super();
		this.incentive = incentive;
	}
	
	

	public Hr(int id, String name, double salary,float incentive) {
		super(id, name, salary);
		this.incentive = incentive;

		// TODO Auto-generated constructor stub
	}

	public float getIncentive() {
		return incentive;
	}

	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}
	
	
	
}
