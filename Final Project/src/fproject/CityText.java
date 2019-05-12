package fproject;

public class CityText extends BedroomText {
	private String text4;
	
	public CityText() {
		super.setText("you are now in the city and you have to go to central park. Should you take a taxi, take the subway, or walk");
		super.setText2( "you took a taxi but there was too much traffic and you wont make it to work on time");
		super.setText3("you took the subway but there was a slight delay, it took you 15mins and it cost you $2.75."
				+ "\nyou still have some time. do you want to get food or walk the park");
		this.text4 = "you had peaceful walk to the park and you have some time"
				+ "\ndo you want to get food or walk the park";
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
