
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

import java.sql.Statement;

/**
 * Servlet implementation class ContactInsertServletPage
 */
@WebServlet("/ContactInsertServletPage")
public class ContactInsertServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactInsertServletPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("Hello World");
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String pn = request.getParameter("pn");
		String email = request.getParameter("emailid");
		String address = request.getParameter("address");
		out.println(fn + "<hr>");
		out.println(ln + "<hr>");
		out.println(pn + "<hr>");
		out.println(email + "<hr>");
		out.println(address + "<hr>");
		out.println("<a href='DisplayContactDetails'>display data</a>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded successfully");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
			System.out.println("connection established succesfully");
			String sql="insert into contact values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
//			int row = stmt.executeUpdate("insert into contact values('" + fn + "','" + ln + "','" + pn + "','" + email
//					+ "','" + address + "')");
			pstmt.setString(1, fn);
			pstmt.setString(2, ln);
			pstmt.setString(3, pn);
			pstmt.setString(4, email);
			pstmt.setString(5, address
					
					
					);
			int i=pstmt.executeUpdate();
			System.out.println(i + " row affected");

		} catch (ClassNotFoundException e) {
			System.out.println("driver not loaded " + e);
		} catch (SQLException e) {
			System.out.println("connection not established " + e);
		}
request.getRequestDispatcher("DisplayContactDetails").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
