import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)  {
    	
        String userid = request.getParameter("newUserid");
        String password = request.getParameter("newPassword");

        AuthenticateUser ref = new AuthenticateUser();
        boolean isRegistered = ref.registerUser(userid, password);

        PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        response.setContentType("text/html");

        if (isRegistered) {
            out.println("<h2>Registration Successful! <a href='RegistrationPage.html'>Login Here</a></h2>");
        } else {
            out.println("<h2>Registration Failed! User already exists.</h2>");
        }
    }
}
