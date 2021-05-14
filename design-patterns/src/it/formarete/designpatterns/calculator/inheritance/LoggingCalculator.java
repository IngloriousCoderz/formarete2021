package it.formarete.designpatterns.calculator.inheritance;

import it.formarete.designpatterns.calculator.CalculatorImpl;

public class LoggingCalculator extends CalculatorImpl {
	@Override
	public int sum(Integer a, Integer b) {
		System.out.println("Input: " + a + ", " + b);

		int sum = super.sum(a, b);

		System.out.println("Output: " + sum);

		return sum;
	}
}
