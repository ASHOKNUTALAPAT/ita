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

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "system", "ashok");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			out.print("<h4>Student deatils</h4>");
			out.print("<table border=1>");
			out.print("<tr><th>Name</th><th>Id</th></tr>");
			while (rs.next())
				out.print("<tr><td>"+rs.getString(1) + "</td><td>" + rs.getInt(2) + "</td></tr>");
			out.print("</table>");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
