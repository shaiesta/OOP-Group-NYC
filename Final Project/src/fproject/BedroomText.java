package fproject;

public class BedroomText {
	private String text;
	private String text2;
	private String text3;
	
	public BedroomText() {
		this.text = "You are in your beedroom and need some things for your trip but you can only fit two more items in your bag \n"
				+ "Pick the best combination you think you will need to get to work on time!";
		this.text2 = "Good choice, you are ready to leave for the bus."
				+ "\nYou have $30 and will now be able to check the time";
		this.text3 = "Sorry, you wont need that! Please try again.";
	}
	
	public String getText() {
		return text;
	}
	public String getText2() {
		return text2;
	}
	public String getText3() {
		return text3;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public void setText3(String text3) {
		this.text3 = text3;
	}
}
