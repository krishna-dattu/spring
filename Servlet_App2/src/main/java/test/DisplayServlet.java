package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet{
	@Override
  public void init()throws ServletException{
	  //NoCode
  }
	@Override
  public void service(ServletRequest req,ServletResponse res)throws
  ServletException,IOException{
	  PrintWriter pw = res.getWriter();
	  res.setContentType("text/html");
	  String custId = req.getParameter("cid");
	  String custName = req.getParameter("cname");
	  pw.println("====CustomerDetails====");
	  pw.println("<br>CustId:"+custId);
	  pw.println("<br>CustName:"+custName);
  }
	@Override
  public void destroy() {
	  //NoCode
  }
}
