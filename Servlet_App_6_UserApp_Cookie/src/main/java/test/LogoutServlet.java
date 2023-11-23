package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	@Override
 protected void doGet(HttpServletRequest req,HttpServletResponse res)
 throws ServletException,IOException{
	 Cookie c[] = req.getCookies();
	 if(c==null) {
		 req.setAttribute("msg", "Session expired..<br>");
	 }else {
		 ServletContext sct = req.getServletContext();
		 sct.removeAttribute("ubean");
		 c[0].setMaxAge(0);
		 res.addCookie(c[0]);
		 req.setAttribute("msg", "User Logged out Successfully..<br>");
	 }//end of if
	 RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
	 rd.forward(req, res);
 }
}
