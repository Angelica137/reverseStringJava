import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseStringReturnsString() {
		assertEquals("Hello, world!", new ReverseString().reverse());
	}

}
