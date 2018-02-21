package fr.j2ee.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
// @WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Session() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		// ajouter un attribut dans la session
		session.setAttribute("Session1", "ValeurSession1");

		// HttpSession session=request.getSession();
		// String chaine=(String)session.getAttribute("Session1");

		//Créer les COOKIES
		Cookie gateau = new Cookie("Gateau", "4Quarts");
		Cookie bonbon= new Cookie("Bonbon","Carambar");
		gateau.setMaxAge(999);
		response.addCookie(bonbon);
		response.addCookie(gateau);

		RequestDispatcher repartiteur = getServletContext().getRequestDispatcher("/Contact");
		if (repartiteur != null)
			repartiteur.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
