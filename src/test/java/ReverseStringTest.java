import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseStringReturnsCorrectStringOddInput() {
		assertEquals("edcba", new ReverseString().reverse("abcde"));
	}

	@Test
	public void testReverseStringReturnsCorrectStringEvenInput() {
		assertEquals("654321", new ReverseString().reverse("123456"));
	}

}
