
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomPage
 */
@WebServlet("/RandomPage")
public class RandomPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RandomPage() {
		super();
	}

	List l = new ArrayList();//

	public void init() {
		l.add("http://www.Devmanuals.com");
		l.add("http://www.facebook.com");
		l.add("http://www.Google.com");
		l.add("http://www.rediffmail.com");
		l.add("http://www.gmail.com");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		
		System.out.println("this is a random value  :  "+Math.random()*l.size());
		int listIndex = ((int) (Math.random() * l.size()));
		System.out.println(listIndex);
		String site = (String) l.get(listIndex);
		res.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
		res.setHeader("Location", site);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
