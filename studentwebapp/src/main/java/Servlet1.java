
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","ashok");
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			ps.setString(1,request.getParameter("sname"));
			ps.setInt(2, Integer.parseInt(request.getParameter("id")));
			ps.executeUpdate();
			out.print("<h3>Student details added to database</h3>");
			con.close();
		}
		catch(Exception e) {
			
		}
	}

}
