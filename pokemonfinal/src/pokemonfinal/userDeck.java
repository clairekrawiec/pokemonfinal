package pokemonfinal;
import java.util.ArrayList;

public class userDeck
	{
		public static ArrayList <PokemonCard> userDeck = new ArrayList <PokemonCard>();
		public static int newCard = 0;
		public static void fillUserDeck()
		{
			userDeck.add(new PokemonCard(20, "Spoink", "hypnotic gaze"));
			userDeck.add(new PokemonCard(10, "Natu", " confuse ray"));
			userDeck.add(new PokemonCard(10, "Treecko", "shining claws"));
			userDeck.add(new PokemonCard(20, "Nidoran", "poison sting"));
			userDeck.add(new PokemonCard(10, "Aron", "flail"));
			userDeck.add(new PokemonCard(20, "Mankey", "low kick"));
			userDeck.add(new PokemonCard(10, "wingull", "wing attack"));
			userDeck.add(new PokemonCard(10, "Gligar", "toxic grip"));
			userDeck.add(new PokemonCard(10, "pineco", "ram"));
			userDeck.add(new PokemonCard(30, "squirtle", "bite"));
			userDeck.add(new PokemonCard(20, "pelipper", "supersonic"));
			userDeck.add(new PokemonCard(10, "Cacnea", "feint attack"));
			userDeck.add(new PokemonCard(10, "skitty", "tail whap"));
			userDeck.add(new PokemonCard(10, "swablu", "peck"));
			userDeck.add(new PokemonCard(20, "Koffing", "confusion gas"));
			userDeck.add(new PokemonCard(10, "Magikarp", "Splash"));
			userDeck.add(new PokemonCard(20, "wooper", "mud shot"));
			userDeck.add(new PokemonCard(10, "wurmple", "needling sting"));
			userDeck.add(new PokemonCard(10, "Barboach", "mud spit"));
			userDeck.add(new PokemonCard(10, "Charmander", "Scratch"));
			
			
		}
		
	}
