import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseStringReturnsString() {
		assertEquals(5, new ReverseString().reverse("abcde"));
	}

	@Test
	public void ReverseStringReturnsLengthOfString() {
		assertEquals(6. new ReverseString().reverse("123456"));
	}

}
