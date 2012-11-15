package md.victordov.lab.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;

import md.victordov.lab.ListersUtils.HibernateUtil;
import md.victordov.lab.vo.Curs;

/**
 * Servlet implementation class CursJSP
 */
@WebServlet("/CursServlet")
public class CursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CursServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria crit = session.createCriteria(Curs.class);
		int pageIndex = 2;
		int numberOfRecordsPerPage = 5;
		int s;
		s = (pageIndex * numberOfRecordsPerPage) - numberOfRecordsPerPage;
		crit.setFirstResult(s);
		crit.setMaxResults(numberOfRecordsPerPage);
		List<Curs> l = (List<Curs>) crit.list();
		Iterator<Curs> it = l.iterator();
		out.println("<table border=1");
		while (it.hasNext()) {
			Curs c = (Curs) it.next();
			out.println("<tr>");
			out.println("<td>" + c.getCursId() + "</td>");
			out.println("<td>" + c.getNumeCurs() + "</td>");
			out.println("<td>" + c.getUniversitateId() + "</td>");
			out.println("<td>" + c.getProfesorId() + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
