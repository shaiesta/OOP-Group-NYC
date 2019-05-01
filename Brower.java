public class Brower extends StartAdventure {
	
	public String placeText(){
		return "\nWe are by Brower Commons, the food is known to be pretty bad.\n"
				+"Do you want to eat here? \n";
	}
	
	public String correctText(){
		return "You just saved yourself from RU food posioning!";
	}
	
	public String incorrectText(){
		return "That mystery meat ended up making your stomach feel pretty weird and queasy...";
	}

}
