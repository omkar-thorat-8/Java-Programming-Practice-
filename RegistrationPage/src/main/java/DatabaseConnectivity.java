import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity {

	@Override
	public boolean checkUser(String userid, String password) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Connectivity","root","Ankit2631");
			String query = "select * from users where userid=? and password=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
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
	
	 @Override
	    public boolean addUser(String userid, String password) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Connectivity", "root", "Ankit2631");

	            // Check if the user already exists
	            String checkQuery = "SELECT * FROM users WHERE userid=?";
	            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
	            checkStmt.setString(1, userid);
	            ResultSet rs = checkStmt.executeQuery();

	            if (rs.next()) {
	                return false; // User already exists
	            }

	            // Insert new user
	            String insertQuery = "INSERT INTO users (userid, password) VALUES (?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(insertQuery);
	            pstmt.setString(1, userid);
	            pstmt.setString(2, password);

	            int rowsAffected = pstmt.executeUpdate();
	            return rowsAffected > 0;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return false;
	    }
	}

