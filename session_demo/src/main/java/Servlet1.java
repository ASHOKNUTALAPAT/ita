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
		String session_info=request.getParameter("session_info");
		//creating session
		HttpSession hs=request.getSession();
		hs.setAttribute("session_id", session_info);
		out.print("Session created successfully...");
		out.print("<a href='Servlet2'>CLICK HERE TO VIEW SESSION</a>");
	}

}
