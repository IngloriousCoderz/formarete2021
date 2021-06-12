package it.formarete.amazin.persistence;

import org.springframework.data.repository.CrudRepository;

import it.formarete.amazin.domain.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
