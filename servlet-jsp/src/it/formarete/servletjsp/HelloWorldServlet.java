package it.formarete.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hello-world", description = "Servlet that responds with 'Hello world!'", urlPatterns = {
		"/hello-world" })
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>");
		out.append("<html>");
		out.append("  <head>");
		out.append("    <title>Hello world!</title>");
		out.append("  </head>");
		out.append("  <body>");
		out.append("    <h1>Hello " + name + "!</h1>");
		out.append("  </body>");
		out.append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
