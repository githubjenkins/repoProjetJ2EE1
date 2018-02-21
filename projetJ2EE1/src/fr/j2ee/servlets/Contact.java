package fr.j2ee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Contact
 */
// @WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served get Contact:
		// ").append(request.getContextPath());

		// getServletContext().getRequestDispatcher("/Contact.jsp").forward(request,
		// response);
		HttpSession session = request.getSession();
		String chaine = (String) session.getAttribute("Session1");
		System.out.println("Session : " + chaine);
//LECTURE des COOKIES
		Cookie[] tabCookies = request.getCookies();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Réponse doPost</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		if (tabCookies != null) {
			int i = 0;
			while (i < tabCookies.length) {
				out.println("Nom du cookie:" + tabCookies[i].getName());
				out.println("Valeur du cookie:" + tabCookies[i].getValue());
				i++;
			}
		}
		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("dans doPost de Contact");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Réponse doPost</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<TABLE border=1>");
		Enumeration lesParametres = request.getParameterNames();
		String nomParametre;
		while (lesParametres.hasMoreElements()) {
			nomParametre = (String) lesParametres.nextElement();
			out.println("<TR>");
			out.println("<TD>" + nomParametre + "</TD>");
			out.println("<TD>" + request.getParameter(nomParametre) + "</TD>");
			out.println("</TR>");
		}
		out.println("</TABLE>");

		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();

	}

}
