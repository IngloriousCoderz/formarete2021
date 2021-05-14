package it.formarete.designpatterns.calculator.proxy;

import it.formarete.designpatterns.calculator.Calculator;

public class ValidatorProxy implements Calculator {
	private Calculator calculator;

	public ValidatorProxy(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int sum(Integer a, Integer b) {
		if (!isValid(a, b)) {
			throw new IllegalArgumentException("One of the two parameters is null");
		}

		return calculator.sum(a, b);
	}

	private boolean isValid(Integer a, Integer b) {
		return a != null && b != null;
	}
}
