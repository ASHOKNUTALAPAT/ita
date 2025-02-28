

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamDemo
 */
//@WebServlet("/ParamDemo")
public class ParamDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		//Fetching Configuration Parameters
		ServletConfig config=getServletConfig();
		Enumeration<String> e=config.getInitParameterNames();
		while(e.hasMoreElements()) {
			String pname=e.nextElement();
			String pvalue=config.getInitParameter(pname);
			out.print("<p>"+pname+":"+pvalue+"</p>");
		}
		//Fetching Context Parameters
		ServletContext cont=getServletContext();
		String cont_param=cont.getInitParameter("context_param");
		out.print(cont_param);
		
	}

}
