import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UtilsTest {

	@Test
	public void testInvalidStringOne() {
		try {
			Utils.validateString("ABC");
		} catch (Exception e) {
			String expectedMessage = "Char " + "'A'" + " is not valid";
			String actualMessage = e.getMessage();
			assertTrue(actualMessage.contains(expectedMessage));
		}
	}

	@Test
	void testInvalidStringTwo() {
		try {
			Utils.validateString("NSNSNU");
		} catch (Exception e) {
			String expectedMessage = "Char " + "'U'" + " is not valid";
			String actualMessage = e.getMessage();
			assertTrue(actualMessage.contains(expectedMessage));
		}
	}

	@Test
	void testInvalidStringThree() {
		try {
			Utils.validateString("OOOOOO#");
		} catch (Exception e) {
			String expectedMessage = "Char " + "'#'" + " is not valid";
			String actualMessage = e.getMessage();
			assertTrue(actualMessage.contains(expectedMessage));
		}
	}

	@Test
	void testStringOne() {
		try {
			Utils.validateString("E");
		} catch (Exception e) {
			fail("Should not have thrown any exception");
		}
	}

	@Test
	void testStringTwo() {
		try {
			Utils.validateString("NESO");
		} catch (Exception e) {
			fail("Should not have thrown any exception");
		}
	}

	@Test
	void testStringThree() {
		try {
			Utils.validateString("NSNSNSNSNS");
		} catch (Exception e) {
			fail("Should not have thrown any exception");
		}
	}
}
