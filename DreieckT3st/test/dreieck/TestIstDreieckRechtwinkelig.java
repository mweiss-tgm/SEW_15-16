package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

public class TestIstDreieckRechtwinkelig {

	int seite_a;
	int seite_b;
	int seite_c;

	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}

	@Test
	public void testIstKeinDreieck() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(0);

		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstAGroesserBUndC() {
		dreieck.setSeite_a(10);
		dreieck.setSeite_b(9);
		dreieck.setSeite_c(8);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testIstBGroesserAUndC() {
		dreieck.setSeite_a(9);
		dreieck.setSeite_b(10);
		dreieck.setSeite_c(8);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testIstCGroesserAUndB() {
		dreieck.setSeite_a(8);
		dreieck.setSeite_b(9);
		dreieck.setSeite_c(10);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testIstCKleinerB() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testIstNichtRechtwinkelig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testIstCGroesserBKleinerA() {
		dreieck.setSeite_a(6);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(6);

		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void zeroWasHere() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);
		
		assertTrue(dreieck.rechtWinkelig());
	}
}