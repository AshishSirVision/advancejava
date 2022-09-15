

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetLocale
 */
@WebServlet("/GetLocale")
public class GetLocale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetLocale() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
    
       //Get the client's Locale
       Locale locale = request.getLocale();
       String language = locale.getLanguage();
       String country = locale.getCountry();
       String discon=locale.getDisplayCountry(locale);
       String dislang=locale.getDisplayLanguage(locale);
       String dispvar=locale.getDisplayVariant();
       String gisocon=locale.getISO3Country();
       
       

       // Set response content type
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();

       String title = "Detecting Locale";
       String docType =
          "<!doctype html>";
       
       out.println(docType +
          "<html>\n" +
             "<head><title>" + title + "</title></head>\n" +
             "<body style='background:aqua;color:tomato;'>\n" +
                "<h1 align = 'center'>" + language + "</h1>\n" +
                "<h2 align = \"center\">" + country + "</h2>\n" +
                "<h2 align = \"center\">" + discon + "</h2>\n" +
                "<h2 align = \"center\">" + dislang + "</h2>\n" +
               
                "<h2 align = \"center\">" + gisocon + "</h2>\n" +
                
                
                
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
