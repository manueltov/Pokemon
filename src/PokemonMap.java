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
	
	//metodo move para outra posicao
	//TODO
	
	//metodo devolve pontuacao
	//TODO
}
