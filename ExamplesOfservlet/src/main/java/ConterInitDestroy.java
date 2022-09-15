
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConterInitDestroy
 */
@WebServlet("/ConterInitDestroy")
public class ConterInitDestroy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;

	public void init() {
		try {
			FileReader fr = new FileReader("/WEB-INF/Samplefile");
			BufferedReader br = new BufferedReader(fr);
			String begining = br.readLine();
			count = Integer.parseInt(begining);
			return;

		} catch (FileNotFoundException f) {
			System.out.println(""+f);
		} catch (IOException io) {
			System.out.println(""+io);
		} catch (NumberFormatException nf) {
			System.out.println(""+nf);
		}
		String beginning = getInitParameter("beginning");
		try {
			count = Integer.parseInt(beginning);
			return;
		} catch (NumberFormatException ignored) {
		}
		count = 0;
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter pw = res.getWriter();
		count++;
		if (count == 1)
			pw.println("From the beginning, this servlet has been accessed " + count + " time.");
		else {
			pw.println("From the beginning, this servlet has been accessed " + count + " times.");
		}
	}

	public void destroy() {
		state();
	}

	public void state() {
		try {
			FileWriter fileWriter = new FileWriter("CountInitDestroy.beginning");
			String begin = Integer.toString(count);
			fileWriter.write(begin, 0, begin.length());
			fileWriter.close();
			return;

		} catch (IOException e) {
		}
	}

}
