import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

/* FINAL PROJECT: RUTGERS ROUNDABOUT 
 * 
 * @author Beatrice Trinidad, Johnny Manzano, Renz Sarayba, Chantelle Glowacki, Jonathan Paragas
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
					    + "You are interested in Rutgers University and want to get accepted next semester. \n"
					    + "Let's go on a journey around campus to see if you're good enough to be a Scarlet Knight. \n \n"
					    + "There will be different things to do on each campus. \n"
					    + "Either enter YES or NO, and hopefully these tasks will bring you closer or farther from being admitted to Rutgers. \n"
					    + "Correct answers will earn you a random amount of 1-10 points. \n"
					    + "Incorrect answers will deduct a random amount of 1-10 points. \n"
					    + "You must gain at least 15 points to gain admission! \n \n"
					    + "If you win, you will be admitted to Rutgers! \n"
					    + "If you lose, you will unfortunately have to send another application. :( \n") ;
		
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
