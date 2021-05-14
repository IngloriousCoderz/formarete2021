package it.formarete.designpatterns.calculator.strategy;

import it.formarete.designpatterns.calculator.Calculator;

public class CalculatorWithStrategies implements Calculator {
	@Override
	public int sum(Integer a, Integer b) {
		Logger logger = new Logger();
		logger.logInput(a, b);

		new Validator().isValid(a, b);

		int sum = a + b;

		logger.logOutput(sum);

		return sum;
	}
}
