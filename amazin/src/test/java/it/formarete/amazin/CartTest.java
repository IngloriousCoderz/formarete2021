package it.formarete.amazin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import it.formarete.amazin.domain.Cart;
import it.formarete.amazin.domain.Item;
import it.formarete.amazin.domain.Product;

class CartTest {
	@Test
	public void testCalculateTotal() {
		// given
		Product tss = new Product();
		tss.setName("tss");
		tss.setPrice(45f);

		Product fci = new Product();
		fci.setName("fci");
		fci.setPrice(61f);

		Cart cart = new Cart();

		Item tssItem = new Item();
		tssItem.setProduct(tss);
		tssItem.setQuantity(110);

		Item fciItem = new Item();
		fciItem.setProduct(fci);
		fciItem.setQuantity(49);

		List<Item> items = new ArrayList<>();
		items.add(tssItem);
		items.add(fciItem);
		cart.setItems(items);

		// when
		Float total = cart.calculateTotal();
		Float netTotal = cart.calculateNetTotal();

		// then
		assertEquals(7939, total);
		assertEquals(3253.6885f, netTotal);
	}
}
