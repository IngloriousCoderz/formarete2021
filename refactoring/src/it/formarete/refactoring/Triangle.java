package it.formarete.refactoring;

public class Triangle {
	private int rows;

	public Triangle(int rows) {
		this.rows = rows;
	}
	
	public String build() {
		String output = "";
		for (int i = 0; i < rows; i++) {
			output += buildRow(i) + "\n";
		}

		return output;
	}

	private String buildRow(int row) {
		return buildSpaces(row) + buildAsterisks(row);
	}

	String buildSpaces(int row) {
		String output = "";
		int limit = rows - 1 - row;
		for (int i = 0; i < limit; i++) {
			output += " ";
		}
		return output;
	}

	String buildAsterisks(int row) {
		String output = "";
		int limit = row * 2 + 1;
		for (int i = 0; i < limit; i++) {
			output += "*";
		}
		return output;
	}
}
