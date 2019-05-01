public class RUHungryTruck extends StartAdventure {
	
	public String placeText(){
		return "\nYum, you are so hungry from this adventure.\n"
				+ "Good thing the RU Hungry Truck is here! \n"
				+ "Do you want to eat a fat sandwich?\n";
	}
	
	public String correctText(){
		return "Now a part of Rutgers is inside you! That delicious Fat Darell tasted awesome.";
	}
	
	public String incorrectText(){
		return "You just missed out on one of the most famous sandwiches in the nation...";
	}
}
