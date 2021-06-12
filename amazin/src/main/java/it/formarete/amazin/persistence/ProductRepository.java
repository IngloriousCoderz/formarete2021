package it.formarete.amazin.persistence;

import org.springframework.data.repository.CrudRepository;

import it.formarete.amazin.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
