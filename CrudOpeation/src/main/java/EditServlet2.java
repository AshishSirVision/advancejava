import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sid = request.getParameter("id");
//		int id1 = Integer.parseInt(sid);
		String name1 = request.getParameter("name");
		String age1 = request.getParameter("age");
		String course1 = request.getParameter("course");
		String city1 = request.getParameter("city");

		stu e1 = new stu();
		e1.setId1(sid);
		e1.setName1(name1);
		e1.setAge1(age1);
		e1.setCourse1(course1);
		e1.setCity1(city1);

		int status = stuDao.update1(e1);
		if (status > 0) {
			response.sendRedirect("ViewServlet1");
		} else {
			out.println("Sorry! unable to update record");
		}

		out.close();
	}

}
