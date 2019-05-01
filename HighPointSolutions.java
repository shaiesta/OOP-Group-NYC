public class HighPointSolutions extends StartAdventure {
	
	public String placeText(){
		return "\nNow, you are at HighPoint Solutions Stadium on Busch Campus. \n"
				+ "However, you promised to go to Alexander Library with your friends back on College Avenue. \n"
				+ "Do you decide to watch the game even though you had other plans? \n";
	}
	
	public String correctText(){
		return "Good on you for remembering that you're a student first. The football team lost to University of Michigan 78-0 anyway!";
	}
	
	public String incorrectText(){
		return "Not only did you forget about the online assignment due date, but Rutgers lost to University of Michigan 78-0!";
	}

}
