package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate1
 */
@WebServlet("/Validate1")
public class Validate1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("password");
		RequestDispatcher rd ;
		if(user.isEmpty() || pass.isEmpty()){
			out.println("<font color=red> Both Fields are mandatory. </font>");
			rd = request.getRequestDispatcher("Form1.html");
		    //rd.include(request, response);
		}
		else{
		if(user.equals("admin") && pass.equals("admin")){
			rd= request.getRequestDispatcher("Admin1");
		    }
		else if(user.equals("admin")&&!(pass.equals("admin"))){
			out.println("<font color=red> Password don't match. </font>");
			rd = request.getRequestDispatcher("Form1.html");
			/*HttpSession session = request.getSession();
			session.setAttribute("user",user);
			rd.forward(request, response);*/
			//session.invalidate();
		}
		else {
			rd= request.getRequestDispatcher("User1");
		    //rd.include(request, response);
	        }
		}
		 rd.include(request, response);
		//out.println("success");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
