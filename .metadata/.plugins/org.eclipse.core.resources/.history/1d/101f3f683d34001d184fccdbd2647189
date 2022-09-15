

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAllRequestHeaders
 */
@WebServlet("/GetAllRequestHeaders")
public class GetAllRequestHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public GetAllRequestHeaders() {
        super();
        // TODO Auto-generated constructor stub
    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		handleRequest(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		handleRequest(req, res);
	}

	public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		Enumeration<String> headerNames = req.getHeaderNames();

		while (headerNames.hasMoreElements()) {

			String headerName = headerNames.nextElement();
			out.write(headerName);
			

			Enumeration<String> headers = req.getHeaders(headerName);
			while (headers.hasMoreElements()) {
				String headerValue = headers.nextElement();
				out.write(" 897776 \t\t\t"+headerValue);
				out.print("<hr/>");	
			}
		}
		out.close();
	}


}
