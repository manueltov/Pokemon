import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PokemonGame {

	/**
	 * Main
	 * @param args - string with sequece of movements
	 * 
	 * Each movement is a letter N, S, E or O (in portuguese: norte, sul, este, oeste).
	 */
	public static void main(String[] args) {
		
		//TODO
		try {
			boolean stringIsValid = validateString(args[0]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TODO
		//Create PokemonMap
		
		
		//TODO
		//Run the sequence in the map
		
		//TODO
		//print the number of pokemons catched
	}
	
	//TODO
	private static boolean validateString(String sequence) throws Exception {
		
		//lets consider that lower cases are also valid
		String upperSequence = sequence.toUpperCase();
		
		Set<Character> setOfValidChars = new HashSet<>();
		setOfValidChars.add('N');
		setOfValidChars.add('S');
		setOfValidChars.add('E');
		setOfValidChars.add('O');

		for (char ch: upperSequence.toCharArray()) {
			if(!setOfValidChars.contains(ch)) {
				throw new Exception("Char " + ch + " is not valid");
			}
		}
		
		//TODO
		//ver outros edge cases de erros para mandar excecao
		
		return true;
	}

}
