package it.formarete.studentmanager.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.formarete.studentmanager.domain.Student;
import it.formarete.studentmanager.persistence.StudentRespository;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentRespository studentRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student body) {
		return studentRepository.save(body);
	}

	@GetMapping
	public Iterable<Student> read() {
		return studentRepository.findAll();
	}

	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, @RequestBody Student body) {
		body.setId(id);
		return studentRepository.save(body);
	}

	@DeleteMapping("/{id}")
	public Student delete(@PathVariable Long id) {
		Optional<Student> student = studentRepository.findById(id);
		studentRepository.delete(student.get());
		return student.get();
	}
}
