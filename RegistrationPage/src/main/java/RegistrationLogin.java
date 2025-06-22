import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationLogin extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		System.out.println(userid + "" + password);
	    AuthenticateUser ref = new AuthenticateUser();
	    
	    boolean result = ref.isValid(userid,password);
	    
	    PrintWriter out=null;
	    
	    try {
			out = response.getWriter();
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
