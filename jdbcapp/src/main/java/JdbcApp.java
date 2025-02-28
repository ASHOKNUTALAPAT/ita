import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/JdbcApp")
public class JdbcApp extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h3>JDBC App Demo</h3>");
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","ashok");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		out.print("<table border=2>");
		out.print("<tr><td>NAME</td><td>IDENTITY</td></tr>");
		while(rs.next()) {
			out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getInt(2)+"</td></tr>");
		}
		out.print("</table>");
		conn.close();
		
		out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
