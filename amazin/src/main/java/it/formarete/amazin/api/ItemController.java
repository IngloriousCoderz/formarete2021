package it.formarete.amazin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.formarete.amazin.domain.Item;
import it.formarete.amazin.persistence.ItemRepository;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class ItemController {
	@Autowired
	private ItemRepository items;

	@GetMapping
	public Iterable<Item> findAll() {
		return items.findAll();
	}

	@GetMapping("/{id}")
	public Item findById(@PathVariable Integer id) {
		return items.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found."));
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item create(@RequestBody Item body) {
		return items.save(body);
	}

	@PutMapping("/{id}")
	public Item update(@PathVariable Integer id, @RequestBody Item body) {
		Item item = findById(id);
		body.setId(item.getId());
		return items.save(body);
	}

	@DeleteMapping("/{id}")
	public Item delete(@PathVariable Integer id) {
		Item item = findById(id);
		items.delete(item);
		return item;
	}
}
