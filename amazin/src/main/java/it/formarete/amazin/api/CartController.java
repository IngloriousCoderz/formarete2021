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

import it.formarete.amazin.domain.Cart;
import it.formarete.amazin.persistence.CartRepository;

@RestController
@RequestMapping("/carts")
@CrossOrigin
public class CartController {
	@Autowired
	private CartRepository carts;

	@GetMapping
	public Iterable<Cart> findAll() {
		return carts.findAll();
	}

	@GetMapping("/{id}")
	public Cart findById(@PathVariable Integer id) {
		return carts.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cart not found."));
	}

	@GetMapping("/{id}/total")
	public Float calculateTotal(@PathVariable Integer id) {
		return findById(id).calculateTotal();
	}

	@GetMapping("/{id}/net-total")
	public Float calculateNetTotal(@PathVariable Integer id) {
		return findById(id).calculateNetTotal();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cart create(@RequestBody Cart body) {
		return carts.save(body);
	}

	@PutMapping("/{id}")
	public Cart update(@PathVariable Integer id, @RequestBody Cart body) {
		Cart cart = findById(id);
		body.setId(cart.getId());
		return carts.save(body);
	}

	@DeleteMapping("/{id}")
	public Cart delete(@PathVariable Integer id) {
		Cart cart = findById(id);
		carts.delete(cart);
		return cart;
	}
}
