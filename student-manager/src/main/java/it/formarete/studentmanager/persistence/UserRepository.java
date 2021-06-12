package it.formarete.studentmanager.persistence;

import org.springframework.data.repository.CrudRepository;

import it.formarete.studentmanager.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
