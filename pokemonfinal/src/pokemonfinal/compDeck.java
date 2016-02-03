package pokemonfinal;
import java.util.ArrayList;
public class compDeck
	{
		public static ArrayList <PokemonCard> compDeck = new ArrayList <PokemonCard>();
		public static int newCard = 0;
		public static void fillUserDeck()
		{
			compDeck.add(new PokemonCard(10, "Zigzagoon", "double stab"));
			compDeck.add(new PokemonCard(10, "taillow", "skill dive"));
			compDeck.add(new PokemonCard(10, "barboach", "waterfall"));
			compDeck.add(new PokemonCard(30, "porygon", "sharpen"));
			compDeck.add(new PokemonCard(30, "electrode", "reckless bomb"));
			compDeck.add(new PokemonCard(10, "zubat", "poison fang"));
			compDeck.add(new PokemonCard(20, "corsola", "double attack"));
			compDeck.add(new PokemonCard(20, "Roselia", "flick poison"));
			compDeck.add(new PokemonCard(10, "beldum", "magnetic lines"));
			compDeck.add(new PokemonCard(30, "Combusken", "fire breathing"));
			compDeck.add(new PokemonCard(60, "Magikarp", "dragon rage"));
			compDeck.add(new PokemonCard(30, "Whismur", "supersonic"));
			compDeck.add(new PokemonCard(10, "meditite", "kick"));
			compDeck.add(new PokemonCard(10, "electrike", "quick blow"));
			compDeck.add(new PokemonCard(20, "Diglett", "sand pitt"));
			compDeck.add(new PokemonCard(20, "nidoran", "poison sting"));
			compDeck.add(new PokemonCard(20, "Treecko", "paralyzing gaze"));
			compDeck.add(new PokemonCard(20, "Staryu", "Spinning attack"));
			compDeck.add(new PokemonCard(10, "Marill", "rollout"));
			compDeck.add(new PokemonCard(20, "Drowzee", "headbutt"));
			compDeck.add(new PokemonCard(10, "Phanpy", "mud slam"));
			compDeck.add(new PokemonCard(30, "machop", "submission"));
			compDeck.add(new PokemonCard(100, "Pikachu", "thunder wave"));
			compDeck.add(new PokemonCard(30, "Corphish", "corkscrew punch"));
			compDeck.add(new PokemonCard(10, "Mankey", "Rage"));
			
		}
	}
