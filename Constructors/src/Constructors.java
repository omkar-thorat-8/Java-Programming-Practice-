
public class Constructors {

	int demo;
	String demo1;
	
	
	//default
	public Constructors() {
		
		this.demo = 0;
		this.demo1 = null;
	}


	//para
	public Constructors(int demo, String demo1) {
		
		this.demo = demo;
		this.demo1 = demo1;
	}
	
	//copy
	public Constructors(Constructors con) {
			
			this.demo = con.demo;
			this.demo1 = con.demo1;
		}
		
}
