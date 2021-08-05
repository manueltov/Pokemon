import java.util.HashSet;
import java.util.Set;

public class PokemonGame {

	/**
	 * Main
	 * @param args - string with sequece of movements
	 * 
	 * Each movement is a letter N, S, E or O (in portuguese: norte, sul, este, oeste).
	 */
	public static void main(String[] args) {
		
		String upperSequence = args[0].toUpperCase();
		
		try {
			//lets consider that lower cases are also valid
			validateString(upperSequence);
			
		} catch (InvalidCharException e) {
			System.err.println("The sequence inserted is invalid.\n" +
					"It shoud contain only N, S, E, O chars upper or lower case");
			e.printStackTrace();
		}
		
		PokemonMap pkMap = new PokemonMap();
		
		//for each char of the sequence convert it to a elem of Direction and move the Ash
		for (Character ch: upperSequence.toCharArray()) {
			switch (ch) {
			case 'N':
				pkMap.moveAsh(Direction.U);
				break;
			case 'S':
				pkMap.moveAsh(Direction.D);
				break;
			case 'E':
				pkMap.moveAsh(Direction.L);
				break;
			case 'O':
				pkMap.moveAsh(Direction.R);
				break;
			default:
				break;
			}
		}
		
		//System.out.println("Ash has made: " + pkMap.getPoints() + " points.");
		
		System.out.println(pkMap.getPoints());
	}
	
	/**
	 * This method validates the given sequence
	 * The sequence can only have N, S, E, O chars
	 * @param sequence
	 * @throws InvalidCharException
	 */
	private static void validateString(String sequence) throws InvalidCharException {
		
		Set<Character> setOfValidChars = new HashSet<>();
		setOfValidChars.add('N');
		setOfValidChars.add('S');
		setOfValidChars.add('E');
		setOfValidChars.add('O');

		for (char ch: sequence.toCharArray()) {
			if(!setOfValidChars.contains(ch)) {
				throw new InvalidCharException("Char " + ch + " is not valid.");
			}
		}
	}

}
