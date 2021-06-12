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

import it.formarete.amazin.domain.Product;
import it.formarete.amazin.persistence.ProductRepository;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
	@Autowired
	private ProductRepository products;

	@GetMapping
	public Iterable<Product> findAll() {
		return products.findAll();
	}

	@GetMapping("/{id}")
	public Product findById(@PathVariable Integer id) {
		return products.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found."));
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product create(@RequestBody Product body) {
		return products.save(body);
	}

	@PutMapping("/{id}")
	public Product update(@PathVariable Integer id, @RequestBody Product body) {
		Product product = findById(id);
		body.setId(product.getId());
		return products.save(body);
	}

	@DeleteMapping("/{id}")
	public Product delete(@PathVariable Integer id) {
		Product product = findById(id);
		products.delete(product);
		return product;
	}
}
