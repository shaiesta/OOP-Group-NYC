public class Alex extends StartAdventure{
	
	public String placeText(){
		return "\nYou reach College Ave by Alexander Library and meet up with your friends. \n"
				+"Do you want to check out a book? \n";
	}
	
	public String correctText(){
		return "Woah, the book you took ended up being the last copy available!";
	}
	
	public String incorrectText(){
		return "That book was needed for your assignment, so now you have to pay a lot of money to get a copy for yourself!";
	}
	
}
