import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PokemonMapTest {

	private static PokemonMap pkMap;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pkMap = new PokemonMap();
	}

	@Test
	void moveAshUp() {
		Coordinates beforeMove = pkMap.getAtualPosi();
		pkMap.moveAsh(Direction.U);
		Coordinates afterMove = pkMap.getAtualPosi();
		assertNotEquals(beforeMove, afterMove);
	}

	@Test
	void moveAshDown() {
		Coordinates beforeMove = pkMap.getAtualPosi();
		pkMap.moveAsh(Direction.D);
		Coordinates afterMove = pkMap.getAtualPosi();
		assertNotEquals(beforeMove, afterMove);
	}

	@Test
	void moveAshLeft() {
		Coordinates beforeMove = pkMap.getAtualPosi();
		pkMap.moveAsh(Direction.L);
		Coordinates afterMove = pkMap.getAtualPosi();
		assertNotEquals(beforeMove, afterMove);
	}

	@Test
	void moveAshRight() {
		Coordinates beforeMove = pkMap.getAtualPosi();
		pkMap.moveAsh(Direction.R);
		Coordinates afterMove = pkMap.getAtualPosi();
		assertNotEquals(beforeMove, afterMove);
	}

	@Test
	void ashReturnToSamePosition() {
		Coordinates beforeMove = pkMap.getAtualPosi();
		pkMap.moveAsh(Direction.R);
		pkMap.moveAsh(Direction.L);
		Coordinates afterMove = pkMap.getAtualPosi();
		assertEquals(beforeMove, afterMove);
	}

	@Test
	void getPoints() {
		int points = pkMap.getPoints();
		assertNotEquals(points, 0);
	}

	@Test
	void hasOnePoint() {
		PokemonMap pkMap2 = new PokemonMap();
		int points = pkMap2.getPoints();
		assertEquals(points, 1);
	}

	@Test
	void exampleInputOne() {
		// Input: E
		// Output: 2
		PokemonMap input1 = new PokemonMap();
		input1.moveAsh(Direction.L);
		int points = input1.getPoints();
		assertEquals(points, 2);
	}

	@Test
	void exampleInputTwo() {
		// Input: NESO
		// Output: 4
		PokemonMap input2 = new PokemonMap();
		input2.moveAsh(Direction.U);
		input2.moveAsh(Direction.L);
		input2.moveAsh(Direction.D);
		input2.moveAsh(Direction.R);
		int points = input2.getPoints();
		assertEquals(points, 4);
	}

	@Test
	void exampleInputThree() {
		// Input: NSNSNSNSNS
		// Output: 2
		PokemonMap input3 = new PokemonMap();
		input3.moveAsh(Direction.U);
		input3.moveAsh(Direction.D);
		input3.moveAsh(Direction.U);
		input3.moveAsh(Direction.D);
		input3.moveAsh(Direction.U);
		input3.moveAsh(Direction.D);
		input3.moveAsh(Direction.U);
		input3.moveAsh(Direction.D);
		input3.moveAsh(Direction.U);
		input3.moveAsh(Direction.D);
		int points = input3.getPoints();
		assertEquals(points, 2);
	}

	@Test
	void exampleBigBigInputComplexity() {
		// Input: NNNNNNN... (1 000 000 times)
		// A MILLION!!
		// Output: 1 000 001
		int howManyTimes = 1000000;
		PokemonMap input4 = new PokemonMap();
		for (int i = 0; i < howManyTimes; i++)
			input4.moveAsh(Direction.U);
		int points = input4.getPoints();
		assertEquals(points, howManyTimes + 1);
	}
}
