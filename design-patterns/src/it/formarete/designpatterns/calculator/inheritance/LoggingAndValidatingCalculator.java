package it.formarete.designpatterns.calculator.inheritance;

public class LoggingAndValidatingCalculator extends ValidatingCalculator {
	@Override
	public int sum(Integer a, Integer b) {
		System.out.println("Input: " + a + ", " + b);

		int sum = super.sum(a, b);

		System.out.println("Output: " + sum);

		return sum;
	}
}
