package md.victordov.lab.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import md.victordov.lab.dao.GenericDAO;
import md.victordov.lab.dao.ProfesorDAO;
import md.victordov.lab.vo.Profesor;

/**
 * Servlet implementation class ProfesorList
 */
@WebServlet("/ProfesorList")
public class ProfesorList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfesorList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GenericDAO<Profesor> cd= new ProfesorDAO();
		//ProfesorDAO cd = new ProfesorDAO();

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head><title>Prof List</title></head><body>");
		cd.delete(12);
		out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
