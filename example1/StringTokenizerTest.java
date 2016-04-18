package example1;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.junit.Test;

/*
 * @author	-	Weiss Matthias
 * @date	- 	2016-04-11
 */

public class StringTokenizerTest {

	StringTokenizer st;
	
	@Test
	public void testNextTokenWithSpaceDelimiter() {
		st = new StringTokenizer("this is a test");
		st.nextToken();
	}
	
	@Test
	public void testNextTokenWithTabulatorDelimiter() {
		st = new StringTokenizer("this\tis a test");
		st.nextToken();
	}
	
	@Test
	public void testNextTokenWithNewLineDelimiter() {
		st = new StringTokenizer("this\nis a test");
		st.nextToken();
	}
	
	@Test
	public void testNextTokenWithReturnDelimiter() {
		st = new StringTokenizer("this\ris a test");
		st.nextToken();
	}
	
	@Test
	public void testNextTokenWithFormfeedDelimiter() {
		st = new StringTokenizer("this\fis a test");
		st.nextToken();
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testNextTokenWithoutExistingToken() {
		st = new StringTokenizer("");
		st.nextToken();
	}
	
	@Test (expected=NoSuchElementException.class)
	public void testNextTokenWithAllDelimiters() {
		st = new StringTokenizer(" \t\n\r\f");
		st.nextToken();
	}
	
	@Test (expected=NoSuchElementException.class)
	public void testNextTokenWithOnlySpaceDelimiter() {
		st = new StringTokenizer("     ");
		st.nextToken();
	}
	
	@Test
	public void testCountTokensWithAllDelimiters() {
		st = new StringTokenizer(" \t\n\r\f");
		st.countTokens();
	}
	
	@Test
	public void testCountTokensWithOnlySpaceDelimiters() {
		st = new StringTokenizer("     ");
		st.countTokens();
	}
	
	@Test
	public void testCountTokensWithOnlyTabulatorDelimiters() {
		st = new StringTokenizer("\t\t\t\t");
		st.countTokens();
	}
	
	@Test
	public void testCountTokensWithOnlyNewLineDelimiters() {
		st = new StringTokenizer("\n\n\n\n");
		st.countTokens();
	}
	
	@Test
	public void testCountTokensWithOnlyReturnDelimiters() {
		st = new StringTokenizer("\r\r\r\r");
		st.countTokens();
	}
	
	@Test
	public void testCountTokensWithOnlyFormFeedDelimiters() {
		st = new StringTokenizer("\f\f\f\f");
		st.countTokens();
	}
	
	@Test
	public void testCountTokensWithOutExistingToken() {
		st = new StringTokenizer("");
		st.countTokens();
	}
}


/*
 *	!important!
 *
 *  @before
 *  @after
 *  @beforeclass
 *  @afterclass
*/