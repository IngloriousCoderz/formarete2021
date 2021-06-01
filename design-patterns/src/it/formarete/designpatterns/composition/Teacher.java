package it.formarete.designpatterns.composition;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private List<Student> students;

	public Teacher() {
		students = new ArrayList<Student>();
	}

	public void work() {
		for (Student student : students) {
			student.doHomework();
		}
	}
}
