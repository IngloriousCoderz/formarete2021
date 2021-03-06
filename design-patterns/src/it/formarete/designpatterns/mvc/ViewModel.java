package it.formarete.designpatterns.mvc;

public class ViewModel {
	private Model model;
	private View view;

	public void setModel(Model model) {
		this.model = model;
	}

	public void setView(View view) {
		this.view = view;
	}

	public void handleInput(String input) {
		model.setAttribute(input);
		String message = model.getAttribute();
		view.update(message);
	}
}
