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
		String name=request.getParameter("uname");
		String password=request.getParameter("pword");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		//name=system
		//password=System@123
		if(name.equals("system") && password.equals("System@123")) {
			rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("/login.html");
			out.print("<h2 style='color:red'>Invalid username/password</h2>");
			rd.include(request, response);
		}
	}

}
