package terning;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TerningTest {

	Dice dice;
	
	@Before
	public void setUp() throws Exception {
		dice = new Dice();
	}

	@After
	public void tearDown() throws Exception {
		dice = null;
	}


	@Test
	public void andreVærdierend6() {
		int b = dice.roll();
		boolean actual =  (b > 0 && b < 7);
		assertTrue(actual);
	}
	
	@Test
	public void andreVærdierend6mange() {
	
		for (int i=1; i<100000; i++) {
			int b = dice.roll();
			boolean actual =  (b > 0 && b < 7);
			assertTrue(actual);
		}		
	}
	
	@Test
	public void erdenfiarmed1() {
		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;
		int f =0;
		
		for (int i=0; i<60000; i++) {
			
			int z = dice.roll();
			
			if (z == 1) {
				 a++;
			}
			else if (z == 2) {
				 b++;
			}
			else if (z == 3) {
				c++;
			}
			else if (z == 4) {
				d++;
			}
			else if (z == 5) {
				e++;
			}
			else  {
				 f++;
			}
	}
		int expected = 10000;
		int interval = 400;
		
		assertEquals(expected, a, interval);
		assertEquals(expected, b, interval);
		assertEquals(expected, c, interval);
		assertEquals(expected, d, interval);
		assertEquals(expected, e, interval);
		assertEquals(expected, f, interval);
		
	}
}
