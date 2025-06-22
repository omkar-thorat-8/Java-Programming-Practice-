import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SALES")
//@DiscriminatorValue(value="S")
public class Sales extends Employee{
	
	@Column(name="commission")
	float commision;

	public Sales() {
		super();
	}

	public Sales(float commision) {
		super();
		this.commision = commision;
	}

	
	public Sales(int id, String name, double salary,float commission) {
		super(id, name, salary);
		this.commision = commission;

		// TODO Auto-generated constructor stub
	}

	public float getCommision() {
		return commision;
	}

	public void setCommision(float commision) {
		this.commision = commision;
	}
	
	

}
