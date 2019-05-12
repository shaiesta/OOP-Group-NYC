package fproject;

public class ParkText extends BedroomText{
	
	private String text4;
	
	public ParkText() {
		super.setText("You decide to grab some breakfast." 
			      + "\nWould you like to order a coffee for a boost (this will subtract 15 minutes from your current time and cost $8) or a donut (this will add 20 minutes to your current time but only cost $3)?");
		super.setText2("Oh no! You took a walk in Central Park but you got lost. Now you won't make it to work on time!");
		super.setText3("The donut was delicious but it cost you 20 mins. and $3."
				+ "\nIt is time to head to work. Should you walk or take a taxi?");
		this.text4 = ("The coffee costs you $8, but it gave you boost."
				+ "\n It is now time to head to work. Should you walk or take a taxi?");
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
