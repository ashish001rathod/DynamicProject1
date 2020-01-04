package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestReq
 */
@WebServlet("/RequestReq")
public class RequestReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestReq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name=request.getParameter("empname");
		String emailId=request.getParameter("emailaddress");
		String dateOfJoining = request.getParameter("doj");
		String job = request.getParameter("job");
		int sal = Integer.parseInt(request.getParameter("sal"));
		out.println("Employee name = "+ name+"<br>");
		out.println("Email Id ="+emailId+"<br>");
		out.println("Date Of Joining ="+dateOfJoining+"<br>");
		out.println("Job ="+job+"<br>");
		out.println("Salary ="+sal+"<br>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
