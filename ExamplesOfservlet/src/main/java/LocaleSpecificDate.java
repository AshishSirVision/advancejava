

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LocaleSpecificDate
 */
@WebServlet("/LocaleSpecificDate")
public class LocaleSpecificDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocaleSpecificDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    	      throws ServletException, IOException {
    	      
    	      // Set response content type
    	      response.setContentType("text/html");
    	      PrintWriter out = response.getWriter();
    	      
    	      //Get the client's Locale
    	      Locale locale = request.getLocale();
    	     
    	      String date = DateFormat.getDateTimeInstance(DateFormat.FULL, 
    	         DateFormat.SHORT).format(new Date( ));

    	      String title = "Locale Specific Dates";
    	      String docType =
    	         "<!doctype html>";
    	     
    	      out.println(docType +
    	         "<html>\n" +
    	            "<head><title>" + title + "</title></head>\n" +
    	            "<body bgcolor = \"#f0f0f0\">\n" +
    	               "<h1 align = \"center\">" + date + "</h1>\n" +
    	            "</body></html>"
    	      );
    	   }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
