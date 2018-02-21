package fr.j2ee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eleve
 */
// @WebServlet("/Eleve")
public class Eleve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served get Eleve :
		// ").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/Eleve.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 //doGet(request, response);
		// response.getWriter().append("Served at post:
		// ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>iNFORMATION SUR ELEVE (reponse du post) </TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		// obtenir la valeur des différents paramètres
		out.println("<TABLE border=1>");
		out.println("<TR>");
		out.println("<TD>Nom</TD>");
		out.println("<TD>" + request.getParameter("tnom") + "</TD>");
		out.println("<TD>Age</TD>");
		out.println("<TD>" + request.getParameter("tadresse") + "</TD>");
		out.println("<TD>Date de naissance</TD>");
		out.println("<TD>" + request.getParameter("tnele") + "</TD>");
		out.println("</TR>");
		out.println("</TABLE>");
		out.println("</BODY>");
		out.flush();
		out.close();

	}

}
