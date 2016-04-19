package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

public class TestIstDreieck {
	
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a,seite_b,seite_c);
	}
	
	@Test
	public void testIstDreieckSeiteANull() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckSeiteBNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckSeiteCNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckSeiteAKleinerNull() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckSeiteBKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckSeiteCKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(-1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testAPlusBGleichC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testAPlusCGleichB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testCPlusBGleichA() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testAPlusBKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(Integer.MAX_VALUE);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testCPlusBKleinerNull() {
		dreieck.setSeite_a(Integer.MAX_VALUE);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testAPlusCKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(Integer.MAX_VALUE);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testAPlusBKleinerC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testAPlusCKleinerB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(6);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testCPlusBKleinerA() {
		dreieck.setSeite_a(6);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void testIstDreieckTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.istDreieck());
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
}