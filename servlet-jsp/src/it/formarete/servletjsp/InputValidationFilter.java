package it.formarete.servletjsp;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/calculate")
public class InputValidationFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String num1String = request.getParameter("num1");
		String num2String = request.getParameter("num2");

		try {
			Integer.parseInt(num1String);
			Integer.parseInt(num2String);

			chain.doFilter(request, response);
		} catch (NumberFormatException e) {
			request.setAttribute("error", "Invalid input");
			request.getRequestDispatcher("calculator.jsp").forward(request, response);
		}
	}
}
