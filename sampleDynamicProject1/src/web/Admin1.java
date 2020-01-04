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
 * Servlet implementation class Admin1
 */
@WebServlet("/Admin1")
public class Admin1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher rd = null ;
		Object obj = session.getAttribute("user");
		if(obj!=null){
		out.println("<h2>Welcome Admininstrator!!! </h2>");
		out.println("<a href = Form1.html>Return to Form</a>");
		session.invalidate();
		}
		else{ 
			out.println("Unauthorized USER ");
			rd = request.getRequestDispatcher("Form1.html");
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
