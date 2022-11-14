import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Espresso();
		//System.out.println(b1.getDescription());
		//System.out.println(b1.cost());
		//assertEquals("Espresso",b1.getDescription());
		b1 = new Soy(b1);
		b1 = new SteamedMilk(b1);
		assertEquals("Espresso, Soy, Steamed Milk",b1.getDescription());
		assertEquals(2.24,b1.cost());
	}
	
	@Test
	void testDecafMochaWhip() {
		Beverage b2 = new Decaf();
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
		assertEquals("Decaf, Mocha, Whip",b2.getDescription());
		assertEquals(1.35,b2.cost());
	}
}
