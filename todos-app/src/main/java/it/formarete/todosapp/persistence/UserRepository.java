package it.formarete.todosapp.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import it.formarete.todosapp.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Override
	List<User> findAll();

//	User findById(int id);

	@Transactional
	void deleteByUsername(String username);
	
//	@Transactional
//	@Modifying
//	@Query("delete from User u where u.username = :username")
//	void deleteUsers(@Param("username") String username);
}
