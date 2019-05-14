public class Brower extends StartAdventure {
	
	public String placeText(){
		return "\nLooks like we're at Brower Commons now! The food here seems to have a bad rep., but eating here is convenient.\n"
				+"Do you want to eat here? \n";
	}
	
	public String correctText(){
		return "You just saved yourself from RU food posioning!";
	}
	
	public String incorrectText(){
		return "That mystery meat ended up making your stomach feel pretty weird and queasy...";
	}

}
