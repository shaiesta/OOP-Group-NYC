import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

/* FINAL PROJECT: RUTGERS ROUNDABOUT 
 * 
 * @author Daniell, Kayla, Shaiesta, Raqia, Julia - Using: Beatrice Trinidad, Johnny Manzano, Renz Sarayba, Chantelle Glowacki, Jonathan Paragas
 *
 */
public class PlayGame {

	public static void main(String[] args)  throws IOException {
		
// GAME EXPLANATION
		StartAdventure adventure = new StartAdventure();
		Scanner keyboard = new Scanner(System.in);
		String playAgain; // Asks if user wants to play again
		
		do {  
			
// PLAYER HANDLING
				String name; // Player's name
			 	int totalPlayers = 0; // Will change to however many total players will be doing this game
			 	boolean done = false; // Boolean to check if a valid input was actually done.
			 	
			 	System.out.println("\nWelcome to Rutgers Roundabout! \n"
					    + "It's a beautiful morning and the first day of your internship. \n"
					    + "As an ITI student at Rutgers, you decided to expand your horizons and accept an offer in NYC. \n \n"
					    + "Excited for the day ahead, you look at the clock that now reads 5:00 a.m.. \n"
					    + "Work starts at 8:00 a.m.. \n"
					    + "So you better get ready and head out soon to reach midtown Manhattan in time! \n"
					    + "As you get ready, you excitedly think about the day to come. \n"
					    + "You did some research last night on how to get to work and found a few options.\n \n"
					    + "Once you reach Penn Station at NYC, you can either \n"
				            + "Take the subway - which is a reasonable option \n"
					    + "Grab a taxi - which seems like the fastest, yet most expensive option \n"
					    + "Or take a walk and enjoy the city air - which will take time but be enjoyable \n"
				            + "You glance at the clock once more and notice that it's nearly 6:00am! \n"
					    + "No time to grab breakfast...maybe you'll get something in the city. \n"   
					    + "It's time to start your journey!. :( \n") ;
		
			 	while (!done) {
			 		try {
			 			System.out.print("How many players are in this game? ");
			 			totalPlayers = keyboard.nextInt(); 
			 			done = true;
					
			 		} catch(InputMismatchException e) { 
			 			System.out.println("Invalid input - try again. \n"); 
			 			keyboard.next();
			 		}
			 	}
			 	

		        Player[] playersArray = new Player[totalPlayers];

		        for (int i = 0; i < playersArray.length; i++) {
		        	
		        		System.out.print("What is the name of Player " + (i + 1)  + "? ");
					name = keyboard.next();
					
					playersArray[i] = new Player();
					playersArray[i].setPlayerName(name);
	  
		        }
		        
		       int tPoints = 0; // Sets each player's points to zero.
		       
		       System.out.println("\nLet's begin our tour at Rutgers University! \n");
		        
// PASSION PUDDLE		        
		      // adventure.passionPuddle();
		       
		       passionPuddle passionPuddle = new passionPuddle();
		       System.out.println(passionPuddle.placeText());
			 		
			 			for (int i = 0; i < playersArray.length; i++) {
			 			
					    	   
					       done = false; // Boolean to check if a valid input was actually done.
						 	
					       while (!done) {
						 		
						 		System.out.println(playersArray[i].getPlayerName() + "'s Answer:"); 
							     String choice = keyboard.next();
							       
					       
					       		if (choice.equalsIgnoreCase("yes")) { // CORRECT ANSWER
					       			System.out.println(passionPuddle.correctText());
					       			System.out.println("Yay! That helped with your admission!");
					       			playersArray[i].winPoints(playersArray[i].getTotalPoints());
					       			System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
					       			done = true;
					       		} else if (choice.equalsIgnoreCase("no")) { // INCORRECT ANSWER
					       			playersArray[i].losePoints(playersArray[i].getTotalPoints());
					       			System.out.println(passionPuddle.incorrectText());
					 				System.out.println("Sorry, that choice didn’t help with your admission!");
					 				System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
					 				done = true;
					       		} else {
					       			System.out.println("*** Invalid input - enter YES or NO! *** \n");
					       		}
					
			 		}
			 	}

// RU HUNGRY TRUCK
		      
			RUHungryTruck RuHungryTruck = new RUHungryTruck();
			System.out.println(RuHungryTruck.placeText());	
			
		       for (int i = 0; i < playersArray.length; i++) {
		 			
		    	   
			       done = false; // Boolean to check if a valid input was actually done.
				 	
			       while (!done) {
				 		
				 		System.out.println(playersArray[i].getPlayerName() + "'s Answer:"); 
					     String choice = keyboard.next();
					       
			       
			       		if (choice.equalsIgnoreCase("yes")) { // CORRECT ANSWER
			       			System.out.println(RuHungryTruck.correctText());
			       			System.out.println("Yay! That helped with your admission!");
			       			playersArray[i].winPoints(playersArray[i].getTotalPoints());
			       			System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			       			done = true;
			       		} else if (choice.equalsIgnoreCase("no")) { // INCORRECT ANSWER
			       			playersArray[i].losePoints(playersArray[i].getTotalPoints());
			       			System.out.println(RuHungryTruck.incorrectText());
			 				System.out.println("Sorry, that choice didn’t help with your admission!");
			 				System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			 				done = true;
			       		} else {
			       			System.out.println("*** Invalid input - enter YES or NO! *** \n");
			       		}
			
	 		}
	 	}
	 	

// HIGHPOINT SOLUTIONS STADIUM
		  
		   	HighPointSolutions HighPointSolutions = new HighPointSolutions();
			System.out.println(HighPointSolutions.placeText());	
		       
		       for (int i = 0; i < playersArray.length; i++) {
		 
			       done = false; // Boolean to check if a valid input was actually done.
				 	
			       while (!done) {
				 		
				 		System.out.println(playersArray[i].getPlayerName() + "'s Answer:"); 
					    String choice = keyboard.next();
					       
			       
			       		if (choice.equalsIgnoreCase("yes")) {  // INCORRECT ANSWER
			       			playersArray[i].losePoints(playersArray[i].getTotalPoints());
			       			System.out.println(HighPointSolutions.incorrectText());
			 				System.out.println("Sorry, that choice didn’t help with your admission!");
			 				System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			       			done = true;
			       		} else if (choice.equalsIgnoreCase("no")) {  // CORRECT ANSWER
			 				playersArray[i].winPoints(playersArray[i].getTotalPoints());
			     			System.out.println(HighPointSolutions.correctText());
			       			System.out.println("Yay! That helped with your admission!");
			       			System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			 				done = true;
			       		} else {
			       			System.out.println("*** Invalid input - enter YES or NO! *** \n");
			       		}
			
	 		}
	 	}
		       
// ALEXANDER LIBRARY
		   	Alex Alex = new Alex();
			System.out.println(Alex.placeText());	
		       
		       for (int i = 0; i < playersArray.length; i++) {
		 			
		    	   
			       done = false; // Boolean to check if a valid input was actually done.
				 	
			       while (!done) {
				 		
				 		System.out.println(playersArray[i].getPlayerName() + "'s Answer:"); 
					     String choice = keyboard.next();
					       
			       
			       		if (choice.equalsIgnoreCase("yes")) { // CORRECT ANSWER
			       			System.out.println(Alex.correctText());
			       			System.out.println("Yay! That helped with your admission!");
			       			playersArray[i].winPoints(playersArray[i].getTotalPoints());
			       			System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			       			done = true;
			       		} else if (choice.equalsIgnoreCase("no")) { // INCORRECT ANSWER
			       			playersArray[i].losePoints(playersArray[i].getTotalPoints());
			       			System.out.println(Alex.incorrectText());
			 				System.out.println("Sorry, that choice didn’t help with your admission!");
			 				System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			 				done = true;
			       		} else {
			       			System.out.println("*** Invalid input - enter YES or NO! *** \n");
			       		}
			
	 		}
	 	}

// BROWER
		    Brower Brower = new Brower();
			System.out.println(Brower.placeText());	
		       
		       for (int i = 0; i < playersArray.length; i++) {
		  		 
			       done = false; // Boolean to check if a valid input was actually done.
				 	
			       while (!done) {
				 		
				 		System.out.println(playersArray[i].getPlayerName() + "'s Answer:"); 
					    String choice = keyboard.next();
					       
			       
			       		if (choice.equalsIgnoreCase("yes")) {  // INCORRECT ANSWER
			       			playersArray[i].losePoints(playersArray[i].getTotalPoints());
			       			System.out.println(Brower.incorrectText());
			 				System.out.println("Sorry, that choice didn’t help with your admission!");
			 				System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			       			done = true;
			       		} else if (choice.equalsIgnoreCase("no")) {  // CORRECT ANSWER
			 				playersArray[i].winPoints(playersArray[i].getTotalPoints());
			     			System.out.println(Alex.correctText());
			       			System.out.println("Yay! That helped with your admission!");
			       			System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			 				done = true;
			       		} else {
			       			System.out.println("*** Invalid input - enter YES or NO! *** \n");
			       		}
			
	 		}
	 	}

// BUSINESS SCHOOL
		       
		    BusinessSchool BusinessSchool = new BusinessSchool();
			System.out.println(BusinessSchool.placeText());
		       
		       for (int i = 0; i < playersArray.length; i++) {
			  		 
			       done = false; // Boolean to check if a valid input was actually done.
				 	
			       while (!done) {
				 		
				 		System.out.println(playersArray[i].getPlayerName() + "'s Answer:"); 
					    String choice = keyboard.next();
					       
			       
			       		if (choice.equalsIgnoreCase("yes")) {  // INCORRECT ANSWER
			       			playersArray[i].losePoints(playersArray[i].getTotalPoints());
			       			System.out.println(BusinessSchool.incorrectText());
			 				System.out.println("Sorry, that choice didn’t help with your admission!");
			 				System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			       			done = true;
			       		} else if (choice.equalsIgnoreCase("no")) {  // CORRECT ANSWER
			 				playersArray[i].winPoints(playersArray[i].getTotalPoints());
			     			System.out.println(BusinessSchool.correctText());
			       			System.out.println("Yay! That helped with your admission!");
			       			System.out.println(playersArray[i].getPlayerName() + "'s Total Points: " + playersArray[i].getTotalPoints() + "\n");
			 				done = true;
			       		} else {
			       			System.out.println("*** Invalid input - enter YES or NO! *** \n");
			       		}
			
	 		}
	 	}

		       
// WINNERS AND LOSERS:
		       System.out.println("*** FINAL RESULTS: Let's see if you became a Rutgers Student! ***\n");
		       for (int i = 0; i < playersArray.length; i++) {
		    	   
		    	   if (playersArray[i].getTotalPoints() >= 15) {
		    	   		System.out.println(playersArray[i].getPlayerName() + ", congrats on your admission! You gained enough points to become a real Scarlet Knight!"); 
		       } else {
		    	   		System.out.println(playersArray[i].getPlayerName() + ", Rutgers is unable to offer you admission into the incoming class. Try to apply again!");
		       }
		       
		       }


// PLAY AGAIN		  
			 	keyboard.nextLine();
		        System.out.println("\nWould you like to play again? Enter 'Y' to play or any other key to quit: ");
		        playAgain = keyboard.nextLine();
		        
		} while(playAgain.equalsIgnoreCase("Y"));
		 
		    System.out.println("\nThanks for playing Rutgers Roundabout! Hope to see you next semester!");
		    
		} 

}
