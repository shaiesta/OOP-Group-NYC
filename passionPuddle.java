public class passionPuddle extends StartAdventure {
	
	public String placeText(){
		return "\nWow, Passion Puddle looks great right now! \n"
				+ "You have a sketchbook with you. \n"
				+ "Do you want to draw the scenery? \n";
	}
	
	public String correctText(){
		return "Nice work, the trees look super realistic!";
	}
	
	public String incorrectText(){
		return "Well, not everyone is an artist...";
	}
}
