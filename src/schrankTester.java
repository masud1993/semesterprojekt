import static org.junit.Assert.*;
import org.junit.*;

public class schrankTester {
	schranke s1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_1() {
		s1.schliessen();
		assertTrue(s1.istGeschlossen());
	}
}