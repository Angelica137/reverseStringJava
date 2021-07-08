import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseStringReturnsString() {
		assertEquals("e is the one", new ReverseString().reverse("abcde"));
	}

	@Test
	public void ReverseStringReturnsLengthOfString() {
		assertEquals("6 is the one", new ReverseString().reverse("123456"));
	}

}
