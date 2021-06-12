package it.formarete.amazin.persistence;

import org.springframework.data.repository.CrudRepository;

import it.formarete.amazin.domain.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
