
public class Consultant implements Payable{

	String name;
	float rateOfRemuneration;
	Address postal;
	
	public Consultant() {
		super();
//		System.out.println("Default Constructor call");
		// (here how many bean we create that much default constructor calls)
	}


	public Consultant(String name, float rateOfRemuneration,Address postal) {
		super();
		this.name = name;
		this.rateOfRemuneration = rateOfRemuneration;
		this.postal = postal;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getRateOfRemuneration() {
		return rateOfRemuneration;
	}


	public void setRateOfRemuneration(float rateOfRemuneration) {
		this.rateOfRemuneration = rateOfRemuneration;
	}
	
	


	public Address getPostal() {
		return postal;
	}


	public void setPostal(Address postal) {
		this.postal = postal;
	}


	public void pay()
	{
		System.out.println("Pay Consultant");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(postal.getLine1() + " " + postal.getLine2());

	}
}
