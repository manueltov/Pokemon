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
		
		//Add the pokemon of the inicial position
		catchPokemonIfExists(atualPosi);
	}
	
	/**
	 * This method moves Ash to the requested direction
	 * @param dir - Up or Down or Left or Right
	 * @return True if it correctly moved, False otherwise
	 */
	public boolean moveAsh(Direction dir) {
		boolean moved = false;
		
		//atual position of Ash
		int atualX = atualPosi.getX();
		int atualY = atualPosi.getY();
		
		//move to the new position
		switch (dir) {
		case U:
			atualPosi = new Coordinates(atualX, atualY+1);
			moved = true;
			break;
		case D:
			atualPosi = new Coordinates(atualX, atualY-1);
			moved = true;
			break;
		case L:
			atualPosi = new Coordinates(atualX-1, atualY);
			moved = true;
			break;
		case R:
			atualPosi = new Coordinates(atualX+1, atualY);
			moved = true;
			break;
		default:
			return moved;
		}
		
		//catch pokemon if the new position has one
		catchPokemonIfExists(atualPosi);
		
		return moved;
	}

	/**
	 * Method to get the pontuation
	 * @return int with the pontuation
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Getter of atual position coordinates of Ash
	 * @return
	 */
	public Coordinates getAtualPosi() {
		return atualPosi;
	}

	/**
	 * If that position has a pokemon, catch it
	 * and save that position to the set
	 * @param posi - position to try to catch
	 */
	private void catchPokemonIfExists(Coordinates posi) {
		if(!this.pokemonCatched.contains(posi)) {
			this.points++;
			this.pokemonCatched.add(posi);
		}
	}
}
