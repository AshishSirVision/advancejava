

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
 * Servlet implementation class LocaleSpecificCurrency
 */
@WebServlet("/LocaleSpecificCurrency")
public class LocaleSpecificCurrency extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocaleSpecificCurrency() {
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
    	      Locale locale = request.getLocale( );
    	      NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
    	      String formattedCurr = nft.format(1000000);

    	      String title = "Locale Specific Currency";
    	      String docType =
    	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
    	      
    	      out.println(docType +
    	         "<html>\n" +
    	            "<head><title>" + title + "</title></head>\n" +
    	            "<body bgcolor = \"#f0f0f0\">\n" +
    	               "<h1 align = \"center\">" + formattedCurr + "</h1>\n" +
    	            "</body></html>"
    	      );
    	      
    	      Locale.setDefault(new Locale("en","IN"));
    	        long payment=1000000;
				String india = NumberFormat.getCurrencyInstance().format(payment);
    	        Locale.setDefault(Locale.CHINA);
    	        String china = NumberFormat.getCurrencyInstance().format(payment);
    	        Locale.setDefault(Locale.US);
    	        String us = NumberFormat.getCurrencyInstance().format(payment);
    	        Locale.setDefault(Locale.FRANCE);
    	        String france = NumberFormat.getCurrencyInstance().format(payment);
    	       out.println("<hr>US: " + us);
    	       out.println("<hr>India: " + india);
    	       out.println("<hr>China: " + china);
    	       out.println("<hr>France: " + france);
    	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
