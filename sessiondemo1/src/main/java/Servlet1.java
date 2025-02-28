import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String session_value=request.getParameter("session_val");
		//Session Creation
		HttpSession ht=request.getSession();
		ht.setAttribute("session1",session_value);
		out.print("Session Created....");
		//To initiate Servlet2 click on below hyperlink
		out.print("<a href='Servlet2'>CLICK HERE</a>");
	}

}
