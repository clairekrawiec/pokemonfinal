package pokemonfinal;
import java.util.ArrayList;
import java.util.Collections;
public class CompDeck
	{
		public static ArrayList <PokemonCard> compDeck = new ArrayList <PokemonCard>();
		public static int newCard = 0;
		public static void fillCompDeck()
		{
			compDeck.add(new PokemonCard(10, "Zigzagoon", "double stab"));
			compDeck.add(new PokemonCard(10, "Taillow", "skill dive"));
			compDeck.add(new PokemonCard(10, "Barboach", "waterfall"));
			compDeck.add(new PokemonCard(30, "Porygon", "sharpen"));
			compDeck.add(new PokemonCard(30, "Electrode", "reckless bomb"));
			compDeck.add(new PokemonCard(10, "Zubat", "poison fang"));
			compDeck.add(new PokemonCard(20, "Corsola", "double attack"));
			compDeck.add(new PokemonCard(20, "Roselia", "flick poison"));
			compDeck.add(new PokemonCard(10, "Beldum", "magnetic lines"));
			compDeck.add(new PokemonCard(30, "Combusken", "fire breathing"));
			compDeck.add(new PokemonCard(60, "Magikarp", "dragon rage"));
			compDeck.add(new PokemonCard(30, "Whismur", "supersonic"));
			compDeck.add(new PokemonCard(10, "Meditite", "kick"));
			compDeck.add(new PokemonCard(10, "Electrike", "quick blow"));
			compDeck.add(new PokemonCard(20, "Diglett", "sand pitt"));
			compDeck.add(new PokemonCard(20, "Nidoran", "poison sting"));
			compDeck.add(new PokemonCard(20, "Treecko", "paralyzing gaze"));
			compDeck.add(new PokemonCard(20, "Staryu", "Spinning attack"));
			compDeck.add(new PokemonCard(10, "Marill", "rollout"));
			compDeck.add(new PokemonCard(20, "Drowzee", "headbutt"));
			compDeck.add(new PokemonCard(10, "Phanpy", "mud slam"));
			compDeck.add(new PokemonCard(30, "Machop", "submission"));
			compDeck.add(new PokemonCard(100, "Pikachu", "thunder wave"));
			compDeck.add(new PokemonCard(30, "Corphish", "corkscrew punch"));
			compDeck.add(new PokemonCard(10, "Mankey", "Rage"));
			
		}
		public static void shuffleCompDeck()
			{
				Collections.shuffle(compDeck);
			}
		
		public static ArrayList<PokemonCard> getCompDeck()
			{
				return compDeck;
			}
		public static void setCompDeck(ArrayList<PokemonCard> cd)
			{
				CompDeck.compDeck = cd;
			}
	}
