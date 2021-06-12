package it.formarete.amazin.persistence;

import org.springframework.data.repository.CrudRepository;

import it.formarete.amazin.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
