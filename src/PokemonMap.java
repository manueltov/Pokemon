import java.util.HashSet;
import java.util.Set;

/**
 * PokemonMap is the map for PokemonGame
 * @author Manuel
 *
 */
public class PokemonMap {

	private Coordinates atualPosi;
	private int points;
	private Set<Coordinates> pokemonCatched;
	
	public PokemonMap() {
		this.atualPosi = new Coordinates(0,0);
		this.points = 0;
		this.pokemonCatched = new HashSet<>();
	}
	
	/**
	 * This method moves Ash to the requested direction
	 * @param dir - Up or Down or Left or Right
	 * @return True if it correctly moved, False otherwise
	 */
	public boolean moveAsh(Direction dir) {
		//TODO
		return false;
	}

	/**
	 * Method to get the pontuation
	 * @return int with the pontuation
	 */
	public int getPoints() {
		return points;
	}
}
