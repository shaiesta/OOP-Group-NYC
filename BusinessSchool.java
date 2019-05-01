public class BusinessSchool extends StartAdventure{
	
	public String placeText(){
		return "\nWe are at the Rutgers Business School,\n"
				+"one of the top-ranked business schools in the country.\n"
				+ "Would you want to be a business student? \n";
	}
	
	public String correctText(){
		return "School of Communication and Information students are better anyway!";
	}
	
	public String incorrectText(){
		return "Business students are great and all, but IT students are way better!";
	}

}
