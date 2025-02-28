import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","ashok");
			PreparedStatement ps=con.prepareStatement("select * from student where Id=?");
			ps.setInt(1, Integer.parseInt(request.getParameter("id")));
			ResultSet rs=ps.executeQuery();
			int id=0;
			String sname="";
			while(rs.next()) {
			id=rs.getInt(2);
			sname=rs.getString(1);
			}
			out.print("update student details");
			out.print("<form action='Servlet4'>");
			out.print("<input type='hidden' name='id' value='"+id+"'>");
			out.print("Name:<input type='text' name='sname' value='"+sname+"'>");
			out.print("<input type='submit' value='UPDATE'>");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
