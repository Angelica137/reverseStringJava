import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseStringReturnsString() {
		assertEquals(1, new ReverseString().reverse("12345"));
	}

}
