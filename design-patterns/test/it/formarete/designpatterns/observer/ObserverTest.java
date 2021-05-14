package it.formarete.designpatterns.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ObserverTest {
	@Test
	public void testObserver() {
		// given
		Subject subject = new Subject();
		Observer observer = new ObserverImpl();
		subject.registerObserver(observer);
		
		// when
		subject.notifyObservers("Hello world!");
		
		// then
		assertEquals("Hello world!", ((ObserverImpl)observer).getMessage());
	}
}
