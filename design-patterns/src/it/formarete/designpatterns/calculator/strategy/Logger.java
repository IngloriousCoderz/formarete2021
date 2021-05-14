package it.formarete.designpatterns.calculator.strategy;

public class Logger {
	public void logInput(Integer a, Integer b) {
		System.out.println("Input: " + a + ", " + b);
	}
	
	public void logOutput(int output) {
		System.out.println("Output: " + output);
	}
}
