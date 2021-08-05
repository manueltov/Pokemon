import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CoordinatesTest {

	@Test
	void testHashCode() {
		Coordinates pos1 = new Coordinates(2,4);
		Coordinates pos2 = new Coordinates(2,4);
		assertEquals(pos1.hashCode(), pos2.hashCode());
	}

	@Test
	void testGetX() {
		Coordinates pos1 = new Coordinates(-4,2);
		int x = pos1.getX();
		assertEquals(x, -4);
	}

	@Test
	void testSetX() {
		Coordinates pos1 = new Coordinates(-4,2);
		int newX = -3;
		pos1.setX(newX);
		assertEquals(pos1.getX(), newX);
	}

	@Test
	void testGetY() {
		Coordinates pos1 = new Coordinates(-2,3);
		int y = pos1.getY();
		assertEquals(y, 3);
	}

	@Test
	void testSetY() {
		Coordinates pos1 = new Coordinates(-4,2);
		int newY = -1;
		pos1.setY(newY);
		assertEquals(pos1.getY(), newY);
	}

	@Test
	void testEqualsObject() {
		Coordinates pos1 = new Coordinates(-3,-1);
		Coordinates pos2 = new Coordinates(-3,-1);
		assertTrue(pos1.equals(pos2));
	}

}
