package pokemonfinal;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonRunner1
    {
        public static int playerCards;
        public static int compCards;
        public static int drawCard;
        public static int askQuestion;
        public static int menuChoice = 1;
        public static int playAgain = 1;
        public static boolean play = true;
         public static ArrayList <UserDeck> userHand = new ArrayList <UserDeck>();
         public static ArrayList <CompDeck> computerHand = new ArrayList <CompDeck>();
        public static void main(String[] args)
            {
            	while(play)
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
                    for(int i = 0; i > 3; i++)
                    {
                        CompDeck.compDeck.get(0);
                        CompDeck.compDeck.get(1);
                        CompDeck.compDeck.get(2);
                        CompDeck.compDeck.get(3);
                        
                    }
                        
                        System.out.println("Welcome to Pokemon! ");
                        		System.out.println("your first card is " + UserDeck.userDeck.get(0).getName());
                        System.out.println();
                        System.out.println("Your second card is " + UserDeck.userDeck.get(1).getName());
                        System.out.println();
                        System.out.println("Your third card is " + UserDeck.userDeck.get(2).getName());
                        System.out.println();
                        System.out.println("your fourth card is " + UserDeck.userDeck.get(3).getName());
                        System.out.println();
                        System.out.println("What card would you like to play?");
                        askQuestion();
                        switch (menuChoice)
                        {
                        case 1:
                            System.out.println("You played " + UserDeck.userDeck.get(0).getName() + ", its power was " +UserDeck.userDeck.get(0).getPower());
                                System.out.println("The computer's card was " + CompDeck.compDeck.get(0).getName() + ", its power was " + CompDeck.compDeck.get(0).getPower());
                                    if(UserDeck.userDeck.get(0).getPowerNum() == CompDeck.compDeck.get(0).getPowerNum())
                                    {
                                        System.out.println("Your pokemon's tied! crazy!");
                                    }
                                    if(UserDeck.userDeck.get(0).getPowerNum() > CompDeck.compDeck.get(0).getPowerNum())
                                    {
                                        System.out.println("Your card " + UserDeck.userDeck.get(0).getName() + " beat the computer's card " + CompDeck.compDeck.get(0).getName());
                                        System.out.println("YOU WIN!!!!");
                                        System.out.println();
                                        System.out.println("Catch them all!");
                                    }
                                    if(UserDeck.userDeck.get(0).getPowerNum() < CompDeck.compDeck.get(0).getPowerNum())
                                    {
                                        System.out.println("Your card " + UserDeck.userDeck.get(0).getName() + " was beaten by the computer's card " + CompDeck.compDeck.get(0).getName());
                                        System.out.println("You lose.");
                                    }
                            break;
                        case 2:
                            System.out.println("You played " + UserDeck.userDeck.get(1).getName() + " it power was " + UserDeck.userDeck.get(1).getPower());
                            System.out.println("The computer's card was " + CompDeck.compDeck.get(1).getName() + ", and its power was " + CompDeck.compDeck.get(1).getPower());
                                if(UserDeck.userDeck.get(1).getPowerNum() == CompDeck.compDeck.get(1).getPowerNum())
                                {
                                    System.out.println("Your pokemons tied! crazy!");
                                }
                                if(UserDeck.userDeck.get(1).getPowerNum() > CompDeck.compDeck.get(1).getPowerNum())
                                {
                                    System.out.println("Your card " + UserDeck.userDeck.get(1).getName() + " beat the computer's card " + CompDeck.compDeck.get(1).getName());
                                    System.out.println("YOU WIN!!!!!!!");
                                    System.out.println();
                                    System.out.println("Catch them all!");
                                }
                                if(UserDeck.userDeck.get(1).getPowerNum() < CompDeck.compDeck.get(1).getPowerNum())
                                {
                                    System.out.println("Your card " + UserDeck.userDeck.get(1).getName() + " was beaten by the computers card " + CompDeck.compDeck.get(1).getName());
                                    System.out.println("You lose.");
                                }
                            break;
                        case 3:
                            System.out.println("You played " + UserDeck.userDeck.get(2).getName() + ", its power was " + UserDeck.userDeck.get(2).getPower());
                            System.out.println("The computer's card was " + CompDeck.compDeck.get(2).getName() + ", and its power was " + CompDeck.compDeck.get(2).getPower());
                            if(UserDeck.userDeck.get(2).getPowerNum() == CompDeck.compDeck.get(2).getPowerNum())
                            {
                                System.out.println("Your pokemons tied! Crazy!");
                            }
                            if(UserDeck.userDeck.get(2).getPowerNum() > CompDeck.compDeck.get(2).getPowerNum())
                            {
                                System.out.println("Your card " + UserDeck.userDeck.get(2).getName() + " beat the computer's card " + CompDeck.compDeck.get(2).getName());
                                System.out.println("YOU WIN!!!");
                                System.out.println();
                                System.out.println("Catch them all!");
                            }
                            if(UserDeck.userDeck.get(2).getPowerNum() < CompDeck.compDeck.get(2).getPowerNum())
                            {
                                System.out.println("Your card " + UserDeck.userDeck.get(2).getName() + " was beaten by the computer's card " + CompDeck.compDeck.get(2).getName());
                                System.out.println("You lose.");
                            }
                            break;
                        case 4:
                            System.out.println("You played " + UserDeck.userDeck.get(3).getName() + ", its power was " + UserDeck.userDeck.get(3).getPower());
                            System.out.println("The computer's card was " + CompDeck.compDeck.get(3).getName() + ", and its power was " + CompDeck.compDeck.get(3).getPower());
                            if(UserDeck.userDeck.get(3).getPowerNum() == CompDeck.compDeck.get(3).getPowerNum())
                            {
                                System.out.println("Your pokemons tied! Crazy!");
                            }
                            if(UserDeck.userDeck.get(3).getPowerNum() > CompDeck.compDeck.get(3).getPowerNum())
                            {
                                System.out.println("Your card " + UserDeck.userDeck.get(3).getName() + " beat the computer's card " + CompDeck.compDeck.get(3).getName());
                                System.out.println("YOU WIN!!!!!!!");
                                System.out.println();
                                System.out.println("Catch them all!");
                            }
                            if(UserDeck.userDeck.get(3).getPowerNum() < CompDeck.compDeck.get(3).getPowerNum())
                            {
                                System.out.println("Your card " + UserDeck.userDeck.get(3).getName() + " was beaten by the computer's card " + CompDeck.compDeck.get(3).getName());
                                System.out.println("You lose.");
                            }
                            break;
                        case 5:
                        	System.out.println("please choose a number 1-4");
                        	askQuestion();
                        	break;
                            
                        }
                        System.out.println("Would you like to play again?");
                        System.out.println("1. Heck yes!");
                        System.out.println("2. No thanks.");
                        Scanner userInput = new Scanner (System.in);
                    String input = userInput.nextLine();
                        
                       if(input.equals("1"))
                    	   {
                    		   
                    	   }
                    	   
                            System.out.println("Thanks for playing. remember to catch them all!");
                            play= false;
                        }
                        
            		}
                        
                

            }
        public static void askQuestion()
        {
            
            System.out.println("1. first card");
            System.out.println("2. second card");
            System.out.println("3. third card");
            System.out.println("4. fourth card");
            Scanner user_Input = new Scanner (System.in);
            user_Input.nextLine();
            
            
            
        
        }

    }

