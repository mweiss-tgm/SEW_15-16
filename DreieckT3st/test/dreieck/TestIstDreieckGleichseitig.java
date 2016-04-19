package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

public class TestIstDreieckGleichseitig {
	
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}
	
	@Test
	public void testIstGleichseitig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSeitig());
	}
	
	@Test
	public void testIstNichtGleichseitig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testIstGleichseitigAberMinus() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(-1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testIstAUndBGleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testIstAUndCGleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void testIstBUndCGleich() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
}