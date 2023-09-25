package sample.cafekiosk.unit.beverage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmericanoTest {

	@Test
	void getName() {
		Americano americano = new Americano();
		//JUnit
		assertEquals(americano.getName(), "Americano");
		//assertj, 조금 더 명시적임.
		assertThat(americano.getName()).isEqualTo("Americano");
	}

	@Test
	void getPrice(){
		Americano americano = new Americano();
		assertThat(americano.getPrice()).isEqualTo(4000);
	}

}