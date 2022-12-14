

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LocaleSpecificPercentage
 */
@WebServlet("/LocaleSpecificPercentage")
public class LocaleSpecificPercentage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocaleSpecificPercentage() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    	      throws ServletException, IOException {
    	      
    	      // Set response content type
    	      response.setContentType("text/html");
    	      PrintWriter out = response.getWriter();
    	      
    	      //Get the client's Locale
    	      Locale locale = request.getLocale( );
    	      NumberFormat nft = NumberFormat.getPercentInstance(locale);
    	      String formattedPerc = nft.format(0.99);

    	      String title = "Locale Specific Percentage";
    	      String docType =
    	      "<!doctype html>";
    	      
    	      out.println(docType +
    	         "<html>\n" +
    	            "<head><title>" + title + "</title></head>\n" +
    	            "<body bgcolor = \"#f0f0f0\">\n" +
    	               "<h1 align = \"center\">" + formattedPerc + "</h1>\n" +
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
