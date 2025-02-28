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
//@WebServlet("/ParamDemo")
public class ParamDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//Accessing Initialization parameters(configuration)
		ServletConfig conf=getServletConfig();
		/*String db_uname=conf.getInitParameter("username");
		String db_password=conf.getInitParameter("password");
		out.print("<p>Database username="+db_uname+"</p>");
		out.print("<p>Database password="+db_password+"</p>");*/
		Enumeration<String> param_names=conf.getInitParameterNames();
		while(param_names.hasMoreElements()) {
			String param_name=param_names.nextElement();
			String param_value=conf.getInitParameter(param_name);
			out.print("<p>Param Name:"+param_name+"</p>");
			out.print("<p>Param Value:"+param_value+"</p>");
		}
		
		//Accessing Initialization parameters(context)
		ServletContext cont=getServletContext();
		String cont_var=cont.getInitParameter("context_param");
		out.print("<p>Context Param value="+cont_var+"</p>");
	}

}
