package test;
import java.io.*;
import java.util.*;
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
	 
	 
	 //ServletContext
	 pw.println("===ServletContext===<br>");
	 ServletContext sct =req.getServletContext();
	 String servInfo =sct.getServerInfo();
	 pw.println("===ServerInfo" + servInfo +"<br>");
	 Enumeration<String> e1 =sct.getInitParameterNames();
	 while(e1.hasMoreElements()) {
		 String ele =e1.nextElement();
		 pw.println(Integer.parseInt(sct.getInitParameter(ele)));
	 }
	 
	 
	 
	 //ServletConfig
	 pw.println("=====ServletConfig====<br>");
	 ServletConfig scf = super.getServletConfig();
	 String serName = scf.getServletName();
	 
	 pw.println("ServletName:"+serName+"<br>");
	 
	 Enumeration<String> e2 =scf.getInitParameterNames();
	 while(e2.hasMoreElements()) {
		 String ele =e2.nextElement();
		 pw.println(Integer.parseInt(scf.getInitParameter(ele)));
	 }
  }
}

