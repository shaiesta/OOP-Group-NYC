package fproject;

public class ParkText extends BedroomText{
	
	private String text4;
	
	public ParkText() {
		super.setText("do you want a donut (+20min) or a coffee(super speed but it cost more)?");
		super.setText2("you walked the park but got lost, now you wont make it to work on time!");
		super.setText3("The donut was great but it cost you 20 mins and 3$."
				+ "\nIt is time to head to work. should you walk or take a taxi");
		this.text4 = "The coffee cost you 8$ but gave you boost."
				+ "\n It is now time to head to work. should you walk or take a taxi";
	}
	
	public String getText4() {
		return text4;
	}
	
	public void setText(String text4) {
		this.text4 = text4;
	}

}
