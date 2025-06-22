
public class AuthenticateUser {

	public boolean isValid(String userid, String password) {
		
		// TODO Auto-generated method stub
		Connectivity ref = new DatabaseConnectivity();
		return ref.checkUser(userid,password);	
	}

	 public boolean registerUser(String userid, String password) {
		 
			// TODO Auto-generated method stub
	        Connectivity ref = new DatabaseConnectivity();
	        return ref.addUser(userid, password);
	    }
}
