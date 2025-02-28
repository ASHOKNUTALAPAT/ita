import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/lifecycle")
public class LifeCycleDemo implements Servlet{
	public void destroy() {
		System.out.println("destroy()...");	
	}
	public ServletConfig getServletConfig() {
		return null;
	}
	public String getServletInfo() {
		return null;
	}
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init()...");
	}
	public void service(ServletRequest arg0, ServletResponse arg1) 
			throws ServletException, IOException {
		System.out.println("service()...");
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.print("Life Cycle Demo....");
	}
}
