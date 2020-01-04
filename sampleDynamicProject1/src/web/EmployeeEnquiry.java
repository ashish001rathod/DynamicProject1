package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class EmployeeEnquiry
 */
@WebServlet("/EmployeeEnquiry")
public class EmployeeEnquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int empno = Integer.parseInt(request.getParameter("empno"));
		String empname = request.getParameter("empname");
		String job = request.getParameter("job");
		int manager = Integer.parseInt(request.getParameter("mgr"));
		String hiredate = request.getParameter("hirdate");
		double salary = Double.parseDouble(request.getParameter("sal"));	
		double comm = Double.parseDouble(request.getParameter("comm"));
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		
		Emp emp = new Emp(empno,empname,job,manager,hiredate,salary,comm,deptno);
		EmpDao dao =new EmpDaoImpl();
		int rows= dao.addEmp(emp);
		out.println(rows+" row Inserted");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
