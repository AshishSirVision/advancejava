package p1;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler2 extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		
	
			int fact=1;
			int num=5;
			for (int i = 1; i <=num; i++) {
				fact=fact*i;
			}
			try {
				out.println("factorial of 5 is "+fact);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			
		
		return SKIP_BODY;
	}
}
