package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet{
 protected void doGet(HttpServletRequest req,HttpServletResponse res)
 throws ServletException,IOException{
	 Cookie c[] = req.getCookies();
	 if(c==null) {
		 req.setAttribute("msg", "Session expired...<br>");
		 RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
		 rd.forward(req, res);
	 }else {
		String name = c[0].getValue();
		req.setAttribute("fName", name);
		RequestDispatcher rd = 
				req.getRequestDispatcher("EditProfile.jsp");
		rd.forward(req, res);
	 }
 }
}
