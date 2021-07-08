import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseStringReturnsString() {
		assertEquals("odd", new ReverseString().reverse("abcde"));
	}

	@Test
	public void ReverseStringReturnsLengthOfString() {
		assertEquals("even", new ReverseString().reverse("123456"));
	}

}
