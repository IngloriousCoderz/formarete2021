package it.formarete.designpatterns.calculator.proxy;

import it.formarete.designpatterns.calculator.Calculator;

public class LoggerProxy implements Calculator {
	private Calculator calculator;

	public LoggerProxy(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int sum(Integer a, Integer b) {
		System.out.println("Input: " + a + ", " + b);

		int sum = calculator.sum(a, b);

		System.out.println("Output: " + sum);

		return sum;
	}
}
