
import static org.junit.Assert.*;
import org.junit.*;

public class preisBerechnenTester {

	preisBerechnen p1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_1() {
		assertEquals(500, p1.getPreis(1)); // für ein tag
	}
}