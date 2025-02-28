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
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","ashok");
			if(con!=null)
				System.out.println("Connection done...");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from stud_itb");
			while(rs.next())
				out.print(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+"<br>");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
