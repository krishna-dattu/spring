package test;
import java.io.*;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dis")
public class DisplayServlet extends HttpServlet {
	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			String uName  =req.getParameter("uname");
			pw.println("Welcome user :" +uName +"<br>");
			pw.println("***ServletContext***   <br>" );
			ServletContext sct =req.getServletContext();
			String serInfo =sct.getServerInfo();
			pw.println(serInfo);
			int a = Integer.parseInt(sct.getInitParameter("a"));
			pw.println(a);
			
	}

}
