

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeleteServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{String s=request.getParameter("id");
		int id=Integer.parseInt(s);
		int result=stuDao.delete1(id);
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Query OK,"+result+" row affcted<br>");
        out.println("<a href='student.html'>Add New Student</a>");  
        out.println("\r\n"
        		+ "	<br />\r\n"
        		+ "	<a href=\"ViewServlet1\">View Student</a>");
		out.println("</body>");
		out.println("</html>");
		}
		catch( Exception e){
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
