import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "DrawingTeacher")
public class DrawingTeacher extends Teacher{

	@Column(name = "drawing")
	String drawing;

	public DrawingTeacher() {
		super();
	}

	public DrawingTeacher(int id, String name,String drawing) {
		super(id, name);
		this.drawing = drawing;
		// TODO Auto-generated constructor stub
	}

	public String getDrawing() {
		return drawing;
	}

	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}
	
	
}
