package fr.j2ee.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter
 */
//@WebFilter("/Filter")
public class Filtrer implements javax.servlet.Filter {

	/**
	 * Default constructor.
	 */
	public Filtrer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("ClickCounterFilter - doFilter");

		ServletContext sc = request.getServletContext();

		int counter = (int) sc.getAttribute("counter");
		counter++;
		sc.setAttribute("counter", counter);

		System.out.println("Counter : " + sc.getAttribute("counter"));

		// pass the request along the filter chain
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		int counter = 0;
		ServletContext sc = fConfig.getServletContext();
		sc.setAttribute("counter", counter);

	}

}
