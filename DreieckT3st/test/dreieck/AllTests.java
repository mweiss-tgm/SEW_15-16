package dreieck;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestIstDreieck.class, TestIstDreieckGleichschenkelig.class, TestIstDreieckGleichseitig.class, TestIstDreieckRechtwinkelig.class })
public class AllTests {

}