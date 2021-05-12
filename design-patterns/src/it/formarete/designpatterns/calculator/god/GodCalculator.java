package it.formarete.designpatterns.calculator.god;

import it.formarete.designpatterns.calculator.Calculator;

public class GodCalculator implements Calculator {
	@Override
	public int sum(Integer a, Integer b) {
		System.out.println("Input: " + a + ", " + b);

		if (!isValid(a, b)) {
			throw new IllegalArgumentException("One of the two parameters is null");
		}

		Integer sum = a + b;

		System.out.println("Output: " + sum);

		return sum;
	}

	private boolean isValid(Integer a, Integer b) {
		return a != null & b != null;
	}
}
