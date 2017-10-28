/**
 * @author mtaher2s , jachou2s , oemran2s
 */

import static org.junit.Assert.*;
import org.junit.*;

public class zahlenTester {
	zahlen z1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_1() {
		assertTrue(z1.bezahlend(1));
	}

	@Test
	public void test_2() {
		assertFalse(z1.bezahlend(2));
	}
}
