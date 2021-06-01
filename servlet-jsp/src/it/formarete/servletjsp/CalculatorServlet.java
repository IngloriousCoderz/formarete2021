package it.formarete.servletjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1String = req.getParameter("num1");
		String num2String = req.getParameter("num2");

		int num1 = Integer.parseInt(num1String);
		int num2 = Integer.parseInt(num2String);

		Calculator calc = new Calculator();
		int sum = calc.sum(num1, num2);

		req.setAttribute("result", sum);
		req.getRequestDispatcher("calculator.jsp").forward(req, resp);
	}
}
