

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//fetching value submitted in HTML form
		String fname=request.getParameter("name1");
		String lname=request.getParameter("name2");
		PrintWriter out=response.getWriter();
		out.print("Hello..."+fname+" "+lname);
	}

}
