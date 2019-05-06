package fproject;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome, you in your room. You see:");
		Room myObj = new Room();
		myObj.print();
		System.out.println("Pick your first item");
		Scanner input = new Scanner(System.in);
		String item = input.nextLine(); 
		
		boolean playing = true;
		while (playing) {
			
		int loop = 1;
		while (loop == 1) {
		if (item.equalsIgnoreCase("money") || item.equalsIgnoreCase("watch")) {
			System.out.println("Good choice");
			loop = 0;
		}
			else {
				System.out.println("Not a good choice. -5mins. Try again");
				item = input.nextLine(); 
				//put an identifier for time 
				loop = 1; 
		}
		}
		System.out.println("Pick your second item");
		String item2 = input.nextLine(); 

		loop = 1;
		while (loop == 1) {
		if (item.equalsIgnoreCase(item2)) {
				System.out.println("you already have that. Try again");
				item2 = input.nextLine();
				loop = 1;
			}
		else if (item2.equalsIgnoreCase("money") || item2.equalsIgnoreCase("watch")) {
			System.out.println("Good choice");
			loop = 0;
		}
		
			else {
				System.out.println("Not a good choice. -5mins. Try again");
				//put an identifier for time 
				item2 = input.nextLine(); 
				loop = 1; 
		}
		}
		double money = 30;
		System.out.println("You took the bus to the Train Station. Should you take the train(14$) or the bus($11.50)?");
		String userInput = input.nextLine();
		if (userInput.equalsIgnoreCase("train")) {
			money = money - 14;
			System.out.println("You now have $" + money);
		}
		else if (userInput.equalsIgnoreCase("bus")) {
			money = money - 11.5;
			System.out.println("You now have $" + money);
		}
		//add error else statement 
		
		System.out.println("You are now in the city. You have to go to central park. Should you take the subway, walk, or take a taxi?");
		userInput = input.nextLine();
		if (userInput.equalsIgnoreCase("Taxi")) {
			System.out.println("You took a taxi but there was so much traffic and you wont make it");
			playing = false;
		}
		
		

		}
		input.close();

	}

}
