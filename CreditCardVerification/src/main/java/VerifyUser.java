
public class VerifyUser {

	public boolean isValid(String cardNo, String cardHolderName, String exDate, String cvv) {
		// TODO Auto-generated method stub
		
		Connectivity ref = new DatabaseConnectivity();
		return ref.chechUser(cardNo,cardHolderName,exDate,cvv);	
		}

}
