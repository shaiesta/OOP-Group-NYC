package fproject;

public class WorkText extends BedroomText {
	
	private String text4;
	
	public WorkText() {
		super.setText("Sorry, you won't make it in time because the donut slowed you down.");
		super.setText2("You had just enough money left to take a taxi and you made it to work on time! Congrats!");
		super.setText3("It was a long walk but thanks to the coffee boost (super speed), you made it to work on time! Congrats!");
		this.text4 = ("You get in the taxi and realize that you don't have enough money. Therefore, you won't make it to work on time.")";
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
