import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//@WebServlet("/Generic")
public class GenericServletDemo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		//doGet()
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("GenericServlet here...");
		
	}
	
}
