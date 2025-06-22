import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity {

	@Override
	public boolean chechUser(String v1, String v2, String v3, String v4) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/creditcard","root","Ankit2631");
			String query = "select * from creditcard where cardNo=? and cardHolderName=? and excard=? and cvv=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, v1);
			pstmt.setString(2, v2);
			pstmt.setString(3, v3);
			pstmt.setString(4, v4);

			ResultSet rs = pstmt.executeQuery();
			System.out.println(rs);
			return rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
