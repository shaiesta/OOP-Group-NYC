package fproject;

public class WorkText extends BedroomText {
	
	private String text4;
	
	public WorkText() {
		super.setText("sorry wont make it in time because donut slowed you down");
		super.setText2("You had just enough money left to take a taxi and you made it to work on time! congrats");
		super.setText3("it was a long walk but thanks to the coffee you made it to work on time! congrats!");
		this.text4 = "You get in the taxi and realize you dont have enough money and you won't make it to work.";
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
