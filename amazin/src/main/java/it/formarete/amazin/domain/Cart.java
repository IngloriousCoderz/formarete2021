package it.formarete.amazin.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	private User user;
	@OneToMany
	@JoinColumn(name = "cart_id")
	private List<Item> items;

	public Float calculateTotal() {
		Float total = 0f;
		for (Item item : items) {
			total += item.calculatePrice();
		}
		return total;
	}

	public Float calculateNetTotal() {
		final Float VAT = 1.22f;
		final Float TAXES = 0.5f;

		Float total = calculateTotal();
		return total / VAT * (1 - TAXES);
	}
}
