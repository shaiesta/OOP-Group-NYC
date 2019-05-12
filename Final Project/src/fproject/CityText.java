package fproject;

public class CityText extends BedroomText {
	private String text4;
	
	public CityText() {
		super.setText("You are now in the city and you have to go to Central Park. Should you take a taxi, take the subway, or walk?");
		super.setText2( "You took a taxi but there was too much traffic and you wont make it to work on time,");
		super.setText3("You took the subway but there was a slight delay, it took you 15mins and it cost you $2.75."
				+ "\nYou still have some time. Do you want to get food or walk to the park?");
		this.text4 = "You had peaceful walk to the park and you have some time."
				+ "\nDo you want to get food or take a walk in the park?";
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
