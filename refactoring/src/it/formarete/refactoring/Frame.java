package it.formarete.refactoring;

public class Frame {
	private int columns;
	private int rows;
	private String label;

	public Frame(int columns, int rows, String label) {
		this.columns = columns;
		this.rows = rows;
		this.label = label;
	}

	public String build() {
		int rowsMinusBorders = rows - 2;
		int halfFrame = rowsMinusBorders / 2;
		int offset = rows % 2 == 0 ? 1 : 0;

		String output = "";
		output += buildFullRow();
		output += buildEmptyRows(halfFrame - offset);
		output += buildRowWithLabel();
		output += buildEmptyRows(halfFrame);
		output += buildFullRow();
		return output;
	}

	String buildRowWithLabel() {
		String output = "* ";
		int charsPerColumn = output.length();
		int borders = 2 * charsPerColumn;
		int spaces = columns * charsPerColumn - borders - label.length();
		int halfSpaces = spaces / 2;
		int offset = label.length() % 2 == 0 ? 0 : 1;

		for (int i = 0; i < halfSpaces; i++) {
			output += " ";
		}

		output += label;

		for (int i = 0; i < halfSpaces + offset; i++) {
			output += " ";
		}

		return output + "* \n";
	}

	private String buildFullRow() {
		String output = "";
		for (int i = 0; i < columns; i++) {
			output += "* ";
		}
		output += "\n";
		return output;
	}

	String buildEmptyRows(int count) {
		String output = "";
		for (int i = 0; i < count; i++) {
			output += buildEmptyRow();
		}
		return output;
	}

	String buildEmptyRow() {
		String output = "* ";
		int charsPerColumn = output.length();
		int columnsMinusBorders = columns - 2;
		int spaces = columnsMinusBorders * charsPerColumn;
		for (int i = 0; i < spaces; i++) {
			output += " ";
		}
		output += "* \n";
		return output;
	}

	public static void main(String[] args) {
		Frame frame = new Frame(10, 10, "ciauz");
		System.out.print(frame.build());
	}
}