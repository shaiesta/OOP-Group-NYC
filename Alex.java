public class Alex extends StartAdventure{
	
	public String placeText(){
		return "\nYou have reached College Ave by Alexander Library and decide to meet up with some friends! \n"
				+"Is there a book you would like to check out? \n";
	}
	
	public String correctText(){
		return "Good choice! but unfortunately it looks like the book you took ended up being the last copy available!";
	}
	
	public String incorrectText(){
		return "That book was needed for your assignment, so now you have to pay a lot of money to get a copy for yourself!";
	}
	
}
