

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EditServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
		int id=Integer.parseInt(request.getParameter("id"));
out.println("<html>\r\n"
		+ "				<head>\r\n"
		+ "				<meta charset=\"ISO-8859-1\">\r\n"
		+ "				<title>Insert title here</title>\r\n"
		+ "				</head>\r\n"
		+ "				<body>\r\n"
		+ "					<form action=\"EditServlet\" method=\"post\">\r\n"
		+ "						<table>\r\n"
		+ "							<tr>\r\n"
		+ "								<td>Id:</td>\r\n"
		+ "								<td><input type=\"text\" name=\"id1\" value=\"<%=Integer.parseInt(request.getParameter(\"id\")) %>\" readonly=\"readonly\"/></td>\r\n"
		+ "							</tr>\r\n"
		+ "							<tr>\r\n"
		+ "								<td>Name:</td>\r\n"
		+ "								<td><input type=\"text\" name=\"name1\" /></td>\r\n"
		+ "							</tr>\r\n"
		+ "							<tr>\r\n"
		+ "								<td>Age:</td>\r\n"
		+ "								<td><input type=\"text\" name=\"age1\" /></td>\r\n"
		+ "							</tr>\r\n"
		+ "							<tr>\r\n"
		+ "								<td>Course:</td>\r\n"
		+ "								<td><input type=\"text\" name=\"course1\" /></td>\r\n"
		+ "							</tr>\r\n"
		+ "							<tr>\r\n"
		+ "								<td>City:</td>\r\n"
		+ "								<td><select name=\"city1\" style=\"width: 150px\">\r\n"
		+ "										<option>Delhi</option>\r\n"
		+ "										<option>Noida</option>\r\n"
		+ "										<option>Raipur</option>\r\n"
		+ "										<option>Bhopal</option>\r\n"
		+ "								</select></td>\r\n"
		+ "							</tr>\r\n"
		+ "							<tr>\r\n"
		+ "								<td colspan=\"2\"><input type=\"submit\" value=\"Update\" /></td>\r\n"
		+ "							</tr>\r\n"
		+ "						</table>\r\n"
		+ "					</form>\r\n"
		+ "					<br />\r\n"
		+ "					<a href=\"ViewServlet1\">View Student</a>\r\n"
		+ "				</body>\r\n"
		+ "				</html>");
		stu s1=new stu();   
        String id1=request.getParameter("id1");      
        String name1=request.getParameter("name1");      
        String age1=request.getParameter("age1");    
        String course1=request.getParameter("course1");      
        String city1=request.getParameter("city1"); 
        s1.setId1(id1);
        s1.setName1(name1);
        s1.setAge1(age1);
        s1.setCourse1(course1);
        s1.setCity1(city1);
        int result=stuDao.update1(s1);
        out.println("query ok,"+result+" row affected");
		}
		catch(Exception e) {
			out.println("Sorry,Something error occured :- ");
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
