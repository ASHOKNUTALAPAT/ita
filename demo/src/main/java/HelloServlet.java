import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/Welcome")
public class HelloServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("<h2>Hello ,VVIT</h2>");
	}
}

