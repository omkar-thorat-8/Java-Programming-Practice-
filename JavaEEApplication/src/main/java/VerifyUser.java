
public class VerifyUser {

	public boolean isValid(String user,String password) {
		
		Connectivity ref = new DatabaseConnectivity();
		
		return ref.chechUser(user, password);
	}
}
