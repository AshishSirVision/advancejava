

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.ResultSet;

/**
 * Servlet implementation class DisplayContactDetails
 */
@WebServlet("/DisplayContactDetails")
public class DisplayContactDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayContactDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<a href='ContactUsForm.html'>Add more contact</a>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded successfully");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
			System.out.println("connection established succesfully");
			String sql="select * from contact";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
		
out.println("<table border='1'>");
while(rs.next())
{
		out.println("<tr>"
		+ "<td>"+rs.getString(1)+"</td>"
			+ "<td>"+rs.getString(2)+"</td>"
			+ "<td>"+rs.getString(3)+"</td>"
			+ "<td>"+rs.getString(4)+"</td>"
			+ "<td>"+rs.getString(5)+"</td>"							
		+ "</tr>");
}
out.println("</table>");

		} catch (ClassNotFoundException e) {
			System.out.println("driver not loaded " + e);
		} catch (SQLException e) {
			System.out.println("connection not established " + e);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
