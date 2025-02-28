

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String cookie_value=request.getParameter("cook_name");
		//Cookie creation
		
		Cookie ck=new Cookie("cookie1",cookie_value);
		//Adding cookie to response
		response.addCookie(ck);
		
		out.print("cookie created...");
		out.print("<h3>To initiate Request2 click below button</h3><br>");
		out.print("<form action='Servlet2'>");
		out.print("<input type='submit'>");
		out.print("</form>");
		
		
	}

}
