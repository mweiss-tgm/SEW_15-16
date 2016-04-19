package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

public class TestIstDreieckGleichschenkelig {
	
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}
	
	@Test
	public void testIstKeinDreieck() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testIstDreieck() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testIstNichtGleichschenkelig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(9);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testIstAUndBGleichschenkelig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(4);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testIstAundCGleichschenkelig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void testIstBundCGleichschenkelig() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
}