package fproject;

public class CityText extends BedroomText {
	private String text4;
	
	public CityText() {
		super.setText("After a seemingly quiet commute, you make it to the noisy, but very active NYC!"
			      + "\nYou walk out on the platform and into bustling Penn Station."
			      + "\nThe clock reads 6:45… “Not too bad on time,” you think." 
			      + "\nCentral Park is close to the route you will travel to go to work. Should you take a taxi, take the subway, or walk the rest of the way to work?");
		super.setText2( "You took a taxi but unfortunetly, there was too much traffic and you wont make it to work on time!"
				+ "\nPlay Again to make it to work on time!.");
		super.setText3("You took the subway but there was a slight delay, it took you 15mins and it costs you $2.75."
				+ "\nYou still have some time. You start weighing your options on whether to grab some breakfast or walk to Central Park."
			        + "\nWhich will you choose? Breakfast or walking to the park?");
		this.text4 = "You had peaceful walk to the park and you have some time."
				+ "\nDo you want to grab breakfast in the park or take a walk in the park?";
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
