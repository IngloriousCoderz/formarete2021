package it.formarete.designpatterns.calculator.strategy;

public class Validator {
	public boolean isValid(Integer a, Integer b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException("One of the two parameters is null");
		};
		
		return true;
	}
}
