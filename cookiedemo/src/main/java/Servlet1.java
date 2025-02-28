

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
		String name=request.getParameter("uname");
		
		Cookie ck=new Cookie("uname",name);
		response.addCookie(ck);
		out.print("<h3>"+name+"</h3>");
		
		out.print("<form action='Servlet2'>");
		out.print("<input type='submit' value='check cookie here'>");
		out.print("</form>");
	}
}
