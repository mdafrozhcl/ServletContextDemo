import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletContextEx1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		Enumeration<String> globalvalues = context.getInitParameterNames();
		while(globalvalues.hasMoreElements()){
			String name = globalvalues.nextElement();
			out.println(name+ " : "+context.getInitParameter(name)+"<br>");
		}
		out.close();
	}
}
