import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/lifecycle")
public class ServletLifeCycleDemo implements Servlet{
	@Override
	public void destroy() {
		System.out.println("destroy()...");	
	}
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}
	@Override
	public String getServletInfo() {
		return null;
	}
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init()....");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) 
			throws ServletException, IOException {
		arg1.setContentType("text/html");
		PrintWriter pw=arg1.getWriter();
		pw.print("Servlet Life Cycle...");
		System.out.println("service()...");
	}
	
}