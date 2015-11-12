import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContextDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext context = getServletContext();
		String value = context.getInitParameter("goldrate");
		out.println("Goldrate : "+value);
//		Enumeration<String> enume = context.getInitParameterNames();
//		while(enume.hasMoreElements()){
//			String name1=enume.nextElement();
//			out.print(name1+" : "+context.getInitParameter(name1)+"<br>");
//		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
