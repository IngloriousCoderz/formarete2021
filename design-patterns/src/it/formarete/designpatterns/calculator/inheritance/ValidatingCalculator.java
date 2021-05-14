package it.formarete.designpatterns.calculator.inheritance;

import it.formarete.designpatterns.calculator.CalculatorImpl;

public class ValidatingCalculator extends CalculatorImpl {
	@Override
	public int sum(Integer a, Integer b) {
		if (!isValid(a, b)) {
			throw new IllegalArgumentException("One of the two parameters is null");
		}

		return super.sum(a, b);
	}

	private boolean isValid(Integer a, Integer b) {
		return a != null && b != null;
	}
}
