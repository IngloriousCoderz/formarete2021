package it.formarete.refactoring;

/**
 * build:
 * 	for each row
 * 	  build row: ✓
 *      build spaces ✓
 *      build asterisks ✓
 *    go to new line ✓
 */
public class InvertedTriangle {
	private int rows;

	public InvertedTriangle(int rows) {
		this.rows = rows;
	}
	

	public String build() {
		String output = "";
		for (int i = 0; i < rows; i++) {
			output += buildRow(i) + "\n";
		}
		return output;
	}
	
	String buildRow(int row) {
		return buildSpaces(row) + buildAsterisks(row);
	}
	

	String buildSpaces(int row) {
		int limit = row;
		String output = "";
		for (int i = 0; i < limit; i++) {
			output += " ";
		}
		return output;
	}

	String buildAsterisks(int row) {
		int lastRow = rows - 1;
		int limit = (lastRow - row) * 2 + 1;
		String output = "";
		for (int i = 0; i < limit; i++) {
			output += "*";
		}
		return output;
	}
}
