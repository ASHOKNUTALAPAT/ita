

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PostDemo")
public class PostDemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val1=request.getParameter("num1");
		String val2=request.getParameter("num2");
		int num1=Integer.parseInt(val1);
		int num2=Integer.parseInt(val2);
		PrintWriter out=response.getWriter();
		out.print("<h5>Addition Result:</h5></br>");
		out.print("<h4>Addition of "+num1+" and "+num2+" is "+(num1+num2)+"</h4>");
		out.close();
		}

}
