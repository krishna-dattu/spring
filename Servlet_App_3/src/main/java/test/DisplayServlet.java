package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends HttpServlet{
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res)
  throws ServletException,IOException{
	 PrintWriter pw = res.getWriter();
	 res.setContentType("text/html");
	 String uName = req.getParameter("uname");
	 pw.println("Welcome User : "+uName+"<br>");
	 pw.println("=====ServletContext====<br>");
	 ServletContext sct = req.getServletContext();
	     //Accessing the reference of ServletContext object
	 String servInfo = sct.getServerInfo();
	 int a = Integer.parseInt(sct.getInitParameter("a"));
	 pw.println("ServerInfo:"+servInfo+"<br>");
	 pw.println("ContextValue:"+a);
  }
}
