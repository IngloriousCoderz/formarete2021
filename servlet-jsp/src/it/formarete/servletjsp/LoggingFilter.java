package it.formarete.servletjsp;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LoggingFilter implements Filter {

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Initialized");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Before");

		((HttpServletRequest) request).getCookies();

		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("age"));

		chain.doFilter(request, response);

		System.out.println("After");
	}

	@Override
	public void destroy() {

	}
}
