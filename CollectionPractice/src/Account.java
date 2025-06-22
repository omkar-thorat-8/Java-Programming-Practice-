
public class Account implements Comparable{

	
	private int ActId;
	private String ActName;
	
	public Account(int actId, String actName) {
		ActId = actId;
		ActName = actName;
	}
	
	public int getActId() {
		return ActId;
	}
	public void setActId(int actId) {
		ActId = actId;
	}
	public String getActName() {
		return ActName;
	}
	public void setActName(String actName) {
		ActName = actName;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		return this.getActName().compareTo(o.ActName());
			
	
	}
	
	
}
