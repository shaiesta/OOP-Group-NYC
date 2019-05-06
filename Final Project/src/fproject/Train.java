package fproject;

public class Train extends Room {
	
	public Train() {
		item.clear();
		super.item.add("Ticket");
			
	}
	public void print() {
		for (String items : item) {
			System.out.println(items);
		}
	}

}
