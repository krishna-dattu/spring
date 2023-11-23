package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class DisplayServlet extends HttpServlet{
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res)
  throws ServletException,IOException{
	 PrintWriter pw = res.getWriter();
	 res.setContentType("text/html");
	 String uName = req.getParameter("uname");
	 pw.println("Welcome User : "+uName+"<br>");
	 pw.println("=====ServletConfig====<br>");
	 ServletConfig scf = super.getServletConfig();
	 String serName = scf.getServletName();
	 int b = Integer.parseInt(scf.getInitParameter("b"));
	 pw.println("ServletName:"+serName+"<br>");
	 pw.println("ConfigVal:"+b);
  }
}

