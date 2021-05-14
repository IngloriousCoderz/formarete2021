package it.formarete.designpatterns.mvc;

public class ModelImpl implements Model {
	private String attribute;

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
