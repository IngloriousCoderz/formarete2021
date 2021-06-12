package it.formarete.studentmanager.persistence;

import org.springframework.data.repository.CrudRepository;

import it.formarete.studentmanager.domain.Student;

public interface StudentRespository extends CrudRepository<Student, Long> {
}
