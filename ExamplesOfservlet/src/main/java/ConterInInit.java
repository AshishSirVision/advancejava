
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConterInInit
 */
@WebServlet("/ConterInInit")
public class ConterInInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int counter;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String initValue = config.getInitParameter("initial");
		try {
			counter = Integer.parseInt(initValue);
		} catch (NumberFormatException e) {
			counter = 0;
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		counter++;
		pw.println("Since loading this servlet" + "has been accessed" + counter + "times");
	}

}
