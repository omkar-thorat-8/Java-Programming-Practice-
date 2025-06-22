import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Service Layer
@WebServlet("/verify")
public class Verification extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		String user = req.getParameter("userid");
		String pass = req.getParameter("password");
		System.out.println(user +""+ pass);
		
//		JDBC code
		VerifyUser ref = new VerifyUser();
		boolean result = ref.isValid(user,pass);
		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result == true)
		{
			out.println("Valid user");
		}
		else
		{
			out.println("Invalid user");
		}
	}
	
}
