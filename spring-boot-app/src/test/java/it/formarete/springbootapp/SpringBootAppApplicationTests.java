package it.formarete.springbootapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringBootAppApplicationTests {

	@Test
	void worksWithoutDI() {
		Engine engine = new Engine();
		Transmission transmission = new Transmission();
		Car car = new Car(engine, transmission);

		assertNotNull(car.getEngine());
		assertNotNull(car.getTransmission());
	}

	@Test
	void worksWithDI() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Car car = context.getBean(Car.class);

		assertNotNull(car.getEngine());
		assertNotNull(car.getTransmission());

		Car anotherCar = context.getBean(Car.class);

		assertTrue(car == anotherCar);

		((ConfigurableApplicationContext) context).close();
	}

	@Autowired
	private Car car;

	@Test
	void worksWithAutowiring() {
		assertNotNull(car.getEngine());
		assertNotNull(car.getTransmission());
	}
}
