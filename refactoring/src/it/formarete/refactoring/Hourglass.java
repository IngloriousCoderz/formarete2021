package it.formarete.refactoring;

public class Hourglass {
	private int rows;

	public Hourglass(int rows) {
		this.rows = rows / 2 + 1;
	}

	public String build() {
		return buildTopHalf() + buildBottomHalf();
	}

	private String buildTopHalf() {
		return new InvertedTriangle(rows).build();
	}

	private String buildBottomHalf() {
		int newlines = 1;
		int firstRow = rows + newlines;
		return new Triangle(rows).build().substring(firstRow);
	}
}
