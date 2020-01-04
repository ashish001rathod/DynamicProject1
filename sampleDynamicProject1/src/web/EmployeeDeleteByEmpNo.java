package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class EmployeeDeleteByEmpNo
 */
@WebServlet("/EmployeeDeleteByEmpNo")
public class EmployeeDeleteByEmpNo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmpDao dao =new EmpDaoImpl();
		int rows= dao.deleteEmp(empno);
		out.println(rows+" row Deleted");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
