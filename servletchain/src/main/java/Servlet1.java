import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		//username=system
		//password=System@123
		RequestDispatcher rd;
		if(username.equals("system") && password.equals("System@123")) {
			//redirecting to welcome(home) page
			rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
		}
		else {
			//redirecting to login page
			out.print("<h4 style='color:red'>Invalid username/password</h4>");
			rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
		
		
		
		
		
	}

}
