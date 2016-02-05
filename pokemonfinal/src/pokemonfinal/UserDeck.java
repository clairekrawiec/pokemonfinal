package pokemonfinal;
import java.util.ArrayList;
import java.util.Collections;

public class UserDeck
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
			userDeck.add(new PokemonCard(10, "Wingull", "wing attack"));
			userDeck.add(new PokemonCard(10, "Gligar", "toxic grip"));
			userDeck.add(new PokemonCard(10, "Pineco", "ram"));
			userDeck.add(new PokemonCard(30, "Squirtle", "bite"));
			userDeck.add(new PokemonCard(20, "Pelipper", "supersonic"));
			userDeck.add(new PokemonCard(10, "Cacnea", "feint attack"));
			userDeck.add(new PokemonCard(10, "Skitty", "tail whap"));
			userDeck.add(new PokemonCard(10, "Swablu", "peck"));
			userDeck.add(new PokemonCard(20, "Koffing", "confusion gas"));
			userDeck.add(new PokemonCard(10, "Magikarp", "Splash"));
			userDeck.add(new PokemonCard(20, "Wooper", "mud shot"));
			userDeck.add(new PokemonCard(10, "Wurmple", "needling sting"));
			userDeck.add(new PokemonCard(10, "Barboach", "mud spit"));
			userDeck.add(new PokemonCard(10, "Charmander", "Scratch"));
			userDeck.add(new PokemonCard(10, "Oddish", "stun spore"));
			userDeck.add(new PokemonCard(10, "Elekid", "Thunder Spear"));
			userDeck.add(new PokemonCard(10, "Ralts", "quick blow"));
			userDeck.add(new PokemonCard(40, "Makuhita", "arm thrust"));
			userDeck.add(new PokemonCard(20, "Gloom", "acid"));
			
			
			
		}
		public static void shuffleUserDeck()
			{
				Collections.shuffle(userDeck);
			}
		
		public static ArrayList<PokemonCard> getUserDeck()
			{
				return userDeck;
			}
		public static void setUserDeck(ArrayList<PokemonCard> ud)
			{
				UserDeck.userDeck = ud;
			}
	}
