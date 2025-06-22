import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity{

	@Override
	public boolean chechUser(String v1, String v2) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Connectivity","root","Ankit2631");
			String query = "select * from users where userid=? and password=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, v1);
			pstmt.setString(2, v2);
			ResultSet rs = pstmt.executeQuery();
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
