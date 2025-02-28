

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("uname");
		RequestDispatcher rd;
		if(user.equalsIgnoreCase("ashok")) {
			rd=request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("/login.html");
			out.print("<h3 style='color:red'>wrong username</h3>");
			rd.include(request, response);
		}
	}

}
