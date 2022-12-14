

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashBoradPage
 */
@WebServlet("/DashBoradPage")
public class DashBoradPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashBoradPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext sc=getServletContext();
		ServletConfig conf=getServletConfig();
		
		Enumeration contextInfo=sc.getInitParameterNames();
		while (contextInfo.hasMoreElements()) {
			String winfo = (String) contextInfo.nextElement();
			out.println(winfo+" :  "+sc.getInitParameter(winfo));	
		}
		
		String username=conf.getInitParameter("Username");
		String pwd=conf.getInitParameter("Password");
	
		
		
		if(pwd.equals("Tom"))
		{
			out.print("Welcome "+username);
		}
		else
		{
			out.print("wrong password");
		}
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
