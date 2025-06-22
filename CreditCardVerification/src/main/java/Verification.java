import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cardVerify")
public class Verification extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		System.out.println("Hello");
		
		String cardNo = req.getParameter("card-number");
		String cardHolderName = req.getParameter("card-name");
		String exDate = req.getParameter("exp-date");
		String cvv = req.getParameter("cvv");
		
		System.out.println(cardNo +""+ cardHolderName + "" + exDate + "" +cvv);
		
		VerifyUser ref = new VerifyUser();
		
		boolean result = ref.isValid(cardNo,cardHolderName,exDate,cvv);
		
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
