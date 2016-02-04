package pokemonfinal;
import java.util.ArrayList;
import java.util.Scanner;
public class PokemonRunner1
	{
		public static int playerCards;
		public static int compCards;
		public static int drawCard;
		public static int askQuestion;
		 public static ArrayList <UserDeck> userHand = new ArrayList <UserDeck>();
         public static ArrayList <CompDeck> computerHand = new ArrayList <CompDeck>();
		public static void main(String[] args)
			{
				UserDeck.fillUserDeck();
				CompDeck.fillCompDeck();
				UserDeck.shuffleUserDeck();
				CompDeck.shuffleCompDeck();
				
					for(int i = 0; i > 3; i++)
						{
							  UserDeck.userDeck.get(0);
							  UserDeck.userDeck.get(1);
							  UserDeck.userDeck.get(2);
							  UserDeck.userDeck.get(3);
							
						}
						
						System.out.println("Welcome to Pokemon! your first card is " + UserDeck.userDeck.get(0).getName());
						System.out.println();
						System.out.println("Your second card is " + UserDeck.userDeck.get(1).getName());
						System.out.println();
						System.out.println("Your third card is " + UserDeck.userDeck.get(2).getName());
						System.out.println();
						System.out.println("your fourth card is " + UserDeck.userDeck.get(3).getName());
						System.out.println("What card would you like to play?");
						   Scanner userInput = new Scanner (System.in);
                           userInput.nextLine();
				

			}
		public static void askQuestion()
		{
			System.out.println("1. first card");
			System.out.println("2. second card");
			System.out.println("3. third card");
			System.out.println("4. fourth card");
			if(askQuestion == 1)
				{
					System.out.println("You played " + UserDeck.userDeck.get(0).getName() + " and its power is " + UserDeck.userDeck.get(0).getPower());
				}
			if(askQuestion == 2)
				{
					System.out.println("You played " + UserDeck.userDeck.get(1).getName() + " and its power is " + UserDeck.userDeck.get(1).getPower());
				}
			if(askQuestion == 3)
				{
					System.out.println("You played " + UserDeck.userDeck.get(2).getName() + " and its power is " + UserDeck.userDeck.get(2).getPower());
				}
			if(askQuestion == 4)
				{
					System.out.println("you played " + UserDeck.userDeck.get(4).getName() + " and its power is " + UserDeck.userDeck.get(4).getPower());
				}
		}

	}
