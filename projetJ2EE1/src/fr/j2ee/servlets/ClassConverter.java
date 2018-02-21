package fr.j2ee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Converter
 */
// @WebServlet("/Converter")
public class ClassConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClassConverter() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// System.out.println("DO GET");
		request.getRequestDispatcher("Converter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String celcius = request.getParameter("celcius");
		String mess = "";
		float result = (float) 0.0;
		try {
			float floatCelcius = Float.parseFloat(celcius);
			// System.out.println("Valeur de floatCelcisus : " + floatCelcius);
			result = (floatCelcius * 9 / 5) + 32;
		} catch (Exception e) {
			Object String;
			if (e != null)
				mess = e.getMessage();
		}
		if (!mess.equals(""))
			System.out.println("ERREUR " + mess);
		else {
			System.out.println("result :" + result);
			request.setAttribute("result", result);
			request.getRequestDispatcher("Converter.jsp").forward(request, response);
		}

	}

}
