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
	
	
}
