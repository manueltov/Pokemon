import java.util.HashSet;
import java.util.Set;

public class Utils {

	/**
	 * This method validates the given sequence The sequence can only have N, S, E,
	 * O chars
	 * 
	 * @param sequence
	 * @throws InvalidCharException
	 */
	public static void validateString(String sequence) throws InvalidCharException {

		Set<Character> setOfValidChars = new HashSet<>();
		setOfValidChars.add('N');
		setOfValidChars.add('S');
		setOfValidChars.add('E');
		setOfValidChars.add('O');

		for (char ch : sequence.toCharArray()) {
			if (!setOfValidChars.contains(ch)) {
				throw new InvalidCharException("Char '" + ch + "' is not valid.");
			}
		}
	}
}
